package co.uniminuto.edu.pojos;
// Generated 17/04/2019 01:32:46 PM by Hibernate Tools 4.3.1



/**
 * Deporte generated by hbm2java
 */
public class Deporte  implements java.io.Serializable {


     private Integer iddeporte;
     private String deporte;

    public Deporte() {
    }

    public Deporte(String deporte) {
       this.deporte = deporte;
    }
   
    public Integer getIddeporte() {
        return this.iddeporte;
    }
    
    public void setIddeporte(Integer iddeporte) {
        this.iddeporte = iddeporte;
    }
    public String getDeporte() {
        return this.deporte;
    }
    
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }




}


