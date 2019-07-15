package entidades;
// Generated 11/07/2019 10:50:35 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Atencion generated by hbm2java
 */
public class Atencion  implements java.io.Serializable {


     private int idAtencion;
     private Mascotaporcliente mascotaporcliente;
     private Personal personal;
     private Date fechaAtencion;
     private Date horaAtencion;
     private String diagnostico;

    public Atencion() {
    }

    public Atencion(int idAtencion, Mascotaporcliente mascotaporcliente, Personal personal, Date fechaAtencion, Date horaAtencion, String diagnostico) {
       this.idAtencion = idAtencion;
       this.mascotaporcliente = mascotaporcliente;
       this.personal = personal;
       this.fechaAtencion = fechaAtencion;
       this.horaAtencion = horaAtencion;
       this.diagnostico = diagnostico;
    }
   
    public int getIdAtencion() {
        return this.idAtencion;
    }
    
    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }
    public Mascotaporcliente getMascotaporcliente() {
        return this.mascotaporcliente;
    }
    
    public void setMascotaporcliente(Mascotaporcliente mascotaporcliente) {
        this.mascotaporcliente = mascotaporcliente;
    }
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public Date getFechaAtencion() {
        return this.fechaAtencion;
    }
    
    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    public Date getHoraAtencion() {
        return this.horaAtencion;
    }
    
    public void setHoraAtencion(Date horaAtencion) {
        this.horaAtencion = horaAtencion;
    }
    public String getDiagnostico() {
        return this.diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }




}


