
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
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeNameSerial"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeName"/&gt;
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
    "tradeNameSerial",
    "tradeName"
})
@XmlRootElement(name = "TradeNameDetail")
public class TradeNameDetail {

    @XmlElement(name = "TradeNameSerial", required = true)
    protected String tradeNameSerial;
    @XmlElement(name = "TradeName", required = true)
    protected TradeName tradeName;

    /**
     * Gets the value of the tradeNameSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeNameSerial() {
        return tradeNameSerial;
    }

    /**
     * Sets the value of the tradeNameSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeNameSerial(String value) {
        this.tradeNameSerial = value;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link TradeName }
     *     
     */
    public TradeName getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeName }
     *     
     */
    public void setTradeName(TradeName value) {
        this.tradeName = value;
    }

}
