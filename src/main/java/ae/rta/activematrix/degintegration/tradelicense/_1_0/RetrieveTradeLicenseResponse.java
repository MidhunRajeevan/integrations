
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
 *         &lt;element name="TradeLicenseDetails"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicense"/&gt;
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
@XmlType(name = "", propOrder = {
    "tradeLicenseDetails"
})
@XmlRootElement(name = "RetrieveTradeLicenseResponse")
public class RetrieveTradeLicenseResponse {

    @XmlElement(name = "TradeLicenseDetails", required = true)
    protected RetrieveTradeLicenseResponse.TradeLicenseDetails tradeLicenseDetails;

    /**
     * Gets the value of the tradeLicenseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveTradeLicenseResponse.TradeLicenseDetails }
     *     
     */
    public RetrieveTradeLicenseResponse.TradeLicenseDetails getTradeLicenseDetails() {
        return tradeLicenseDetails;
    }

    /**
     * Sets the value of the tradeLicenseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveTradeLicenseResponse.TradeLicenseDetails }
     *     
     */
    public void setTradeLicenseDetails(RetrieveTradeLicenseResponse.TradeLicenseDetails value) {
        this.tradeLicenseDetails = value;
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
     *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}TradeLicense"/&gt;
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
        "tradeLicense"
    })
    public static class TradeLicenseDetails {

        @XmlElement(name = "TradeLicense", required = true)
        protected TradeLicense tradeLicense;

        /**
         * Gets the value of the tradeLicense property.
         * 
         * @return
         *     possible object is
         *     {@link TradeLicense }
         *     
         */
        public TradeLicense getTradeLicense() {
            return tradeLicense;
        }

        /**
         * Sets the value of the tradeLicense property.
         * 
         * @param value
         *     allowed object is
         *     {@link TradeLicense }
         *     
         */
        public void setTradeLicense(TradeLicense value) {
            this.tradeLicense = value;
        }

    }

}
