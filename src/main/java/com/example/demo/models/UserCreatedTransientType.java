//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.24 at 11:48:00 AM EEST 
//


package com.example.demo.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 transient values which are created by parties, with additional data (dimension and dimension instance UIDs)
 *             
 * 
 * <p>Java class for userCreatedTransientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userCreatedTransientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}transientValueType"&gt;
 *       &lt;attribute name="dimensionUid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dimensionInstanceUid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userCreatedTransientType")
public class UserCreatedTransientType
    extends TransientValueType
{

    @XmlAttribute(name = "dimensionUid", required = true)
    protected String dimensionUid;
    @XmlAttribute(name = "dimensionInstanceUid", required = true)
    protected String dimensionInstanceUid;

    /**
     * Gets the value of the dimensionUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionUid() {
        return dimensionUid;
    }

    /**
     * Sets the value of the dimensionUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionUid(String value) {
        this.dimensionUid = value;
    }

    /**
     * Gets the value of the dimensionInstanceUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionInstanceUid() {
        return dimensionInstanceUid;
    }

    /**
     * Sets the value of the dimensionInstanceUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionInstanceUid(String value) {
        this.dimensionInstanceUid = value;
    }

}