package poo;

public class Main {

    public static void main(String [] args){

        Usuario estudiante = new Usuario();
        Usuario profesor = new Usuario();

        estudiante.nombre = "Pepito";
        profesor.nombre = "Maria";

        System.out.println(estudiante.nombre);
        System.out.println(profesor.nombre);

        estudiante.registrarUsuario();
        profesor.registrarUsuario();
        estudiante.imprimirRegistro();
        profesor.imprimirRegistro();




    }
}
