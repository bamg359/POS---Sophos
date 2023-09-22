package explicacionpoo;

import java.util.Scanner;

public class Padre {

    Scanner sc = new Scanner(System.in);
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    String ocupacion;


    //Constructor

    public Padre(){

    }

    public Padre(String apellido){
        this.apellido = apellido;
    }

    public Padre(int id, String nombre, String apellido, int edad, String ocupacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    // Getter y Setter

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    // Comportamientos o métodos

    public void crearPadre(){
        System.out.println("Escriba el id del padre:");
        id = sc.nextInt();
        sc.skip("\n");
        System.out.println("Escriba el nombre del Padre: ");
        nombre = sc.nextLine();
        System.out.println("Escriba el apellido del padre: ");
        apellido = sc.nextLine();
        System.out.println("Escriba la edad del padre: ");
        edad = sc.nextInt();
        sc.skip("\n");
        System.out.println("Escriba  la ocupación del padre: ");
        ocupacion = sc.nextLine();
    }

    public void verPadre(){
        System.out.println("id: "+ id+ "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido" + apellido + "\n" +
                "Edad: " + edad + "\n" +
                "Ocupación: " + ocupacion);
    }
}
