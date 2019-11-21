/**
 * EGeneracionBonoVip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.componenteEntidad;

public class EGeneracionBonoVip  implements java.io.Serializable {
    private java.lang.String apellidos;

    private java.math.BigDecimal bonoganado;

    private java.lang.String cliente;

    private java.lang.String identificacion;

    private java.lang.String mail;

    private java.lang.String nombres;

    private java.lang.String pais;

    private java.math.BigDecimal total;

    private java.math.BigDecimal totalbono;

    public EGeneracionBonoVip() {
    }

    public EGeneracionBonoVip(
           java.lang.String apellidos,
           java.math.BigDecimal bonoganado,
           java.lang.String cliente,
           java.lang.String identificacion,
           java.lang.String mail,
           java.lang.String nombres,
           java.lang.String pais,
           java.math.BigDecimal total,
           java.math.BigDecimal totalbono) {
           this.apellidos = apellidos;
           this.bonoganado = bonoganado;
           this.cliente = cliente;
           this.identificacion = identificacion;
           this.mail = mail;
           this.nombres = nombres;
           this.pais = pais;
           this.total = total;
           this.totalbono = totalbono;
    }


    /**
     * Gets the apellidos value for this EGeneracionBonoVip.
     * 
     * @return apellidos
     */
    public java.lang.String getApellidos() {
        return apellidos;
    }


    /**
     * Sets the apellidos value for this EGeneracionBonoVip.
     * 
     * @param apellidos
     */
    public void setApellidos(java.lang.String apellidos) {
        this.apellidos = apellidos;
    }


    /**
     * Gets the bonoganado value for this EGeneracionBonoVip.
     * 
     * @return bonoganado
     */
    public java.math.BigDecimal getBonoganado() {
        return bonoganado;
    }


    /**
     * Sets the bonoganado value for this EGeneracionBonoVip.
     * 
     * @param bonoganado
     */
    public void setBonoganado(java.math.BigDecimal bonoganado) {
        this.bonoganado = bonoganado;
    }


    /**
     * Gets the cliente value for this EGeneracionBonoVip.
     * 
     * @return cliente
     */
    public java.lang.String getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this EGeneracionBonoVip.
     * 
     * @param cliente
     */
    public void setCliente(java.lang.String cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the identificacion value for this EGeneracionBonoVip.
     * 
     * @return identificacion
     */
    public java.lang.String getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this EGeneracionBonoVip.
     * 
     * @param identificacion
     */
    public void setIdentificacion(java.lang.String identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the mail value for this EGeneracionBonoVip.
     * 
     * @return mail
     */
    public java.lang.String getMail() {
        return mail;
    }


    /**
     * Sets the mail value for this EGeneracionBonoVip.
     * 
     * @param mail
     */
    public void setMail(java.lang.String mail) {
        this.mail = mail;
    }


    /**
     * Gets the nombres value for this EGeneracionBonoVip.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this EGeneracionBonoVip.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the pais value for this EGeneracionBonoVip.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this EGeneracionBonoVip.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the total value for this EGeneracionBonoVip.
     * 
     * @return total
     */
    public java.math.BigDecimal getTotal() {
        return total;
    }


    /**
     * Sets the total value for this EGeneracionBonoVip.
     * 
     * @param total
     */
    public void setTotal(java.math.BigDecimal total) {
        this.total = total;
    }


    /**
     * Gets the totalbono value for this EGeneracionBonoVip.
     * 
     * @return totalbono
     */
    public java.math.BigDecimal getTotalbono() {
        return totalbono;
    }


    /**
     * Sets the totalbono value for this EGeneracionBonoVip.
     * 
     * @param totalbono
     */
    public void setTotalbono(java.math.BigDecimal totalbono) {
        this.totalbono = totalbono;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EGeneracionBonoVip)) return false;
        EGeneracionBonoVip other = (EGeneracionBonoVip) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellidos==null && other.getApellidos()==null) || 
             (this.apellidos!=null &&
              this.apellidos.equals(other.getApellidos()))) &&
            ((this.bonoganado==null && other.getBonoganado()==null) || 
             (this.bonoganado!=null &&
              this.bonoganado.equals(other.getBonoganado()))) &&
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.mail==null && other.getMail()==null) || 
             (this.mail!=null &&
              this.mail.equals(other.getMail()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.totalbono==null && other.getTotalbono()==null) || 
             (this.totalbono!=null &&
              this.totalbono.equals(other.getTotalbono())));
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
        if (getApellidos() != null) {
            _hashCode += getApellidos().hashCode();
        }
        if (getBonoganado() != null) {
            _hashCode += getBonoganado().hashCode();
        }
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getMail() != null) {
            _hashCode += getMail().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getTotalbono() != null) {
            _hashCode += getTotalbono().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EGeneracionBonoVip.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "eGeneracionBonoVip"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "apellidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonoganado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "bonoganado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "mail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "pais"));
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
        elemField.setFieldName("totalbono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/componenteEntidad", "totalbono"));
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
