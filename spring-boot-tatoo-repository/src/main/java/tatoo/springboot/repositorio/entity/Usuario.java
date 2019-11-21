package tatoo.springboot.repositorio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="username",length = 50, unique = true)
	private String username;

	@Column(name="password",length = 60)
	private String password;
	
	@Column(name="enabled")
	private Boolean enabled;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="nombre_user")
	private String nombre;
	
	@Column(name="apellido_user")
	private String apellido;
	
	@Column(name="desc_clave")
	private String desc_clave;
	

	public String getDesc_clave() {
		return desc_clave;
	}

	public void setDesc_clave(String desc_clave) {
		this.desc_clave = desc_clave;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<Role> roles;
	
	public Usuario()
	{
		roles = new ArrayList<Role>();
		
	}
	
	public void addRole(Role role)
	{
		this.roles.add(role);
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
