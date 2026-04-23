/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_composicion_2;

/**
 *
 * @author aldop
 */
public class EVA2_19_COMPOSICION_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor=new Motor(5,'g',1.5);
        Vehiculo vehiculo =new Vehiculo("FORD","Mustang","Azul",1970,motor);
        System.out.println(vehiculo);
    }
    
}
