
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateTradeLicenseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateTradeLicenseResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vlrsvlTradeLicenseNumber" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicenseNumber"/&gt;
 *         &lt;element name="vlrsTradeLicenseValid" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicenseValid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateTradeLicenseResponse", propOrder = {
    "vlrsvlTradeLicenseNumber",
    "vlrsTradeLicenseValid"
})
public class ValidateTradeLicenseResponse {

    @XmlElement(required = true)
    protected String vlrsvlTradeLicenseNumber;
    protected boolean vlrsTradeLicenseValid;

    /**
     * Gets the value of the vlrsvlTradeLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlrsvlTradeLicenseNumber() {
        return vlrsvlTradeLicenseNumber;
    }

    /**
     * Sets the value of the vlrsvlTradeLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlrsvlTradeLicenseNumber(String value) {
        this.vlrsvlTradeLicenseNumber = value;
    }

    /**
     * Gets the value of the vlrsTradeLicenseValid property.
     * 
     */
    public boolean isVlrsTradeLicenseValid() {
        return vlrsTradeLicenseValid;
    }

    /**
     * Sets the value of the vlrsTradeLicenseValid property.
     * 
     */
    public void setVlrsTradeLicenseValid(boolean value) {
        this.vlrsTradeLicenseValid = value;
    }

}
