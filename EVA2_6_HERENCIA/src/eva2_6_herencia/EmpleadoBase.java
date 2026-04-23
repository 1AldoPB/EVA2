package eva2_6_herencia;

import java.time.Year;

public class EmpleadoBase extends Empleados {

    private int annioIngreso;

    public EmpleadoBase(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    public int getAnnioIngreso() {
        return annioIngreso;
    }

    public void setAnnioIngreso(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    // Método para calcular quinquenios
    public int antiguedad() {
        int añoActual = Year.now().getValue();
        int anti = añoActual - annioIngreso;
        int quin = anti / 5;
        return quin;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * (1 + (antiguedad() * 0.1));
    }
}
