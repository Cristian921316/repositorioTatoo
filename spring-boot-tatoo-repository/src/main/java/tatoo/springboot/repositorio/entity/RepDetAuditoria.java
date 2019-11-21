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
@Table(name="rep_det_auditoria")
public class RepDetAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "user_id")	
	private Usuario user_id;
	
	@Column(name = "fecha_cambio", columnDefinition="DATETIME") 
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fecha_cambio;
	
	@Column(name = "sube_archivo")
	private String sube_archivo;
	
	@Column(name = "nom_archivo")
	private String nom_archivo;
	
	@Column(name = "accion_cambio")
	private String accion_cambio;
	
	public String getAccion_cambio() {
		return accion_cambio;
	}

	public void setAccion_cambio(String accion_cambio) {
		this.accion_cambio = accion_cambio;
	}

	@Column(name = "tabla_cambio")
	private String tabla_cambio;
	
	@Column(name = "valor_ant")
	private String valor_ant;
	
	@Column(name = "valor_nuevo")
	private String valor_nuevo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Date getFecha_cambio() {
		return fecha_cambio;
	}

	public void setFecha_cambio(Date fecha_cambio) {
		this.fecha_cambio = fecha_cambio;
	}

	public String getSube_archivo() {
		return sube_archivo;
	}

	public void setSube_archivo(String sube_archivo) {
		this.sube_archivo = sube_archivo;
	}

	public String getNom_archivo() {
		return nom_archivo;
	}

	public void setNom_archivo(String nom_archivo) {
		this.nom_archivo = nom_archivo;
	}

	public String getTabla_cambio() {
		return tabla_cambio;
	}

	public void setTabla_cambio(String tabla_cambio) {
		this.tabla_cambio = tabla_cambio;
	}

	public String getValor_ant() {
		return valor_ant;
	}

	public void setValor_ant(String valor_ant) {
		this.valor_ant = valor_ant;
	}

	public String getValor_nuevo() {
		return valor_nuevo;
	}

	public void setValor_nuevo(String valor_nuevo) {
		this.valor_nuevo = valor_nuevo;
	}

	public Usuario getUser_id() {
		return user_id;
	}

	public void setUser_id(Usuario user_id) {
		this.user_id = user_id;
	}
	
	
	
	
}
