
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
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Address"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Pobox"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}eMail"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ParcelId"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}BuildingNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}FloorNumber"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}SuiteNumber"/&gt;
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
    "address",
    "pobox",
    "eMail",
    "parcelId",
    "buildingNumber",
    "floorNumber",
    "suiteNumber"
})
@XmlRootElement(name = "DepartmentUserArea")
public class DepartmentUserArea {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Pobox", required = true)
    protected String pobox;
    @XmlElement(required = true)
    protected String eMail;
    @XmlElement(name = "ParcelId", required = true)
    protected String parcelId;
    @XmlElement(name = "BuildingNumber", required = true)
    protected String buildingNumber;
    @XmlElement(name = "FloorNumber", required = true)
    protected String floorNumber;
    @XmlElement(name = "SuiteNumber", required = true)
    protected String suiteNumber;

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
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the parcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelId(String value) {
        this.parcelId = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the floorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * Sets the value of the floorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNumber(String value) {
        this.floorNumber = value;
    }

    /**
     * Gets the value of the suiteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuiteNumber() {
        return suiteNumber;
    }

    /**
     * Sets the value of the suiteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuiteNumber(String value) {
        this.suiteNumber = value;
    }

}
