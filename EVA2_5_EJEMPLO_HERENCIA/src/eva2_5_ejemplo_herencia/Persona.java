package eva2_5_ejemplo_herencia;

public class Persona {

    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String rfc;
    private int edad;
    private char genero;

    // Constructor vacío
    public Persona(){
        this.nombre = "";
        this.ap_paterno = "";
        this.ap_materno = "";
        this.edad = 0;
        this.rfc = "";
        this.genero = ' ';
    }

    // Constructor con parámetros
    public Persona(String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero){
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.rfc = rfc;
        this.edad = edad;
        this.genero = genero;
    }

    public String regresarGenero(){
        switch(genero){
            case 'H': return "Hombre";
            case 'M': return "Mujer";
            case 'O': return "Otro";
            default: return "No definido";
        }
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido paterno: " + ap_paterno);
        System.out.println("Apellido materno: " + ap_materno);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + regresarGenero());
    }
}


/* CLASE HIJA */
class Empleado extends Persona{

    private String nombrePuesto;
    private double salario;
    private int numeroEmpleado;

    // Constructor vacío
    public Empleado(){
        super();
        nombrePuesto = "";
        salario = 0;
        numeroEmpleado = 0;
    }

    // Constructor con parámetros
    public Empleado(String nombre,String ap_paterno,String ap_materno,String rfc,int edad,char genero,
                    String nombrePuesto,double salario,int numeroEmpleado){

        super(nombre, ap_paterno, ap_materno, rfc, edad, genero);

        this.nombrePuesto = nombrePuesto;
        this.salario = salario;
        this.numeroEmpleado = numeroEmpleado;
    }

    public void imprimirEmpleado(){
        imprimirDatos();
        System.out.println("Puesto: " + nombrePuesto);
        System.out.println("Salario: " + salario);
        System.out.println("Numero de empleado: " + numeroEmpleado);
    }
}