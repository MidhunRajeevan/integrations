
package eip.integrations.shared.definition.commertialinstitutedetails;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for companyDetailResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="companyDetailResponseBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrginizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgCreatedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISCARRENTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgTrafficClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgTrafficClassA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgTrafficClassE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgActivityDescE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgActivityDescA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgLegalClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgLegalTypeA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgLegalTypeE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgTypeA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgLicenseTypeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgLicenseTypeDescA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgLicenseTypeDescE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrgNameE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrgNameA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootOrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootOrgNameA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootOrgNameE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="companyNameAR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="poBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeLicenseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trafficFileNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="issuanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuanceAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeLicenseOwnerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyDetailResponseBodyType", propOrder = {
    "orginizationId",
    "orgActivityCode",
    "orgCreatedOn",
    "iscarrental",
    "orgTrafficClass",
    "orgTrafficClassA",
    "orgTrafficClassE",
    "orgActivityDescE",
    "orgActivityDescA",
    "orgLegalClassCode",
    "orgLegalTypeA",
    "orgLegalTypeE",
    "orgTypeCode",
    "orgTypeA",
    "orgLicenseTypeNo",
    "orgLicenseTypeDescA",
    "orgLicenseTypeDescE",
    "parentOrgId",
    "parentOrgNameE",
    "parentOrgNameA",
    "rootOrgId",
    "rootOrgNameA",
    "rootOrgNameE",
    "organizationCode",
    "companyName",
    "companyNameAR",
    "email",
    "address",
    "companyType",
    "parentCompanyName",
    "phone",
    "mobile",
    "fax",
    "poBox",
    "tradeLicenseNo",
    "trafficFileNo",
    "issuanceDate",
    "expiryDate",
    "issuanceAuthority",
    "tradeLicenseOwnerAddress"
})
public class CompanyDetailResponseBodyType {

    @XmlElement(name = "OrginizationId")
    protected String orginizationId;
    @XmlElement(name = "OrgActivityCode")
    protected String orgActivityCode;
    @XmlElement(name = "OrgCreatedOn")
    protected String orgCreatedOn;
    @XmlElement(name = "ISCARRENTAL")
    protected String iscarrental;
    @XmlElement(name = "OrgTrafficClass")
    protected String orgTrafficClass;
    @XmlElement(name = "OrgTrafficClassA")
    protected String orgTrafficClassA;
    @XmlElement(name = "OrgTrafficClassE")
    protected String orgTrafficClassE;
    @XmlElement(name = "OrgActivityDescE")
    protected String orgActivityDescE;
    @XmlElement(name = "OrgActivityDescA")
    protected String orgActivityDescA;
    @XmlElement(name = "OrgLegalClassCode")
    protected String orgLegalClassCode;
    @XmlElement(name = "OrgLegalTypeA")
    protected String orgLegalTypeA;
    @XmlElement(name = "OrgLegalTypeE")
    protected String orgLegalTypeE;
    @XmlElement(name = "OrgTypeCode")
    protected String orgTypeCode;
    @XmlElement(name = "OrgTypeA")
    protected String orgTypeA;
    @XmlElement(name = "OrgLicenseTypeNo")
    protected String orgLicenseTypeNo;
    @XmlElement(name = "OrgLicenseTypeDescA")
    protected String orgLicenseTypeDescA;
    @XmlElement(name = "OrgLicenseTypeDescE")
    protected String orgLicenseTypeDescE;
    @XmlElement(name = "ParentOrgId")
    protected String parentOrgId;
    @XmlElement(name = "ParentOrgNameE")
    protected String parentOrgNameE;
    @XmlElement(name = "ParentOrgNameA")
    protected String parentOrgNameA;
    @XmlElement(name = "RootOrgId")
    protected String rootOrgId;
    @XmlElement(name = "RootOrgNameA")
    protected String rootOrgNameA;
    @XmlElement(name = "RootOrgNameE")
    protected String rootOrgNameE;
    @XmlElement(name = "OrganizationCode")
    protected String organizationCode;
    @XmlElement(required = true)
    protected String companyName;
    @XmlElement(required = true)
    protected String companyNameAR;
    protected String email;
    protected String address;
    protected String companyType;
    @XmlElement(required = true)
    protected String parentCompanyName;
    protected String phone;
    protected String mobile;
    protected String fax;
    protected String poBox;
    protected String tradeLicenseNo;
    protected BigDecimal trafficFileNo;
    protected String issuanceDate;
    protected String expiryDate;
    protected String issuanceAuthority;
    protected String tradeLicenseOwnerAddress;

    /**
     * Gets the value of the orginizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginizationId() {
        return orginizationId;
    }

    /**
     * Sets the value of the orginizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginizationId(String value) {
        this.orginizationId = value;
    }

    /**
     * Gets the value of the orgActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgActivityCode() {
        return orgActivityCode;
    }

    /**
     * Sets the value of the orgActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgActivityCode(String value) {
        this.orgActivityCode = value;
    }

    /**
     * Gets the value of the orgCreatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCreatedOn() {
        return orgCreatedOn;
    }

    /**
     * Sets the value of the orgCreatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCreatedOn(String value) {
        this.orgCreatedOn = value;
    }

    /**
     * Gets the value of the iscarrental property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISCARRENTAL() {
        return iscarrental;
    }

    /**
     * Sets the value of the iscarrental property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISCARRENTAL(String value) {
        this.iscarrental = value;
    }

    /**
     * Gets the value of the orgTrafficClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgTrafficClass() {
        return orgTrafficClass;
    }

    /**
     * Sets the value of the orgTrafficClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgTrafficClass(String value) {
        this.orgTrafficClass = value;
    }

    /**
     * Gets the value of the orgTrafficClassA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgTrafficClassA() {
        return orgTrafficClassA;
    }

    /**
     * Sets the value of the orgTrafficClassA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgTrafficClassA(String value) {
        this.orgTrafficClassA = value;
    }

    /**
     * Gets the value of the orgTrafficClassE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgTrafficClassE() {
        return orgTrafficClassE;
    }

    /**
     * Sets the value of the orgTrafficClassE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgTrafficClassE(String value) {
        this.orgTrafficClassE = value;
    }

    /**
     * Gets the value of the orgActivityDescE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgActivityDescE() {
        return orgActivityDescE;
    }

    /**
     * Sets the value of the orgActivityDescE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgActivityDescE(String value) {
        this.orgActivityDescE = value;
    }

    /**
     * Gets the value of the orgActivityDescA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgActivityDescA() {
        return orgActivityDescA;
    }

    /**
     * Sets the value of the orgActivityDescA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgActivityDescA(String value) {
        this.orgActivityDescA = value;
    }

    /**
     * Gets the value of the orgLegalClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgLegalClassCode() {
        return orgLegalClassCode;
    }

    /**
     * Sets the value of the orgLegalClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgLegalClassCode(String value) {
        this.orgLegalClassCode = value;
    }

    /**
     * Gets the value of the orgLegalTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgLegalTypeA() {
        return orgLegalTypeA;
    }

    /**
     * Sets the value of the orgLegalTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgLegalTypeA(String value) {
        this.orgLegalTypeA = value;
    }

    /**
     * Gets the value of the orgLegalTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgLegalTypeE() {
        return orgLegalTypeE;
    }

    /**
     * Sets the value of the orgLegalTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgLegalTypeE(String value) {
        this.orgLegalTypeE = value;
    }

    /**
     * Gets the value of the orgTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgTypeCode() {
        return orgTypeCode;
    }

    /**
     * Sets the value of the orgTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgTypeCode(String value) {
        this.orgTypeCode = value;
    }

    /**
     * Gets the value of the orgTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgTypeA() {
        return orgTypeA;
    }

    /**
     * Sets the value of the orgTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgTypeA(String value) {
        this.orgTypeA = value;
    }

    /**
     * Gets the value of the orgLicenseTypeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgLicenseTypeNo() {
        return orgLicenseTypeNo;
    }

    /**
     * Sets the value of the orgLicenseTypeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgLicenseTypeNo(String value) {
        this.orgLicenseTypeNo = value;
    }

    /**
     * Gets the value of the orgLicenseTypeDescA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgLicenseTypeDescA() {
        return orgLicenseTypeDescA;
    }

    /**
     * Sets the value of the orgLicenseTypeDescA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgLicenseTypeDescA(String value) {
        this.orgLicenseTypeDescA = value;
    }

    /**
     * Gets the value of the orgLicenseTypeDescE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgLicenseTypeDescE() {
        return orgLicenseTypeDescE;
    }

    /**
     * Sets the value of the orgLicenseTypeDescE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgLicenseTypeDescE(String value) {
        this.orgLicenseTypeDescE = value;
    }

    /**
     * Gets the value of the parentOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrgId() {
        return parentOrgId;
    }

    /**
     * Sets the value of the parentOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrgId(String value) {
        this.parentOrgId = value;
    }

    /**
     * Gets the value of the parentOrgNameE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrgNameE() {
        return parentOrgNameE;
    }

    /**
     * Sets the value of the parentOrgNameE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrgNameE(String value) {
        this.parentOrgNameE = value;
    }

    /**
     * Gets the value of the parentOrgNameA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrgNameA() {
        return parentOrgNameA;
    }

    /**
     * Sets the value of the parentOrgNameA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrgNameA(String value) {
        this.parentOrgNameA = value;
    }

    /**
     * Gets the value of the rootOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOrgId() {
        return rootOrgId;
    }

    /**
     * Sets the value of the rootOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootOrgId(String value) {
        this.rootOrgId = value;
    }

    /**
     * Gets the value of the rootOrgNameA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOrgNameA() {
        return rootOrgNameA;
    }

    /**
     * Sets the value of the rootOrgNameA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootOrgNameA(String value) {
        this.rootOrgNameA = value;
    }

    /**
     * Gets the value of the rootOrgNameE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOrgNameE() {
        return rootOrgNameE;
    }

    /**
     * Sets the value of the rootOrgNameE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootOrgNameE(String value) {
        this.rootOrgNameE = value;
    }

    /**
     * Gets the value of the organizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the value of the organizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyNameAR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNameAR() {
        return companyNameAR;
    }

    /**
     * Sets the value of the companyNameAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNameAR(String value) {
        this.companyNameAR = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the parentCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCompanyName() {
        return parentCompanyName;
    }

    /**
     * Sets the value of the parentCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCompanyName(String value) {
        this.parentCompanyName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the tradeLicenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeLicenseNo() {
        return tradeLicenseNo;
    }

    /**
     * Sets the value of the tradeLicenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeLicenseNo(String value) {
        this.tradeLicenseNo = value;
    }

    /**
     * Gets the value of the trafficFileNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrafficFileNo() {
        return trafficFileNo;
    }

    /**
     * Sets the value of the trafficFileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrafficFileNo(BigDecimal value) {
        this.trafficFileNo = value;
    }

    /**
     * Gets the value of the issuanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceDate() {
        return issuanceDate;
    }

    /**
     * Sets the value of the issuanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceDate(String value) {
        this.issuanceDate = value;
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
     * Gets the value of the issuanceAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceAuthority() {
        return issuanceAuthority;
    }

    /**
     * Sets the value of the issuanceAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceAuthority(String value) {
        this.issuanceAuthority = value;
    }

    /**
     * Gets the value of the tradeLicenseOwnerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeLicenseOwnerAddress() {
        return tradeLicenseOwnerAddress;
    }

    /**
     * Sets the value of the tradeLicenseOwnerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeLicenseOwnerAddress(String value) {
        this.tradeLicenseOwnerAddress = value;
    }

}
