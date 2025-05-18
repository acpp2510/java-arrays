import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        System.out.print("¿Cuántas bolas de helado quieres?: "+ "\t");
        Scanner scanner =new Scanner(System.in);
        int numBalls = scanner.nextInt();
        System.out.println();


        String [] flavours = new String [numBalls];
        System.out.println("¡Perfecto! Ahora escoge de que sabor quieres cada helado:");



        for (int i= 0;i<numBalls;i++){
            System.out.print(i+"."+"\t");
            Scanner scanner1 =new Scanner(System.in);
            flavours[i]= scanner1.nextLine();
            //scanner1.close();
        }
        System.out.println();
        System.out.println("¡Gracias por tu orden! Has pedido los siguientes sabores:");

        for (int j= 0;j<flavours.length;j++){
            System.out.println(j+"."+"\t"+flavours[j]);
        }
        System.out.println();
        System.out.print("¿Es correcto? presiona cualquier tecla para continuar"+"\t");
        Scanner scanner2 = new Scanner(System.in);
        String end = scanner2.nextLine();
        scanner.close();
        scanner2.close();
        System.out.println();
        System.out.print("¡Listo, tenemos tu orden! Acércate al mostrador y Robotina te entregará tu helado");


        //Vamos a hacer un programa que haga un pedido online por cada helado ordenado, vamos a escoger cuantas bolas de helado le pondremos y sus sabores.

        //Ejemplo de como debe mostrarse en la terminal:
        /* 
            ¿Cuántas bolas de helado quieres?: 3

            ¡Perfecto! Ahora escoge de que sabor quieres cada helado: 
                0. Chocolate
                1. Fresa
                2. Vainilla

            ¡Gracias por tu orden! Has pedido los siguientes sabores:
                0. Chocolate
                1. Fresa
                2. Vainilla
            
            ¿Es correcto? presiona cualquier tecla para continuar

            ¡Listo, tenemos tu orden! Acércate al mostrador y Robotina te entregará tu helado
        */

        // La cantidad y los sabores escoge el usuario

        //Los índices 0, 1 y 2 (y los que sean) no lo escribirá el usuario, saldrá automáticamente según la cantidad de bolas de helado que haya escogido el usuario. Primero saldrá 0. y esperará a que el usuario escriba el primer sabor y después del "enter" aparecerá el 1. para que el usuario escriba el segundo sabor y así sucesivamente.

        //Has de usar un array para almacenar los sabores de helado y un bucle para imprimirlos.

        //Mira en el ejemplo los saltos de línea que has de tener.
    
    }
} 