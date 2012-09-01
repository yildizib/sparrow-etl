//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.23 at 07:01:14 PM SGT 
//


package sparrow.etl.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOOKUPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOOKUPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARAM" type="{}PARAMType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FILTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COLUMNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CLASS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DEPENDS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DATA-PROVIDER" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LOAD-TYPE" type="{http://www.w3.org/2001/XMLSchema}string" default="AUTO" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOOKUPType", propOrder = {
    "param",
    "filter",
    "columns"
})
public class LOOKUPType {

    @XmlElement(name = "PARAM")
    protected List<PARAMType> param;
    @XmlElement(name = "FILTER")
    protected String filter;
    @XmlElement(name = "COLUMNS")
    protected String columns;
    @XmlAttribute(name = "NAME", required = true)
    protected String name;
    @XmlAttribute(name = "CLASS")
    protected String _class;
    @XmlAttribute(name = "DEPENDS")
    protected String depends;
    @XmlAttribute(name = "DATA-PROVIDER", required = true)
    protected String dataprovider;
    @XmlAttribute(name = "LOAD-TYPE")
    protected String loadtype;

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARAM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMType }
     * 
     * 
     */
    public List<PARAMType> getPARAM() {
        if (param == null) {
            param = new ArrayList<PARAMType>();
        }
        return this.param;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILTER() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILTER(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLUMNS() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLUMNS(String value) {
        this.columns = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the class property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASS(String value) {
        this._class = value;
    }

    /**
     * Gets the value of the depends property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPENDS() {
        return depends;
    }

    /**
     * Sets the value of the depends property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPENDS(String value) {
        this.depends = value;
    }

    /**
     * Gets the value of the dataprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAPROVIDER() {
        return dataprovider;
    }

    /**
     * Sets the value of the dataprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAPROVIDER(String value) {
        this.dataprovider = value;
    }

    /**
     * Gets the value of the loadtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOADTYPE() {
        if (loadtype == null) {
            return "AUTO";
        } else {
            return loadtype;
        }
    }

    /**
     * Sets the value of the loadtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOADTYPE(String value) {
        this.loadtype = value;
    }

}