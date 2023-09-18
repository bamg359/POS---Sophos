package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Pos {


        static Scanner sc = new Scanner(System.in);


        static ArrayList<ArrayList<String>> productos = new ArrayList<>();
        static ArrayList<String> producto = new ArrayList<>();

        // Vamos a generar las variables globales

        static int id;
        static String nombreProducto;
        static String presentacion;
        static double costo;
        static double precioVenta;
        static double margen;
        static double cantidad;
        static double valorInventario;

        static int numListas = productos.size()-1;



        public static void main(String[] args) {
        /*nombreProducto = "Yupi";
        presentacion = "paquete 200 gr";
        costo = 1100;
        margen = 0.3;
        cantidad = 20;
        precioVenta =  Math.round(costo /(1 - margen))  ;
        valorInventario = cantidad*costo;

        System.out.println(precioVenta);
        System.out.println(valorInventario);*/


            menuApp();

        /*
        registrarProducto();

        recorrerLista();

        System.out.println("--------------------------------");
        recorrerListadeListas();
        */

        }

        public static void registrarProducto(){
            try {
                System.out.println("Ingrese el id del producto:");
                id = sc.nextInt();
                String idString = id + ""; // Esto es un parseo de int a String
                producto.add(idString);
                sc.skip("\n");
                System.out.println("Ingrese el nombre del producto:");
                nombreProducto = sc.nextLine();
                producto.add(nombreProducto);
                System.out.println("INgrese la presentacion del producto");
                presentacion = sc.nextLine();
                producto.add(presentacion);
                System.out.println("Ingrese el costo del producto: ");
                costo = sc.nextDouble();
                String costoString = costo + "";
                producto.add(costoString);
                System.out.println("Ingrese la cantidad del producto:");
                cantidad = sc.nextDouble();
                String cantString = cantidad + "";
                producto.add(cantString);
                System.out.println("Ingrese el margen de ventas: ");
                margen = sc.nextDouble();
                String margenStr = margen + "";
                producto.add(margenStr);
                precioVenta = calcularPrecioVenta();
                valorInventario = calcularValorInventario();

                //for(int i = 0; i< productos.size(); i++ ){
                //    productos.add(producto);
                //}

                ArrayList<String> copy = (ArrayList<String>)producto.clone();

                productos.add(copy);

                producto.clear();



            }catch (Exception e){
                System.out.println(e);
                System.out.println("Debe ingresar decimales con coma (,)");


            }
        }

        public static double calcularPrecioVenta(){

            precioVenta =  Math.round(costo /(1 - margen));

            return precioVenta;

        }

        public static double calcularValorInventario(){

            valorInventario = cantidad*costo;

            return valorInventario;
        }

        public static void imprimirProducto(){
            System.out.println("id: "+ id + "\n" +
                    "Producto: " + nombreProducto + "\n" +
                    "Presentación : " + presentacion + "\n" +
                    "Costo: " + costo + "\n" +
                    "cantidad: " + cantidad + "\n" +
                    "Margen: " + margen + "\n" +
                    "Precio de venta: " + precioVenta + "\n" +
                    "Valor Inventario: " + valorInventario + "\n");
        }

        public static void menuApp(){

            try {


                System.out.println("Inicializar app, oprima 1");
                int isOn = sc.nextInt();

                while (isOn != 0) {

                    System.out.println("Bienvenido al gestor de Venta XYZ20000");
                    System.out.println("Seleccione: 1. Registrar producto" +
                            "2. Listar producto" +
                            "3. Registrar venta" +
                            "4. imprimir factura" +
                            "5. ver caja" +
                            "6. Salir");

                    int opc = sc.nextInt();

                    switch (opc) {
                        case 1:
                            System.out.println("Registrar producto");
                            registrarProducto();
                            break;
                        case 2:
                            System.out.println("Listar productos");
                            imprimirProducto();
                            break;
                        case 3:
                            System.out.println("Registrar venta");
                            break;
                        case 4:
                            System.out.println("Imprimir factura");
                            break;
                        case 5:
                            System.out.println("Ver caja");
                            break;
                        case 6:
                            System.out.println("Listar productos");
                            recorrerListadeListas();
                            break;
                        case 7:
                            System.out.println("Salir");
                            isOn = 0;
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");


                    }
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }


        public static void recorrerLista(){

            for ( int  i = 0; i< producto.size(); i++){
                System.out.println(producto.get(i));
            }



        }

        public static void recorrerListadeListas(){

            for( ArrayList<String> producto : productos){
                for(String i: producto){
                    System.out.println(i);
                }
                System.out.println("\n");
            }

        }
    }


