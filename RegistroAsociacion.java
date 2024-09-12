package PracticaNo1;
import java.util.ArrayList;
import java.util.List;

public class RegistroAsociacion {
    private List<AsociadoDirectivo> directivos;
    private List<AsociadoNatural> naturales;

    public RegistroAsociacion() {
        this.directivos = new ArrayList<>();
        this.naturales = new ArrayList<>();
    }

    public void agregarAsociadoDirectivo(AsociadoDirectivo directivo) {
        if (directivo != null) {
            directivos.add(directivo);
        }
    }

    public void agregarAsociadoNatural(AsociadoNatural natural) {
        if (natural != null) {
            naturales.add(natural);
        }
    }

    public boolean asignarCargo(int numeroSocio, String nuevoCargo) {
        for (AsociadoDirectivo directivo : directivos) {
            if (directivo.getCargo().equalsIgnoreCase(nuevoCargo)) {
                return false; // Cargo ya está asignado
            }
        }
        for (AsociadoDirectivo directivo : directivos) {
            if (directivo.getNumeroSocio() == numeroSocio) {
                directivo.setCargo(nuevoCargo);
                return true; // Cargo asignado correctamente
            }
        }
        return false; 
    }

    public void registrarAportacion(int numeroSocio, double monto) {
        for (AsociadoNatural natural : naturales) {
            if (natural.getNumeroSocio() == numeroSocio) {
                natural.registrarAportacion(monto);
                break;
            }
        }
    }

    public void imprimirDirectivos() {
        for (AsociadoDirectivo directivo : directivos) {
            System.out.println(directivo);
        }
    }

    public void imprimirNaturales() {
        for (AsociadoNatural natural : naturales) {
            System.out.println(natural);
        }
    }
}
