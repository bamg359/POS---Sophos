package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);

    // atributos

    int id;
    String nombre;
    String apellido;
    int documento;
    String correo;
    String tel;
    String rol;

    // métodos

    public void registrarUsuario(){


        System.out.println("Ingrese el id");
        id= sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese su nombre");
        nombre= sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese su documento");
        documento = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese su correo");
        correo = sc.nextLine();
        System.out.println("Ingrese su telefono");
        tel = sc.nextLine();
        System.out.println("Ingrese su rol");
        rol = sc.nextLine();

    }

    public void imprimirRegistro(){

        System.out.println( "Id: " + id + "\n" +
                "nombre: " + nombre + "\n" +
                "apellido: " + apellido + "\n" +
                "documento: " + documento + "\n" +
                "correo: " + correo + "\n" +
                "tel: " + tel + "\n" +
                "rol: " + rol + "\n");
    }


}
