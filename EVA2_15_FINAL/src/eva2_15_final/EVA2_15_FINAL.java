package eva2_15_final;

public class EVA2_15_FINAL {

    public static void main(String[] args) {
        
        // Prueba
        Empleado emp = new Empleado("Aldo", "Programador");
        System.out.println(emp.getNombre());
        System.out.println(emp.getPuesto());
        
        CEO jefe = new CEO("Carlos", 1000);
        System.out.println(jefe.getNombre());
        System.out.println(jefe.getAcciones());
    }
}

// Clase base
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

// Clase hija
class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, String puesto) {
        super(nombre); // llama al constructor de Persona
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

// Clase final (no se puede heredar)
final class CEO extends Persona {
    private int acciones;

    public CEO(String nombre, int acciones) {
        super(nombre);
        this.acciones = acciones;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }
}