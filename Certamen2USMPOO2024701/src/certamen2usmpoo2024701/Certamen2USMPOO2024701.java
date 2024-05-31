/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package certamen2usmpoo2024701;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javier.choque
 */
public class Certamen2USMPOO2024701 {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
    // Crear una lista de alumnos
    List<Alumno> listaAlumnos = new ArrayList<>();
    
    // Agregar alumnos a la lista
    listaAlumnos.add(new Alumno("Juan", 0.0, 0.0, 0.0)); // Por defecto todas las notas en 0.0
    listaAlumnos.add(new Alumno("María", 0.0, 0.0, 0.0));
    listaAlumnos.add(new Alumno("Pedro", 0.0, 0.0, 0.0));
    
    // Crear un objeto AlmacenamientoAlumnos y establecer la lista de alumnos
    AlmacenamientoAlumnos almacenamientoAlumnos = new AlmacenamientoAlumnos();
    almacenamientoAlumnos.setDbRamAlumnos((ArrayList<Alumno>) listaAlumnos);
    
    // Crear una instancia de Requerimientos y pasar el objeto AlmacenamientoAlumnos
    Requerimientos requerimientos = new Requerimientos(almacenamientoAlumnos);
    
    // Llamar a los métodos de caso de uso
    requerimientos.casoDeUsoCrearDatos();
    requerimientos.casoDeUsoMostrarVentana();
    
    System.out.println("Alumnos y sus notas:");
    for (Alumno alumno : listaAlumnos) {
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Nota 1: " + alumno.getNota1());
        System.out.println("Nota 2: " + alumno.getNota2());
        System.out.println("Nota 3: " + alumno.getNota3());
        System.out.println(); // Espacio en blanco para separar cada alumno
    }

}

    
}
