/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioMenu;

/**
 *
 * @author daniel
 */
public class Pitagoras {
    public static double calcularHipotenusa(double catetoa,double catetob){
        double hipotenusa;
        hipotenusa= Math.sqrt(Math.pow(catetoa,2)+Math.pow(catetob,2));
        return hipotenusa;
    }
}
