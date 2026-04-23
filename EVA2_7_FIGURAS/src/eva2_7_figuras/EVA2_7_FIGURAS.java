/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_figuras;

/**
 *
 * @author aldop
 */
public class EVA2_7_FIGURAS {

    /**
     * @param args the command line arguments
     */

    // Métodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // MAIN aquí
    public static void main(String[] args) {

        Circulo c = new Circulo(5);
        System.out.println("CÍRCULO");
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());

        System.out.println("-------------------");

        Triangulo t = new Triangulo(3, 4, 5, 4, 3);
        System.out.println("TRIÁNGULO");
        System.out.println("Área: " + t.calcularArea());
        System.out.println("Perímetro: " + t.calcularPerimetro());
    }
}
    }
    
}
