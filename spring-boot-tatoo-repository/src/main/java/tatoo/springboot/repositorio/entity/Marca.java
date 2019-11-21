package tatoo.springboot.repositorio.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="com_marca")
public class Marca implements Serializable{
	//se mapea los campos de la tabla
	//campo id en la base de datos(marca_pk)como incrementable tipo int
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "marca_pk")
	private Long marca_pk;
	
	@NotEmpty
	@Column(name = "marca")
	private String nombre;
	
	@Column(name = "fk_web")
	private Long fk_web;
	
	@Column(name = "fk_tatoosoft_ecu")
	private String fk_tatoosoft_ecu;
	
	@Column(name = "fk_tatoosoft_col")
	private String fk_tatoosoft_col;
	
	@Column(name = "fk_tatoosoft_chl")
	private String fk_tatoosoft_chl;
	
	@Column(name = "fk_tatoosoft_per")
	private String fk_tatoosoft_per;	
	
	
	@Column(name = "updated_at", columnDefinition="DATETIME") 	
	@Temporal(TemporalType.TIMESTAMP)	
	private Date updated_at;	
	
	@Column(name = "created_at", columnDefinition="DATETIME") 
	@Temporal(TemporalType.TIMESTAMP)	
	private Date created_at;

	
	
	
	@Override
	public String toString() {
		return nombre +" "+fk_tatoosoft_ecu+" "+fk_tatoosoft_col+" "+fk_tatoosoft_per+""+fk_tatoosoft_chl;
	}

	
	//setter and getter necesarios para la colocacion y extraccion de datos a los campos
	

	
	public Long getMarca_pk() {
		return marca_pk;
	}

	public void setMarca_pk(Long marca_pk) {
		this.marca_pk = marca_pk;
	}

	
	
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getFk_web() {
		return fk_web;
	}

	public void setFk_web(Long fk_web) {
		this.fk_web = fk_web;
	}	
	
	
	public String getFk_tatoosoft_ecu() {
		return fk_tatoosoft_ecu;
	}

	public void setFk_tatoosoft_ecu(String fk_tatoosoft_ecu) {
		this.fk_tatoosoft_ecu = fk_tatoosoft_ecu;
	}

	public String getFk_tatoosoft_col() {
		return fk_tatoosoft_col;
	}

	public void setFk_tatoosoft_col(String fk_tatoosoft_col) {
		this.fk_tatoosoft_col = fk_tatoosoft_col;
	}

	public String getFk_tatoosoft_chl() {
		return fk_tatoosoft_chl;
	}

	public void setFk_tatoosoft_chl(String fk_tatoosoft_chl) {
		this.fk_tatoosoft_chl = fk_tatoosoft_chl;
	}

	public String getFk_tatoosoft_per() {
		return fk_tatoosoft_per;
	}

	public void setFk_tatoosoft_per(String fk_tatoosoft_per) {
		this.fk_tatoosoft_per = fk_tatoosoft_per;
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
	
	

}
