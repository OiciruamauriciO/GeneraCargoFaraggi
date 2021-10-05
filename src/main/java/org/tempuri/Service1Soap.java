
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service1Soap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service1Soap {


    /**
     * 
     * @param xmlINPUT
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Autorizacion", action = "http://tempuri.org/Autorizacion")
    @WebResult(name = "AutorizacionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Autorizacion", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Autorizacion")
    @ResponseWrapper(localName = "AutorizacionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AutorizacionResponse")
    public String autorizacion(
        @WebParam(name = "XML_INPUT", targetNamespace = "http://tempuri.org/")
        String xmlINPUT);

    /**
     * 
     * @param xmlINPUT
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Anulacion", action = "http://tempuri.org/Anulacion")
    @WebResult(name = "AnulacionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Anulacion", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Anulacion")
    @ResponseWrapper(localName = "AnulacionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AnulacionResponse")
    public String anulacion(
        @WebParam(name = "XML_INPUT", targetNamespace = "http://tempuri.org/")
        String xmlINPUT);

    /**
     * 
     * @param xmlINPUT
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CargoVenta", action = "http://tempuri.org/CargoVenta")
    @WebResult(name = "CargoVentaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CargoVenta", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CargoVenta")
    @ResponseWrapper(localName = "CargoVentaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CargoVentaResponse")
    public String cargoVenta(
        @WebParam(name = "XML_INPUT", targetNamespace = "http://tempuri.org/")
        String xmlINPUT);

}
