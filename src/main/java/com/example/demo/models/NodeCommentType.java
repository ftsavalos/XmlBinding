//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.24 at 11:48:00 AM EEST 
//


package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * node comments can be defined for nodes in the tree
 * 
 * <p>Java class for nodeCommentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nodeCommentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{}commentType" minOccurs="0"/&gt;
 *         &lt;element name="yearSpecificComments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="yearSpecificComment" type="{}yearSpecificCommentType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodeCommentType", propOrder = {
    "comment",
    "yearSpecificComments"
})
public class NodeCommentType {

    protected CommentType comment;
    protected NodeCommentType.YearSpecificComments yearSpecificComments;
    @XmlAttribute(name = "uid")
    @XmlSchemaType(name = "anySimpleType")
    protected String uid;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComment(CommentType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the yearSpecificComments property.
     * 
     * @return
     *     possible object is
     *     {@link NodeCommentType.YearSpecificComments }
     *     
     */
    public NodeCommentType.YearSpecificComments getYearSpecificComments() {
        return yearSpecificComments;
    }

    /**
     * Sets the value of the yearSpecificComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeCommentType.YearSpecificComments }
     *     
     */
    public void setYearSpecificComments(NodeCommentType.YearSpecificComments value) {
        this.yearSpecificComments = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="yearSpecificComment" type="{}yearSpecificCommentType" maxOccurs="unbounded"/&gt;
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
        "yearSpecificComment"
    })
    public static class YearSpecificComments {

        @XmlElement(required = true)
        protected List<YearSpecificCommentType> yearSpecificComment;

        /**
         * Gets the value of the yearSpecificComment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the yearSpecificComment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getYearSpecificComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link YearSpecificCommentType }
         * 
         * 
         */
        public List<YearSpecificCommentType> getYearSpecificComment() {
            if (yearSpecificComment == null) {
                yearSpecificComment = new ArrayList<YearSpecificCommentType>();
            }
            return this.yearSpecificComment;
        }

    }

}
