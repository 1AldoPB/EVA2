/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_herencia_interfaces;

/**
 *
 * @author aldop
 */
public class EVA2_12_HERENCIA_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
interface prueba{
    void mostrarMensaje();
}
interface otraPrueba extends prueba{
void mostrarSaludo(String Mensaje);
}
class Demo implements otraPrueba{

    @Override
    public void mostrarSaludo(String Mensaje) {
        System.out.println(Mensaje);
    }

    @Override
    public void mostrarMensaje() {
        
    }

}
