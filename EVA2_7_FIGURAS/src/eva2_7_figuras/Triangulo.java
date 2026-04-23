/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_figuras;

/**
 *
 * @author aldop
 */

    public class Triangulo extends Figuras {

    private double lado1, lado2, lado3;
    private double base, altura;

    public Triangulo(double lado1, double lado2, double lado3, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

