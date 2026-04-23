
package eva2_19_composicion_2;

/**
 *
 * @author aldop
 */
public class Vehiculo {
    private String marca;
    private String  modelo;
    private String color;
    private int anno;
    private Motor motor;

    public Vehiculo(String marca, String modelo, String color, int anno, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anno = anno;
        this.motor = motor;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anno=" + anno + ", motor=" + motor + '}';
    }
    
}
