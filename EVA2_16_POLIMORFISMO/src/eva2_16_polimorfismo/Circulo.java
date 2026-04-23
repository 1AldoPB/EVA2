package eva2_16_polimorfismo;

public class Circulo implements Figuras {
    private double radio;

    public Circulo() {
    }

    // ✅ constructor con parámetro
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularP() {
        return 2 * Math.PI * radio;
    }
}