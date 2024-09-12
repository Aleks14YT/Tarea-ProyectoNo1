package PracticaNo1;

import java.util.Date;

public class AsociadoDirectivo extends Asociado {
    private String cargo;
    private Date fechaTomaPosesion;

    public AsociadoDirectivo(int numeroSocio, String nombreCompleto, Date fechaIngreso, String numeroTelefonico, String cargo, Date fechaTomaPosesion) {
        super(numeroSocio, nombreCompleto, fechaIngreso, numeroTelefonico);
        this.cargo = cargo;
        this.fechaTomaPosesion = fechaTomaPosesion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaTomaPosesion() {
        return fechaTomaPosesion;
    }

    @Override
    public String toString() {
        return super.toString() + ", AsociadoDirectivo{" +
                "cargo = '" + cargo + '\'' +
                ", fechaTomaPosesion = " + fechaTomaPosesion +
                '}';
    }
}
