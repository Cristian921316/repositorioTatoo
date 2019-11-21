/**
 * EClienteVipWif.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.componenteEntidad;

public class EClienteVipWif  implements java.io.Serializable {
    private java.lang.String cardNumber;

    private java.lang.String country;

    private java.lang.String effectiveDate;

    private java.lang.String email;

    private java.lang.String expirationDate;

    private java.lang.String firstName;

    private java.lang.String isAnActiveCardHolder;

    private java.lang.String lastName;

    private java.math.BigDecimal salesVip;

    private java.lang.String version;

    public EClienteVipWif() {
    }

    public EClienteVipWif(
           java.lang.String cardNumber,
           java.lang.String country,
           java.lang.String effectiveDate,
           java.lang.String email,
           java.lang.String expirationDate,
           java.lang.String firstName,
           java.lang.String isAnActiveCardHolder,
           java.lang.String lastName,
           java.math.BigDecimal salesVip,
           java.lang.String version) {
           this.cardNumber = cardNumber;
           this.country = country;
           this.effectiveDate = effectiveDate;
           this.email = email;
           this.expirationDate = expirationDate;
           this.firstName = firstName;
           this.isAnActiveCardHolder = isAnActiveCardHolder;
           this.lastName = lastName;
           this.salesVip = salesVip;
           this.version = version;
    }


    /**
     * Gets the cardNumber value for this EClienteVipWif.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this EClienteVipWif.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the country value for this EClienteVipWif.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this EClienteVipWif.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the effectiveDate value for this EClienteVipWif.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this EClienteVipWif.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the email value for this EClienteVipWif.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EClienteVipWif.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the expirationDate value for this EClienteVipWif.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this EClienteVipWif.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the firstName value for this EClienteVipWif.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this EClienteVipWif.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the isAnActiveCardHolder value for this EClienteVipWif.
     * 
     * @return isAnActiveCardHolder
     */
    public java.lang.String getIsAnActiveCardHolder() {
        return isAnActiveCardHolder;
    }


    /**
     * Sets the isAnActiveCardHolder value for this EClienteVipWif.
     * 
     * @param isAnActiveCardHolder
     */
    public void setIsAnActiveCardHolder(java.lang.String isAnActiveCardHolder) {
        this.isAnActiveCardHolder = isAnActiveCardHolder;
    }


    /**
     * Gets the lastName value for this EClienteVipWif.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this EClienteVipWif.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the salesVip value for this EClienteVipWif.
     * 
     * @return salesVip
     */
    public java.math.BigDecimal getSalesVip() {
        return salesVip;
    }


    /**
     * Sets the salesVip value for this EClienteVipWif.
     * 
     * @param salesVip
     */
    public void setSalesVip(java.math.BigDecimal salesVip) {
        this.salesVip = salesVip;
    }


    /**
     * Gets the version value for this EClienteVipWif.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this EClienteVipWif.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EClienteVipWif)) return false;
        EClienteVipWif other = (EClienteVipWif) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.isAnActiveCardHolder==null && other.getIsAnActiveCardHolder()==null) || 
             (this.isAnActiveCardHolder!=null &&
              this.isAnActiveCardHolder.equals(other.getIsAnActiveCardHolder()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.salesVip==null && other.getSalesVip()==null) || 
             (this.salesVip!=null &&
              this.salesVip.equals(other.getSalesVip()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getIsAnActiveCardHolder() != null) {
            _hashCode += getIsAnActiveCardHolder().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getSalesVip() != null) {
            _hashCode += getSalesVip().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EClienteVipWif.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "eClienteVipWif"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAnActiveCardHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "isAnActiveCardHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesVip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "salesVip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
