
package rta.adv.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syncTradeLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncTradeLicense"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="xmlTradeLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncTradeLicense", propOrder = {
    "xmlTradeLicense"
})
public class SyncTradeLicense {

    protected String xmlTradeLicense;

    /**
     * Gets the value of the xmlTradeLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlTradeLicense() {
        return xmlTradeLicense;
    }

    /**
     * Sets the value of the xmlTradeLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlTradeLicense(String value) {
        this.xmlTradeLicense = value;
    }

}
