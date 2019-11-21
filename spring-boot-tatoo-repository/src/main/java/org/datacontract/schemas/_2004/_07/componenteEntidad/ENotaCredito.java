/**
 * ENotaCredito.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.componenteEntidad;

public class ENotaCredito  implements java.io.Serializable {
    private java.lang.String numero;

    private java.math.BigDecimal saldoNota;

    private java.math.BigDecimal usoNota;

    private java.math.BigDecimal valorNota;

    public ENotaCredito() {
    }

    public ENotaCredito(
           java.lang.String numero,
           java.math.BigDecimal saldoNota,
           java.math.BigDecimal usoNota,
           java.math.BigDecimal valorNota) {
           this.numero = numero;
           this.saldoNota = saldoNota;
           this.usoNota = usoNota;
           this.valorNota = valorNota;
    }


    /**
     * Gets the numero value for this ENotaCredito.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this ENotaCredito.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the saldoNota value for this ENotaCredito.
     * 
     * @return saldoNota
     */
    public java.math.BigDecimal getSaldoNota() {
        return saldoNota;
    }


    /**
     * Sets the saldoNota value for this ENotaCredito.
     * 
     * @param saldoNota
     */
    public void setSaldoNota(java.math.BigDecimal saldoNota) {
        this.saldoNota = saldoNota;
    }


    /**
     * Gets the usoNota value for this ENotaCredito.
     * 
     * @return usoNota
     */
    public java.math.BigDecimal getUsoNota() {
        return usoNota;
    }


    /**
     * Sets the usoNota value for this ENotaCredito.
     * 
     * @param usoNota
     */
    public void setUsoNota(java.math.BigDecimal usoNota) {
        this.usoNota = usoNota;
    }


    /**
     * Gets the valorNota value for this ENotaCredito.
     * 
     * @return valorNota
     */
    public java.math.BigDecimal getValorNota() {
        return valorNota;
    }


    /**
     * Sets the valorNota value for this ENotaCredito.
     * 
     * @param valorNota
     */
    public void setValorNota(java.math.BigDecimal valorNota) {
        this.valorNota = valorNota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ENotaCredito)) return false;
        ENotaCredito other = (ENotaCredito) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.saldoNota==null && other.getSaldoNota()==null) || 
             (this.saldoNota!=null &&
              this.saldoNota.equals(other.getSaldoNota()))) &&
            ((this.usoNota==null && other.getUsoNota()==null) || 
             (this.usoNota!=null &&
              this.usoNota.equals(other.getUsoNota()))) &&
            ((this.valorNota==null && other.getValorNota()==null) || 
             (this.valorNota!=null &&
              this.valorNota.equals(other.getValorNota())));
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
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getSaldoNota() != null) {
            _hashCode += getSaldoNota().hashCode();
        }
        if (getUsoNota() != null) {
            _hashCode += getUsoNota().hashCode();
        }
        if (getValorNota() != null) {
            _hashCode += getValorNota().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ENotaCredito.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "eNotaCredito"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoNota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "saldoNota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usoNota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "usoNota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorNota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "valorNota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
