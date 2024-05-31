package certamen2usmpoo2024701;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javier.choque
 */
public class Requerimientos {
    
    AlmacenamientoAlumnos dbAlumnos;

    public Requerimientos(AlmacenamientoAlumnos dbAlumnos) {
        this.dbAlumnos = dbAlumnos;
    }
    
    public void casoDeUsoCrearDatos(){
        List<Alumno> alumnos = dbAlumnos.getDbRamAlumnos();
        // Iterar sobre la lista de alumnos
        for (Alumno alumno : alumnos) {
            if (alumno != null) { // Verificar si el elemento es nulo
                // Generar notas aleatorias
                int nota1 = Generador.generarNumeroIntAlAzarEntreMinYMax(0, 20); // Nota aleatoria entre 0 y 20
                int nota2 = Generador.generarNumeroIntAlAzarEntreMinYMax(0, 20);
                int nota3 = Generador.generarNumeroIntAlAzarEntreMinYMax(0, 20);
                
                // Asignar las notas al alumno
                alumno.setNota1((double) nota1);
                alumno.setNota2((double) nota2);
                alumno.setNota3((double) nota3);
            }
        }
            
    }
    
    public void casoDeUsoMostrarVentana(){
        // Crear la ventana
        VentanaJFrameSacarPromedios ventana = new VentanaJFrameSacarPromedios(dbAlumnos);
        
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
