
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}MasterData"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CommerceRegistry" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}CommerceRegistryActivity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Activities"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Partners"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Transactions" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "masterData",
    "commerceRegistry",
    "commerceRegistryActivity",
    "activities",
    "partners",
    "transactions"
})
@XmlRootElement(name = "TradeLicense")
public class TradeLicense {

    @XmlElement(name = "MasterData", required = true)
    protected MasterData masterData;
    @XmlElement(name = "CommerceRegistry")
    protected CommerceRegistry commerceRegistry;
    @XmlElement(name = "CommerceRegistryActivity")
    protected CommerceRegistryActivity commerceRegistryActivity;
    @XmlElement(name = "Activities", required = true)
    protected Activities activities;
    @XmlElement(name = "Partners", required = true)
    protected Partners partners;
    @XmlElement(name = "Transactions")
    protected List<Transactions> transactions;

    /**
     * Gets the value of the masterData property.
     * 
     * @return
     *     possible object is
     *     {@link MasterData }
     *     
     */
    public MasterData getMasterData() {
        return masterData;
    }

    /**
     * Sets the value of the masterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterData }
     *     
     */
    public void setMasterData(MasterData value) {
        this.masterData = value;
    }

    /**
     * Gets the value of the commerceRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link CommerceRegistry }
     *     
     */
    public CommerceRegistry getCommerceRegistry() {
        return commerceRegistry;
    }

    /**
     * Sets the value of the commerceRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommerceRegistry }
     *     
     */
    public void setCommerceRegistry(CommerceRegistry value) {
        this.commerceRegistry = value;
    }

    /**
     * Gets the value of the commerceRegistryActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CommerceRegistryActivity }
     *     
     */
    public CommerceRegistryActivity getCommerceRegistryActivity() {
        return commerceRegistryActivity;
    }

    /**
     * Sets the value of the commerceRegistryActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommerceRegistryActivity }
     *     
     */
    public void setCommerceRegistryActivity(CommerceRegistryActivity value) {
        this.commerceRegistryActivity = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link Activities }
     *     
     */
    public Activities getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activities }
     *     
     */
    public void setActivities(Activities value) {
        this.activities = value;
    }

    /**
     * Gets the value of the partners property.
     * 
     * @return
     *     possible object is
     *     {@link Partners }
     *     
     */
    public Partners getPartners() {
        return partners;
    }

    /**
     * Sets the value of the partners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partners }
     *     
     */
    public void setPartners(Partners value) {
        this.partners = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transactions }
     * 
     * 
     */
    public List<Transactions> getTransactions() {
        if (transactions == null) {
            transactions = new ArrayList<Transactions>();
        }
        return this.transactions;
    }

}
