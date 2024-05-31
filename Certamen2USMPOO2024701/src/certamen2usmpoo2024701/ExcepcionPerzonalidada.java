/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package certamen2usmpoo2024701;

/**
 *
 * @author javier.choque
 */
public class ExcepcionPerzonalidada {
    
    String Nombre;
    
    Double nota1;
    
    Double nota2;
    
    Double nota3;


    public ExcepcionPerzonalidada(String Nombre, Double nota1, Double nota2, Double nota3) {
        this.Nombre = Nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    
    public double ObtenerPromedio3Notas(){
        return (nota1+nota2+nota3)/3;
    }
}
