package co.uniminuto.edu.pojos;
// Generated 17/04/2019 01:32:46 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Partido generated by hbm2java
 */
public class Partido  implements java.io.Serializable {


     private Integer idpartido;
     private Date fecha;
     private String resultado;
     private int equipoIdequipo;
     private int equipoIdequipo1;

    public Partido() {
    }

	
    public Partido(int equipoIdequipo, int equipoIdequipo1) {
        this.equipoIdequipo = equipoIdequipo;
        this.equipoIdequipo1 = equipoIdequipo1;
    }
    public Partido(Date fecha, String resultado, int equipoIdequipo, int equipoIdequipo1) {
       this.fecha = fecha;
       this.resultado = resultado;
       this.equipoIdequipo = equipoIdequipo;
       this.equipoIdequipo1 = equipoIdequipo1;
    }
   
    public Integer getIdpartido() {
        return this.idpartido;
    }
    
    public void setIdpartido(Integer idpartido) {
        this.idpartido = idpartido;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getResultado() {
        return this.resultado;
    }
    
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public int getEquipoIdequipo() {
        return this.equipoIdequipo;
    }
    
    public void setEquipoIdequipo(int equipoIdequipo) {
        this.equipoIdequipo = equipoIdequipo;
    }
    public int getEquipoIdequipo1() {
        return this.equipoIdequipo1;
    }
    
    public void setEquipoIdequipo1(int equipoIdequipo1) {
        this.equipoIdequipo1 = equipoIdequipo1;
    }

}


