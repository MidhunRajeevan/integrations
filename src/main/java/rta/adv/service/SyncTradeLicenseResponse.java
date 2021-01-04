
package rta.adv.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syncTradeLicenseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncTradeLicenseResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="syncTradeLicenseReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncTradeLicenseResponse", propOrder = {
    "syncTradeLicenseReturn"
})
public class SyncTradeLicenseResponse {

    protected String syncTradeLicenseReturn;

    /**
     * Gets the value of the syncTradeLicenseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncTradeLicenseReturn() {
        return syncTradeLicenseReturn;
    }

    /**
     * Sets the value of the syncTradeLicenseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncTradeLicenseReturn(String value) {
        this.syncTradeLicenseReturn = value;
    }

}
