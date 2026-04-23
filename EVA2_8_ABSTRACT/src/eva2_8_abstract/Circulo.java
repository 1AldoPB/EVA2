/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_8_abstract;

/**
 *
 * @author aldop
 */
public class Circulo extends Figuras {
    private double radio;

    public Circulo() {
        radio=0;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
    return Math.PI*(radio * 2);
    }

    @Override
    public double CalcularPerimetro() {
    return Math.PI*(radio * 2);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
}
