
package ae.rta.activematrix.degintegration.tradelicense._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}ParcelID"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Address"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Area"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}SubArea"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Community"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Unit"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Building"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Street"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Longitude"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}Latitude"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}QRCode"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}RentContractNo"/&gt;
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
    "content"
})
@XmlRootElement(name = "LicenseAddress")
public class LicenseAddress {

    @XmlElementRefs({
        @XmlElementRef(name = "ParcelID", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = JAXBElement.class),
        @XmlElementRef(name = "Address", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = JAXBElement.class),
        @XmlElementRef(name = "Area", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = Area.class),
        @XmlElementRef(name = "SubArea", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = SubArea.class),
        @XmlElementRef(name = "Community", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = Community.class),
        @XmlElementRef(name = "Unit", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = Unit.class),
        @XmlElementRef(name = "Building", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = Building.class),
        @XmlElementRef(name = "Street", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = Street.class),
        @XmlElementRef(name = "Longitude", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = JAXBElement.class),
        @XmlElementRef(name = "Latitude", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = JAXBElement.class),
        @XmlElementRef(name = "QRCode", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = JAXBElement.class),
        @XmlElementRef(name = "RentContractNo", namespace = "http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Area }
     * {@link SubArea }
     * {@link Community }
     * {@link Unit }
     * {@link Building }
     * {@link Street }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
