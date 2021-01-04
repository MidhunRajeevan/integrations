
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ValidateTradeLicenseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateTradeLicenseRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vlTradeLicenseNumber" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicenseNumber"/&gt;
 *         &lt;element name="vlExpiryDate" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ExpiryDate"/&gt;
 *         &lt;element name="vlIssueDate" type="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}IssueDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateTradeLicenseRequest", propOrder = {
    "vlTradeLicenseNumber",
    "vlExpiryDate",
    "vlIssueDate"
})
public class ValidateTradeLicenseRequest {

    @XmlElement(required = true)
    protected String vlTradeLicenseNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vlExpiryDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vlIssueDate;

    /**
     * Gets the value of the vlTradeLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlTradeLicenseNumber() {
        return vlTradeLicenseNumber;
    }

    /**
     * Sets the value of the vlTradeLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlTradeLicenseNumber(String value) {
        this.vlTradeLicenseNumber = value;
    }

    /**
     * Gets the value of the vlExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVlExpiryDate() {
        return vlExpiryDate;
    }

    /**
     * Sets the value of the vlExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVlExpiryDate(XMLGregorianCalendar value) {
        this.vlExpiryDate = value;
    }

    /**
     * Gets the value of the vlIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVlIssueDate() {
        return vlIssueDate;
    }

    /**
     * Sets the value of the vlIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVlIssueDate(XMLGregorianCalendar value) {
        this.vlIssueDate = value;
    }

}
