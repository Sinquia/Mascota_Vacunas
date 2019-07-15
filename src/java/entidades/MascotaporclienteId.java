package entidades;
// Generated 11/07/2019 10:50:35 AM by Hibernate Tools 4.3.1

public class MascotaporclienteId  implements java.io.Serializable {


     private int idMascota;
     private int idCliente;

    public MascotaporclienteId() {
    }

    public MascotaporclienteId(int idMascota, int idCliente) {
       this.idMascota = idMascota;
       this.idCliente = idCliente;
    }
   
    public int getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}


