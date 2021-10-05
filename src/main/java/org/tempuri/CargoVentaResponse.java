
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
 *         &lt;element name="CargoVentaResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cargoVentaResult"
})
@XmlRootElement(name = "CargoVentaResponse")
public class CargoVentaResponse {

    @XmlElement(name = "CargoVentaResult")
    protected String cargoVentaResult;

    /**
     * Obtiene el valor de la propiedad cargoVentaResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoVentaResult() {
        return cargoVentaResult;
    }

    /**
     * Define el valor de la propiedad cargoVentaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoVentaResult(String value) {
        this.cargoVentaResult = value;
    }

}
