
package conversordemoedas;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConversordeMOedas", targetNamespace = "http://conversordemoedas/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConversordeMOedas {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dolarToReal", targetNamespace = "http://conversordemoedas/", className = "conversordemoedas.DolarToReal")
    @ResponseWrapper(localName = "dolarToRealResponse", targetNamespace = "http://conversordemoedas/", className = "conversordemoedas.DolarToRealResponse")
    @Action(input = "http://conversordemoedas/ConversordeMOedas/dolarToRealRequest", output = "http://conversordemoedas/ConversordeMOedas/dolarToRealResponse")
    public double dolarToReal(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "euriToReal", targetNamespace = "http://conversordemoedas/", className = "conversordemoedas.EuriToReal")
    @ResponseWrapper(localName = "euriToRealResponse", targetNamespace = "http://conversordemoedas/", className = "conversordemoedas.EuriToRealResponse")
    @Action(input = "http://conversordemoedas/ConversordeMOedas/euriToRealRequest", output = "http://conversordemoedas/ConversordeMOedas/euriToRealResponse")
    public double euriToReal(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "realToDolar", targetNamespace = "http://conversordemoedas/", className = "conversordemoedas.RealToDolar")
    @ResponseWrapper(localName = "realToDolarResponse", targetNamespace = "http://conversordemoedas/", className = "conversordemoedas.RealToDolarResponse")
    @Action(input = "http://conversordemoedas/ConversordeMOedas/realToDolarRequest", output = "http://conversordemoedas/ConversordeMOedas/realToDolarResponse")
    public double realToDolar(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "realToEuro", targetNamespace = "http://conversordemoedas/", className = "conversordemoedas.RealToEuro")
    @ResponseWrapper(localName = "realToEuroResponse", targetNamespace = "http://conversordemoedas/", className = "conversordemoedas.RealToEuroResponse")
    @Action(input = "http://conversordemoedas/ConversordeMOedas/realToEuroRequest", output = "http://conversordemoedas/ConversordeMOedas/realToEuroResponse")
    public double realToEuro(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}
