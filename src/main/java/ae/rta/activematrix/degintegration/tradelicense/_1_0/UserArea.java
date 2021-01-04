
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
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}AuthorizedDepartments" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.rta.ae/Activematrix/DEGIntegration/TradeLicense/1_0}DepartmentUserArea" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorizedDepartments",
    "departmentUserArea"
})
@XmlRootElement(name = "UserArea")
public class UserArea {

    @XmlElement(name = "AuthorizedDepartments")
    protected AuthorizedDepartments authorizedDepartments;
    @XmlElement(name = "DepartmentUserArea")
    protected DepartmentUserArea departmentUserArea;

    /**
     * Gets the value of the authorizedDepartments property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedDepartments }
     *     
     */
    public AuthorizedDepartments getAuthorizedDepartments() {
        return authorizedDepartments;
    }

    /**
     * Sets the value of the authorizedDepartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedDepartments }
     *     
     */
    public void setAuthorizedDepartments(AuthorizedDepartments value) {
        this.authorizedDepartments = value;
    }

    /**
     * Gets the value of the departmentUserArea property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentUserArea }
     *     
     */
    public DepartmentUserArea getDepartmentUserArea() {
        return departmentUserArea;
    }

    /**
     * Sets the value of the departmentUserArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentUserArea }
     *     
     */
    public void setDepartmentUserArea(DepartmentUserArea value) {
        this.departmentUserArea = value;
    }

}
