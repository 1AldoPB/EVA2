/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_herencia;

/**
 *
 * @author aldop
 */
public class EmpleadosHonorarios extends Empleados {

    private int horas;
    private double pagoPorHora;

    // Constructor con horas
    public EmpleadosHonorarios(int horas) {
        super();
        this.horas = horas;
    }

    // Constructor vacío (opcional pero recomendable)
    public EmpleadosHonorarios() {
        super();
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setHorasTrabajadas(int horas) {
        this.horas = horas;
    }

    public void setPagoPorHora(double pago) {
        this.pagoPorHora = pago;
    }

    @Override
    public String toString() {
        return "EmpleadoHonorarios{" +
               "horas=" + horas +
               ", pagoPorHora=" + pagoPorHora +
               '}';
    }
}