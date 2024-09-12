package PracticaNo1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RegistroAsociacion RegistroAsociacion = new RegistroAsociacion();

        // Agregar 25 asociados directivos
        for (int i = 1; i <= 25; i++) {
            AsociadoDirectivo directivo = new AsociadoDirectivo(
                i, 
                "Directivo " + i, 
                new Date(), 
                "271100903" + i, 
                "Cargo " + i, 
                new Date()
            );
            RegistroAsociacion.agregarAsociadoDirectivo(directivo);
        }

        // Agregar 25 asociados naturales
        for (int i = 26; i <= 50; i++) {
            AsociadoNatural natural = new AsociadoNatural(
                i, 
                "Natural " + (i - 25), 
                new Date(), 
                "27256998" + (i - 25)
            );
            RegistroAsociacion.agregarAsociadoNatural(natural);
        }

        // Asignar cargos adicionales a algunos directivos
        RegistroAsociacion.asignarCargo(1, "Presidente");
        RegistroAsociacion.asignarCargo(2, "Vicepresidente");
        RegistroAsociacion.asignarCargo(3, "Secretario");
        RegistroAsociacion.asignarCargo(4, "Tesorero");

        // Registrar aportaciones para algunos asociados naturales
        RegistroAsociacion.registrarAportacion(26, 500.00);
        RegistroAsociacion.registrarAportacion(27, 1000.00);
        RegistroAsociacion.registrarAportacion(28, 750.00);
        RegistroAsociacion.registrarAportacion(29, 600.00);
        RegistroAsociacion.registrarAportacion(30, 1200.00);

        // Imprimir listados
        System.out.println("Listado de Asociados Directivos:");
        RegistroAsociacion.imprimirDirectivos();

        System.out.println("\nListado de Asociados Naturales:");
        RegistroAsociacion.imprimirNaturales();
    }
}

