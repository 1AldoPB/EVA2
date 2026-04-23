/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_polimorfismo;

/**
 *
 * @author aldop
 */
public class EVA2_17_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Aldo" , 17);
        
    }
    public static void ImprimirD(Persona p){
        System.out.println(p.GenDatos());
    if (p instanceof Empleado);
        System.out.println("Empleado");
        if (p instanceof Cliente);
        System.out.println("Cliente");
    }
}
