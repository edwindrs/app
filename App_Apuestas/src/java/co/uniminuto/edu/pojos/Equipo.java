package co.uniminuto.edu.pojos;
// Generated 17/04/2019 01:32:46 PM by Hibernate Tools 4.3.1



/**
 * Equipo generated by hbm2java
 */
public class Equipo  implements java.io.Serializable {


     private Integer idequipo;
     private String equipo;
     private int deporteIddeporte;

    public Equipo() {
    }

	
    public Equipo(int deporteIddeporte) {
        this.deporteIddeporte = deporteIddeporte;
    }
    public Equipo(String equipo, int deporteIddeporte) {
       this.equipo = equipo;
       this.deporteIddeporte = deporteIddeporte;
    }
   
    public Integer getIdequipo() {
        return this.idequipo;
    }
    
    public void setIdequipo(Integer idequipo) {
        this.idequipo = idequipo;
    }
    public String getEquipo() {
        return this.equipo;
    }
    
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public int getDeporteIddeporte() {
        return this.deporteIddeporte;
    }
    
    public void setDeporteIddeporte(int deporteIddeporte) {
        this.deporteIddeporte = deporteIddeporte;
    }




}

