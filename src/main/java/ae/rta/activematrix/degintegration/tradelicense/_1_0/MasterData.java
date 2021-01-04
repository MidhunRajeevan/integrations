
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}LicenseNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}IssueAuthority" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}InitialApprovalNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}DunsID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CommerceNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ChamberOfCommerceNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeNameDetail" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ContactNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}IssueDate"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ExpiryDate"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CancelDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}LicenseStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Category"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}LicenseAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}PrintRemarks" minOccurs="0"/&gt;
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
    "licenseNumber",
    "issueAuthority",
    "initialApprovalNumber",
    "dunsID",
    "commerceNumber",
    "chamberOfCommerceNumber",
    "tradeNameDetail",
    "contactNumber",
    "issueDate",
    "expiryDate",
    "cancelDate",
    "licenseStatus",
    "category",
    "licenseAddress",
    "printRemarks"
})
@XmlRootElement(name = "MasterData")
public class MasterData {

    @XmlElement(name = "LicenseNumber", required = true)
    protected String licenseNumber;
    @XmlElement(name = "IssueAuthority")
    protected IssueAuthority issueAuthority;
    @XmlElement(name = "InitialApprovalNumber")
    protected String initialApprovalNumber;
    @XmlElement(name = "DunsID")
    protected String dunsID;
    @XmlElement(name = "CommerceNumber", required = true)
    protected String commerceNumber;
    @XmlElement(name = "ChamberOfCommerceNumber", required = true)
    protected String chamberOfCommerceNumber;
    @XmlElement(name = "TradeNameDetail")
    protected TradeNameDetail tradeNameDetail;
    @XmlElement(name = "ContactNumber", required = true)
    protected ContactNumber contactNumber;
    @XmlElement(name = "IssueDate", required = true)
    protected String issueDate;
    @XmlElement(name = "ExpiryDate", required = true)
    protected String expiryDate;
    @XmlElement(name = "CancelDate")
    protected String cancelDate;
    @XmlElement(name = "LicenseStatus")
    protected LicenseStatus licenseStatus;
    @XmlElement(name = "Category", required = true)
    protected Category category;
    @XmlElement(name = "LicenseAddress")
    protected LicenseAddress licenseAddress;
    @XmlElement(name = "PrintRemarks")
    protected PrintRemarks printRemarks;

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the issueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link IssueAuthority }
     *     
     */
    public IssueAuthority getIssueAuthority() {
        return issueAuthority;
    }

    /**
     * Sets the value of the issueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueAuthority }
     *     
     */
    public void setIssueAuthority(IssueAuthority value) {
        this.issueAuthority = value;
    }

    /**
     * Gets the value of the initialApprovalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialApprovalNumber() {
        return initialApprovalNumber;
    }

    /**
     * Sets the value of the initialApprovalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialApprovalNumber(String value) {
        this.initialApprovalNumber = value;
    }

    /**
     * Gets the value of the dunsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunsID() {
        return dunsID;
    }

    /**
     * Sets the value of the dunsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunsID(String value) {
        this.dunsID = value;
    }

    /**
     * Gets the value of the commerceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceNumber() {
        return commerceNumber;
    }

    /**
     * Sets the value of the commerceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceNumber(String value) {
        this.commerceNumber = value;
    }

    /**
     * Gets the value of the chamberOfCommerceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamberOfCommerceNumber() {
        return chamberOfCommerceNumber;
    }

    /**
     * Sets the value of the chamberOfCommerceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamberOfCommerceNumber(String value) {
        this.chamberOfCommerceNumber = value;
    }

    /**
     * Gets the value of the tradeNameDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNameDetail }
     *     
     */
    public TradeNameDetail getTradeNameDetail() {
        return tradeNameDetail;
    }

    /**
     * Sets the value of the tradeNameDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNameDetail }
     *     
     */
    public void setTradeNameDetail(TradeNameDetail value) {
        this.tradeNameDetail = value;
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ContactNumber }
     *     
     */
    public ContactNumber getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactNumber }
     *     
     */
    public void setContactNumber(ContactNumber value) {
        this.contactNumber = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the licenseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseStatus }
     *     
     */
    public LicenseStatus getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Sets the value of the licenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseStatus }
     *     
     */
    public void setLicenseStatus(LicenseStatus value) {
        this.licenseStatus = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the licenseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseAddress }
     *     
     */
    public LicenseAddress getLicenseAddress() {
        return licenseAddress;
    }

    /**
     * Sets the value of the licenseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseAddress }
     *     
     */
    public void setLicenseAddress(LicenseAddress value) {
        this.licenseAddress = value;
    }

    /**
     * Gets the value of the printRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link PrintRemarks }
     *     
     */
    public PrintRemarks getPrintRemarks() {
        return printRemarks;
    }

    /**
     * Sets the value of the printRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintRemarks }
     *     
     */
    public void setPrintRemarks(PrintRemarks value) {
        this.printRemarks = value;
    }

}
