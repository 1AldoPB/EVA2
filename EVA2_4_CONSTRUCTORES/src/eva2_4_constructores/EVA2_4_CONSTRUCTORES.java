/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_constructores;

/**
 *
 * @author aldop
 */
public class EVA2_4_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Empleado e =new Empleado(9999);
            
    }
    
}
class persona{
public persona(){
    System.out.println("CLASE PERSONA");
}
public persona(String Mensaje){
    System.out.println("MENSAJE");

}
}
class Empleado extends persona{
    //super es aceso a lo publivo o protegido de la superclase
    public Empleado(){
    super();
    }
public Empleado(int salario){
    

}
public Empleado(String mensaje){
super(mensaje);
}
}
