package PracticaNo1;

import java.util.Date;

public class AsociadoNatural extends Asociado {
    private double totalAportaciones;
    private int cantidadAportaciones;
    private Date ultimaFechaAportacion;

    public AsociadoNatural(int numeroSocio, String nombreCompleto, Date fechaIngreso, String numeroTelefonico) {
        super(numeroSocio, nombreCompleto, fechaIngreso, numeroTelefonico);
        this.totalAportaciones = 2500.00; // Cuota inicial
        this.cantidadAportaciones = 1; // Cuenta la cuota inicial
        this.ultimaFechaAportacion = new Date(); // Fecha actual
    }

    public double getTotalAportaciones() {
        return totalAportaciones;
    }

    public int getCantidadAportaciones() {
        return cantidadAportaciones;
    }

    public Date getUltimaFechaAportacion() {
        return ultimaFechaAportacion;
    }

    public void registrarAportacion(double monto) {
        this.totalAportaciones += monto;
        this.cantidadAportaciones++;
        this.ultimaFechaAportacion = new Date(); // Actualiza la fecha a la fecha actual
    }

    @Override
    public String toString() {
        return super.toString() + ", AsociadoNatural{" +
                "totalAportaciones = " + totalAportaciones +
                ", cantidadAportaciones = " + cantidadAportaciones +
                ", ultimaFechaAportacion = " + ultimaFechaAportacion +
                '}';
    }
}
