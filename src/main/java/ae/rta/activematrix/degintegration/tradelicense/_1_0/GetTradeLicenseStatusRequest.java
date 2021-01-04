
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTradeLicenseStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTradeLicenseStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gtstTradeLicenseNumber" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicenseNumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTradeLicenseStatusRequest", propOrder = {
    "gtstTradeLicenseNumber"
})
public class GetTradeLicenseStatusRequest {

    @XmlElement(required = true)
    protected String gtstTradeLicenseNumber;

    /**
     * Gets the value of the gtstTradeLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtstTradeLicenseNumber() {
        return gtstTradeLicenseNumber;
    }

    /**
     * Sets the value of the gtstTradeLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtstTradeLicenseNumber(String value) {
        this.gtstTradeLicenseNumber = value;
    }

}
