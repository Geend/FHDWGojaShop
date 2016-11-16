package viewClient;

import view.*;
import java.net.MalformedURLException;

import java.io.IOException;
import java.util.Vector;
import org.apache.xmlrpc.XmlRpcException;

public class CustomerServiceConnection extends ServiceConnection {

	public CustomerServiceConnection (String url, ExceptionAndEventHandler handler, ClientReporter reporter) throws MalformedURLException {
		super(url, handler, reporter);
	}

	public CustomerServiceView getCustomerServiceView(){
		return (CustomerServiceView)super.getServer();
	}

    public synchronized String customerService_Menu_Filter(Anything anything) throws ModelException{
        try {
            Vector<Object> parameters = new Vector<Object>();
            if (anything == null){
                parameters.add(common.RPCConstantsAndServices.createFromClientNullProxiRepresentation());
            } else {
                parameters.add(((view.objects.ViewProxi)anything).createProxiInformation());
            }
            java.util.HashMap<?,?> success = (java.util.HashMap<?,?>)this.execute(this.connectionName, "customerService_Menu_Filter", parameters);
            if(!((Boolean)success.get(common.RPCConstantsAndServices.OKOrNotOKResultFieldName)).booleanValue()){
                if (((Integer)success.get(common.RPCConstantsAndServices.ErrorNumberFieldName)).intValue() == 0)
                    throw new ModelException((String)success.get(common.RPCConstantsAndServices.ExceptionMessageFieldName), ((Integer)success.get(common.RPCConstantsAndServices.ExceptionNumberFieldName)).intValue());
                throw new ModelException ("Fatal error (unknown exception code:" + (Integer)success.get(common.RPCConstantsAndServices.ErrorNumberFieldName) + ")",0);
            }else{
                return (String)success.get(common.RPCConstantsAndServices.ResultFieldName);
            }
        }catch(IOException ioe){
            throw new ModelException(ioe.getMessage(),0);
        }catch(XmlRpcException xre){
            throw new ModelException(xre.getMessage(),0);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    public synchronized CustomerShopArticleWrapperView loadArticleWrapper(StandardArticleWrapperView wrapper) throws ModelException{
        try {
            Vector<Object> parameters = new Vector<Object>();
            if (wrapper == null){
                parameters.add(common.RPCConstantsAndServices.createFromClientNullProxiRepresentation());
            } else {
                parameters.add(((view.objects.ViewProxi)wrapper).createProxiInformation());
            }
            java.util.HashMap<?,?> success = (java.util.HashMap<?,?>)this.execute(this.connectionName, "loadArticleWrapper", parameters);
            if(!((Boolean)success.get(common.RPCConstantsAndServices.OKOrNotOKResultFieldName)).booleanValue()){
                if (((Integer)success.get(common.RPCConstantsAndServices.ErrorNumberFieldName)).intValue() == 0)
                    throw new ModelException((String)success.get(common.RPCConstantsAndServices.ExceptionMessageFieldName), ((Integer)success.get(common.RPCConstantsAndServices.ExceptionNumberFieldName)).intValue());
                throw new ModelException ("Fatal error (unknown exception code:" + (Integer)success.get(common.RPCConstantsAndServices.ErrorNumberFieldName) + ")",0);
            }else{
                java.util.HashMap<String,Object> allResults = (java.util.HashMap<String,Object>) success.get(common.RPCConstantsAndServices.ResultFieldName);
                view.objects.ViewProxi.resolveReferences(allResults, getHandler());
                common.ProxiInformation proxiInformation = common.RPCConstantsAndServices.createProxiInformation((String) success.get(common.RPCConstantsAndServices.RootFieldName));
                CustomerShopArticleWrapperView result = (CustomerShopArticleWrapperView) view.objects.ViewProxi.createProxi(proxiInformation, getHandler());
                if (result != null) ((view.objects.ViewRoot)result).setToString(proxiInformation.getToString());
                view.objects.ViewObject root = (view.objects.ViewObject) allResults.get(proxiInformation.getHashKey());
                if (root != null) ((view.objects.ViewProxi)result).setObject(root);
                return result;
            }
        }catch(IOException ioe){
            throw new ModelException(ioe.getMessage(),0);
        }catch(XmlRpcException xre){
            throw new ModelException(xre.getMessage(),0);
        }
        
    }
    

}
