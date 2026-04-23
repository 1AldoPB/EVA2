/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_composicioon;

/**
 *
 * @author aldop
 */
public class Persona  {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;
//Constructores

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.direccion = direccion; // ← aquí el cambio importante

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
   
}
