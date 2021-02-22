
package eip.integrations.shared.definition.commertialinstitutedetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for headerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="headerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceSystemType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerType", propOrder = {
    "sourceSystemType",
    "sourceSystemId",
    "transactionId",
    "transactionDateTime"
})
public class HeaderType {

    @XmlElement(required = true)
    protected String sourceSystemType;
    @XmlElement(required = true)
    protected String sourceSystemId;
    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected String transactionDateTime;

    /**
     * Gets the value of the sourceSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemType() {
        return sourceSystemType;
    }

    /**
     * Sets the value of the sourceSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemType(String value) {
        this.sourceSystemType = value;
    }

    /**
     * Gets the value of the sourceSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Sets the value of the sourceSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemId(String value) {
        this.sourceSystemId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDateTime(String value) {
        this.transactionDateTime = value;
    }

}
