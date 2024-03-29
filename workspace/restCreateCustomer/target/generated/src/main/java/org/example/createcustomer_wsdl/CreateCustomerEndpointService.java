package org.example.createcustomer_wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-sb2-750026-redhat-00001
 * 2022-12-29T10:53:03.081+05:30
 * Generated source version: 3.2.7.fuse-sb2-750026-redhat-00001
 *
 */
@WebServiceClient(name = "CreateCustomerEndpointService",
                  wsdlLocation = "file:/Users/rchhabria/Documents/demos/fuse/restCreateCustomer/src/main/resources/wsdl/GetFullName.wsdl",
                  targetNamespace = "http://www.example.org/CreateCustomer_WSDL/")
public class CreateCustomerEndpointService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/CreateCustomer_WSDL/", "CreateCustomerEndpointService");
    public final static QName CreateCustomerService = new QName("http://www.example.org/CreateCustomer_WSDL/", "CreateCustomerService");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/rchhabria/Documents/demos/fuse/restCreateCustomer/src/main/resources/wsdl/GetFullName.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CreateCustomerEndpointService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/rchhabria/Documents/demos/fuse/restCreateCustomer/src/main/resources/wsdl/GetFullName.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CreateCustomerEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CreateCustomerEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreateCustomerEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CreateCustomerEndpointService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CreateCustomerEndpointService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CreateCustomerEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CreateCustomerEndpoint
     */
    @WebEndpoint(name = "CreateCustomerService")
    public CreateCustomerEndpoint getCreateCustomerService() {
        return super.getPort(CreateCustomerService, CreateCustomerEndpoint.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreateCustomerEndpoint
     */
    @WebEndpoint(name = "CreateCustomerService")
    public CreateCustomerEndpoint getCreateCustomerService(WebServiceFeature... features) {
        return super.getPort(CreateCustomerService, CreateCustomerEndpoint.class, features);
    }

}
