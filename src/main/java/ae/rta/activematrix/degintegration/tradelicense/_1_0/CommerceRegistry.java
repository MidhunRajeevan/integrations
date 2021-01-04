
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
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}RegisterSerialNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}UCRNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CommerceNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CompanyName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}MainLicenseNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CommerceRegisterType"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}LegalType"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Nationality"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}IssueDate"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ExpiryDate"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CancelDate"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}PaidUpCapital"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}NominalCapital"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Address"/&gt;
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
    "registerSerialNumber",
    "ucrNumber",
    "commerceNumber",
    "companyName",
    "mainLicenseNumber",
    "commerceRegisterType",
    "legalType",
    "nationality",
    "issueDate",
    "expiryDate",
    "cancelDate",
    "paidUpCapital",
    "nominalCapital",
    "address"
})
@XmlRootElement(name = "CommerceRegistry")
public class CommerceRegistry {

    @XmlElement(name = "RegisterSerialNumber", required = true)
    protected String registerSerialNumber;
    @XmlElement(name = "UCRNumber", required = true)
    protected String ucrNumber;
    @XmlElement(name = "CommerceNumber", required = true)
    protected String commerceNumber;
    @XmlElement(name = "CompanyName")
    protected CompanyName companyName;
    @XmlElement(name = "MainLicenseNumber", required = true)
    protected String mainLicenseNumber;
    @XmlElement(name = "CommerceRegisterType", required = true)
    protected CommerceRegisterType commerceRegisterType;
    @XmlElement(name = "LegalType", required = true)
    protected LegalType legalType;
    @XmlElement(name = "Nationality", required = true)
    protected Nationality nationality;
    @XmlElement(name = "IssueDate", required = true)
    protected String issueDate;
    @XmlElement(name = "ExpiryDate", required = true)
    protected String expiryDate;
    @XmlElement(name = "CancelDate", required = true)
    protected String cancelDate;
    @XmlElement(name = "PaidUpCapital", required = true)
    protected String paidUpCapital;
    @XmlElement(name = "NominalCapital", required = true)
    protected String nominalCapital;
    @XmlElement(name = "Address", required = true)
    protected String address;

    /**
     * Gets the value of the registerSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterSerialNumber() {
        return registerSerialNumber;
    }

    /**
     * Sets the value of the registerSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterSerialNumber(String value) {
        this.registerSerialNumber = value;
    }

    /**
     * Gets the value of the ucrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCRNumber() {
        return ucrNumber;
    }

    /**
     * Sets the value of the ucrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCRNumber(String value) {
        this.ucrNumber = value;
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
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyName }
     *     
     */
    public CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyName }
     *     
     */
    public void setCompanyName(CompanyName value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the mainLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainLicenseNumber() {
        return mainLicenseNumber;
    }

    /**
     * Sets the value of the mainLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainLicenseNumber(String value) {
        this.mainLicenseNumber = value;
    }

    /**
     * Gets the value of the commerceRegisterType property.
     * 
     * @return
     *     possible object is
     *     {@link CommerceRegisterType }
     *     
     */
    public CommerceRegisterType getCommerceRegisterType() {
        return commerceRegisterType;
    }

    /**
     * Sets the value of the commerceRegisterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommerceRegisterType }
     *     
     */
    public void setCommerceRegisterType(CommerceRegisterType value) {
        this.commerceRegisterType = value;
    }

    /**
     * Gets the value of the legalType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalType }
     *     
     */
    public LegalType getLegalType() {
        return legalType;
    }

    /**
     * Sets the value of the legalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalType }
     *     
     */
    public void setLegalType(LegalType value) {
        this.legalType = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link Nationality }
     *     
     */
    public Nationality getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nationality }
     *     
     */
    public void setNationality(Nationality value) {
        this.nationality = value;
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
     * Gets the value of the paidUpCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidUpCapital() {
        return paidUpCapital;
    }

    /**
     * Sets the value of the paidUpCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidUpCapital(String value) {
        this.paidUpCapital = value;
    }

    /**
     * Gets the value of the nominalCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalCapital() {
        return nominalCapital;
    }

    /**
     * Sets the value of the nominalCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalCapital(String value) {
        this.nominalCapital = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
