
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTradeLicenseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTradeLicenseResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TradeLicenseNumber" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicenseNumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTradeLicenseResponse", propOrder = {
    "tradeLicenseNumber"
})
public class InsertTradeLicenseResponse {

    @XmlElement(name = "TradeLicenseNumber", required = true)
    protected String tradeLicenseNumber;

    /**
     * Gets the value of the tradeLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeLicenseNumber() {
        return tradeLicenseNumber;
    }

    /**
     * Sets the value of the tradeLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeLicenseNumber(String value) {
        this.tradeLicenseNumber = value;
    }

}
