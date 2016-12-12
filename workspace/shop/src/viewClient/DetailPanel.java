package viewClient;

import view.Anything;
import view.ModelException;
import view.objects.ViewProxi;
import view.visitor.AnythingVisitor;

import common.Fraction;
import common.DateAndTime;

import rGType.CharacterType;
import expressions.RegularExpression;
import expressions.RegularExpressionHandler;
import view.FX.RegExprPanel2;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Hashtable;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;


abstract public class DetailPanel extends BorderPane {

	public static void setButtonToNeutral( Button button) {
		button.setBackground( new Background( new BackgroundFill( GUIConstants.Yellow, null, Insets.EMPTY)));
		button.setTextFill( GUIConstants.NeutralForeground);
		button.setText( GUIConstants.NeutralText);
		// 	button.setIcon(GUIConstants.NeutralIcon);
		button.setDisable(true);
	}

	public static void setButtonToOK( Button button) {
		button.setBackground( new Background( new BackgroundFill( GUIConstants.Green, null, Insets.EMPTY)));
		button.setTextFill( GUIConstants.OKForeground);
		button.setText( GUIConstants.OKText);
		// button.setIcon(GUIConstants.OKIcon);
		button.setDisable(false);
	}

	public static void setButtonToNotOk( Button button) {
		button.setBackground( new Background( new BackgroundFill( GUIConstants.Red, null, Insets.EMPTY)));
		button.setTextFill( GUIConstants.NotOKForeground);
		button.setText( GUIConstants.NotOKText);
		// button.setIcon(GUIConstants.NotOKIcon);
		button.setDisable(true);
	}

	protected Anything anything;
	private ExceptionAndEventHandler exceptionAndEventHandler;

	protected DetailPanel(ExceptionAndEventHandler exceptionHandler) {
		super();
		this.exceptionAndEventHandler = exceptionHandler;
	}

	abstract public void setAnything(Anything anything);

	protected Anything getAnything() {
		return this.anything;
	}

	protected ExceptionAndEventHandler getExceptionAndEventhandler() {
		return this.exceptionAndEventHandler;
	}
}

abstract class BaseTypePanel extends HBox {

	protected static final int Neutral = 0;
	protected static final int OK 	   = 1;
	protected static final int NotOK   = 2;

	private DefaultDetailPanel master;
	protected Updater updater;

	protected BaseTypePanel( DefaultDetailPanel master, String name, String value) {
        super(10);
		this.master = master;
		this.setAlignment( Pos.BASELINE_LEFT );
		this.setPadding( new Insets( 10,10,0,10 ));
		this.prefWidthProperty().bind( master.widthProperty());        
		this.getChildren().add( this.getUpdateButton() );
		
		HBox nameBox = new HBox();
		nameBox.setAlignment(Pos.BASELINE_LEFT);
		this.getNameLabel().setText( name );
		nameBox.getChildren().add( this.getNameLabel());
		nameBox.getChildren().add( new Label(":"));
		nameBox.setMinWidth(USE_PREF_SIZE);
		nameBox.setMaxWidth(USE_PREF_SIZE);
		this.getChildren().add( nameBox );

		this.getChildren().add( (Node) this.getConcreteValueComponent() );

		this.getChildren().add( this.getUpdateMarker() );
		this.getValueComponent().setComponentValue( value);
	}

	abstract protected ValueComponent getValueComponent();
	
	protected ValueComponent valueComponent = null;
	protected ValueComponent getConcreteValueComponent(){
		if( this.valueComponent == null){
			this.valueComponent = this.getValueComponent();
			HBox.setHgrow( (Node) this.valueComponent, Priority.ALWAYS);
		}
		return this.valueComponent;
	};
	
	private Label updateMarker = null;
	protected Label getUpdateMarker() {
		if( this.updateMarker == null) {
			this.updateMarker = new Label( GUIConstants.UpdateMarker );
			this.updateMarker.setVisible(false);
		}
		return this.updateMarker;
	}

	private Button updateButton;
	private Button getUpdateButton() {
		if( this.updateButton == null) {
			this.updateButton = new Button("    ");
			this.setStatus( Neutral );
			this.updateButton.setMinWidth(USE_PREF_SIZE);
			this.updateButton.setMaxWidth(USE_PREF_SIZE);
			this.updateButton.setOnAction(new EventHandler<ActionEvent>() {
				public void handle( ActionEvent event) {
					if (isUpdatable()) update();
				}
			});
		}
		return this.updateButton;
	}

	public void setOK(boolean ok) {
		if (ok) {
			this.setStatus(OK);
		} else {
			this.setStatus(NotOK);
		}
	}

	private int status = BaseTypePanel.Neutral;
	protected void setStatus(int status) {
		this.status = status;
		if( this.status == Neutral)
			DetailPanel.setButtonToNeutral(this.getUpdateButton());
		if( this.status == OK)
			DetailPanel.setButtonToOK(this.getUpdateButton());
		if( this.status == NotOK)
			DetailPanel.setButtonToNotOk(this.getUpdateButton());
		this.master.check();
	}

	private Label nameLabel;
	protected Label getNameLabel() {
		if( this.nameLabel == null) {
			this.nameLabel = new Label();
		}
		return this.nameLabel;
	}

	protected DefaultDetailPanel getMaster() {
		return this.master;
	}

	protected void registerUpdater( Updater updater) {
		this.updater = updater;
		this.setUpdatable();
		this.getValueComponent().setComponentValue( updater.format(this.getValueComponent().getComponentValue()));
	}

	protected void setUpdatable() {
		this.getUpdateMarker().setVisible(true);
		this.getValueComponent().setComponentEditable();
	}

	public boolean isUpdatable() {
		return this.updater != null;
	}

	protected boolean isReadyForUpdate() {
		return this.isUpdatable() && !this.getUpdateButton().isDisabled();
	}

	public void updateIfReady() {
		if (this.isReadyForUpdate())
			this.update();
	}

	private void update() {
		try {
			this.updater.update( this.getValueComponent().getComponentValue());
			this.setStatus( Neutral);
		} catch (ModelException ex) {
			this.getValueComponent().setComponentValue( ex.getMessage());
			this.setStatus( NotOK);
		}
	}

	public int getStatus() {
		return this.status;
	}
}

interface ValueComponent{
	String getComponentValue();
	void setComponentValue(String value);
	void setComponentEditable();	
}

abstract class BaseTypePanelWithTextField extends BaseTypePanel{

	protected BaseTypePanelWithTextField(DefaultDetailPanel master, String name, String value) {
		super(master, name, value);
	}
	
	protected ValueTextField getValueTextField() {
		ValueTextField valueTextField = new ValueTextField();
		valueTextField.setEditable(false);
		valueTextField.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if (isUpdatable()) {
					try {
						setOK(updater.check(getValue()));
					} catch (ModelException me) {
						getValueComponent().setText(me.getMessage());
					}
				}
			}
		});
		return valueTextField;
	}

	class ValueTextField extends TextField implements ValueComponent{
		public ValueTextField() {
			super();
		}

		@Override
		public String getComponentValue() {
			return this.getText();
		}

		@Override
		public void setComponentValue(String value) {
			this.setText( value);
			this.home();
		}

		@Override
		public void setComponentEditable() {
			this.setEditable(true);
		}
	}
	
	protected ValueTextField getValueComponent(){
		if( this.valueComponent == null){
			return this.getValueTextField();
		}
		return (ValueTextField) this.valueComponent;
	}
	
	public String getValue() {
		return this.getValueComponent().getComponentValue();
	}

	protected void setValue( String value ) {
		this.getValueComponent().setComponentValue(value);
	}
	
	protected void setEditable(){		
		this.getValueComponent().setComponentEditable();
	}	
}

class IntegerPanel extends BaseTypePanelWithTextField {
	protected IntegerPanel(DefaultDetailPanel master, String name, long value) {
		super(master, name, Long.toString(value));
	}
}

class FractionPanel extends BaseTypePanelWithTextField {
	protected FractionPanel(DefaultDetailPanel master, String name, Fraction value) {
		super(master, name, value.toString());
	}
}

class StringPanel extends BaseTypePanelWithTextField {
	protected StringPanel(DefaultDetailPanel master, String name, String value) {
		super(master, name, value);
	}
}

class RegularExpressionPanel extends BaseTypePanelWithTextField {

	private RegularExpressionHandler handler;

	protected RegularExpressionPanel(DefaultDetailPanel master, String name, String value, RegularExpressionHandler handler) {
		super(master, name, value);
		this.handler = handler;
		this.getValueComponent().setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				if (getValueComponent().isEditable() ){
					if(e.getClickCount() == 2 || e.isAltDown()) getMaster().switchToRegExprView(RegularExpressionPanel.this);
				}
			}
		});
		this.getValueComponent().setTooltip( new Tooltip( GUIConstants.TextFieldToolTipText));
	}

	protected boolean check() {
		return this.handler.check(new rGType.CharacterValue(this.getValue()));
	}

	public RegularExpression<Character, rGType.CharacterType> getExpression() {
		return handler.getRegExpr();
	}
}

class TextPanel extends BaseTypePanelWithTextField {
	private String value;

	protected TextPanel(DefaultDetailPanel master, String name, String value) {
		super(master, name, value);
		this.value = value;
		// open text view to see the whole text, independent if text editable
		this.getValueComponent().setOnMouseClicked( new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				if (e.getClickCount() == 2 || e.isAltDown()) getMaster().switchToTextView(TextPanel.this);
			}
		});
		this.getValueComponent().setTooltip( new Tooltip( GUIConstants.TextFieldToolTipText));
	}

	public String getValue() {
		return this.value;
	}

	protected void setValue(String value) {
		if (this.value != null && this.value.equals(value)) return;
		this.value = value;
		boolean tooLong = value.length() > GUIConstants.TextPreviewLength;
		this.getValueComponent().setComponentValue(value.substring(0, tooLong ? GUIConstants.TextPreviewLength : value.length()) + (tooLong ? "....." : ""));
		if( this.isUpdatable()) {
			try {
				this.setOK( this.updater.check(getValue()));
			} catch (ModelException me) {
				this.setOK(false);
				this.getValueComponent().setText(me.getMessage());
			}
		}
	}

	protected void setUpdatable() {
		this.getUpdateMarker().setVisible(true);
	}
}


class DatePanel extends BaseTypePanel {
	protected DatePanel(DefaultDetailPanel master, String name, java.util.Date value) {
		super( master, name, DateAndTime.toString(value, false));
	}
	
	class ValueDatePicker extends HBox implements ValueComponent{
		ValueDatePicker(){
			super(10);
			this.getChildren().add(this.getDatePicker());
			this.getChildren().add(this.getSpaceHolder());
			this.setAlignment(Pos.BASELINE_LEFT);
			HBox.setHgrow(this.getDatePicker(), Priority.SOMETIMES);
			HBox.setHgrow(this.getSpaceHolder(), Priority.ALWAYS);
		}
		private Label getSpaceHolder() {
			return new Label();
		}
		private DatePicker datePicker;
		private DatePicker getDatePicker(){
			if( this.datePicker == null){
				this.date = LocalDate.now();
				this.result = java.util.Date.from(this.date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());		
				this.datePicker = new DatePicker(); 
				this.datePicker.getEditor().setText(DateAndTime.toString(this.result, false));
				this.setMinWidth(Double.MIN_VALUE);
				this.setComponentNotEditable();
				this.datePicker.getEditor().setOnKeyReleased( new EventHandler<KeyEvent>() {
					public void handle(KeyEvent event) {
						if( isUpdatable() ){
							try {
								setOK( updater.check( getValueComponent().getComponentValue()));
						    } catch (ModelException me) {
						    	getValueComponent().setComponentValue( me.getMessage());
						    }						
						}
					}
				});
				this.datePicker.setOnAction(new EventHandler<ActionEvent>() {				
					public void handle(ActionEvent event) {
						if( isUpdatable() ){
							try {
								setOK( updater.check( getValueComponent().getComponentValue()));
						    } catch (ModelException me) {
						    	getValueComponent().setComponentValue( me.getMessage());
						    }						
						}
					}
				});			
			}
			return this.datePicker;
		}
		protected void setComponentNotEditable() {
			this.datePicker.setDisable(true);
			this.datePicker.setStyle( GUIConstants.STYLE_OPACITY_OFF);
			this.datePicker.getEditor().setStyle( GUIConstants.STYLE_OPACITY_OFF);			
		}
		@Override
		public String getComponentValue() {
			return this.getDatePicker().getEditor().getText();
		}

		private java.util.Date result;
		private LocalDate date;
		
		@Override
		public void setComponentValue(String value) {
			if( value != null){
				java.util.Date tmp;
				try {
					tmp = DateAndTime.parseDate(value);
					this.result = tmp;
					Instant instant = this.result.toInstant();
					ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
					this.date = zdt.toLocalDate();
					this.getDatePicker().getEditor().setText( DateAndTime.toString( this.result, false));
				} catch (ParseException e) {
					this.getDatePicker().getEditor().setText( e.getMessage());		
				}
			} 			
		}

		@Override
		public void setComponentEditable() {
			this.getDatePicker().setDisable(false);
			this.getDatePicker().getEditor().setEditable(true);
		}		
	}
	@Override
	protected ValueComponent getValueComponent() {		
		if( this.valueComponent == null){
			return new ValueDatePicker();
		}
		return this.valueComponent;
	}

}
class TimestampPanel extends BaseTypePanel implements ValueTimestampMaster{
	protected TimestampPanel(DefaultDetailPanel master, String name, java.util.Date value) {
		super(master, name, DateAndTime.toString(value, true));
//System.out.println("TimestampPanel() value formatted " + DateAndTimeConstantsAndServices.toString(value, true));
		}		
	@Override
	protected ValueComponent getValueComponent() {
		if( this.valueComponent == null){
			return new ValueTimestampPanel(this);
		}
		return this.valueComponent;
	}
	@Override
	public boolean checkAndSetOk(String value) throws ModelException {
		boolean checkResult = this.updater.check(value);
		this.setOK(checkResult);
		return checkResult;
	}	
}

interface CompleteUpdater {
	void update() throws ModelException;
}

interface Updater {
	void update(String text) throws ModelException;

	String format(String text);

	boolean check(String text) throws ModelException;
}

abstract class StandardUpdater implements Updater {
	public String format(String text) {
		return text;
	}
}

abstract class UpdaterForInteger extends StandardUpdater {
	public boolean check(String text) throws ModelException {
		try {
			Long.parseLong(text);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}

abstract class UpdaterForString extends StandardUpdater {
	public boolean check(String text) throws ModelException {
		return true;
	}
}

abstract class UpdaterForText extends StandardUpdater {
	public boolean check(String text) throws ModelException {
		return true;
	}
}

abstract class UpdaterForDate extends StandardUpdater {
	public boolean check(String text) throws ModelException {
		try {
			DateAndTime.parseDate(text);
			return true;
		} catch (java.text.ParseException pe) {
			return false;
		}
	}
}

abstract class UpdaterForTimeStamp extends StandardUpdater {
	public boolean check(String text) throws ModelException {
		try {
			DateAndTime.parseTimestamp(text);
			return true;
		} catch (java.text.ParseException pe) {
			return false;
		}
	}
}

abstract class DefaultDetailPanel extends DetailPanel {

	public static DetailPanel getStandardDetailPanel(Anything object, final ExceptionAndEventHandler handler) throws ModelException {
		DetailPanelFactory factory = new DetailPanelFactory(handler);
		object.accept(factory);
		return factory.result;
	}

	public void check() {
		boolean somethingUpdatable = false;
		this.setStatus(BaseTypePanel.Neutral);
		java.util.Iterator<BaseTypePanel> panelIterator = this.panels.values().iterator();
		while (panelIterator.hasNext()) {
			BaseTypePanel current = panelIterator.next();
			if (current.getStatus() == BaseTypePanel.NotOK) {
				this.setStatus(BaseTypePanel.NotOK);
				return;
			}
			if (current.getStatus() == BaseTypePanel.OK) {
				somethingUpdatable = true;
			}
		}
		if (somethingUpdatable)
			this.setStatus(BaseTypePanel.OK);
	}

	Hashtable<String, BaseTypePanel> panels;
	private CompleteUpdater completeUpdater;

	protected DefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
		super(exceptionHandler);
		this.panels = new Hashtable<String, BaseTypePanel>();
		this.setCenter( this.getStandardDetailsPanel() );
		this.setAnything(anything);
	}

	protected void registerUpdater(String fieldName, Updater updater) {
		BaseTypePanel panel = this.panels.get(fieldName);
		if (panel != null)
			panel.registerUpdater(updater);
	}

	protected void registerCompleteUpdater(CompleteUpdater completeUpdater) {
		this.completeUpdater = completeUpdater;
	}

	abstract protected void addFields();

	public BaseTypePanel getPanel(String key) {
		return this.panels.get(key);
	}

	public void switchBackFromTextView( boolean update) {
		this.setCenter(this.getStandardDetailsPanel());
		if( update) {
			this.currentTextPanel.setValue( this.getTextView().getText());
		}
	}

	private TextPanel currentTextPanel = null;
	public void switchToTextView( TextPanel panel) {
		this.currentTextPanel = panel;
		this.getTextView().setText( panel.getValue());
		this.getTextView().positionCaret(0);
		this.getTextView().setEditable( this.currentTextPanel.isUpdatable() );
		this.getTextPaneWithTitle().setText( panel.getNameLabel().getText() );
		this.setCenter( this.getTextPane());
		this.getTextView().requestFocus();
	}

	private RegularExpressionPanel currentRegExpPanel = null;
	public void switchToRegExprView(RegularExpressionPanel panel) {
		this.currentRegExpPanel = panel;
		final BorderPane regExpPanel = this.getRegExprComfortPanel(panel.getExpression(), panel.getNameLabel().getText(), panel.getValue());
		this.setCenter( regExpPanel );
		this.regExprPane.getRegExprInput().focusedProperty().addListener( new ChangeListener<Boolean>() {
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if(! newValue ){					
					if( regExpOkButton.isFocused() || regExpCancelButton.isFocused()){
					} else {						
						switchBackFromRegExpView(false);
					}
				}
			}
		});
		this.regExprPane.getRegExprInput().requestFocus();
	}

	public void switchBackFromRegExpView( boolean update) {
		this.setCenter( this.getStandardDetailsPanel());
		if( update ) {
			String value = this.regExprPane.getRegExprInput().getText();
			this.currentRegExpPanel.setValue( value);
			this.currentRegExpPanel.setOK( this.currentRegExpPanel.check());
		}
	}

	private BorderPane regExprComfortPanel = null;
	private BorderPane getRegExprComfortPanel(RegularExpression<Character, CharacterType> expression, String name, String value) {
		if( this.regExprComfortPanel == null) {
			this.regExprComfortPanel = new BorderPane();
			this.regExprComfortPanel.setBottom( this.getRegExprComfortToolBar());
			this.regExprComfortPanel.setCenter( this.getRegExprPane( expression, name, value));
		} 
		return regExprComfortPanel;
	}
	private ToolBar regExprComfortToolBar = null;
	private ToolBar getRegExprComfortToolBar() {
		if( this.regExprComfortToolBar == null) {
			this.regExprComfortToolBar = new ToolBar(getRegExpOkButton(), getRegExpCancelButton() );
		}
		return regExprComfortToolBar;
	}
	private Button regExpOkButton = null;
	private Button getRegExpOkButton() {
		if( this.regExpOkButton == null) {
			this.regExpOkButton = new Button( GUIConstants.UpdateButtonText);
			this.regExpOkButton.setMinWidth(Region.USE_PREF_SIZE);
			this.regExpOkButton.setMaxWidth(Region.USE_PREF_SIZE);
			this.regExpOkButton.setOnAction( new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					switchBackFromRegExpView(true);
				}
			});
		}
		return this.regExpOkButton;
	}
	private Button regExpCancelButton = null;
	private Button getRegExpCancelButton() {
		if( this.regExpCancelButton == null) {
			this.regExpCancelButton = new Button( GUIConstants.CancelButtonText );
			this.regExpCancelButton.setOnAction( new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					switchBackFromRegExpView(false);
				}
			});
		}
		return this.regExpCancelButton;
	}
	private RegExprPanel2 regExprPane = null;
	private RegExprPanel2 getRegExprPane(RegularExpression<Character, CharacterType> expression, String name, String value) {
		this.regExprPane = new RegExprPanel2(expression, name, value);
		return regExprPane;
	}
	private BorderPane standardDetailsPane;
	private BorderPane getStandardDetailsPanel() {
		if( this.standardDetailsPane == null) {
			this.standardDetailsPane = new BorderPane();
			this.standardDetailsPane.setBottom( this.getMajorToolBar());
			this.standardDetailsPane.setCenter( this.getDetailScrollPane() );
		}
		return this.standardDetailsPane;
	}
	private ToolBar majorToolBar;
	private ToolBar getMajorToolBar() {
		if( this.majorToolBar == null) {
			this.majorToolBar = new ToolBar(  this.getUpdateAllButton());
		}
		return this.majorToolBar;
	}
	private Button updateAllButton;
	private Button getUpdateAllButton() {
		if( this.updateAllButton == null) {
			this.updateAllButton = new Button( GUIConstants.UpdateText);
			this.updateAllButton.setMinWidth(USE_PREF_SIZE);
			this.updateAllButton.setMaxWidth(USE_PREF_SIZE);
			this.updateAllButton.setOnAction( new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					updateAll();
				}
			});
			this.setStatus( BaseTypePanel.Neutral);
		}
		return this.updateAllButton;
	}

	protected void updateAll() {
		if( this.hasCompleteUpdater()) {
			try {
				this.completeUpdater.update();
				this.resetDetails(true, "");
			} catch (ModelException e) {
				this.resetDetails(false, e.getMessage());
			}
		}
		java.util.Iterator<BaseTypePanel> panelIterator = this.panels.values().iterator();
		while (panelIterator.hasNext()) {
			BaseTypePanel current = panelIterator.next();
			current.updateIfReady();
		}
		this.check();
	}

	private void resetDetails(boolean withoutErrors, String message) {
		java.util.Iterator<BaseTypePanel> panelIterator = this.panels.values().iterator();
		while (panelIterator.hasNext()) {
			BaseTypePanel current = panelIterator.next();
			if (current.isReadyForUpdate()) {
				if (withoutErrors) {
					current.setStatus(BaseTypePanel.Neutral);
				} else {
					current.getValueComponent().setComponentValue(message);
					current.setStatus(BaseTypePanel.NotOK);
				}
			}
		}
		this.check();
	}

	private boolean hasCompleteUpdater() {
		return this.completeUpdater != null;
	}

	private void setStatus(int status) {
		if (status == BaseTypePanel.Neutral)
			DetailPanel.setButtonToNeutral(this.getUpdateAllButton());
		if (status == BaseTypePanel.OK)
			DetailPanel.setButtonToOK(this.getUpdateAllButton());
		if (status == BaseTypePanel.NotOK)
			DetailPanel.setButtonToNotOk(this.getUpdateAllButton());
	}
	private ScrollPane detailScrollPane = null;
	private ScrollPane getDetailScrollPane() {
		if( this.detailScrollPane == null) {
			this.detailScrollPane = new ScrollPane();
			this.detailScrollPane.setContent( this.getScrollablePane());
		    this.detailScrollPane.prefWidthProperty().bind( this.widthProperty().multiply(0.98));			
		    this.detailScrollPane.prefHeightProperty().bind( this.heightProperty());			
		}
		return detailScrollPane;
	}
	private BorderPane textPane = null;
	private BorderPane getTextPane() {
		if( this.textPane == null) {
			this.textPane = new BorderPane();
			this.textPane.setCenter( this.getTextPaneWithTitle());
			this.textPane.setBottom( this.getTextToolBar());
		}
		return this.textPane;
	}
	private TitledPane textPaneTitle;
	private TitledPane getTextPaneWithTitle() {
		if (this.textPaneTitle == null) {
			this.textPaneTitle = new TitledPane("", this.getTextView());
			this.textPaneTitle.setCollapsible(false);
		}
		return this.textPaneTitle;
	}

	private ToolBar textToolBar;
	private ToolBar getTextToolBar() {
		if( this.textToolBar == null) {
			this.textToolBar = new ToolBar();
			this.textToolBar.getItems().add( this.getSwitchBackCancelButton());
			this.textToolBar.getItems().add( this.getSwitchBackUpdateButton());
		}
		return this.textToolBar;
	}

	private Button switchBackUpdateButton;
	private Button getSwitchBackUpdateButton() {
		if( this.switchBackUpdateButton == null) {
			this.switchBackUpdateButton = new Button( GUIConstants.UpdateButtonText);
			this.switchBackUpdateButton.setDisable( true);
			this.switchBackUpdateButton.setOnAction( new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					switchBackFromTextView(true);
				}
			}); 
		}
		return this.switchBackUpdateButton;
	}

	private Button switchBackCancelButton;
	private Button getSwitchBackCancelButton() {
		if( this.switchBackCancelButton == null){
			this.switchBackCancelButton = new Button( GUIConstants.CancelButtonText);
			this.switchBackCancelButton.setOnAction( new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					switchBackFromTextView(false);
				}
			});
		}
		return this.switchBackCancelButton;
	}

	private TextArea textView = null;
	private TextArea getTextView() {
		if( this.textView == null) {
			this.textView = new TextArea();
			this.textView.setWrapText( true );
			this.textView.setPrefHeight(USE_PREF_SIZE);
			this.textView.setMaxHeight(Double.MAX_VALUE);
			this.textView.prefHeightProperty().bind(this.heightProperty());
			this.textView.setOnKeyReleased( new EventHandler<KeyEvent>() {
				public void handle( KeyEvent event ) {
					getSwitchBackUpdateButton().setDisable( !getTextView().isEditable());					
				}
			});
		}
		return this.textView;
	}

	private VBox scrollablePane = null;
	protected VBox getScrollablePane() {
		if( this.scrollablePane == null) {
			this.scrollablePane = new VBox(8);
			this.scrollablePane.setAlignment( Pos.TOP_LEFT);
			this.scrollablePane.prefWidthProperty().bind( this.getDetailScrollPane().prefWidthProperty());
		}
		return this.scrollablePane;
	}

	public void setAnything(Anything anything) {
		this.anything = anything;
		((ViewProxi) anything).expand();
		this.addFields();
	}
}

class ValueTimestampPanel extends HBox implements ValueComponent{
	private java.util.Date result;
	private LocalDate date;
	private LocalTime time;
	private ValueTimestampMaster master;
	private int partsPerHour;
	private int delta;								// delta in seconds of time slider step
	private int hourStart = DateAndTime.HOUR_START; // time slider range start, inclusive
	private int hourEnd = DateAndTime.HOUR_END; 	// time slider range end, exclusive

	ValueTimestampPanel(){		
		this(DateAndTime.PARTS_PER_HOUR, DateAndTime.HOUR_START, DateAndTime.HOUR_END);
	}

	ValueTimestampPanel( ValueTimestampMaster master ){
		this( DateAndTime.PARTS_PER_HOUR, DateAndTime.HOUR_START, DateAndTime.HOUR_END);
		this.master = master;
	}

	ValueTimestampPanel(ValueTimestampMaster master, int partsPerHour, int startHour, int endHour){		
		this( partsPerHour, startHour, endHour);
		this.master = master;
	}

	/**
	 * The Parameter <code> partsPerHour </code> determines the granularity for the time slider in seconds. 
	 * <p> The default is 12.
	 * <p> The range is 1 to 3600.
	 * <p> One hour (60 minutes) is divided into 5 minutes parts by default; e.g. one time slider step is 5 minutes plus or minus.
	 */
	ValueTimestampPanel(int partsPerHour, int startHour, int endHour){		
		super(10);
		this.partsPerHour = partsPerHour;
		this.delta = 3600/this.partsPerHour;
		this.hourStart = startHour;
		this.hourEnd = endHour;

		this.master = new ValueTimestampMaster() {
			public boolean checkAndSetOk(String value) throws ModelException {
				return false;
			}
			public boolean isUpdatable() {
				return false;
			}
		};
		
		this.date = LocalDate.now();
		this.time = LocalTime.now();
		long fractions = this.calcFractions( this.time.getHour(), this.time.getMinute(), this.time.getSecond());
		this.time = LocalTime.ofSecondOfDay(((long) fractions*delta));
//System.out.println("init time " + this.time + " fractions " + fractions + " part " + partsPerHour);		
//		this.time = this.time.minusSeconds(this.time.getSecond());
//		this.time = this.time.minusNanos(this.time.getNano());
        this.result = java.util.Date.from( this.date.atTime(this.time).atZone(ZoneId.systemDefault()).toInstant());
		
		this.setAlignment( Pos.BASELINE_LEFT );
		this.getChildren().add( this.getDatePicker());
		this.getChildren().add( this.getTimeInputField());
		this.getChildren().add( this.getTimeSlider());
		HBox.setHgrow(this.getDatePicker(), Priority.NEVER);
		HBox.setHgrow(this.getTimeInputField(), Priority.SOMETIMES);			
		HBox.setHgrow(this.getTimeSlider(), Priority.ALWAYS);
		
		this.setTimeValue( this.time.getHour(), this.time.getMinute(), this.time.getSecond());
	}
			
	private DatePicker datePicker;
	private DatePicker getDatePicker(){
		if( this.datePicker == null){
			this.datePicker = new DatePicker( this.date );
			this.datePicker.getEditor().setText(DateAndTime.toString(this.result, false));
			this.datePicker.setDisable(true);
			this.datePicker.setStyle(GUIConstants.STYLE_OPACITY_OFF);
			this.datePicker.getEditor().setStyle(GUIConstants.STYLE_OPACITY_OFF);
			this.datePicker.getEditor().setOnKeyReleased( new EventHandler<KeyEvent>() {
				public void handle(KeyEvent event) {
					if( master.isUpdatable() ){
						try {
							master.checkAndSetOk( getComponentValue());
					    } catch (ModelException me) {
					    	datePicker.getEditor().setText( me.getMessage());
					    }						
					}
				}
			});
			this.datePicker.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if( master.isUpdatable() ){
						try {
							master.checkAndSetOk( getComponentValue());
					    } catch (ModelException me) {
					    	datePicker.getEditor().setText( me.getMessage());
					    }						
					}
				}
			});		
		}
		return this.datePicker;
	}
	
	private Slider timeSlider;
	private Slider getTimeSlider() {
		if( this.timeSlider == null){
			this.timeSlider = new Slider( this.hourStart*this.partsPerHour
										, this.hourEnd*this.partsPerHour - 1
					, this.calcFractions( this.time.getHour(), this.time.getMinute(), this.time.getSecond() ));	
			this.timeSlider.setPrefWidth(20);
			this.timeSlider.setMinWidth(Double.MIN_VALUE);
			this.timeSlider.setTooltip(new Tooltip(GUIConstants.TimeSliderToolTipText));
			this.timeSlider.setVisible(false);
			this.timeSlider.setOnMouseDragged(new EventHandler<MouseEvent>() {
				public void handle(MouseEvent event) {
					time = LocalTime.ofSecondOfDay(((long) (timeSlider.getValue())*delta));
					setTimeValue( time.getHour(), time.getMinute(), time.getSecond());
					if( master.isUpdatable() ){
						try {
							master.checkAndSetOk( getComponentValue());
					    } catch (ModelException me) {
					    	getDatePicker().getEditor().setText( me.getMessage());
					    }						
					}					
				}
			});
			this.timeSlider.setOnKeyPressed(new EventHandler<KeyEvent>() {
				public void handle(KeyEvent event) {
					if( event.getCode() == KeyCode.RIGHT ) {
						time = LocalTime.ofSecondOfDay(((long) (timeSlider.getValue())* delta));							
						if(((long)timeSlider.getValue()) >= hourEnd * partsPerHour - 1) return;						
						time = time.plusSeconds( delta );
						Platform.runLater(new Runnable() {
							public void run() {
								timeSlider.setValue( calcFractions(time.getHour(), time.getMinute(), time.getSecond()));									
								setTimeValue( time.getHour(), time.getMinute(), time.getSecond());						
								if( master.isUpdatable() ){
									try {
										master.checkAndSetOk( getComponentValue());
								    } catch (ModelException me) {
								    	getDatePicker().getEditor().setText( me.getMessage());
								    }						
								}					
							}
						});
					} else if (event.getCode() == KeyCode.LEFT){
						time = LocalTime.ofSecondOfDay(((long) (timeSlider.getValue())* delta));							
						if( ((long)timeSlider.getValue()) <= hourStart*partsPerHour)return;					
						time = time.minusSeconds( delta );
						Platform.runLater(new Runnable() {
							public void run() {
								timeSlider.setValue( calcFractions(time.getHour(), time.getMinute(), time.getSecond()));
								setTimeValue( time.getHour(), time.getMinute(), time.getSecond());						
								if( master.isUpdatable() ){
									try {
										master.checkAndSetOk( getComponentValue());
								    } catch (ModelException me) {
								    	getDatePicker().getEditor().setText( me.getMessage());
								    }						
								}					
							}
						});
					}
				}
			});				
		}
		return this.timeSlider;
	}
	private long calcFractions( int hour, int minute, int second ){
		int totalSeconds = (hour*60+minute)*60 + second;
		return totalSeconds/this.delta + (totalSeconds % this.delta > 0 ? 1 : 0);
	}
	private TextField timeInputField;
	private TextField getTimeInputField() {
		if( this.timeInputField == null){
			this.timeInputField = new TextField();
			this.timeInputField.setPrefWidth(70);
			this.timeInputField.setMinWidth(Double.MIN_VALUE);
			this.timeInputField.setEditable(false);
			this.timeInputField.setOnKeyReleased(new EventHandler<KeyEvent>() {
				public void handle(KeyEvent event) {
					if( master.isUpdatable() ){
						try {
							master.checkAndSetOk( getComponentValue());
							getTimeSlider().setValue( calcFractions(time.getHour(), time.getMinute(), time.getSecond()));
					    } catch (ModelException me) {
					    	getDatePicker().getEditor().setText( me.getMessage());
					    }						
					}
				}
			});			
		}
		return this.timeInputField;
	}
	protected void setTimeValue( int hours, int minutes, int seconds) {
		LocalTime time;
		String format;
		if( this.partsPerHour > 60 ){				
			time =  LocalTime.of( hours, minutes, seconds);
			format = DateAndTime.TIMEFORMAT;
		}
		else {
			time =  LocalTime.of( hours, minutes, 0);				
			format = DateAndTime.TIMEFORMAT_SIMPLE;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( format );
		this.getTimeInputField().setText( time.format(formatter));							
	}

	public void setComponentValue( String value) {			
		if( value != null){
			java.util.Date tmp;
			try {
				tmp = DateAndTime.parseTimestamp(value);
				this.setComponentValue(tmp);
			} catch (ParseException e) {
				this.datePicker.getEditor().setText( e.getMessage());
			}
		} 
	}
	
	public void setComponentValue( java.util.Date value) {
		this.result = value;
		Instant instant = this.result.toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		this.date = zdt.toLocalDate();
		this.time = zdt.toLocalTime();
		this.datePicker.getEditor().setText( DateAndTime.toString( this.result, false));
		this.setTimeValue( this.time.getHour(), this.time.getMinute(), this.time.getSecond());
	}

	public String getComponentValue() {
		if( check()){
//System.out.println("getComponentValue " + this.getCurrentResult());		
			return this.getCurrentResult();
		}
//System.out.println("getComponentValue gescheitert");				
		return this.getDatePicker().getEditor().getText() + " " + this.getTimeInputField().getText(); 
	}

	String getCurrentResult() {
		return DateAndTime.toString(this.result, true);
	}
	
	public java.util.Date getResult(){
		return this.result;
	}
	
	public boolean check() {
		boolean isResultOk = false;
		java.util.Date tmp = this.result;
		try {
			String dateInputAsText = this.getDatePicker().getEditor().getText();
			if( dateInputAsText.length() > 0){				
				tmp = DateAndTime.parseDate( dateInputAsText );
				this.date = tmp.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				isResultOk = true;
			} else if( this.getDatePicker().getValue() != null){
				this.date = this.getDatePicker().getValue();
				isResultOk = true;
			}	
		} catch (java.text.ParseException pe) {}
		if( isResultOk){
			try{	
				tmp = DateAndTime.parseTime( this.getTimeInputField().getText() );
				this.time = tmp.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
				this.result = java.util.Date.from( this.date.atTime(this.time).atZone(ZoneId.systemDefault()).toInstant() );
			} catch (ParseException pe) {
				isResultOk = false;
//System.out.println("parse time -> schrott (Format?)" + this.getTimeInputField().getText());				
			}			
		}
		return isResultOk;
	}
		
	public void setComponentEditable() {
		this.getTimeInputField().setEditable(true);
		this.getDatePicker().setDisable(false);
		this.getTimeSlider().setVisible(true);
	}
	
	public void handleFocusGained() {
		this.getDatePicker().requestFocus();
	}

}


interface ValueTimestampMaster{

	boolean isUpdatable();

	boolean checkAndSetOk(String value) throws ModelException;	
}


class DetailPanelFactory implements AnythingVisitor {
	protected DefaultDetailPanel result = null;
	private ExceptionAndEventHandler handler;
	public DetailPanelFactory(ExceptionAndEventHandler handler) {
		this.handler = handler;
	}
    public void handleProducerLst(view.ProducerLstView object){
        result = new ProducerLstDefaultDetailPanel(handler, object);
    }
    public void handleCONCBackgroundTask(view.CONCBackgroundTaskView object){
        result = new CONCBackgroundTaskDefaultDetailPanel(handler, object);
    }
    public void handleProductGroup(view.ProductGroupView object){
        result = new ProductGroupDefaultDetailPanel(handler, object);
    }
    public void handleCustomerService(view.CustomerServiceView object){
        result = new CustomerServiceDefaultDetailPanel(handler, object);
    }
    public void handleRemainingStock(view.RemainingStockView object){
        result = new RemainingStockDefaultDetailPanel(handler, object);
    }
    public void handleOrderQuantifiedArticle(view.OrderQuantifiedArticleView object){
        result = new OrderQuantifiedArticleDefaultDetailPanel(handler, object);
    }
    public void handleServer(view.ServerView object){
        result = new ServerDefaultDetailPanel(handler, object);
    }
    public void handleErrorDisplay(view.ErrorDisplayView object){
        result = new ErrorDisplayDefaultDetailPanel(handler, object);
    }
    public void handleReOrderQuantifiedArticle(view.ReOrderQuantifiedArticleView object){
        result = new ReOrderQuantifiedArticleDefaultDetailPanel(handler, object);
    }
    public void handleNotInSale(view.NotInSaleView object){
        result = new NotInSaleDefaultDetailPanel(handler, object);
    }
    public void handleCustomerRegisterService(view.CustomerRegisterServiceView object){
        result = new CustomerRegisterServiceDefaultDetailPanel(handler, object);
    }
    public void handleProcessingOrderState(view.ProcessingOrderStateView object){
        result = new ProcessingOrderStateDefaultDetailPanel(handler, object);
    }
    public void handleComponentContainerImplementation(view.ComponentContainerImplementationView object){
        result = new ComponentContainerImplementationDefaultDetailPanel(handler, object);
    }
    public void handleGlobalOrderArchive(view.GlobalOrderArchiveView object){
        result = new GlobalOrderArchiveDefaultDetailPanel(handler, object);
    }
    public void handleCustomerDeliveryTimeManager(view.CustomerDeliveryTimeManagerView object){
        result = new CustomerDeliveryTimeManagerDefaultDetailPanel(handler, object);
    }
    public void handleSettings(view.SettingsView object){
        result = new SettingsDefaultDetailPanel(handler, object);
    }
    public void handleOrder(view.OrderView object){
        result = new OrderDefaultDetailPanel(handler, object);
    }
    public void handleOrderQuantifiedArticleNormalState(view.OrderQuantifiedArticleNormalStateView object){
        result = new OrderQuantifiedArticleNormalStateDefaultDetailPanel(handler, object);
    }
    public void handleCustomerAccount(view.CustomerAccountView object){
        result = new CustomerAccountDefaultDetailPanel(handler, object);
    }
    public void handleGlobalOrderManager(view.GlobalOrderManagerView object){
        result = new GlobalOrderManagerDefaultDetailPanel(handler, object);
    }
    public void handleReOrderManager(view.ReOrderManagerView object){
        result = new ReOrderManagerDefaultDetailPanel(handler, object);
    }
    public void handleInTransitOrderState(view.InTransitOrderStateView object){
        result = new InTransitOrderStateDefaultDetailPanel(handler, object);
    }
    public void handleShop(view.ShopView object){
        result = new ShopDefaultDetailPanel(handler, object);
    }
    public void handleProducer(view.ProducerView object){
        result = new ProducerDefaultDetailPanel(handler, object);
    }
    public void handleArticleReturn(view.ArticleReturnView object){
        result = new ArticleReturnDefaultDetailPanel(handler, object);
    }
    public void handleOrderQuantifiedArticleMarkedForReturnState(view.OrderQuantifiedArticleMarkedForReturnStateView object){
        result = new OrderQuantifiedArticleMarkedForReturnStateDefaultDetailPanel(handler, object);
    }
    public void handleArticleWrapper(view.ArticleWrapperView object){
        result = new ArticleWrapperDefaultDetailPanel(handler, object);
    }
    public void handlePreOrderState(view.PreOrderStateView object){
        result = new PreOrderStateDefaultDetailPanel(handler, object);
    }
    public void handleReturnManager(view.ReturnManagerView object){
        result = new ReturnManagerDefaultDetailPanel(handler, object);
    }
    public void handleArticle(view.ArticleView object){
        result = new ArticleDefaultDetailPanel(handler, object);
    }
    public void handleCustomerDeliveryTime(view.CustomerDeliveryTimeView object){
        result = new CustomerDeliveryTimeDefaultDetailPanel(handler, object);
    }
    public void handleOwnerService(view.OwnerServiceView object){
        result = new OwnerServiceDefaultDetailPanel(handler, object);
    }
    public void handleFinishedOrderState(view.FinishedOrderStateView object){
        result = new FinishedOrderStateDefaultDetailPanel(handler, object);
    }
    public void handleComponentManager(view.ComponentManagerView object){
        result = new ComponentManagerDefaultDetailPanel(handler, object);
    }
    public void handleCustomerArticleLst(view.CustomerArticleLstView object){
        result = new CustomerArticleLstDefaultDetailPanel(handler, object);
    }
    public void handleShoppingCartQuantifiedArticle(view.ShoppingCartQuantifiedArticleView object){
        result = new ShoppingCartQuantifiedArticleDefaultDetailPanel(handler, object);
    }
    public void handleNewCreated(view.NewCreatedView object){
        result = new NewCreatedDefaultDetailPanel(handler, object);
    }
    public void handleBackgroundTaskManager(view.BackgroundTaskManagerView object){
        result = new BackgroundTaskManagerDefaultDetailPanel(handler, object);
    }
    public void handleWaitingForAcceptOrderState(view.WaitingForAcceptOrderStateView object){
        result = new WaitingForAcceptOrderStateDefaultDetailPanel(handler, object);
    }
    public void handleInSale(view.InSaleView object){
        result = new InSaleDefaultDetailPanel(handler, object);
    }
    public void handleReturnQuantifiedArticle(view.ReturnQuantifiedArticleView object){
        result = new ReturnQuantifiedArticleDefaultDetailPanel(handler, object);
    }
    public void handleShoppingCart(view.ShoppingCartView object){
        result = new ShoppingCartDefaultDetailPanel(handler, object);
    }
    public void handleArticlesInReturnOrderState(view.ArticlesInReturnOrderStateView object){
        result = new ArticlesInReturnOrderStateDefaultDetailPanel(handler, object);
    }
    public void handleOrderQuantifiedArticlePreOrder(view.OrderQuantifiedArticlePreOrderView object){
        result = new OrderQuantifiedArticlePreOrderDefaultDetailPanel(handler, object);
    }
    public void handleCanceledOrderState(view.CanceledOrderStateView object){
        result = new CanceledOrderStateDefaultDetailPanel(handler, object);
    }
    public void handleCustomerOrderManager(view.CustomerOrderManagerView object){
        result = new CustomerOrderManagerDefaultDetailPanel(handler, object);
    }

}



class ProducerLstDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ProducerLst$$currentProducer = "ProducerLst$$currentProducer";
    
    protected ProducerLstDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ProducerLstView getAnything(){
        return (view.ProducerLstView)this.anything;
    }
}

class CONCBackgroundTaskDefaultDetailPanel extends DefaultDetailPanel{
    
    protected CONCBackgroundTaskDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.CONCBackgroundTaskView getAnything(){
        return (view.CONCBackgroundTaskView)this.anything;
    }
}

class ProductGroupDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ProductGroup$$container = "ProductGroup$$container";
    protected static final String ProductGroup$$name = "ProductGroup$$name";
    
    protected ProductGroupDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new StringPanel(this, "Name", this.getAnything().getName());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(ProductGroup$$name, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ProductGroupView getAnything(){
        return (view.ProductGroupView)this.anything;
    }
}

class CustomerServiceDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String CustomerService$$articleLst = "CustomerService$$articleLst";
    protected static final String CustomerService$$componentManager = "CustomerService$$componentManager";
    protected static final String CustomerService$$customerDeliveryTimeManager = "CustomerService$$customerDeliveryTimeManager";
    protected static final String CustomerService$$account = "CustomerService$$account";
    protected static final String CustomerService$$cart = "CustomerService$$cart";
    protected static final String CustomerService$$orderManager = "CustomerService$$orderManager";
    
    protected CustomerServiceDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.CustomerServiceView getAnything(){
        return (view.CustomerServiceView)this.anything;
    }
}

class RemainingStockDefaultDetailPanel extends DefaultDetailPanel{
    
    protected RemainingStockDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.RemainingStockView getAnything(){
        return (view.RemainingStockView)this.anything;
    }
}

class OrderQuantifiedArticleDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String QuantifiedArticle$$quantity = "QuantifiedArticle$$quantity";
    protected static final String OrderQuantifiedArticle$$articlePriceAtOrderTime = "OrderQuantifiedArticle$$articlePriceAtOrderTime";
    
    protected OrderQuantifiedArticleDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Anzahl", this.getAnything().getQuantity());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(QuantifiedArticle$$quantity, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Preis", this.getAnything().getArticlePriceAtOrderTime());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(OrderQuantifiedArticle$$articlePriceAtOrderTime, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.OrderQuantifiedArticleView getAnything(){
        return (view.OrderQuantifiedArticleView)this.anything;
    }
}

class ServerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String Server$$service = "Server$$service";
    protected static final String Server$$user = "Server$$user";
    
    protected ServerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new StringPanel(this, "user", this.getAnything().getUser());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Server$$user, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ServerView getAnything(){
        return (view.ServerView)this.anything;
    }
}

class ErrorDisplayDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ErrorDisplay$$message = "ErrorDisplay$$message";
    
    protected ErrorDisplayDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new StringPanel(this, "message", this.getAnything().getMessage());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(ErrorDisplay$$message, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ErrorDisplayView getAnything(){
        return (view.ErrorDisplayView)this.anything;
    }
}

class ReOrderQuantifiedArticleDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String QuantifiedArticle$$quantity = "QuantifiedArticle$$quantity";
    protected static final String ReOrderQuantifiedArticle$$countdown = "ReOrderQuantifiedArticle$$countdown";
    
    protected ReOrderQuantifiedArticleDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Anzahl", this.getAnything().getQuantity());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(QuantifiedArticle$$quantity, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Verbleibende Lieferzeit", this.getAnything().getCountdown());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(ReOrderQuantifiedArticle$$countdown, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ReOrderQuantifiedArticleView getAnything(){
        return (view.ReOrderQuantifiedArticleView)this.anything;
    }
}

class NotInSaleDefaultDetailPanel extends DefaultDetailPanel{
    
    protected NotInSaleDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.NotInSaleView getAnything(){
        return (view.NotInSaleView)this.anything;
    }
}

class CustomerRegisterServiceDefaultDetailPanel extends DefaultDetailPanel{
    
    protected CustomerRegisterServiceDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.CustomerRegisterServiceView getAnything(){
        return (view.CustomerRegisterServiceView)this.anything;
    }
}

class ProcessingOrderStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected ProcessingOrderStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ProcessingOrderStateView getAnything(){
        return (view.ProcessingOrderStateView)this.anything;
    }
}

class ComponentContainerImplementationDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ComponentContainerImplementation$$components = "ComponentContainerImplementation$$components";
    
    protected ComponentContainerImplementationDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ComponentContainerImplementationView getAnything(){
        return (view.ComponentContainerImplementationView)this.anything;
    }
}

class GlobalOrderArchiveDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String GlobalOrderArchive$$orders = "GlobalOrderArchive$$orders";
    
    protected GlobalOrderArchiveDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.GlobalOrderArchiveView getAnything(){
        return (view.GlobalOrderArchiveView)this.anything;
    }
}

class CustomerDeliveryTimeManagerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String CustomerDeliveryTimeManager$$customerDeliveryTimes = "CustomerDeliveryTimeManager$$customerDeliveryTimes";
    
    protected CustomerDeliveryTimeManagerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.CustomerDeliveryTimeManagerView getAnything(){
        return (view.CustomerDeliveryTimeManagerView)this.anything;
    }
}

class SettingsDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String Settings$$newCustomerDefaultBalance = "Settings$$newCustomerDefaultBalance";
    protected static final String Settings$$newCustomerDefaultLimit = "Settings$$newCustomerDefaultLimit";
    protected static final String Settings$$returnPercentage = "Settings$$returnPercentage";
    
    protected SettingsDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new FractionPanel(this, "Neukunden Startguthaben", this.getAnything().getNewCustomerDefaultBalance());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Settings$$newCustomerDefaultBalance, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Neukunden Limit", this.getAnything().getNewCustomerDefaultLimit());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Settings$$newCustomerDefaultLimit, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Retouren Prozentsatz", this.getAnything().getReturnPercentage());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Settings$$returnPercentage, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.SettingsView getAnything(){
        return (view.SettingsView)this.anything;
    }
}

class OrderDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String Order$$articles = "Order$$articles";
    protected static final String Order$$customerDeliveryTime = "Order$$customerDeliveryTime";
    protected static final String Order$$customerAccount = "Order$$customerAccount";
    protected static final String Order$$totalPrice = "Order$$totalPrice";
    protected static final String Order$$returnPercentageAtOrderTime = "Order$$returnPercentageAtOrderTime";
    
    protected OrderDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new FractionPanel(this, "Gesamtpreis", this.getAnything().getTotalPrice());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Order$$totalPrice, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Retourenprozentsatz", this.getAnything().getReturnPercentageAtOrderTime());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Order$$returnPercentageAtOrderTime, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.OrderView getAnything(){
        return (view.OrderView)this.anything;
    }
}

class OrderQuantifiedArticleNormalStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected OrderQuantifiedArticleNormalStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.OrderQuantifiedArticleNormalStateView getAnything(){
        return (view.OrderQuantifiedArticleNormalStateView)this.anything;
    }
}

class CustomerAccountDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String CustomerAccount$$name = "CustomerAccount$$name";
    protected static final String CustomerAccount$$balance = "CustomerAccount$$balance";
    protected static final String CustomerAccount$$limit = "CustomerAccount$$limit";
    protected static final String CustomerAccount$$shoppingCart = "CustomerAccount$$shoppingCart";
    
    protected CustomerAccountDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new StringPanel(this, "Benutzername", this.getAnything().getName());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(CustomerAccount$$name, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Kontostand", this.getAnything().getBalance());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(CustomerAccount$$balance, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Limit", this.getAnything().getLimit());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(CustomerAccount$$limit, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.CustomerAccountView getAnything(){
        return (view.CustomerAccountView)this.anything;
    }
}

class GlobalOrderManagerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String OrderManager$$orders = "OrderManager$$orders";
    
    protected GlobalOrderManagerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.GlobalOrderManagerView getAnything(){
        return (view.GlobalOrderManagerView)this.anything;
    }
}

class ReOrderManagerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ReOrderManager$$reorderArticles = "ReOrderManager$$reorderArticles";
    
    protected ReOrderManagerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ReOrderManagerView getAnything(){
        return (view.ReOrderManagerView)this.anything;
    }
}

class InTransitOrderStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String InTransitOrderState$$ticksLeft = "InTransitOrderState$$ticksLeft";
    
    protected InTransitOrderStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new IntegerPanel(this, "ticksLeft", this.getAnything().getTicksLeft());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(InTransitOrderState$$ticksLeft, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.InTransitOrderStateView getAnything(){
        return (view.InTransitOrderStateView)this.anything;
    }
}

class ShopDefaultDetailPanel extends DefaultDetailPanel{
    
    protected ShopDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ShopView getAnything(){
        return (view.ShopView)this.anything;
    }
}

class ProducerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String Producer$$name = "Producer$$name";
    
    protected ProducerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new StringPanel(this, "name", this.getAnything().getName());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Producer$$name, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ProducerView getAnything(){
        return (view.ProducerView)this.anything;
    }
}

class ArticleReturnDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ArticleReturn$$order = "ArticleReturn$$order";
    protected static final String ArticleReturn$$returnArticles = "ArticleReturn$$returnArticles";
    
    protected ArticleReturnDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ArticleReturnView getAnything(){
        return (view.ArticleReturnView)this.anything;
    }
}

class OrderQuantifiedArticleMarkedForReturnStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected OrderQuantifiedArticleMarkedForReturnStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.OrderQuantifiedArticleMarkedForReturnStateView getAnything(){
        return (view.OrderQuantifiedArticleMarkedForReturnStateView)this.anything;
    }
}

class ArticleWrapperDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ArticleWrapper$$price = "ArticleWrapper$$price";
    protected static final String ArticleWrapper$$name = "ArticleWrapper$$name";
    
    protected ArticleWrapperDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new FractionPanel(this, "Preis", this.getAnything().getPrice());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(ArticleWrapper$$price, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new StringPanel(this, "Name", this.getAnything().getName());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(ArticleWrapper$$name, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ArticleWrapperView getAnything(){
        return (view.ArticleWrapperView)this.anything;
    }
}

class PreOrderStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected PreOrderStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.PreOrderStateView getAnything(){
        return (view.PreOrderStateView)this.anything;
    }
}

class ReturnManagerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ReturnManager$$articleReturn = "ReturnManager$$articleReturn";
    
    protected ReturnManagerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ReturnManagerView getAnything(){
        return (view.ReturnManagerView)this.anything;
    }
}

class ArticleDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String Article$$name = "Article$$name";
    protected static final String Article$$price = "Article$$price";
    protected static final String Article$$minStock = "Article$$minStock";
    protected static final String Article$$maxStock = "Article$$maxStock";
    protected static final String Article$$currentStock = "Article$$currentStock";
    protected static final String Article$$producerDeliveryTime = "Article$$producerDeliveryTime";
    protected static final String Article$$currentState = "Article$$currentState";
    protected static final String Article$$producerName = "Article$$producerName";
    protected static final String Article$$wrapper = "Article$$wrapper";
    
    protected ArticleDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new StringPanel(this, "Bezeichnung", this.getAnything().getName());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Article$$name, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Preis", this.getAnything().getPrice());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Article$$price, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Mindestlagerbestand", this.getAnything().getMinStock());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Article$$minStock, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Maximallagerbestand", this.getAnything().getMaxStock());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Article$$maxStock, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Lagerbestand", this.getAnything().getCurrentStock());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Article$$currentStock, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Herstellerlieferzeit", this.getAnything().getProducerDeliveryTime());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Article$$producerDeliveryTime, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new StringPanel(this, "Status", this.getAnything().getCurrentState());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Article$$currentState, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new StringPanel(this, "Hersteller", this.getAnything().getProducerName());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(Article$$producerName, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ArticleView getAnything(){
        return (view.ArticleView)this.anything;
    }
}

class CustomerDeliveryTimeDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String CustomerDeliveryTime$$name = "CustomerDeliveryTime$$name";
    protected static final String CustomerDeliveryTime$$price = "CustomerDeliveryTime$$price";
    protected static final String CustomerDeliveryTime$$deliveryTime = "CustomerDeliveryTime$$deliveryTime";
    
    protected CustomerDeliveryTimeDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new StringPanel(this, "Name", this.getAnything().getName());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(CustomerDeliveryTime$$name, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Preis", this.getAnything().getPrice());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(CustomerDeliveryTime$$price, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Lieferzeit", this.getAnything().getDeliveryTime());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(CustomerDeliveryTime$$deliveryTime, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.CustomerDeliveryTimeView getAnything(){
        return (view.CustomerDeliveryTimeView)this.anything;
    }
}

class OwnerServiceDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String OwnerService$$componentManager = "OwnerService$$componentManager";
    protected static final String OwnerService$$prmanager = "OwnerService$$prmanager";
    protected static final String OwnerService$$customerDeliveryTimeManager = "OwnerService$$customerDeliveryTimeManager";
    protected static final String OwnerService$$settings = "OwnerService$$settings";
    protected static final String OwnerService$$reOrderManager = "OwnerService$$reOrderManager";
    protected static final String OwnerService$$orderManager = "OwnerService$$orderManager";
    protected static final String OwnerService$$returnManager = "OwnerService$$returnManager";
    protected static final String OwnerService$$orderArchive = "OwnerService$$orderArchive";
    
    protected OwnerServiceDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.OwnerServiceView getAnything(){
        return (view.OwnerServiceView)this.anything;
    }
}

class FinishedOrderStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected FinishedOrderStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.FinishedOrderStateView getAnything(){
        return (view.FinishedOrderStateView)this.anything;
    }
}

class ComponentManagerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ComponentManager$$container = "ComponentManager$$container";
    
    protected ComponentManagerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ComponentManagerView getAnything(){
        return (view.ComponentManagerView)this.anything;
    }
}

class CustomerArticleLstDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String CustomerArticleLst$$articles = "CustomerArticleLst$$articles";
    
    protected CustomerArticleLstDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.CustomerArticleLstView getAnything(){
        return (view.CustomerArticleLstView)this.anything;
    }
}

class ShoppingCartQuantifiedArticleDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String QuantifiedArticle$$quantity = "QuantifiedArticle$$quantity";
    protected static final String ShoppingCartQuantifiedArticle$$price = "ShoppingCartQuantifiedArticle$$price";
    
    protected ShoppingCartQuantifiedArticleDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Anzahl", this.getAnything().getQuantity());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(QuantifiedArticle$$quantity, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        try{
            BaseTypePanel panel = new FractionPanel(this, "Preis", this.getAnything().getPrice());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(ShoppingCartQuantifiedArticle$$price, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ShoppingCartQuantifiedArticleView getAnything(){
        return (view.ShoppingCartQuantifiedArticleView)this.anything;
    }
}

class NewCreatedDefaultDetailPanel extends DefaultDetailPanel{
    
    protected NewCreatedDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.NewCreatedView getAnything(){
        return (view.NewCreatedView)this.anything;
    }
}

class BackgroundTaskManagerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String BackgroundTaskManager$$tasks = "BackgroundTaskManager$$tasks";
    
    protected BackgroundTaskManagerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.BackgroundTaskManagerView getAnything(){
        return (view.BackgroundTaskManagerView)this.anything;
    }
}

class WaitingForAcceptOrderStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String WaitingForAcceptOrderState$$ticksLeft = "WaitingForAcceptOrderState$$ticksLeft";
    
    protected WaitingForAcceptOrderStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new IntegerPanel(this, "ticksLeft", this.getAnything().getTicksLeft());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(WaitingForAcceptOrderState$$ticksLeft, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.WaitingForAcceptOrderStateView getAnything(){
        return (view.WaitingForAcceptOrderStateView)this.anything;
    }
}

class InSaleDefaultDetailPanel extends DefaultDetailPanel{
    
    protected InSaleDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.InSaleView getAnything(){
        return (view.InSaleView)this.anything;
    }
}

class ReturnQuantifiedArticleDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String QuantifiedArticle$$quantity = "QuantifiedArticle$$quantity";
    
    protected ReturnQuantifiedArticleDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new IntegerPanel(this, "Anzahl", this.getAnything().getQuantity());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(QuantifiedArticle$$quantity, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ReturnQuantifiedArticleView getAnything(){
        return (view.ReturnQuantifiedArticleView)this.anything;
    }
}

class ShoppingCartDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ShoppingCart$$articles = "ShoppingCart$$articles";
    
    protected ShoppingCartDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.ShoppingCartView getAnything(){
        return (view.ShoppingCartView)this.anything;
    }
}

class ArticlesInReturnOrderStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String ArticlesInReturnOrderState$$ticksLeft = "ArticlesInReturnOrderState$$ticksLeft";
    
    protected ArticlesInReturnOrderStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new IntegerPanel(this, "ticksLeft", this.getAnything().getTicksLeft());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(ArticlesInReturnOrderState$$ticksLeft, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.ArticlesInReturnOrderStateView getAnything(){
        return (view.ArticlesInReturnOrderStateView)this.anything;
    }
}

class OrderQuantifiedArticlePreOrderDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String OrderQuantifiedArticlePreOrder$$leftQuantity = "OrderQuantifiedArticlePreOrder$$leftQuantity";
    
    protected OrderQuantifiedArticlePreOrderDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        try{
            BaseTypePanel panel = new IntegerPanel(this, "leftQuantity", this.getAnything().getLeftQuantity());
            this.getScrollablePane().getChildren().add(panel);
            this.panels.put(OrderQuantifiedArticlePreOrder$$leftQuantity, panel);
        }catch(ModelException e){
            this.getExceptionAndEventhandler().handleException(e);
        }
        
    }
    protected view.OrderQuantifiedArticlePreOrderView getAnything(){
        return (view.OrderQuantifiedArticlePreOrderView)this.anything;
    }
}

class CanceledOrderStateDefaultDetailPanel extends DefaultDetailPanel{
    
    protected CanceledOrderStateDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.CanceledOrderStateView getAnything(){
        return (view.CanceledOrderStateView)this.anything;
    }
}

class CustomerOrderManagerDefaultDetailPanel extends DefaultDetailPanel{
    
    protected static final String OrderManager$$orders = "OrderManager$$orders";
    
    protected CustomerOrderManagerDefaultDetailPanel(ExceptionAndEventHandler exceptionHandler, Anything anything) {
        super(exceptionHandler, anything);
    }
    protected void addFields(){
        
    }
    protected view.CustomerOrderManagerView getAnything(){
        return (view.CustomerOrderManagerView)this.anything;
    }
}
