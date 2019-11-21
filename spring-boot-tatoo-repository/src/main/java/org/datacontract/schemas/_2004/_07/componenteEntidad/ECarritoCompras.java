/**
 * ECarritoCompras.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.componenteEntidad;

public class ECarritoCompras  implements java.io.Serializable {
    private java.math.BigDecimal quantity;

    private java.lang.String store;

    private java.lang.String upc;

    public ECarritoCompras() {
    }

    public ECarritoCompras(
           java.math.BigDecimal quantity,
           java.lang.String store,
           java.lang.String upc) {
           this.quantity = quantity;
           this.store = store;
           this.upc = upc;
    }


    /**
     * Gets the quantity value for this ECarritoCompras.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ECarritoCompras.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the store value for this ECarritoCompras.
     * 
     * @return store
     */
    public java.lang.String getStore() {
        return store;
    }


    /**
     * Sets the store value for this ECarritoCompras.
     * 
     * @param store
     */
    public void setStore(java.lang.String store) {
        this.store = store;
    }


    /**
     * Gets the upc value for this ECarritoCompras.
     * 
     * @return upc
     */
    public java.lang.String getUpc() {
        return upc;
    }


    /**
     * Sets the upc value for this ECarritoCompras.
     * 
     * @param upc
     */
    public void setUpc(java.lang.String upc) {
        this.upc = upc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ECarritoCompras)) return false;
        ECarritoCompras other = (ECarritoCompras) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.store==null && other.getStore()==null) || 
             (this.store!=null &&
              this.store.equals(other.getStore()))) &&
            ((this.upc==null && other.getUpc()==null) || 
             (this.upc!=null &&
              this.upc.equals(other.getUpc())));
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
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getStore() != null) {
            _hashCode += getStore().hashCode();
        }
        if (getUpc() != null) {
            _hashCode += getUpc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ECarritoCompras.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "eCarritoCompras"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "store"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "upc"));
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
