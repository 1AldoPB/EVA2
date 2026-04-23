/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_polimorfismo;

/**
 *
 * @author aldop
 */
public class Empleado extends Persona {
    private String puesto;
    private int salario;

    public Empleado() {
        this.puesto = puesto;
        this.salario = salario;
   
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String GenDatos() {
        return super.GenDatos() + 
        "Puesto:" + puesto + "\n" + "Salario:" + salario;
    }
    public static void ImprimirD(Empleado emp) {
        System.out.println("GERENTE");
        System.out.println(27000);
    
    }
    
}
