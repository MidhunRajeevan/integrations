
package eip.integrations.shared.definition.commertialinstitutedetails;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCommercialInstituteDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCommercialInstituteDetailsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Period" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="orgID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="trafficNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ActivityCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCommercialInstituteDetailsRequestType", propOrder = {
    "period",
    "orgID",
    "trafficNo",
    "activityCodes",
    "appId"
})
public class GetCommercialInstituteDetailsRequestType {

    @XmlElement(name = "Period")
    protected GetCommercialInstituteDetailsRequestType.Period period;
    protected BigDecimal orgID;
    protected BigDecimal trafficNo;
    @XmlElement(name = "ActivityCodes")
    protected String activityCodes;
    protected String appId;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link GetCommercialInstituteDetailsRequestType.Period }
     *     
     */
    public GetCommercialInstituteDetailsRequestType.Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCommercialInstituteDetailsRequestType.Period }
     *     
     */
    public void setPeriod(GetCommercialInstituteDetailsRequestType.Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the orgID property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrgID(BigDecimal value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the trafficNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrafficNo() {
        return trafficNo;
    }

    /**
     * Sets the value of the trafficNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrafficNo(BigDecimal value) {
        this.trafficNo = value;
    }

    /**
     * Gets the value of the activityCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCodes() {
        return activityCodes;
    }

    /**
     * Sets the value of the activityCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCodes(String value) {
        this.activityCodes = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }


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
     *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "startDateTime",
        "endDateTime"
    })
    public static class Period {

        @XmlElement(required = true)
        protected String startDateTime;
        @XmlElement(required = true)
        protected String endDateTime;

        /**
         * Gets the value of the startDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDateTime() {
            return startDateTime;
        }

        /**
         * Sets the value of the startDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDateTime(String value) {
            this.startDateTime = value;
        }

        /**
         * Gets the value of the endDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDateTime() {
            return endDateTime;
        }

        /**
         * Sets the value of the endDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDateTime(String value) {
            this.endDateTime = value;
        }

    }

}
