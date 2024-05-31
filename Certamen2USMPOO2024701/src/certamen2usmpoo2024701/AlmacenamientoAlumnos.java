/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package certamen2usmpoo2024701;

import java.util.ArrayList;

/**
 *
 * @author javier.choque
 */
public class AlmacenamientoAlumnos {
    
    private ArrayList<Alumno> DbRamAlumnos;

    private Requerimientos requerimientos;

    public ArrayList<Alumno> getDbRamAlumnos() {
        return DbRamAlumnos;
    }

    public void setDbRamAlumnos(ArrayList<Alumno> DbRamAlumnos) {
        this.DbRamAlumnos = DbRamAlumnos;
    }

    public Requerimientos getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(Requerimientos requerimientos) {
        this.requerimientos = requerimientos;
    }


    
    
    
    public int ObtenerCantidadAlumnosAlmacenados() {
        return DbRamAlumnos.size();
    }
    
    public boolean AgregarAlumno(Alumno alumno) {
        return DbRamAlumnos.add(alumno);
    }
    
    public Alumno ObtenerAlumno(int index) {
        if (index >= 0 && index < DbRamAlumnos.size()) {
            return DbRamAlumnos.get(index);
        }
        return null; // o lanzar una excepción
    }
}
