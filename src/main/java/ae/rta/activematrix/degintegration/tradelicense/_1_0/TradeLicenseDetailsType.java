
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeLicenseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeLicenseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicenseNumber"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CompanyType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LicenseName_En" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LicenseName_Ar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}IssuingAuthority"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}IssueDate"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ExpiryDate"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}PhoneNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}MobileNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}FaxNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Pobox" minOccurs="0"/&gt;
 *         &lt;element name="CompanyEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Emirate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredAddress_En" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredAddress_Ar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}attributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLicenseDetailsType", propOrder = {
    "tradeLicenseNumber",
    "source",
    "companyType",
    "licenseNameEn",
    "licenseNameAr",
    "issuingAuthority",
    "issueDate",
    "expiryDate",
    "phoneNo",
    "mobileNo",
    "faxNo",
    "pobox",
    "companyEmail",
    "emirate",
    "country",
    "city",
    "registeredAddressEn",
    "registeredAddressAr",
    "attributes"
})
public class TradeLicenseDetailsType {

    @XmlElement(name = "TradeLicenseNumber", required = true)
    protected String tradeLicenseNumber;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "CompanyType", required = true)
    protected String companyType;
    @XmlElement(name = "LicenseName_En", required = true)
    protected String licenseNameEn;
    @XmlElement(name = "LicenseName_Ar")
    protected String licenseNameAr;
    @XmlElement(name = "IssuingAuthority", required = true)
    protected String issuingAuthority;
    @XmlElement(name = "IssueDate", required = true)
    protected String issueDate;
    @XmlElement(name = "ExpiryDate", required = true)
    protected String expiryDate;
    @XmlElement(name = "PhoneNo")
    protected String phoneNo;
    @XmlElement(name = "MobileNo")
    protected String mobileNo;
    @XmlElement(name = "FaxNo")
    protected String faxNo;
    @XmlElement(name = "Pobox")
    protected String pobox;
    @XmlElement(name = "CompanyEmail")
    protected String companyEmail;
    @XmlElement(name = "Emirate")
    protected String emirate;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "RegisteredAddress_En")
    protected String registeredAddressEn;
    @XmlElement(name = "RegisteredAddress_Ar")
    protected String registeredAddressAr;
    protected Attributes attributes;

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

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the licenseNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNameEn() {
        return licenseNameEn;
    }

    /**
     * Sets the value of the licenseNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNameEn(String value) {
        this.licenseNameEn = value;
    }

    /**
     * Gets the value of the licenseNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNameAr() {
        return licenseNameAr;
    }

    /**
     * Sets the value of the licenseNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNameAr(String value) {
        this.licenseNameAr = value;
    }

    /**
     * Gets the value of the issuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingAuthority(String value) {
        this.issuingAuthority = value;
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
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the faxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * Sets the value of the faxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNo(String value) {
        this.faxNo = value;
    }

    /**
     * Gets the value of the pobox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobox() {
        return pobox;
    }

    /**
     * Sets the value of the pobox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobox(String value) {
        this.pobox = value;
    }

    /**
     * Gets the value of the companyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyEmail() {
        return companyEmail;
    }

    /**
     * Sets the value of the companyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyEmail(String value) {
        this.companyEmail = value;
    }

    /**
     * Gets the value of the emirate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmirate() {
        return emirate;
    }

    /**
     * Sets the value of the emirate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmirate(String value) {
        this.emirate = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the registeredAddressEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredAddressEn() {
        return registeredAddressEn;
    }

    /**
     * Sets the value of the registeredAddressEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredAddressEn(String value) {
        this.registeredAddressEn = value;
    }

    /**
     * Gets the value of the registeredAddressAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredAddressAr() {
        return registeredAddressAr;
    }

    /**
     * Sets the value of the registeredAddressAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredAddressAr(String value) {
        this.registeredAddressAr = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

}
