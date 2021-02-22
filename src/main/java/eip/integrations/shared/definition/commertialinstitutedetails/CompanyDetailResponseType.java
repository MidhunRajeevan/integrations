
package eip.integrations.shared.definition.commertialinstitutedetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for companyDetailResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="companyDetailResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseBody" type="{http://http://www.rta.ae/EIP/LACommercialInstituteDetailsService/LACommercialInstituteDetailsServiceSchema}companyDetailResponseBodyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responseType"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="responseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyDetailResponseType", propOrder = {
    "responseBody",
    "responseType"
})
public class CompanyDetailResponseType {

    protected List<CompanyDetailResponseBodyType> responseBody;
    @XmlElement(required = true)
    protected CompanyDetailResponseType.ResponseType responseType;

    /**
     * Gets the value of the responseBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyDetailResponseBodyType }
     * 
     * 
     */
    public List<CompanyDetailResponseBodyType> getResponseBody() {
        if (responseBody == null) {
            responseBody = new ArrayList<CompanyDetailResponseBodyType>();
        }
        return this.responseBody;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDetailResponseType.ResponseType }
     *     
     */
    public CompanyDetailResponseType.ResponseType getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDetailResponseType.ResponseType }
     *     
     */
    public void setResponseType(CompanyDetailResponseType.ResponseType value) {
        this.responseType = value;
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
     *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="responseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "responseCode",
        "responseDescription"
    })
    public static class ResponseType {

        @XmlElement(required = true)
        protected BigInteger responseCode;
        @XmlElement(required = true)
        protected String responseDescription;

        /**
         * Gets the value of the responseCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResponseCode() {
            return responseCode;
        }

        /**
         * Sets the value of the responseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResponseCode(BigInteger value) {
            this.responseCode = value;
        }

        /**
         * Gets the value of the responseDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseDescription() {
            return responseDescription;
        }

        /**
         * Sets the value of the responseDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseDescription(String value) {
            this.responseDescription = value;
        }

    }

}
