
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTradeLicenseStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTradeLicenseStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gtstTradeLicenseNumber" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicenseNumber"/&gt;
 *         &lt;element name="gtstTradeLicenseStatus" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicenseStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTradeLicenseStatusResponse", propOrder = {
    "gtstTradeLicenseNumber",
    "gtstTradeLicenseStatus"
})
public class GetTradeLicenseStatusResponse {

    @XmlElement(required = true)
    protected String gtstTradeLicenseNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TradeLicenseStatus gtstTradeLicenseStatus;

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

    /**
     * Gets the value of the gtstTradeLicenseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLicenseStatus }
     *     
     */
    public TradeLicenseStatus getGtstTradeLicenseStatus() {
        return gtstTradeLicenseStatus;
    }

    /**
     * Sets the value of the gtstTradeLicenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLicenseStatus }
     *     
     */
    public void setGtstTradeLicenseStatus(TradeLicenseStatus value) {
        this.gtstTradeLicenseStatus = value;
    }

}
