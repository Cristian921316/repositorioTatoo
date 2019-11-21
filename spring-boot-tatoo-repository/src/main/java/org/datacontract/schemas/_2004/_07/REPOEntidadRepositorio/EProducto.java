/**
 * EProducto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.REPOEntidadRepositorio;

public class EProducto  implements java.io.Serializable {
    private java.lang.String color;

    private java.lang.String marca;

    private java.lang.String marca_id;

    private java.lang.String nombre;

    private java.lang.Boolean oem;

    private java.lang.String style_number;

    private java.lang.String talla;

    private java.lang.String upc;

    public EProducto() {
    }

    public EProducto(
           java.lang.String color,
           java.lang.String marca,
           java.lang.String marca_id,
           java.lang.String nombre,
           java.lang.Boolean oem,
           java.lang.String style_number,
           java.lang.String talla,
           java.lang.String upc) {
           this.color = color;
           this.marca = marca;
           this.marca_id = marca_id;
           this.nombre = nombre;
           this.oem = oem;
           this.style_number = style_number;
           this.talla = talla;
           this.upc = upc;
    }


    /**
     * Gets the color value for this EProducto.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this EProducto.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the marca value for this EProducto.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this EProducto.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the marca_id value for this EProducto.
     * 
     * @return marca_id
     */
    public java.lang.String getMarca_id() {
        return marca_id;
    }


    /**
     * Sets the marca_id value for this EProducto.
     * 
     * @param marca_id
     */
    public void setMarca_id(java.lang.String marca_id) {
        this.marca_id = marca_id;
    }


    /**
     * Gets the nombre value for this EProducto.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this EProducto.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the oem value for this EProducto.
     * 
     * @return oem
     */
    public java.lang.Boolean getOem() {
        return oem;
    }


    /**
     * Sets the oem value for this EProducto.
     * 
     * @param oem
     */
    public void setOem(java.lang.Boolean oem) {
        this.oem = oem;
    }


    /**
     * Gets the style_number value for this EProducto.
     * 
     * @return style_number
     */
    public java.lang.String getStyle_number() {
        return style_number;
    }


    /**
     * Sets the style_number value for this EProducto.
     * 
     * @param style_number
     */
    public void setStyle_number(java.lang.String style_number) {
        this.style_number = style_number;
    }


    /**
     * Gets the talla value for this EProducto.
     * 
     * @return talla
     */
    public java.lang.String getTalla() {
        return talla;
    }


    /**
     * Sets the talla value for this EProducto.
     * 
     * @param talla
     */
    public void setTalla(java.lang.String talla) {
        this.talla = talla;
    }


    /**
     * Gets the upc value for this EProducto.
     * 
     * @return upc
     */
    public java.lang.String getUpc() {
        return upc;
    }


    /**
     * Sets the upc value for this EProducto.
     * 
     * @param upc
     */
    public void setUpc(java.lang.String upc) {
        this.upc = upc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EProducto)) return false;
        EProducto other = (EProducto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.marca_id==null && other.getMarca_id()==null) || 
             (this.marca_id!=null &&
              this.marca_id.equals(other.getMarca_id()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.oem==null && other.getOem()==null) || 
             (this.oem!=null &&
              this.oem.equals(other.getOem()))) &&
            ((this.style_number==null && other.getStyle_number()==null) || 
             (this.style_number!=null &&
              this.style_number.equals(other.getStyle_number()))) &&
            ((this.talla==null && other.getTalla()==null) || 
             (this.talla!=null &&
              this.talla.equals(other.getTalla()))) &&
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
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getMarca_id() != null) {
            _hashCode += getMarca_id().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getOem() != null) {
            _hashCode += getOem().hashCode();
        }
        if (getStyle_number() != null) {
            _hashCode += getStyle_number().hashCode();
        }
        if (getTalla() != null) {
            _hashCode += getTalla().hashCode();
        }
        if (getUpc() != null) {
            _hashCode += getUpc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EProducto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "eProducto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "marca_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "oem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("style_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "style_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "talla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/REPOEntidadRepositorio", "upc"));
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
