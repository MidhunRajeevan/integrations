
package eip.integrations.shared.definition.commertialinstitutedetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCommercialInstituteDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCommercialInstituteDetailsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getCompanyDetailResponse" type="{http://http://www.rta.ae/EIP/LACommercialInstituteDetailsService/LACommercialInstituteDetailsServiceSchema}companyDetailResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCommercialInstituteDetailsResponseType", propOrder = {
    "getCompanyDetailResponse"
})
public class GetCommercialInstituteDetailsResponseType {

    @XmlElement(required = true)
    protected CompanyDetailResponseType getCompanyDetailResponse;

    /**
     * Gets the value of the getCompanyDetailResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDetailResponseType }
     *     
     */
    public CompanyDetailResponseType getGetCompanyDetailResponse() {
        return getCompanyDetailResponse;
    }

    /**
     * Sets the value of the getCompanyDetailResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDetailResponseType }
     *     
     */
    public void setGetCompanyDetailResponse(CompanyDetailResponseType value) {
        this.getCompanyDetailResponse = value;
    }

}
