/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package certamen2usmpoo2024701;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author javier.choque
 */
public class Generador {
    
    public static int generarNumeroIntAlAzarEntreMinYMax(int min, int max){
        return ThreadLocalRandom.current().nextInt(min,max);
    
    }
    
}
