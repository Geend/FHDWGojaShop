package viewClient;


import java.util.Optional;


import com.sun.javafx.geom.Point2D;

import common.Fraction;
import constants.IconConstants;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import view.Anything;
import view.ArticleView;
import view.ArticleWrapperView;
import view.ComponentContainer;
import view.ComponentView;
import view.CustomerDeliveryTimeView;
import view.CycleException;
import view.DoubleDefinitionException;
import view.ModelException;
import view.NotEnoughStockException;
import view.OwnerServiceView;
import view.ProducerView;
import view.ProductGroupView;
import view.SettingsView;
import view.UserException;
import view.objects.OwnerService;
import view.objects.ViewObjectInTree;
import view.objects.ViewRoot;
import view.visitor.AnythingStandardVisitor;

import javax.swing.tree.TreeModel;

public class OwnerServiceClientView extends BorderPane implements ExceptionAndEventHandler {

    private ConnectionMaster connection;
    private ExceptionAndEventHandler parent;
    private OwnerServiceView service;

    /**
     * This is the default constructor
     */
    public OwnerServiceClientView(ExceptionAndEventHandler parent, OwnerServiceView service) {
        super();
        this.parent = parent;
        this.service = service;
        this.initialize();
    }

    @SuppressWarnings("unused")
    private OwnerServiceView getService() {
        return this.service;
    }

    private void initialize() {
        this.setCenter(this.getMainSplitPane());
        if (!WithStaticOperations && this.getMainToolBar().getItems().size() > 0) {
            this.setTop(this.getMainToolBar());
        }
    }

    private ToolBar mainToolBar = null;

    private ToolBar getMainToolBar() {
        if (this.mainToolBar == null) {
            this.mainToolBar = new ToolBar();
            for (Button current : this.getToolButtonsForStaticOperations()) {
                this.mainToolBar.getItems().add(current);
            }
        }
        return this.mainToolBar;
    }

    private SplitPane mainSplitPane = null;

    private SplitPane getMainSplitPane() {
        if (this.mainSplitPane == null) {
            this.mainSplitPane = new SplitPane();
            this.mainSplitPane.setOrientation(Orientation.HORIZONTAL);
            this.mainSplitPane.getItems().addAll(this.getNavigationSplitPane(), this.getTitledDetailsPane());
            this.mainSplitPane.setDividerPosition(0, 0.5);
            this.mainSplitPane.prefHeightProperty().bind(this.heightProperty());
            this.mainSplitPane.prefWidthProperty().bind(this.widthProperty());
        }
        return this.mainSplitPane;
    }

    private SplitPane navigationSplitPane = null;

    private SplitPane getNavigationSplitPane() {
        if (this.navigationSplitPane == null) {
            this.navigationSplitPane = new SplitPane();
            this.navigationSplitPane.setOrientation(Orientation.VERTICAL);
            this.navigationSplitPane.getItems().addAll(this.getNavigationPanel(), this.getErrorPanel());
            this.navigationSplitPane.prefHeightProperty().bind(this.getMainSplitPane().heightProperty());
            this.navigationSplitPane.setDividerPosition(0, 1.0);
            this.navigationSplitPane.heightProperty().addListener(new ChangeListener<Number>() {
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    if (!getErrorPanel().isVisible()) {
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
        if (this.treePanel == null) {
            this.treePanel = new TitledPane(GUIConstants.NaviationTitle, this.getNavigationTree());
            this.treePanel.setCollapsible(false);
            this.treePanel.prefHeightProperty().bind(this.getNavigationSplitPane().heightProperty());
        }
        return treePanel;
    }

    private TitledPane errorPanel = null;

    private TitledPane getErrorPanel() {
        if (this.errorPanel == null) {
            this.errorPanel = new TitledPane(GUIConstants.ErrorTitle, this.getErrorTree());
            this.errorPanel.setCollapsible(false);
            this.errorPanel.setVisible(false);
        }
        return this.errorPanel;
    }

    private TreeRefresh errorTree = null;

    private TreeRefresh getErrorTree() {
        if (this.errorTree == null) {
            this.errorTree = new TreeRefresh(parent);
            this.errorTree.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
                public void handle(ContextMenuEvent e) {
                    tryShowContextMenu(e, errorTree, false);
                }
            });
        }
        return this.errorTree;
    }

    private void setErrors(TreeModel errors) {
        this.getErrorPanel().setVisible(true);
        this.getErrorTree().setModel(errors);
        this.getNavigationSplitPane().setDividerPosition(0, 0.7);
    }

    private void setNoErrors() {
        this.getErrorPanel().setVisible(false);
        this.getNavigationSplitPane().setDividerPosition(0, 1.0);
    }

    private TitledPane titledDetailsPane = null;

    private TitledPane getTitledDetailsPane() {
        if (this.titledDetailsPane == null) {
            this.titledDetailsPane = new TitledPane();
            this.titledDetailsPane.setText(GUIConstants.DetailsTitle);
            this.titledDetailsPane.setCollapsible(false);
            this.titledDetailsPane.prefHeightProperty().bind(this.getMainSplitPane().heightProperty());
        }
        return this.titledDetailsPane;
    }

    private TreeRefresh navigationTree = null;

    private TreeRefresh getNavigationTree() {
        if (this.navigationTree == null) {
            this.navigationTree = new TreeRefresh(parent);
            this.navigationTree.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            this.navigationTree.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<ViewObjectInTree>>() {
                public void changed(ObservableValue<? extends TreeItem<ViewObjectInTree>> observable, TreeItem<ViewObjectInTree> oldValue, TreeItem<ViewObjectInTree> newValue) {
                    if (menu != null)
                        menu.hide();
                    if (newValue != null) {
                        setDetailsTable((Anything) newValue.getValue().getWrappedObject());
                    }
                }
            });
            this.navigationTree.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
                public void handle(ContextMenuEvent e) {
                    tryShowContextMenu(e, navigationTree, WithStaticOperations);
                }
            });
            navigationTree.setOnKeyReleased(new EventHandler<KeyEvent>() {
                public void handle(KeyEvent event) {
                    if (event.getCode() == KeyCode.F5) {
                        Platform.runLater(new Runnable() {
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

    protected void setDetailsTable(Anything object) {
        this.getTitledDetailsPane().setVisible(false);
        if (object == null && this.getConnection() != null)
            object = this.getConnection().getOwnerServiceView();
        if (object == null) {
            this.currentDetails = getNoDetailsPanel();
        } else {
            try {
                this.currentDetails = this.getDetailView(object);
            } catch (ModelException e) {
                this.handleException(e);
                this.currentDetails = null;
            }
            if (this.currentDetails == null)
                this.currentDetails = getStandardDetailsTable(object);
        }
        this.getTitledDetailsPane().setContent(this.currentDetails);
        this.getTitledDetailsPane().setVisible(true);
        this.currentDetails.prefWidthProperty().bind(this.getTitledDetailsPane().widthProperty());
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

            @Override
            public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException {
                ArticleView articleView = getConnection().getArticle(articleWrapper);

                ArticleDefaultDetailPanel panel = new ArticleDefaultDetailPanel(OwnerServiceClientView.this, articleView);

                panel.registerUpdater(ArticleDefaultDetailPanel.Article$$name, new UpdaterForString() {
                    @Override
                    public void update(String text) throws ModelException {
                        getConnection().changeArticleName(articleWrapper, text);
                    }
                });

                panel.registerUpdater(ArticleDefaultDetailPanel.Article$$price, new StandardUpdater() {
                    @Override
                    public void update(String text) throws ModelException {

                        getConnection().changeArticlePrice(articleWrapper,
                                Fraction.parse(text));
                    }

                    @Override
                    public boolean check(String text) throws ModelException {
                       //TODO! Implement checking of string
                        return true;
                    }
                });
                result = panel;

            }

            @Override
            public void handleSettings(SettingsView settings) throws ModelException {

                SettingsDefaultDetailPanel panel = new SettingsDefaultDetailPanel(OwnerServiceClientView.this, settings);

                panel.registerUpdater(SettingsDefaultDetailPanel.Settings$$newCustomerDefaultBalance, new StandardUpdater() {
                    @Override
                    public void update(String text) throws ModelException {

                        getConnection().changeNewCustomerDefaultBalance(Fraction.parse(text));
                    }

                    @Override
                    public boolean check(String text) throws ModelException {
                        //TODO! Implement checking of string
                        return true;
                    }
                });

                panel.registerUpdater(SettingsDefaultDetailPanel.Settings$$newCustomerDefaultLimit, new StandardUpdater() {
                    @Override
                    public void update(String text) throws ModelException {

                        getConnection().changeNewCustomerDefaultLimit(Fraction.parse(text));
                    }

                    @Override
                    public boolean check(String text) throws ModelException {
                        //TODO! Implement checking of string
                        return true;
                    }
                });

                panel.registerUpdater(SettingsDefaultDetailPanel.Settings$$returnPercentage, new StandardUpdater() {
                    @Override
                    public void update(String text) throws ModelException {
                        getConnection().changeReturnPercentage(Fraction.parse(text));
                    }

                    @Override
                    public boolean check(String text) throws ModelException {
                        //TODO! Implement checking of string
                        return true;
                    }
                });

                result = panel;
            }

            @Override
            public void handleCustomerDeliveryTime(CustomerDeliveryTimeView customerDeliveryTime) throws ModelException {

                CustomerDeliveryTimeDefaultDetailPanel panel = new CustomerDeliveryTimeDefaultDetailPanel(OwnerServiceClientView.this, customerDeliveryTime);

                panel.registerUpdater(CustomerDeliveryTimeDefaultDetailPanel.CustomerDeliveryTime$$deliveryTime, new UpdaterForInteger() {
                    @Override
                    public void update(String text) throws ModelException {
                        getConnection().changeCustomerDeliveryTimeTime(customerDeliveryTime, Integer.parseInt(text));
                    }
                });


                panel.registerUpdater(CustomerDeliveryTimeDefaultDetailPanel.CustomerDeliveryTime$$price, new StandardUpdater() {
                    @Override
                    public void update(String text) throws ModelException {
                        getConnection().changeCustomerDeliveryTimePrice(customerDeliveryTime, Fraction.parse(text));
                    }

                    @Override
                    public boolean check(String text) throws ModelException {
                        //TODO! Implement checking of string
                        return true;
                    }
                });

                result = panel;



            }


            // TODO Overwrite all handle methods for the types for which you intend to provide a special panel!
        }


        PanelDecider decider = new PanelDecider();
        anything.accept(decider);
        return decider.getResult();
    }

    private NoDetailPanel noDetailPanel = null;

    public DetailPanel getNoDetailsPanel() {
        if (this.noDetailPanel == null)
            this.noDetailPanel = new NoDetailPanel(this);
        return noDetailPanel;
    }

    private ContextMenu menu = null;

    protected void tryShowContextMenu(ContextMenuEvent e, TreeRefresh tree, boolean withStaticOperations) {
        if (this.menu != null)
            this.menu.hide();
        SelectionModel<TreeItem<ViewObjectInTree>> selMod = tree.getSelectionModel();
        ViewObjectInTree selVal = selMod.getSelectedItem().getValue();
        ViewRoot selected = selVal.getWrappedObject();
        this.menu = this.getContextMenu(selected, withStaticOperations, new Point2D((float) e.getScreenX(), (float) e.getScreenY()));
        if (this.menu.getItems().size() > 0) {
            this.menu.show(this.getNavigationPanel(), e.getScreenX(), e.getScreenY());
        }
    }

    private DetailPanel getStandardDetailsTable(Anything object) {
        try {
            return DefaultDetailPanel.getStandardDetailPanel(object, this);
        } catch (ModelException e) {
            this.handleException(e);
            return new NoDetailPanel(this);
        }
    }

    public void setConnection(ConnectionMaster connection) {
        this.connection = connection;
    }

    public OwnerServiceConnection getConnection() {
        return (OwnerServiceConnection) this.connection;
    }

    /**
     * Is called by the refresher thread if the server object has changed
     **/
    public void handleRefresh() {
        Platform.runLater(new Runnable() {
            public void run() {
                try {
                    getNavigationTree().refreshTree();



                    java.util.Vector<?> errors = getConnection().getOwnerServiceView().getErrors();
                    if (errors.size() > 0)
                        setErrors(new ListRoot(errors));
                    else
                        setNoErrors();
                } catch (ModelException e) {
                    handleException(e);
                }
            }
        });

        // TODO adjust implementation: handleRefresh()!
    }

    /**
     * Is called only once after the connection has been established
     **/
    public void initializeConnection() {
        Platform.runLater(new Runnable() {
            public void run() {
                getNavigationTree().setModel((TreeModel) getConnection().getOwnerServiceView());
                getNavigationTree().getRoot().setExpanded(true);
                getNavigationTree().getSelectionModel().select(getNavigationTree().getRoot());
            }
        });

        // TODO adjust implementation: initializeConnection
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
        ImageView handle(CreateProducerPRMTRStringPRMTRMenuItem menuItem);
        ImageView handle(CreateCustomerDeliveryTimePRMTRStringPRMTRFractionPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(NewProductGroupPRMTRComponentContainerPRMTRStringPRMTRMenuItem menuItem);
        ImageView handle(NewProductGroupPRMTRStringPRMTRMenuItem menuItem);
        ImageView handle(NewArticlePRMTRComponentContainerPRMTRStringPRMTRFractionPRMTRIntegerPRMTRIntegerPRMTRIntegerPRMTRProducerPRMTRMenuItem menuItem);
        ImageView handle(StopSellingPRMTRArticleWrapperPRMTRMenuItem menuItem);
        ImageView handle(StartSellingPRMTRArticleWrapperPRMTRMenuItem menuItem);
        ImageView handle(IncreaseArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(ReduceArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(MoveToPRMTRComponentPRMTRComponentContainerPRMTRMenuItem menuItem);
    }
    private abstract class OwnerServiceMenuItem extends MenuItem{
        private OwnerServiceMenuItem(){
            this.setGraphic(getIconForMenuItem(this));
        }
        abstract protected ImageView accept(MenuItemVisitor visitor);
    }
    private class CreateProducerPRMTRStringPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class CreateCustomerDeliveryTimePRMTRStringPRMTRFractionPRMTRIntegerPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class NewProductGroupPRMTRComponentContainerPRMTRStringPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class NewProductGroupPRMTRStringPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class NewArticlePRMTRComponentContainerPRMTRStringPRMTRFractionPRMTRIntegerPRMTRIntegerPRMTRIntegerPRMTRProducerPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class StopSellingPRMTRArticleWrapperPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class StartSellingPRMTRArticleWrapperPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class IncreaseArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ReduceArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class MoveToPRMTRComponentPRMTRComponentContainerPRMTRMenuItem extends OwnerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private java.util.Vector<javafx.scene.control.Button> getToolButtonsForStaticOperations() {
        java.util.Vector<javafx.scene.control.Button> result = new java.util.Vector<javafx.scene.control.Button>();
        javafx.scene.control.Button currentButton = null;
        currentButton = new javafx.scene.control.Button("Hersteller anlegen ... ");
        currentButton.setGraphic(new CreateProducerPRMTRStringPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final OwnerServiceCreateProducerStringMssgWizard wizard = new OwnerServiceCreateProducerStringMssgWizard("Hersteller anlegen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Neue Kundenlieferzeit ... ");
        currentButton.setGraphic(new CreateCustomerDeliveryTimePRMTRStringPRMTRFractionPRMTRIntegerPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final OwnerServiceCreateCustomerDeliveryTimeStringFractionIntegerMssgWizard wizard = new OwnerServiceCreateCustomerDeliveryTimeStringFractionIntegerMssgWizard("Neue Kundenlieferzeit");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Neue Produktgruppe ... ");
        currentButton.setGraphic(new NewProductGroupPRMTRStringPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final OwnerServiceNewProductGroupStringMssgWizard wizard = new OwnerServiceNewProductGroupStringMssgWizard("Neue Produktgruppe");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        return result;
    }
    private ContextMenu getContextMenu(final ViewRoot selected, final boolean withStaticOperations, final Point2D menuPos) {
        final ContextMenu result = new ContextMenu();
        MenuItem item = null;
        item = new CreateProducerPRMTRStringPRMTRMenuItem();
        item.setText("(S) Hersteller anlegen ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final OwnerServiceCreateProducerStringMssgWizard wizard = new OwnerServiceCreateProducerStringMssgWizard("Hersteller anlegen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new CreateCustomerDeliveryTimePRMTRStringPRMTRFractionPRMTRIntegerPRMTRMenuItem();
        item.setText("(S) Neue Kundenlieferzeit ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final OwnerServiceCreateCustomerDeliveryTimeStringFractionIntegerMssgWizard wizard = new OwnerServiceCreateCustomerDeliveryTimeStringFractionIntegerMssgWizard("Neue Kundenlieferzeit");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new NewProductGroupPRMTRStringPRMTRMenuItem();
        item.setText("(S) Neue Produktgruppe ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final OwnerServiceNewProductGroupStringMssgWizard wizard = new OwnerServiceNewProductGroupStringMssgWizard("Neue Produktgruppe");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        if (selected != null){
            try {
                this.setPreCalculatedFilters(this.getConnection().ownerService_Menu_Filter((Anything)selected));
            } catch (ModelException me){
                this.handleException(me);
                return result;
            }
            if (selected instanceof ComponentContainer){
                item = new NewProductGroupPRMTRComponentContainerPRMTRStringPRMTRMenuItem();
                item.setText("Neue Produktgruppe ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final OwnerServiceNewProductGroupComponentContainerStringMssgWizard wizard = new OwnerServiceNewProductGroupComponentContainerStringMssgWizard("Neue Produktgruppe");
                        wizard.setFirstArgument((ComponentContainer)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
                item = new NewArticlePRMTRComponentContainerPRMTRStringPRMTRFractionPRMTRIntegerPRMTRIntegerPRMTRIntegerPRMTRProducerPRMTRMenuItem();
                item.setText("Neuer Artikel ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final OwnerServiceNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssgWizard wizard = new OwnerServiceNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssgWizard("Neuer Artikel");
                        wizard.setFirstArgument((ComponentContainer)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof ComponentView){
                item = new MoveToPRMTRComponentPRMTRComponentContainerPRMTRMenuItem();
                item.setText("verschieben ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final OwnerServiceMoveToComponentComponentContainerMssgWizard wizard = new OwnerServiceMoveToComponentComponentContainerMssgWizard("verschieben");
                        wizard.setFirstArgument((ComponentView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof ArticleWrapperView){
                if (filter_stopSelling((ArticleWrapperView) selected)) {
                    item = new StopSellingPRMTRArticleWrapperPRMTRMenuItem();
                    item.setText("Verkauf beenden");
                    item.setOnAction(new EventHandler<ActionEvent>(){
                        public void handle(javafx.event.ActionEvent e) {
                            Alert confirm = new Alert(AlertType.CONFIRMATION);
                            confirm.setTitle(GUIConstants.ConfirmButtonText);
                            confirm.setHeaderText(null);
                            confirm.setContentText("Verkauf beenden" + GUIConstants.ConfirmQuestionMark);
                            Optional<ButtonType> buttonResult = confirm.showAndWait();
                            if (buttonResult.get() == ButtonType.OK) {
                                try {
                                    getConnection().stopSelling((ArticleWrapperView)selected);
                                    getConnection().setEagerRefresh();
                                    
                                }catch(ModelException me){
                                    handleException(me);
                                }
                            }
                        }
                    });
                    result.getItems().add(item);
                }
                if (filter_startSelling((ArticleWrapperView) selected)) {
                    item = new StartSellingPRMTRArticleWrapperPRMTRMenuItem();
                    item.setText("Verkauf starten");
                    item.setOnAction(new EventHandler<ActionEvent>(){
                        public void handle(javafx.event.ActionEvent e) {
                            Alert confirm = new Alert(AlertType.CONFIRMATION);
                            confirm.setTitle(GUIConstants.ConfirmButtonText);
                            confirm.setHeaderText(null);
                            confirm.setContentText("Verkauf starten" + GUIConstants.ConfirmQuestionMark);
                            Optional<ButtonType> buttonResult = confirm.showAndWait();
                            if (buttonResult.get() == ButtonType.OK) {
                                try {
                                    getConnection().startSelling((ArticleWrapperView)selected);
                                    getConnection().setEagerRefresh();
                                    
                                }catch(ModelException me){
                                    handleException(me);
                                }
                            }
                        }
                    });
                    result.getItems().add(item);
                }
                item = new IncreaseArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem();
                item.setText("increaseArticleStock ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final OwnerServiceIncreaseArticleStockArticleWrapperIntegerMssgWizard wizard = new OwnerServiceIncreaseArticleStockArticleWrapperIntegerMssgWizard("increaseArticleStock");
                        wizard.setFirstArgument((ArticleWrapperView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
                item = new ReduceArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem();
                item.setText("reduceArticleStock ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final OwnerServiceReduceArticleStockArticleWrapperIntegerMssgWizard wizard = new OwnerServiceReduceArticleStockArticleWrapperIntegerMssgWizard("reduceArticleStock");
                        wizard.setFirstArgument((ArticleWrapperView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
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
    private boolean filter_stopSelling(ArticleWrapperView argument){
        return this.getPreCalculatedFilters().contains("+++stopSellingPRMTRArticleWrapperPRMTR");
    }
    private boolean filter_startSelling(ArticleWrapperView argument){
        return this.getPreCalculatedFilters().contains("+++startSellingPRMTRArticleWrapperPRMTR");
    }
    
	class OwnerServiceCreateCustomerDeliveryTimeStringFractionIntegerMssgWizard extends Wizard {

		protected OwnerServiceCreateCustomerDeliveryTimeStringFractionIntegerMssgWizard(String operationName){
			super(OwnerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new CreateCustomerDeliveryTimePRMTRStringPRMTRFractionPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "OwnerServiceCreateCustomerDeliveryTimeStringFractionIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().createCustomerDeliveryTime(((StringSelectionPanel)getParametersPanel().getChildren().get(0)).getResult(),
									((FractionSelectionPanel)getParametersPanel().getChildren().get(1)).getResult(),
									((IntegerSelectionPanel)getParametersPanel().getChildren().get(2)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(DoubleDefinitionException e) {
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
			getParametersPanel().getChildren().add(new StringSelectionPanel("name", this));
			getParametersPanel().getChildren().add(new FractionSelectionPanel("price", this));
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("time", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
	}

	class OwnerServiceCreateProducerStringMssgWizard extends Wizard {

		protected OwnerServiceCreateProducerStringMssgWizard(String operationName){
			super(OwnerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new CreateProducerPRMTRStringPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "OwnerServiceCreateProducerStringMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().createProducer(((StringSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(DoubleDefinitionException e) {
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
			getParametersPanel().getChildren().add(new StringSelectionPanel("name", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
	}

	class OwnerServiceIncreaseArticleStockArticleWrapperIntegerMssgWizard extends Wizard {

		protected OwnerServiceIncreaseArticleStockArticleWrapperIntegerMssgWizard(String operationName){
			super(OwnerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new IncreaseArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "OwnerServiceIncreaseArticleStockArticleWrapperIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().increaseArticleStock(firstArgument, ((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
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
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("quantity", this));		
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

	class OwnerServiceMoveToComponentComponentContainerMssgWizard extends Wizard {

		protected OwnerServiceMoveToComponentComponentContainerMssgWizard(String operationName){
			super(OwnerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new MoveToPRMTRComponentPRMTRComponentContainerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "OwnerServiceMoveToComponentComponentContainerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().moveTo(firstArgument, (ComponentContainer)((ObjectSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(CycleException e) {
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
			final ObjectSelectionPanel panel1 = new ObjectSelectionPanel("newParentGroup", "view.ComponentContainer", null, this);
			getParametersPanel().getChildren().add(panel1);
			panel1.setBrowserRoot((ViewRoot) getConnection().getOwnerServiceView());		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ComponentView firstArgument; 
	
		public void setFirstArgument(ComponentView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class OwnerServiceNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssgWizard extends Wizard {

		protected OwnerServiceNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssgWizard(String operationName){
			super(OwnerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new NewArticlePRMTRComponentContainerPRMTRStringPRMTRFractionPRMTRIntegerPRMTRIntegerPRMTRIntegerPRMTRProducerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "OwnerServiceNewArticleComponentContainerStringFractionIntegerIntegerIntegerProducerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().newArticle(firstArgument, ((StringSelectionPanel)getParametersPanel().getChildren().get(0)).getResult(),
									((FractionSelectionPanel)getParametersPanel().getChildren().get(1)).getResult(),
									((IntegerSelectionPanel)getParametersPanel().getChildren().get(2)).getResult().longValue(),
									((IntegerSelectionPanel)getParametersPanel().getChildren().get(3)).getResult().longValue(),
									((IntegerSelectionPanel)getParametersPanel().getChildren().get(4)).getResult().longValue(),
									(ProducerView)((ObjectSelectionPanel)getParametersPanel().getChildren().get(5)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(DoubleDefinitionException e) {
				getStatusBar().setText(e.getMessage());
			}
			catch(CycleException e) {
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
			getParametersPanel().getChildren().add(new StringSelectionPanel("name", this));
			getParametersPanel().getChildren().add(new FractionSelectionPanel("price", this));
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("minStock", this));
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("maxStock", this));
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("producerDeliveryTime", this));
			final ObjectSelectionPanel panel2 = new ObjectSelectionPanel("producer", "view.ProducerView", null, this);
			getParametersPanel().getChildren().add(panel2);
			panel2.setBrowserRoot((ViewRoot) getConnection().getOwnerServiceView());		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ComponentContainer firstArgument; 
	
		public void setFirstArgument(ComponentContainer firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class OwnerServiceNewProductGroupComponentContainerStringMssgWizard extends Wizard {

		protected OwnerServiceNewProductGroupComponentContainerStringMssgWizard(String operationName){
			super(OwnerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new NewProductGroupPRMTRComponentContainerPRMTRStringPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "OwnerServiceNewProductGroupComponentContainerStringMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().newProductGroup(firstArgument, ((StringSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(DoubleDefinitionException e) {
				getStatusBar().setText(e.getMessage());
			}
			catch(CycleException e) {
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
			getParametersPanel().getChildren().add(new StringSelectionPanel("name", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ComponentContainer firstArgument; 
	
		public void setFirstArgument(ComponentContainer firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class OwnerServiceNewProductGroupStringMssgWizard extends Wizard {

		protected OwnerServiceNewProductGroupStringMssgWizard(String operationName){
			super(OwnerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new NewProductGroupPRMTRStringPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "OwnerServiceNewProductGroupStringMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().newProductGroup(((StringSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(DoubleDefinitionException e) {
				getStatusBar().setText(e.getMessage());
			}
			catch(CycleException e) {
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
			getParametersPanel().getChildren().add(new StringSelectionPanel("name", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
	}

	class OwnerServiceReduceArticleStockArticleWrapperIntegerMssgWizard extends Wizard {

		protected OwnerServiceReduceArticleStockArticleWrapperIntegerMssgWizard(String operationName){
			super(OwnerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ReduceArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "OwnerServiceReduceArticleStockArticleWrapperIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().reduceArticleStock(firstArgument, ((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(NotEnoughStockException e) {
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
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("quantity", this));		
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

	/* Menu and wizard section end */

    private ImageView getIconForMenuItem(OwnerServiceMenuItem menuItem) {
        return menuItem.accept(new MenuItemVisitor() {
            @Override
            public ImageView handle(NewProductGroupPRMTRStringPRMTRMenuItem menuItem) {
                return new ImageView(IconManager.getImage(IconConstants.NEW_PRODUCT_GROUP));
            }

            @Override
            public ImageView handle(NewArticlePRMTRComponentContainerPRMTRStringPRMTRFractionPRMTRIntegerPRMTRIntegerPRMTRIntegerPRMTRProducerPRMTRMenuItem menuItem) {
                return null;
            }


            @Override
            public ImageView handle(CreateCustomerDeliveryTimePRMTRStringPRMTRFractionPRMTRIntegerPRMTRMenuItem menuItem) {
                return null;
            }

            @Override
            public ImageView handle(NewProductGroupPRMTRComponentContainerPRMTRStringPRMTRMenuItem menuItem) {
                return new ImageView(IconManager.getImage(IconConstants.NEW_PRODUCT_GROUP));
            }


            @Override
            public ImageView handle(CreateProducerPRMTRStringPRMTRMenuItem menuItem) {
                return new ImageView(IconManager.getImage(IconConstants.NEW_PRODUCER));
            }

            

            @Override
            public ImageView handle(IncreaseArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem menuItem) {
                return null;
            }





            @Override
            public ImageView handle(ReduceArticleStockPRMTRArticleWrapperPRMTRIntegerPRMTRMenuItem menuItem) {
                return null;
            }

            @Override
            public ImageView handle(MoveToPRMTRComponentPRMTRComponentContainerPRMTRMenuItem menuItem) {
                return null;
            }


            @Override
            public ImageView handle(StartSellingPRMTRArticleWrapperPRMTRMenuItem menuItem) {
                return null;
            }

            @Override
            public ImageView handle(StopSellingPRMTRArticleWrapperPRMTRMenuItem menuItem) {
                return null;
            }


        });
    }

    private void addNotGeneratedItems(ContextMenu result, ViewRoot selected) {
        // TODO Add items to menue if you have not generated service calls!!!
    }

    protected boolean getMultiSelectionFor(String parameterInBrowser) {
        return false;
    }

    public int getPartsPerHour(String parameterInBrowser) {
        // divides 60 minutes into the returned number of parts
        return 59;
    }

}