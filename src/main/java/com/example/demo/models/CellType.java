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
 * <p>Java class for cellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cellType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="cellAddress" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="keyId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="variableKeyId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="functionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cellType")
public class CellType {

    @XmlAttribute(name = "cellAddress")
    protected String cellAddress;
    @XmlAttribute(name = "uid")
    protected String uid;
    @XmlAttribute(name = "keyId")
    protected String keyId;
    @XmlAttribute(name = "variableKeyId")
    protected String variableKeyId;
    @XmlAttribute(name = "functionName")
    protected String functionName;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "color")
    protected String color;

    /**
     * Gets the value of the cellAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellAddress() {
        return cellAddress;
    }

    /**
     * Sets the value of the cellAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellAddress(String value) {
        this.cellAddress = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the variableKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableKeyId() {
        return variableKeyId;
    }

    /**
     * Sets the value of the variableKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableKeyId(String value) {
        this.variableKeyId = value;
    }

    /**
     * Gets the value of the functionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * Sets the value of the functionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionName(String value) {
        this.functionName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

}
