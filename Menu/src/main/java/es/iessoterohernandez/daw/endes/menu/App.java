package es.iessoterohernandez.daw.endes.menu;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Hola, elige una de las siguientes opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Hola, has seleccionado la opción 1");
                        salir = true;
                        break;

                    case 2:
                        System.out.println("Hola, has seleccionado la opción 2");
                        salir = true;
                        break;
                    case 3:
                        System.out.println("Hola, has seleccionado la opción 3");
                        salir = true;
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }
}
