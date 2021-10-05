
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Autorizacion }
     * 
     */
    public Autorizacion createAutorizacion() {
        return new Autorizacion();
    }

    /**
     * Create an instance of {@link AutorizacionResponse }
     * 
     */
    public AutorizacionResponse createAutorizacionResponse() {
        return new AutorizacionResponse();
    }

    /**
     * Create an instance of {@link Anulacion }
     * 
     */
    public Anulacion createAnulacion() {
        return new Anulacion();
    }

    /**
     * Create an instance of {@link AnulacionResponse }
     * 
     */
    public AnulacionResponse createAnulacionResponse() {
        return new AnulacionResponse();
    }

    /**
     * Create an instance of {@link CargoVenta }
     * 
     */
    public CargoVenta createCargoVenta() {
        return new CargoVenta();
    }

    /**
     * Create an instance of {@link CargoVentaResponse }
     * 
     */
    public CargoVentaResponse createCargoVentaResponse() {
        return new CargoVentaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
