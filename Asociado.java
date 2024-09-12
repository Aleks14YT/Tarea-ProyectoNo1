package PracticaNo1;

import java.util.Date;

public class Asociado {
    private int numeroSocio;
    private String nombreCompleto;
    private Date fechaIngreso;
    private String numeroTelefonico;

    public Asociado(int numeroSocio, String nombreCompleto, Date fechaIngreso, String numeroTelefonico) {
        this.numeroSocio = numeroSocio;
        this.nombreCompleto = nombreCompleto;
        this.fechaIngreso = fechaIngreso;
        this.numeroTelefonico = numeroTelefonico;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    
    public String toString() {
        return "Asociado{" +
                "numeroSocio = " + numeroSocio +
                ", nombreCompleto = '" + nombreCompleto + '\'' +
                ", fechaIngreso = " + fechaIngreso +
                ", numeroTelefonico = '" + numeroTelefonico + '\'' +
                '}';
    }
}
