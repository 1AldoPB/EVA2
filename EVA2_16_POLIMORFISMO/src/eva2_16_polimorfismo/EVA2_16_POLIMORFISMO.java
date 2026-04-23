    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_polimorfismo;

/**
 *
 * @author aldop
 */
public class EVA2_16_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo  = new Circulo(50);
        Rectangulo rectangulo= new Rectangulo(20,30);
        System.out.println("CIRCULO:");
        imprimir(circulo);
        System.out.println("RECTANGULO:");
        imprimir(rectangulo);
        //ARREGLO FIGURAS
        Figuras [] figuras =new Figuras [10];
        figuras [0]=new Circulo (10);
        figuras [1]=new Rectangulo (10,20);
        figuras [2]=new Circulo (10);
        figuras [3]=new Circulo (10);
        figuras [4]=new Circulo (10);
        System.out.println("FIGURAS");
        for (int i = 0; i < figuras.length; i++) {
            imprimir(figuras[i]);
        }
        
    }
    public static void imprimir(Figuras figuras){
        System.out.println("AREA="+ figuras.calcularArea());
         System.out.println("Perimetro="+ figuras.calcularP());
   
    
    
    }
    
}
