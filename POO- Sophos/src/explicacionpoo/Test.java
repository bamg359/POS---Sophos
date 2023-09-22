package explicacionpoo;

public class Test {

    public static void main(String[] args) {

        Padre padre = new Padre();

        Padre padre1 = new Padre();

        Padre madre = new Padre();

        Padre papaNoel = new Padre();


        padre.setNombre("Pablo");

        System.out.println(padre.getNombre());

        padre.setApellido("Perez");

        System.out.println(padre.getNombre() + " "+padre.getApellido());

        String nombrePadre1 ="Pepito";
        padre1.setNombre(nombrePadre1);

        System.out.println(padre1.getNombre());

        padre1.setApellido("Perez");

        System.out.println(padre1.getNombre() + " "+padre.getApellido());

        madre.setNombre("Lina");
        madre.setApellido("Vélez");

        System.out.println(madre.getNombre() + " "+ madre.getApellido());


        papaNoel.crearPadre();
        papaNoel.verPadre();



    }
}
