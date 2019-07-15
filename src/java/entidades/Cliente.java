package entidades;
// Generated 11/07/2019 10:50:35 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Cliente  implements java.io.Serializable {


     private int idCliente;
     private String nombres;
     private String apellidos;
     private Date fechaNaci;
     private String direccion;
     private String telefono;
     private String email;
     private Set mascotaporclientes = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int idCliente, String nombres, String apellidos, Date fechaNaci, String direccion, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNaci = fechaNaci;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public Cliente(int idCliente, String nombres, String apellidos, Date fechaNaci, String direccion, String telefono, String email, Set mascotaporclientes) {
       this.idCliente = idCliente;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.fechaNaci = fechaNaci;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.mascotaporclientes = mascotaporclientes;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Date getFechaNaci() {
        return this.fechaNaci;
    }
    
    public void setFechaNaci(Date fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getMascotaporclientes() {
        return this.mascotaporclientes;
    }
    
    public void setMascotaporclientes(Set mascotaporclientes) {
        this.mascotaporclientes = mascotaporclientes;
    }




}


