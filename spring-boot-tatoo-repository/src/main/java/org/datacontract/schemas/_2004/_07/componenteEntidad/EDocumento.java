/**
 * EDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.componenteEntidad;

public class EDocumento  implements java.io.Serializable {
    private java.math.BigDecimal bonusPercentage;

    private java.lang.String code;

    private java.util.Calendar date;

    private java.lang.String reservationCode;

    private java.lang.String store;

    private java.math.BigDecimal total;

    private java.math.BigDecimal totalBonusApplied;

    private java.math.BigDecimal totalBonusEarn;

    private java.lang.String type;

    public EDocumento() {
    }

    public EDocumento(
           java.math.BigDecimal bonusPercentage,
           java.lang.String code,
           java.util.Calendar date,
           java.lang.String reservationCode,
           java.lang.String store,
           java.math.BigDecimal total,
           java.math.BigDecimal totalBonusApplied,
           java.math.BigDecimal totalBonusEarn,
           java.lang.String type) {
           this.bonusPercentage = bonusPercentage;
           this.code = code;
           this.date = date;
           this.reservationCode = reservationCode;
           this.store = store;
           this.total = total;
           this.totalBonusApplied = totalBonusApplied;
           this.totalBonusEarn = totalBonusEarn;
           this.type = type;
    }


    /**
     * Gets the bonusPercentage value for this EDocumento.
     * 
     * @return bonusPercentage
     */
    public java.math.BigDecimal getBonusPercentage() {
        return bonusPercentage;
    }


    /**
     * Sets the bonusPercentage value for this EDocumento.
     * 
     * @param bonusPercentage
     */
    public void setBonusPercentage(java.math.BigDecimal bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }


    /**
     * Gets the code value for this EDocumento.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this EDocumento.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the date value for this EDocumento.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this EDocumento.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the reservationCode value for this EDocumento.
     * 
     * @return reservationCode
     */
    public java.lang.String getReservationCode() {
        return reservationCode;
    }


    /**
     * Sets the reservationCode value for this EDocumento.
     * 
     * @param reservationCode
     */
    public void setReservationCode(java.lang.String reservationCode) {
        this.reservationCode = reservationCode;
    }


    /**
     * Gets the store value for this EDocumento.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this EDocumento.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }


    /**
     * Gets the total value for this EDocumento.
     * 
     * @return total
     */
    public java.math.BigDecimal getTotal() {
        return total;
    }


    /**
     * Sets the total value for this EDocumento.
     * 
     * @param total
     */
    public void setTotal(java.math.BigDecimal total) {
        this.total = total;
    }


    /**
     * Gets the totalBonusApplied value for this EDocumento.
     * 
     * @return totalBonusApplied
     */
    public java.math.BigDecimal getTotalBonusApplied() {
        return totalBonusApplied;
    }


    /**
     * Sets the totalBonusApplied value for this EDocumento.
     * 
     * @param totalBonusApplied
     */
    public void setTotalBonusApplied(java.math.BigDecimal totalBonusApplied) {
        this.totalBonusApplied = totalBonusApplied;
    }


    /**
     * Gets the totalBonusEarn value for this EDocumento.
     * 
     * @return totalBonusEarn
     */
    public java.math.BigDecimal getTotalBonusEarn() {
        return totalBonusEarn;
    }


    /**
     * Sets the totalBonusEarn value for this EDocumento.
     * 
     * @param totalBonusEarn
     */
    public void setTotalBonusEarn(java.math.BigDecimal totalBonusEarn) {
        this.totalBonusEarn = totalBonusEarn;
    }


    /**
     * Gets the type value for this EDocumento.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this EDocumento.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EDocumento)) return false;
        EDocumento other = (EDocumento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusPercentage==null && other.getBonusPercentage()==null) || 
             (this.bonusPercentage!=null &&
              this.bonusPercentage.equals(other.getBonusPercentage()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.reservationCode==null && other.getReservationCode()==null) || 
             (this.reservationCode!=null &&
              this.reservationCode.equals(other.getReservationCode()))) &&
            ((this.store==null && other.getStore()==null) || 
             (this.store!=null &&
              this.store.equals(other.getStore()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.totalBonusApplied==null && other.getTotalBonusApplied()==null) || 
             (this.totalBonusApplied!=null &&
              this.totalBonusApplied.equals(other.getTotalBonusApplied()))) &&
            ((this.totalBonusEarn==null && other.getTotalBonusEarn()==null) || 
             (this.totalBonusEarn!=null &&
              this.totalBonusEarn.equals(other.getTotalBonusEarn()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getBonusPercentage() != null) {
            _hashCode += getBonusPercentage().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getReservationCode() != null) {
            _hashCode += getReservationCode().hashCode();
        }
        if (getStore() != null) {
            _hashCode += getStore().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getTotalBonusApplied() != null) {
            _hashCode += getTotalBonusApplied().hashCode();
        }
        if (getTotalBonusEarn() != null) {
            _hashCode += getTotalBonusEarn().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EDocumento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "eDocumento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "bonusPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBonusApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "totalBonusApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBonusEarn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "totalBonusEarn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "type"));
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
