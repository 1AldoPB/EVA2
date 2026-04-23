/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author aldop
 */
public class EVA2_2_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Cliente cliente = new Cliente();
    }
}

class persona{
    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}

class Empleado extends persona{
    private int no_empleado;
    private double salario;

    public int getno_empleado(){
        return no_empleado;
    }

    public void setNo_Empleado(int no_empleado){
        this.no_empleado = no_empleado;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}

class Cliente extends persona{

}