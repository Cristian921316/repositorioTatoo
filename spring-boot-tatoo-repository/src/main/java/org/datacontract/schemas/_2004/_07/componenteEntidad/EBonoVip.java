/**
 * EBonoVip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.componenteEntidad;

public class EBonoVip  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String cardNumber;

    private java.lang.String code;

    private java.lang.String codeBonoVip;

    private java.lang.String date;

    private java.math.BigDecimal invoiceTotal;

    private java.lang.String reservationCode;

    private java.lang.String store;

    private java.lang.Integer storeGroupCodsec;

    public EBonoVip() {
    }

    public EBonoVip(
           java.math.BigDecimal amount,
           java.lang.String cardNumber,
           java.lang.String code,
           java.lang.String codeBonoVip,
           java.lang.String date,
           java.math.BigDecimal invoiceTotal,
           java.lang.String reservationCode,
           java.lang.String store,
           java.lang.Integer storeGroupCodsec) {
           this.amount = amount;
           this.cardNumber = cardNumber;
           this.code = code;
           this.codeBonoVip = codeBonoVip;
           this.date = date;
           this.invoiceTotal = invoiceTotal;
           this.reservationCode = reservationCode;
           this.store = store;
           this.storeGroupCodsec = storeGroupCodsec;
    }


    /**
     * Gets the amount value for this EBonoVip.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this EBonoVip.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardNumber value for this EBonoVip.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this EBonoVip.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the code value for this EBonoVip.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this EBonoVip.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the codeBonoVip value for this EBonoVip.
     * 
     * @return codeBonoVip
     */
    public java.lang.String getCodeBonoVip() {
        return codeBonoVip;
    }


    /**
     * Sets the codeBonoVip value for this EBonoVip.
     * 
     * @param codeBonoVip
     */
    public void setCodeBonoVip(java.lang.String codeBonoVip) {
        this.codeBonoVip = codeBonoVip;
    }


    /**
     * Gets the date value for this EBonoVip.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this EBonoVip.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the invoiceTotal value for this EBonoVip.
     * 
     * @return invoiceTotal
     */
    public java.math.BigDecimal getInvoiceTotal() {
        return invoiceTotal;
    }


    /**
     * Sets the invoiceTotal value for this EBonoVip.
     * 
     * @param invoiceTotal
     */
    public void setInvoiceTotal(java.math.BigDecimal invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }


    /**
     * Gets the reservationCode value for this EBonoVip.
     * 
     * @return reservationCode
     */
    public java.lang.String getReservationCode() {
        return reservationCode;
    }


    /**
     * Sets the reservationCode value for this EBonoVip.
     * 
     * @param reservationCode
     */
    public void setReservationCode(java.lang.String reservationCode) {
        this.reservationCode = reservationCode;
    }


    /**
     * Gets the store value for this EBonoVip.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this EBonoVip.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }


    /**
     * Gets the storeGroupCodsec value for this EBonoVip.
     * 
     * @return storeGroupCodsec
     */
    public java.lang.Integer getStoreGroupCodsec() {
        return storeGroupCodsec;
    }


    /**
     * Sets the storeGroupCodsec value for this EBonoVip.
     * 
     * @param storeGroupCodsec
     */
    public void setStoreGroupCodsec(java.lang.Integer storeGroupCodsec) {
        this.storeGroupCodsec = storeGroupCodsec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EBonoVip)) return false;
        EBonoVip other = (EBonoVip) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.codeBonoVip==null && other.getCodeBonoVip()==null) || 
             (this.codeBonoVip!=null &&
              this.codeBonoVip.equals(other.getCodeBonoVip()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.invoiceTotal==null && other.getInvoiceTotal()==null) || 
             (this.invoiceTotal!=null &&
              this.invoiceTotal.equals(other.getInvoiceTotal()))) &&
            ((this.reservationCode==null && other.getReservationCode()==null) || 
             (this.reservationCode!=null &&
              this.reservationCode.equals(other.getReservationCode()))) &&
            ((this.store==null && other.getStore()==null) || 
             (this.store!=null &&
              this.store.equals(other.getStore()))) &&
            ((this.storeGroupCodsec==null && other.getStoreGroupCodsec()==null) || 
             (this.storeGroupCodsec!=null &&
              this.storeGroupCodsec.equals(other.getStoreGroupCodsec())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCodeBonoVip() != null) {
            _hashCode += getCodeBonoVip().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getInvoiceTotal() != null) {
            _hashCode += getInvoiceTotal().hashCode();
        }
        if (getReservationCode() != null) {
            _hashCode += getReservationCode().hashCode();
        }
        if (getStore() != null) {
            _hashCode += getStore().hashCode();
        }
        if (getStoreGroupCodsec() != null) {
            _hashCode += getStoreGroupCodsec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EBonoVip.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "eBonoVip"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBonoVip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "codeBonoVip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "invoiceTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "reservationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "store"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeGroupCodsec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "storeGroupCodsec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
