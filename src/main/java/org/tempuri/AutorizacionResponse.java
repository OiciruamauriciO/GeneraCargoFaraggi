
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutorizacionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autorizacionResult"
})
@XmlRootElement(name = "AutorizacionResponse")
public class AutorizacionResponse {

    @XmlElement(name = "AutorizacionResult")
    protected String autorizacionResult;

    /**
     * Obtiene el valor de la propiedad autorizacionResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacionResult() {
        return autorizacionResult;
    }

    /**
     * Define el valor de la propiedad autorizacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacionResult(String value) {
        this.autorizacionResult = value;
    }

}
