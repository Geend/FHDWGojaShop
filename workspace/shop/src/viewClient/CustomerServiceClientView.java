package viewClient;

import constants.IconConstants;
import view.*;
import view.objects.ViewRoot;
import view.objects.ViewObjectInTree;

import view.visitor.AnythingStandardVisitor;

import java.util.Optional;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;


import com.sun.javafx.geom.Point2D;

import javax.swing.tree.TreeModel;


public class CustomerServiceClientView extends BorderPane implements ExceptionAndEventHandler{

	private ConnectionMaster 		 connection;
	private ExceptionAndEventHandler parent;	
	private CustomerServiceView 		 		 service;

	/**
	 * This is the default constructor
	 */
	public CustomerServiceClientView( ExceptionAndEventHandler parent, CustomerServiceView service) {
		super();
		this.parent = parent;
		this.service = service;
		this.initialize();
	}
	@SuppressWarnings("unused")
	private CustomerServiceView getService(){
		return this.service;
	}
	private void initialize() {
        this.setCenter( this.getMainSplitPane());
        if( !WithStaticOperations && this.getMainToolBar().getItems().size() > 0){
        	this.setTop( this.getMainToolBar() );
        }
	}
	private ToolBar mainToolBar = null;
	private ToolBar getMainToolBar() {
		if( this.mainToolBar == null){
			this.mainToolBar = new ToolBar();
			for( Button current : this.getToolButtonsForStaticOperations()) {
				this.mainToolBar.getItems().add( current );
			}
		}
		return this.mainToolBar;
	}
	private SplitPane mainSplitPane = null;
	private SplitPane getMainSplitPane() {
		if( this.mainSplitPane == null) {
			this.mainSplitPane = new SplitPane();
			this.mainSplitPane.setOrientation( Orientation.HORIZONTAL);
			this.mainSplitPane.getItems().addAll( this.getNavigationSplitPane(), this.getTitledDetailsPane() );	
			this.mainSplitPane.setDividerPosition( 0, 0.5);
			this.mainSplitPane.prefHeightProperty().bind( this.heightProperty());
			this.mainSplitPane.prefWidthProperty().bind( this.widthProperty());
		}
		return this.mainSplitPane;
	}
	private SplitPane navigationSplitPane = null;
	private SplitPane getNavigationSplitPane(){
		if( this.navigationSplitPane == null ){
			this.navigationSplitPane = new SplitPane();
			this.navigationSplitPane.setOrientation( Orientation.VERTICAL);
			this.navigationSplitPane.getItems().addAll( this.getNavigationPanel(), this.getErrorPanel());
			this.navigationSplitPane.prefHeightProperty().bind( this.getMainSplitPane().heightProperty());
			this.navigationSplitPane.setDividerPosition( 0, 1.0);
			this.navigationSplitPane.heightProperty().addListener(new ChangeListener<Number>() {
				public void changed(
						ObservableValue<? extends Number> observable,
						Number oldValue, Number newValue) {
					if(! getErrorPanel().isVisible()) {						
						navigationSplitPane.setDividerPosition(0, 1.0);
					} else {						
						navigationSplitPane.setDividerPosition(0, 0.7);
					}
				}
			});
			this.getErrorPanel().setMinHeight(0);
		}
		return this.navigationSplitPane;
	}
	private TitledPane treePanel = null;
	private TitledPane getNavigationPanel() {
		if( this.treePanel == null) {
			this.treePanel = new TitledPane( GUIConstants.NaviationTitle, this.getNavigationTree() );
			this.treePanel.setCollapsible( false );
			this.treePanel.prefHeightProperty().bind( this.getNavigationSplitPane().heightProperty());
		}
		return treePanel;
	}
	private TitledPane errorPanel = null;
	private TitledPane getErrorPanel(){
		if( this.errorPanel == null){
			this.errorPanel = new TitledPane( GUIConstants.ErrorTitle, this.getErrorTree());
			this.errorPanel.setCollapsible( false );
			this.errorPanel.setVisible( false );
		}
		return this.errorPanel;
	}

	private TreeRefresh errorTree = null;
	private TreeRefresh getErrorTree(){
		if( this.errorTree == null){
			this.errorTree = new TreeRefresh(parent);
			this.errorTree.setOnContextMenuRequested( new EventHandler<ContextMenuEvent>() {
				public void handle(ContextMenuEvent e) {
					tryShowContextMenu( e, errorTree, false);					
				}
			});
		}
		return this.errorTree;
	}
	private void setErrors( TreeModel errors){
		this.getErrorPanel().setVisible(true);
		this.getErrorTree().setModel( errors );
		this.getNavigationSplitPane().setDividerPosition(0, 0.7);
	}
	private void setNoErrors(){
		this.getErrorPanel().setVisible(false);
        this.getNavigationSplitPane().setDividerPosition(0, 1.0);
	}
	private TitledPane titledDetailsPane = null;
	private TitledPane getTitledDetailsPane() {
		if( this.titledDetailsPane == null ){
			this.titledDetailsPane = new TitledPane();
			this.titledDetailsPane.setText( GUIConstants.DetailsTitle);
			this.titledDetailsPane.setCollapsible(false);			
			this.titledDetailsPane.prefHeightProperty().bind(this.getMainSplitPane().heightProperty());
		}
		return this.titledDetailsPane;		
	}	
	private TreeRefresh navigationTree = null;
	private TreeRefresh getNavigationTree() {
		if( this.navigationTree == null) {
			this.navigationTree = new TreeRefresh( parent );
			this.navigationTree.getSelectionModel().setSelectionMode( SelectionMode.SINGLE);
			this.navigationTree.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<ViewObjectInTree>>() {
				public void changed(
					ObservableValue<? extends TreeItem<ViewObjectInTree>> observable,
					TreeItem<ViewObjectInTree> oldValue,
					TreeItem<ViewObjectInTree> newValue) {
					if( menu !=null) menu.hide();
					if( newValue != null ){						
						setDetailsTable( (Anything) newValue.getValue().getWrappedObject());				
					}
				}
			});
			this.navigationTree.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
				public void handle(ContextMenuEvent e) {
					tryShowContextMenu( e, navigationTree, WithStaticOperations);					
				}
			});
			navigationTree.setOnKeyReleased( new EventHandler<KeyEvent>() {
				public void handle(KeyEvent event) {
					if( event.getCode() == KeyCode.F5 ){
						Platform.runLater( new Runnable() {
							public void run() {								
								try {
									getNavigationTree().refreshTree();
								} catch (ModelException e) {
									handleException(e);
								}			
							}
						});
					}
				}
			});
		}
		return this.navigationTree;
	}
	private DetailPanel currentDetails = null;
	protected void setDetailsTable( Anything object) {
		this.getTitledDetailsPane().setVisible( false );
		if (object == null && this.getConnection() != null) object = this.getConnection().getCustomerServiceView();
		if (object == null){
			this.currentDetails = getNoDetailsPanel();
		}else{
			try {
				this.currentDetails = this.getDetailView(object);
			} catch (ModelException e) {
				this.handleException(e);
				this.currentDetails = null;
			}
			if(this.currentDetails == null) this.currentDetails = getStandardDetailsTable(object);
		}
		this.getTitledDetailsPane().setContent( this.currentDetails );
		this.getTitledDetailsPane().setVisible( true );
		this.currentDetails.prefWidthProperty().bind( this.getTitledDetailsPane().widthProperty() );
	}

	private DetailPanel getDetailView(final Anything anything) throws ModelException {
		class PanelDecider extends AnythingStandardVisitor {

			private DetailPanel result;
			
			public DetailPanel getResult() {
				return this.result;
			}
			protected void standardHandling(Anything Anything) throws ModelException {
				this.result = null;
			}


			//TODO Overwrite all handle methods for the types for which you intend to provide a special panel!
		}
		PanelDecider decider = new PanelDecider();
		anything.accept(decider);
		return decider.getResult();
	}
	private NoDetailPanel noDetailPanel = null;
	public DetailPanel getNoDetailsPanel() {
		if( this.noDetailPanel == null) this.noDetailPanel = new NoDetailPanel(this);
		return noDetailPanel;
	}
	private ContextMenu menu = null;
	protected void tryShowContextMenu( ContextMenuEvent e, TreeRefresh tree, boolean withStaticOperations) {
		if( this.menu !=null ) this.menu.hide();
		SelectionModel<TreeItem<ViewObjectInTree>> selMod = tree.getSelectionModel();
		ViewObjectInTree selVal = selMod.getSelectedItem().getValue();
		ViewRoot selected = selVal.getWrappedObject();
		this.menu = this.getContextMenu( selected, withStaticOperations , new Point2D((float)e.getScreenX(), (float)e.getScreenY() ) );
		if( this.menu.getItems().size() > 0) {
			this.menu.show( this.getNavigationPanel(),  e.getScreenX(), e.getScreenY() );
		}
	}
	
	private DetailPanel getStandardDetailsTable(Anything object) {
		try {
			return DefaultDetailPanel.getStandardDetailPanel(object,this);
		} catch (ModelException e) {
			this.handleException(e);
			return new NoDetailPanel(this);
		}
	}

	public void setConnection(ConnectionMaster connection){
		this.connection = connection;
	}
	public CustomerServiceConnection getConnection(){
        	return (CustomerServiceConnection)this.connection;
	}
	/** Is called by the refresher thread if the server object has changed
	**/
	public void handleRefresh(){
		Platform.runLater(new Runnable() {
			public void run(){
				try {
					getNavigationTree().refreshTree();
					java.util.Vector<?> errors = getConnection().getCustomerServiceView().getErrors();
					if (errors.size() >0 )setErrors( new ListRoot(errors));
					else setNoErrors();
				} catch (ModelException e) {
					handleException(e);
				}			
			}
		});
		//TODO adjust implementation: handleRefresh()!
	}
	/** Is called only once after the connection has been established
	**/
	public void initializeConnection(){
		Platform.runLater( new  Runnable() {
			public void run() {
				getNavigationTree().setModel((TreeModel) getConnection().getCustomerServiceView());	
				getNavigationTree().getRoot().setExpanded(true);
				getNavigationTree().getSelectionModel().select( getNavigationTree().getRoot());
			}
		});
		//TODO adjust implementation: initializeConnection
	}
	public void handleException(ModelException exception) {
		this.parent.handleException(exception);
	}
	public void handleOKMessage(String message) {
		this.parent.handleOKMessage(message);
	}
	public void handleUserException(UserException exception) {
		this.parent.handleUserException(exception);	
	}	
	
	/* Menu and wizard section start */

	static boolean WithStaticOperations = false;


    interface MenuItemVisitor{
        ImageView handle(ReloadUIPRMTRMenuItem menuItem);
        ImageView handle(MarkForReturnPRMTROrderQuantifiedArticlePRMTRMenuItem menuItem);
        ImageView handle(ChangeArticleQuantityPRMTRShoppingCartQuantifiedArticlePRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(FindArticlePRMTRCustomerArticleLstPRMTRStringPRMTRMenuItem menuItem);
        ImageView handle(WithdrawPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem menuItem);
        ImageView handle(OrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem menuItem);
        ImageView handle(DepositPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem menuItem);
        ImageView handle(RemoveFromCartPRMTRShoppingCartQuantifiedArticlePRMTRMenuItem menuItem);
        ImageView handle(ClearErrorPRMTRErrorDisplayPRMTRMenuItem menuItem);
        ImageView handle(AddToCartPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(EmptyCartPRMTRShoppingCartPRMTRMenuItem menuItem);
        ImageView handle(AcceptOrderPRMTROrderPRMTRMenuItem menuItem);
        ImageView handle(UnmarkForReturnPRMTROrderQuantifiedArticlePRMTRMenuItem menuItem);
        ImageView handle(CancelPreOrderPRMTROrderPRMTRMenuItem menuItem);
        ImageView handle(ClearPRMTRCustomerArticleLstPRMTRMenuItem menuItem);
        ImageView handle(PreOrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem menuItem);
    }
    private abstract class CustomerServiceMenuItem extends MenuItem{
        private CustomerServiceMenuItem(){
            this.setGraphic(getIconForMenuItem(this));
        }
        abstract protected ImageView accept(MenuItemVisitor visitor);
    }
    private class ReloadUIPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class MarkForReturnPRMTROrderQuantifiedArticlePRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ChangeArticleQuantityPRMTRShoppingCartQuantifiedArticlePRMTRIntegerPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class FindArticlePRMTRCustomerArticleLstPRMTRStringPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class WithdrawPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class OrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class DepositPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class RemoveFromCartPRMTRShoppingCartQuantifiedArticlePRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ClearErrorPRMTRErrorDisplayPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class AddToCartPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class EmptyCartPRMTRShoppingCartPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class AcceptOrderPRMTROrderPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class UnmarkForReturnPRMTROrderQuantifiedArticlePRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class CancelPreOrderPRMTROrderPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ClearPRMTRCustomerArticleLstPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class PreOrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private java.util.Vector<javafx.scene.control.Button> getToolButtonsForStaticOperations() {
        java.util.Vector<javafx.scene.control.Button> result = new java.util.Vector<javafx.scene.control.Button>();
        javafx.scene.control.Button currentButton = null;
        currentButton = new javafx.scene.control.Button("Aktualisieren");
        currentButton.setGraphic(new ReloadUIPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                Alert confirm = new Alert(AlertType.CONFIRMATION);
                confirm.setTitle(GUIConstants.ConfirmButtonText);
                confirm.setHeaderText(null);
                confirm.setContentText("Aktualisieren" + GUIConstants.ConfirmQuestionMark);
                Optional<ButtonType> buttonResult = confirm.showAndWait();
                if (buttonResult.get() == ButtonType.OK) {
                    try {
                        getConnection().reloadUI();
                        getConnection().setEagerRefresh();
                        
                    }catch(ModelException me){
                        handleException(me);
                    }
                }
            }
        });
        result.add(currentButton);
        return result;
    }
    private ContextMenu getContextMenu(final ViewRoot selected, final boolean withStaticOperations, final Point2D menuPos) {
        final ContextMenu result = new ContextMenu();
        MenuItem item = null;
        item = new ReloadUIPRMTRMenuItem();
        item.setText("(S) Aktualisieren");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                Alert confirm = new Alert(AlertType.CONFIRMATION);
                confirm.setTitle(GUIConstants.ConfirmButtonText);
                confirm.setHeaderText(null);
                confirm.setContentText("Aktualisieren" + GUIConstants.ConfirmQuestionMark);
                Optional<ButtonType> buttonResult = confirm.showAndWait();
                if (buttonResult.get() == ButtonType.OK) {
                    try {
                        getConnection().reloadUI();
                        getConnection().setEagerRefresh();
                        
                    }catch(ModelException me){
                        handleException(me);
                    }
                }
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        if (selected != null){
            try {
                this.setPreCalculatedFilters(this.getConnection().customerService_Menu_Filter((Anything)selected));
            } catch (ModelException me){
                this.handleException(me);
                return result;
            }
            if (selected instanceof OrderView){
                item = new AcceptOrderPRMTROrderPRMTRMenuItem();
                item.setText("Lieferung annehmen");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        Alert confirm = new Alert(AlertType.CONFIRMATION);
                        confirm.setTitle(GUIConstants.ConfirmButtonText);
                        confirm.setHeaderText(null);
                        confirm.setContentText("Lieferung annehmen" + GUIConstants.ConfirmQuestionMark);
                        Optional<ButtonType> buttonResult = confirm.showAndWait();
                        if (buttonResult.get() == ButtonType.OK) {
                            try {
                                getConnection().acceptOrder((OrderView)selected);
                                getConnection().setEagerRefresh();
                                
                            }catch(ModelException me){
                                handleException(me);
                            }
                        }
                    }
                });
                result.getItems().add(item);
                if (filter_cancelPreOrder((OrderView) selected)) {
                    item = new CancelPreOrderPRMTROrderPRMTRMenuItem();
                    item.setText("Stornieren");
                    item.setOnAction(new EventHandler<ActionEvent>(){
                        public void handle(javafx.event.ActionEvent e) {
                            Alert confirm = new Alert(AlertType.CONFIRMATION);
                            confirm.setTitle(GUIConstants.ConfirmButtonText);
                            confirm.setHeaderText(null);
                            confirm.setContentText("Stornieren" + GUIConstants.ConfirmQuestionMark);
                            Optional<ButtonType> buttonResult = confirm.showAndWait();
                            if (buttonResult.get() == ButtonType.OK) {
                                try {
                                    getConnection().cancelPreOrder((OrderView)selected);
                                    getConnection().setEagerRefresh();
                                    
                                }catch(ModelException me){
                                    handleException(me);
                                }
                            }
                        }
                    });
                    result.getItems().add(item);
                }
            }
            if (selected instanceof OrderQuantifiedArticleView){
                if (filter_markForReturn((OrderQuantifiedArticleView) selected)) {
                    item = new MarkForReturnPRMTROrderQuantifiedArticlePRMTRMenuItem();
                    item.setText("Als Retour markieren");
                    item.setOnAction(new EventHandler<ActionEvent>(){
                        public void handle(javafx.event.ActionEvent e) {
                            Alert confirm = new Alert(AlertType.CONFIRMATION);
                            confirm.setTitle(GUIConstants.ConfirmButtonText);
                            confirm.setHeaderText(null);
                            confirm.setContentText("Als Retour markieren" + GUIConstants.ConfirmQuestionMark);
                            Optional<ButtonType> buttonResult = confirm.showAndWait();
                            if (buttonResult.get() == ButtonType.OK) {
                                try {
                                    getConnection().markForReturn((OrderQuantifiedArticleView)selected);
                                    getConnection().setEagerRefresh();
                                    
                                }catch(ModelException me){
                                    handleException(me);
                                }
                            }
                        }
                    });
                    result.getItems().add(item);
                }
                if (filter_unmarkForReturn((OrderQuantifiedArticleView) selected)) {
                    item = new UnmarkForReturnPRMTROrderQuantifiedArticlePRMTRMenuItem();
                    item.setText("Retour markierung entfernen");
                    item.setOnAction(new EventHandler<ActionEvent>(){
                        public void handle(javafx.event.ActionEvent e) {
                            Alert confirm = new Alert(AlertType.CONFIRMATION);
                            confirm.setTitle(GUIConstants.ConfirmButtonText);
                            confirm.setHeaderText(null);
                            confirm.setContentText("Retour markierung entfernen" + GUIConstants.ConfirmQuestionMark);
                            Optional<ButtonType> buttonResult = confirm.showAndWait();
                            if (buttonResult.get() == ButtonType.OK) {
                                try {
                                    getConnection().unmarkForReturn((OrderQuantifiedArticleView)selected);
                                    getConnection().setEagerRefresh();
                                    
                                }catch(ModelException me){
                                    handleException(me);
                                }
                            }
                        }
                    });
                    result.getItems().add(item);
                }
            }
            if (selected instanceof ShoppingCartView){
                item = new OrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem();
                item.setText("Bestellen ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServiceOrderShoppingCartCustomerDeliveryTimeMssgWizard wizard = new CustomerServiceOrderShoppingCartCustomerDeliveryTimeMssgWizard("Bestellen");
                        wizard.setFirstArgument((ShoppingCartView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
                item = new EmptyCartPRMTRShoppingCartPRMTRMenuItem();
                item.setText("Leeren");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        Alert confirm = new Alert(AlertType.CONFIRMATION);
                        confirm.setTitle(GUIConstants.ConfirmButtonText);
                        confirm.setHeaderText(null);
                        confirm.setContentText("Leeren" + GUIConstants.ConfirmQuestionMark);
                        Optional<ButtonType> buttonResult = confirm.showAndWait();
                        if (buttonResult.get() == ButtonType.OK) {
                            try {
                                getConnection().emptyCart((ShoppingCartView)selected);
                                getConnection().setEagerRefresh();
                                
                            }catch(ModelException me){
                                handleException(me);
                            }
                        }
                    }
                });
                result.getItems().add(item);
                item = new PreOrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem();
                item.setText("Vorbestellen ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServicePreOrderShoppingCartCustomerDeliveryTimeMssgWizard wizard = new CustomerServicePreOrderShoppingCartCustomerDeliveryTimeMssgWizard("Vorbestellen");
                        wizard.setFirstArgument((ShoppingCartView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof ErrorDisplayView){
                item = new ClearErrorPRMTRErrorDisplayPRMTRMenuItem();
                item.setText("Fehler zurücksetzten");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        Alert confirm = new Alert(AlertType.CONFIRMATION);
                        confirm.setTitle(GUIConstants.ConfirmButtonText);
                        confirm.setHeaderText(null);
                        confirm.setContentText("Fehler zurücksetzten" + GUIConstants.ConfirmQuestionMark);
                        Optional<ButtonType> buttonResult = confirm.showAndWait();
                        if (buttonResult.get() == ButtonType.OK) {
                            try {
                                getConnection().clearError((ErrorDisplayView)selected);
                                getConnection().setEagerRefresh();
                                
                            }catch(ModelException me){
                                handleException(me);
                            }
                        }
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof ShoppingCartQuantifiedArticleView){
                item = new ChangeArticleQuantityPRMTRShoppingCartQuantifiedArticlePRMTRIntegerPRMTRMenuItem();
                item.setText("Anzahl ï¿½ndern ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServiceChangeArticleQuantityShoppingCartQuantifiedArticleIntegerMssgWizard wizard = new CustomerServiceChangeArticleQuantityShoppingCartQuantifiedArticleIntegerMssgWizard("Anzahl ï¿½ndern");
                        wizard.setFirstArgument((ShoppingCartQuantifiedArticleView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
                item = new RemoveFromCartPRMTRShoppingCartQuantifiedArticlePRMTRMenuItem();
                item.setText("Entfernen");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        Alert confirm = new Alert(AlertType.CONFIRMATION);
                        confirm.setTitle(GUIConstants.ConfirmButtonText);
                        confirm.setHeaderText(null);
                        confirm.setContentText("Entfernen" + GUIConstants.ConfirmQuestionMark);
                        Optional<ButtonType> buttonResult = confirm.showAndWait();
                        if (buttonResult.get() == ButtonType.OK) {
                            try {
                                getConnection().removeFromCart((ShoppingCartQuantifiedArticleView)selected);
                                getConnection().setEagerRefresh();
                                
                            }catch(ModelException me){
                                handleException(me);
                            }
                        }
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof CustomerArticleLstView){
                item = new FindArticlePRMTRCustomerArticleLstPRMTRStringPRMTRMenuItem();
                item.setText("Artikel suchen ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServiceFindArticleCustomerArticleLstStringMssgWizard wizard = new CustomerServiceFindArticleCustomerArticleLstStringMssgWizard("Artikel suchen");
                        wizard.setFirstArgument((CustomerArticleLstView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
                item = new ClearPRMTRCustomerArticleLstPRMTRMenuItem();
                item.setText("Suche zurücksetzen");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        Alert confirm = new Alert(AlertType.CONFIRMATION);
                        confirm.setTitle(GUIConstants.ConfirmButtonText);
                        confirm.setHeaderText(null);
                        confirm.setContentText("Suche zurücksetzen" + GUIConstants.ConfirmQuestionMark);
                        Optional<ButtonType> buttonResult = confirm.showAndWait();
                        if (buttonResult.get() == ButtonType.OK) {
                            try {
                                getConnection().clear((CustomerArticleLstView)selected);
                                getConnection().setEagerRefresh();
                                
                            }catch(ModelException me){
                                handleException(me);
                            }
                        }
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof CustomerAccountView){
                item = new WithdrawPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem();
                item.setText("Auszahlen ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServiceWithdrawCustomerAccountFractionMssgWizard wizard = new CustomerServiceWithdrawCustomerAccountFractionMssgWizard("Auszahlen");
                        wizard.setFirstArgument((CustomerAccountView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
                item = new DepositPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem();
                item.setText("Einzahlen ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServiceDepositCustomerAccountFractionMssgWizard wizard = new CustomerServiceDepositCustomerAccountFractionMssgWizard("Einzahlen");
                        wizard.setFirstArgument((CustomerAccountView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof ArticleWrapperView){
                if (filter_addToCart((ArticleWrapperView) selected)) {
                    item = new AddToCartPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem();
                    item.setText("In den Warenkorb ... ");
                    item.setOnAction(new EventHandler<ActionEvent>(){
                        public void handle(javafx.event.ActionEvent e) {
                            final CustomerServiceAddToCartArticleWrapperIntegerMssgWizard wizard = new CustomerServiceAddToCartArticleWrapperIntegerMssgWizard("In den Warenkorb");
                            wizard.setFirstArgument((ArticleWrapperView)selected);
                            wizard.setWidth(getNavigationPanel().getWidth());
                            wizard.showAndWait();
                        }
                    });
                    result.getItems().add(item);
                }
            }
            
        }
        this.addNotGeneratedItems(result,selected);
        return result;
    }
    private String preCalculatedFilters = "";
    private String getPreCalculatedFilters() {
        return this.preCalculatedFilters;
    }
    private void setPreCalculatedFilters(String switchOff) {
        this.preCalculatedFilters = switchOff;
    }
    private boolean filter_markForReturn(OrderQuantifiedArticleView argument){
        return this.getPreCalculatedFilters().contains("+++markForReturnPRMTROrderQuantifiedArticlePRMTR");
    }
    private boolean filter_addToCart(ArticleWrapperView argument){
        return this.getPreCalculatedFilters().contains("+++addToCartPRMTRArticleWrapperPRMTRIntegerPRMTR");
    }
    private boolean filter_unmarkForReturn(OrderQuantifiedArticleView argument){
        return this.getPreCalculatedFilters().contains("+++unmarkForReturnPRMTROrderQuantifiedArticlePRMTR");
    }
    private boolean filter_cancelPreOrder(OrderView argument){
        return this.getPreCalculatedFilters().contains("+++cancelPreOrderPRMTROrderPRMTR");
    }
    
	class CustomerServiceAddToCartArticleWrapperIntegerMssgWizard extends Wizard {

		protected CustomerServiceAddToCartArticleWrapperIntegerMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new AddToCartPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceAddToCartArticleWrapperIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().addToCart(firstArgument, ((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("Anzahl", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ArticleWrapperView firstArgument; 
	
		public void setFirstArgument(ArticleWrapperView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class CustomerServiceChangeArticleQuantityShoppingCartQuantifiedArticleIntegerMssgWizard extends Wizard {

		protected CustomerServiceChangeArticleQuantityShoppingCartQuantifiedArticleIntegerMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ChangeArticleQuantityPRMTRShoppingCartQuantifiedArticlePRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceChangeArticleQuantityShoppingCartQuantifiedArticleIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().changeArticleQuantity(firstArgument, ((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("Anzahl", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ShoppingCartQuantifiedArticleView firstArgument; 
	
		public void setFirstArgument(ShoppingCartQuantifiedArticleView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class CustomerServiceDepositCustomerAccountFractionMssgWizard extends Wizard {

		protected CustomerServiceDepositCustomerAccountFractionMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new DepositPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceDepositCustomerAccountFractionMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().deposit(firstArgument, ((FractionSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new FractionSelectionPanel("amount", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private CustomerAccountView firstArgument; 
	
		public void setFirstArgument(CustomerAccountView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class CustomerServiceFindArticleCustomerArticleLstStringMssgWizard extends Wizard {

		protected CustomerServiceFindArticleCustomerArticleLstStringMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new FindArticlePRMTRCustomerArticleLstPRMTRStringPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceFindArticleCustomerArticleLstStringMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().findArticle(firstArgument, ((StringSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new StringSelectionPanel("Bezeichnung", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private CustomerArticleLstView firstArgument; 
	
		public void setFirstArgument(CustomerArticleLstView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class CustomerServiceOrderShoppingCartCustomerDeliveryTimeMssgWizard extends Wizard {

		protected CustomerServiceOrderShoppingCartCustomerDeliveryTimeMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new OrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceOrderShoppingCartCustomerDeliveryTimeMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().order(firstArgument, (CustomerDeliveryTimeView)((ObjectSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(EmptyCartException e) {
				getStatusBar().setText(e.getMessage());
			}
			catch(NotEnoughStockException e) {
				getStatusBar().setText(e.getMessage());
			}
			catch(NotEnoughMoneyException e) {
				getStatusBar().setText(e.getMessage());
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			final ObjectSelectionPanel panel1 = new ObjectSelectionPanel("Versandart", "view.CustomerDeliveryTimeView", null, this);
			getParametersPanel().getChildren().add(panel1);
			panel1.setBrowserRoot((ViewRoot) getConnection().getCustomerServiceView());		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ShoppingCartView firstArgument; 
	
		public void setFirstArgument(ShoppingCartView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class CustomerServicePreOrderShoppingCartCustomerDeliveryTimeMssgWizard extends Wizard {

		protected CustomerServicePreOrderShoppingCartCustomerDeliveryTimeMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new PreOrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServicePreOrderShoppingCartCustomerDeliveryTimeMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().preOrder(firstArgument, (CustomerDeliveryTimeView)((ObjectSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(EmptyCartException e) {
				getStatusBar().setText(e.getMessage());
			}
			catch(NotEnoughMoneyException e) {
				getStatusBar().setText(e.getMessage());
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			final ObjectSelectionPanel panel2 = new ObjectSelectionPanel("Versandart", "view.CustomerDeliveryTimeView", null, this);
			getParametersPanel().getChildren().add(panel2);
			panel2.setBrowserRoot((ViewRoot) getConnection().getCustomerServiceView());		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ShoppingCartView firstArgument; 
	
		public void setFirstArgument(ShoppingCartView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class CustomerServiceWithdrawCustomerAccountFractionMssgWizard extends Wizard {

		protected CustomerServiceWithdrawCustomerAccountFractionMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new WithdrawPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceWithdrawCustomerAccountFractionMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().withdraw(firstArgument, ((FractionSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(NotEnoughMoneyException e) {
				getStatusBar().setText(e.getMessage());
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new FractionSelectionPanel("amount", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private CustomerAccountView firstArgument; 
	
		public void setFirstArgument(CustomerAccountView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	/* Menu and wizard section end */
	
	private ImageView getIconForMenuItem(CustomerServiceMenuItem menuItem){
		return menuItem.accept(new MenuItemVisitor() {
			@Override
			public ImageView handle(AcceptOrderPRMTROrderPRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(AddToCartPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(EmptyCartPRMTRShoppingCartPRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(ChangeArticleQuantityPRMTRShoppingCartQuantifiedArticlePRMTRIntegerPRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(FindArticlePRMTRCustomerArticleLstPRMTRStringPRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(WithdrawPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(ClearErrorPRMTRErrorDisplayPRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(ClearPRMTRCustomerArticleLstPRMTRMenuItem menuItem) {
				return null;
			}


			@Override
			public ImageView handle(ReloadUIPRMTRMenuItem menuItem) {
				return null;
			}


			@Override
			public ImageView handle(MarkForReturnPRMTROrderQuantifiedArticlePRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(OrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem menuItem) {
				return new ImageView(IconManager.getImage(IconConstants.CHECKOUT));

			}

			@Override
			public ImageView handle(DepositPRMTRCustomerAccountPRMTRFractionPRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(PreOrderPRMTRShoppingCartPRMTRCustomerDeliveryTimePRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(RemoveFromCartPRMTRShoppingCartQuantifiedArticlePRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(UnmarkForReturnPRMTROrderQuantifiedArticlePRMTRMenuItem menuItem) {
				return null;
			}

			@Override
			public ImageView handle(CancelPreOrderPRMTROrderPRMTRMenuItem menuItem) {
				return null;
			}

		});


	}
	
	
	private void addNotGeneratedItems(ContextMenu result, ViewRoot selected) {
		// TODO Add items to menue if you have not generated service calls!!!
	}
	protected boolean getMultiSelectionFor(String parameterInBrowser){
		return false;
	}
	public int getPartsPerHour(String parameterInBrowser) {
		// divides 60 minutes into the returned number of parts
		return 59;
	}
	
	
}