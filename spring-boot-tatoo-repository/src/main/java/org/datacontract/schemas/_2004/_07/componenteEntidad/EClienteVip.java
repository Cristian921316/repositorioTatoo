/**
 * EClienteVip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.componenteEntidad;

public class EClienteVip  implements java.io.Serializable {
    private java.lang.String _idCliente;

    private java.lang.String _identificacion;

    private java.lang.String _nombreCliente;

    private java.lang.String _saldo;

    public EClienteVip() {
    }

    public EClienteVip(
           java.lang.String _idCliente,
           java.lang.String _identificacion,
           java.lang.String _nombreCliente,
           java.lang.String _saldo) {
           this._idCliente = _idCliente;
           this._identificacion = _identificacion;
           this._nombreCliente = _nombreCliente;
           this._saldo = _saldo;
    }


    /**
     * Gets the _idCliente value for this EClienteVip.
     * 
     * @return _idCliente
     */
    public java.lang.String get_idCliente() {
        return _idCliente;
    }


    /**
     * Sets the _idCliente value for this EClienteVip.
     * 
     * @param _idCliente
     */
    public void set_idCliente(java.lang.String _idCliente) {
        this._idCliente = _idCliente;
    }


    /**
     * Gets the _identificacion value for this EClienteVip.
     * 
     * @return _identificacion
     */
    public java.lang.String get_identificacion() {
        return _identificacion;
    }


    /**
     * Sets the _identificacion value for this EClienteVip.
     * 
     * @param _identificacion
     */
    public void set_identificacion(java.lang.String _identificacion) {
        this._identificacion = _identificacion;
    }


    /**
     * Gets the _nombreCliente value for this EClienteVip.
     * 
     * @return _nombreCliente
     */
    public java.lang.String get_nombreCliente() {
        return _nombreCliente;
    }


    /**
     * Sets the _nombreCliente value for this EClienteVip.
     * 
     * @param _nombreCliente
     */
    public void set_nombreCliente(java.lang.String _nombreCliente) {
        this._nombreCliente = _nombreCliente;
    }


    /**
     * Gets the _saldo value for this EClienteVip.
     * 
     * @return _saldo
     */
    public java.lang.String get_saldo() {
        return _saldo;
    }


    /**
     * Sets the _saldo value for this EClienteVip.
     * 
     * @param _saldo
     */
    public void set_saldo(java.lang.String _saldo) {
        this._saldo = _saldo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EClienteVip)) return false;
        EClienteVip other = (EClienteVip) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._idCliente==null && other.get_idCliente()==null) || 
             (this._idCliente!=null &&
              this._idCliente.equals(other.get_idCliente()))) &&
            ((this._identificacion==null && other.get_identificacion()==null) || 
             (this._identificacion!=null &&
              this._identificacion.equals(other.get_identificacion()))) &&
            ((this._nombreCliente==null && other.get_nombreCliente()==null) || 
             (this._nombreCliente!=null &&
              this._nombreCliente.equals(other.get_nombreCliente()))) &&
            ((this._saldo==null && other.get_saldo()==null) || 
             (this._saldo!=null &&
              this._saldo.equals(other.get_saldo())));
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
        if (get_idCliente() != null) {
            _hashCode += get_idCliente().hashCode();
        }
        if (get_identificacion() != null) {
            _hashCode += get_identificacion().hashCode();
        }
        if (get_nombreCliente() != null) {
            _hashCode += get_nombreCliente().hashCode();
        }
        if (get_saldo() != null) {
            _hashCode += get_saldo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EClienteVip.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "eClienteVip"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "_idCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "_identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_nombreCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "_nombreCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_saldo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "_saldo"));
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
