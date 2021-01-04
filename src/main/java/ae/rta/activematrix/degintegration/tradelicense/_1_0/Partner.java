
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
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Id"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Name"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}UnifiedFileNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}EmiratesID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}BirthDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}PersonCategory"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}PercentOwnership"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}PassportNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ResidenceNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Nationality"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}LegalType"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Status"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}AddDate"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CancelDate" minOccurs="0"/&gt;
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
    "id",
    "name",
    "unifiedFileNumber",
    "emiratesID",
    "birthDate",
    "personCategory",
    "percentOwnership",
    "passportNumber",
    "residenceNumber",
    "nationality",
    "legalType",
    "status",
    "addDate",
    "cancelDate"
})
@XmlRootElement(name = "Partner")
public class Partner {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "UnifiedFileNumber")
    protected String unifiedFileNumber;
    @XmlElement(name = "EmiratesID")
    protected String emiratesID;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "PersonCategory", required = true)
    protected PersonCategory personCategory;
    @XmlElement(name = "PercentOwnership", required = true)
    protected String percentOwnership;
    @XmlElement(name = "PassportNumber", required = true)
    protected String passportNumber;
    @XmlElement(name = "ResidenceNumber", required = true)
    protected String residenceNumber;
    @XmlElement(name = "Nationality", required = true)
    protected Nationality nationality;
    @XmlElement(name = "LegalType", required = true)
    protected LegalType legalType;
    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "AddDate", required = true)
    protected String addDate;
    @XmlElement(name = "CancelDate")
    protected String cancelDate;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the unifiedFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnifiedFileNumber() {
        return unifiedFileNumber;
    }

    /**
     * Sets the value of the unifiedFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnifiedFileNumber(String value) {
        this.unifiedFileNumber = value;
    }

    /**
     * Gets the value of the emiratesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmiratesID() {
        return emiratesID;
    }

    /**
     * Sets the value of the emiratesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmiratesID(String value) {
        this.emiratesID = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the personCategory property.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategory }
     *     
     */
    public PersonCategory getPersonCategory() {
        return personCategory;
    }

    /**
     * Sets the value of the personCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategory }
     *     
     */
    public void setPersonCategory(PersonCategory value) {
        this.personCategory = value;
    }

    /**
     * Gets the value of the percentOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentOwnership() {
        return percentOwnership;
    }

    /**
     * Sets the value of the percentOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentOwnership(String value) {
        this.percentOwnership = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the residenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceNumber() {
        return residenceNumber;
    }

    /**
     * Sets the value of the residenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceNumber(String value) {
        this.residenceNumber = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the addDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddDate() {
        return addDate;
    }

    /**
     * Sets the value of the addDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddDate(String value) {
        this.addDate = value;
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

}
