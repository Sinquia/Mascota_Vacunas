package entidades;
// Generated 15/07/2019 09:12:37 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Personal generated by hbm2java
 */
public class Personal  implements java.io.Serializable {


     private Integer idpersonal;
     private String nombre;
     private String dni;
     private String telefono;
     private String cargo;
     private String email;
     private String apellidos;
     private Set atencions = new HashSet(0);

    public Personal() {
    }

	
    public Personal(String nombre, String dni, String telefono, String cargo, String email, String apellidos) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.cargo = cargo;
        this.email = email;
        this.apellidos = apellidos;
    }
    public Personal(String nombre, String dni, String telefono, String cargo, String email, String apellidos, Set atencions) {
       this.nombre = nombre;
       this.dni = dni;
       this.telefono = telefono;
       this.cargo = cargo;
       this.email = email;
       this.apellidos = apellidos;
       this.atencions = atencions;
    }
   
    public Integer getIdpersonal() {
        return this.idpersonal;
    }
    
    public void setIdpersonal(Integer idpersonal) {
        this.idpersonal = idpersonal;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Set getAtencions() {
        return this.atencions;
    }
    
    public void setAtencions(Set atencions) {
        this.atencions = atencions;
    }




}


