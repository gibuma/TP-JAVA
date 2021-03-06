package entity;

public class Persona {
	private int idpersona;
	private String dni;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasenia;
	private boolean habilitado;
	private Categoria categoria;
	
	
	public Categoria getCategoria(){
		 return categoria;
		 }

	public void setCategoria(Categoria categoria){
		 this.categoria=categoria;
		 }
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public boolean getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	public Persona (String dni, String nombre, String apellido, boolean habilitado){
		 this.setDni(dni);
		 this.setNombre(nombre);
		 this.setApellido(apellido);
		 this.setHabilitado(habilitado);
	
		 }
	public Persona(){}
	 
	 @Override
	 public boolean equals(Object p){
	 return (p instanceof Persona) &&
	 (((Persona)p).getDni().equals(this.getDni()));
	 }
	 }


