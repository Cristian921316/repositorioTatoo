/**
 * EConfClienteB2B.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.REPOEntidadRepositorio;

public class EConfClienteB2B  implements java.io.Serializable {
    private java.lang.Integer brandCode;

    private java.lang.String identificiacion;

    private java.math.BigDecimal porcentaje;

    public EConfClienteB2B() {
    }

    public EConfClienteB2B(
           java.lang.Integer brandCode,
           java.lang.String identificiacion,
           java.math.BigDecimal porcentaje) {
           this.brandCode = brandCode;
           this.identificiacion = identificiacion;
           this.porcentaje = porcentaje;
    }


    /**
     * Gets the brandCode value for this EConfClienteB2B.
     * 
     * @return brandCode
     */
    public java.lang.Integer getBrandCode() {
        return brandCode;
    }


    /**
     * Sets the brandCode value for this EConfClienteB2B.
     * 
     * @param brandCode
     */
    public void setBrandCode(java.lang.Integer brandCode) {
        this.brandCode = brandCode;
    }


    /**
     * Gets the identificiacion value for this EConfClienteB2B.
     * 
     * @return identificiacion
     */
    public java.lang.String getIdentificiacion() {
        return identificiacion;
    }


    /**
     * Sets the identificiacion value for this EConfClienteB2B.
     * 
     * @param identificiacion
     */
    public void setIdentificiacion(java.lang.String identificiacion) {
        this.identificiacion = identificiacion;
    }


    /**
     * Gets the porcentaje value for this EConfClienteB2B.
     * 
     * @return porcentaje
     */
    public java.math.BigDecimal getPorcentaje() {
        return porcentaje;
    }


    /**
     * Sets the porcentaje value for this EConfClienteB2B.
     * 
     * @param porcentaje
     */
    public void setPorcentaje(java.math.BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EConfClienteB2B)) return false;
        EConfClienteB2B other = (EConfClienteB2B) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brandCode==null && other.getBrandCode()==null) || 
             (this.brandCode!=null &&
              this.brandCode.equals(other.getBrandCode()))) &&
            ((this.identificiacion==null && other.getIdentificiacion()==null) || 
             (this.identificiacion!=null &&
              this.identificiacion.equals(other.getIdentificiacion()))) &&
            ((this.porcentaje==null && other.getPorcentaje()==null) || 
             (this.porcentaje!=null &&
              this.porcentaje.equals(other.getPorcentaje())));
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
        if (getBrandCode() != null) {
            _hashCode += getBrandCode().hashCode();
        }
        if (getIdentificiacion() != null) {
            _hashCode += getIdentificiacion().hashCode();
        }
        if (getPorcentaje() != null) {
            _hashCode += getPorcentaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EConfClienteB2B.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "eConfClienteB2B"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "brandCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificiacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "identificiacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "porcentaje"));
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
