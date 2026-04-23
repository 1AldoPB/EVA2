/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_herencia;

/**
 *
 * @author aldop
 */
public class EVA2_6_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Objeto de clase base
Empleados emp = new Empleados();
emp.setNombre("Juan");
emp.setApellidos("Perez");
emp.setClaveEmpleado("EMP001");
emp.setSalario(10000);

System.out.println("=== EMPLEADO NORMAL ===");
System.out.println(emp);

// Objeto de subclase
EmpleadosHonorarios empH = new EmpleadosHonorarios();
empH.setNombre("Ana");
empH.setApellidos("Lopez");
empH.setClaveEmpleado("EMP002");
empH.setHorasTrabajadas(40);
empH.setPagoPorHora(150);

System.out.println("=== EMPLEADO HONORARIOS ===");
System.out.println(empH);
    }
    
}
