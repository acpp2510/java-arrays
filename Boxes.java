import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {

        
        /* ¡Nos mudamos de piso! vamos a crear un pequeño programa que nos ayude a saber en que caja pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 4. Bolsos
        Caja 5. Zapatos
        Caja 6. Cosas de verano
        Caja 7. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas
        String [] boxes ={"Libros", "Utensilios de cocina", "Artículos de baño", "Bolsos", "Zapatos", "Cosas de verano", "Cosas de invierno"};

        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar? (la respuesta deberá aparecer en la terminal en la misma línea)

        Scanner solicitud = new Scanner(System.in);
        System.out.print("Hola, soy tu asistente de la organización ¿Qué deseas buscar?" + "\t");
        String objBuscado = solicitud.nextLine();
        solicitud.close();

        //Crea un programa que te devuelva lo siguiente: <cosas> están en la caja <índice> en el caso de no existir que devuelva: <cosas> no las empacaste, oops!
        int i;
        for (i=0; i< boxes.length ;i++ ) {
            if (boxes[i].equals(objBuscado)) {
                System.out.println(objBuscado + " están en la caja: " + i);
                break;
            }
        }
        if (i == boxes.length) {
            System.out.println("'" + objBuscado + "' no las empacaste, oops!");
        }
    }
}
