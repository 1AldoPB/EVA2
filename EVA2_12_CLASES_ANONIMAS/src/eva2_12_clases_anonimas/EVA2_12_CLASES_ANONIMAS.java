/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_clases_anonimas;

/**
 *
 * @author aldop
 */
public class EVA2_12_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prueba p=new prueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("HOLA MUNDO");
            }
        };
        p.mostrarMensaje();
//CLASE ANONIMA ES CLASE SIN NOMBRE
    }
    
}
//class usarPrueba implements prueba{}

interface prueba{
public void mostrarMensaje();
}
