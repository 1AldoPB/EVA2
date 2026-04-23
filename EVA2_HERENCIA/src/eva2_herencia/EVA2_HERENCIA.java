/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_herencia;

/**
 *
 * @author aldop
 */
public class EVA2_HERENCIA {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.comer();
        Mamifero M = new Mamifero();
        M.comer();
        M.Tenerpelo();
        System.out.println("----------CLASE PERSONA------------");
        Persona P = new Persona();
    }
}

class Animal {
    public Animal() {
        System.out.println("CLASE ANIMAL");
    }
    public void comer() {
        System.out.println("ANIMAL: COMER");
    }
}
class Mamifero extends Animal {
    public Mamifero() {
        System.out.println("CLASE MAMIFERO");
    }
    public void Tenerpelo() {
        System.out.println("MAMIFERO TENER PELO");
    }
}
class Persona extends Mamifero {

    public Persona() {
        System.out.println("CLASE PERSONA");
    }
}