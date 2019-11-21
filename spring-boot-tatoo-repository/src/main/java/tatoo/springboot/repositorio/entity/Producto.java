package tatoo.springboot.repositorio.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="com_producto")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_producto")
	private Long pk_producto;
	
	@Column(name = "style_number")
	private String style_number;
	
	@Column(name = "upc")
	private String upc;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "talla")
	private String talla;
	
	@Column(name = "color")
	private String color;	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "marca_pk")	
	private Marca marca_pk;
	
	@Column(name = "orden")
	private Long orden;
	
	@Column(name = "fecha", columnDefinition="DATETIME") 
	@Temporal(TemporalType.TIMESTAMP) 	
	private Date fecha;

	@Column(name = "updated_at", columnDefinition="DATETIME") 
	@Temporal(TemporalType.TIMESTAMP) 	
	private Date updated_at;
	
	@Column(name = "created_at", columnDefinition="DATETIME") 
	@Temporal(TemporalType.TIMESTAMP) 	
	private Date created_at;
	
	@Column(name = "oem")
	private Long oem;
	
	@Column(name = "tipo")
	private Long tipo;
	
	
	
	


	public Long getPk_producto() {
		return pk_producto;
	}

	public void setPk_producto(Long pk_producto) {
		this.pk_producto = pk_producto;
	}

	public String getStyle_number() {
		return style_number;
	}

	public void setStyle_number(String style_number) {
		this.style_number = style_number;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	
	public Marca getMarca_pk() {
		return marca_pk;
	}

	public void setMarca_pk(Marca marca_pk) {
		this.marca_pk = marca_pk;
	}

	public Long getOrden() {
		return orden;
	}

	public void setOrden(Long orden) {
		this.orden = orden;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Long getOem() {
		return oem;
	}

	public void setOem(Long oem) {
		this.oem = oem;
	}

	
	public Long getTipo() {
		return tipo;
	}

	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}	
	
	
}
