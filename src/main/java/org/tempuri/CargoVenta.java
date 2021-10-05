
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
 *         &lt;element name="XML_INPUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "xmlinput"
})
@XmlRootElement(name = "CargoVenta")
public class CargoVenta {

    @XmlElement(name = "XML_INPUT")
    protected String xmlinput;

    /**
     * Obtiene el valor de la propiedad xmlinput.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLINPUT() {
        return xmlinput;
    }

    /**
     * Define el valor de la propiedad xmlinput.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLINPUT(String value) {
        this.xmlinput = value;
    }

}
