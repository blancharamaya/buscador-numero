package proyecto.visualizacion;

import proyecto.controlador.Metodos;

import java.util.Scanner;

public class Interfaz {
    public void visualizacion(){
        /*Variables y clase*/
        Scanner input = new Scanner(System.in);
        Metodos ver = new Metodos();
        int x;
        /**/
        do {
            System.out.println("""
                    Menu:
                    1: Ver numeros.
                    2: Buscar numeros.
                    3: Agregar numeros.
                    4: Eliminar numeros.
                    5: Salir.
                    """);
            System.out.print("Digite su respuesta:");
            x = input.nextInt();
            /*limpiando buffer*/
            input.nextLine();
            if(x<1||x>5){
                System.out.println("ERROR: El numero ingresado no es valido." +
                        "\nIntente nuevamente");
                visualizacion();
            }
            switch (x) {
                /*Metodo para ver un numero*/
                case 1 -> ver.verNumero();
                /*Metodo para buscar un numero*/
                case 2 -> ver.buscarNumero();
                /*Metodo para agregar un numero*/
                case 3 -> ver.agregarNumero();
                /*Metodo para eliminar un numero*/
                case 4 -> ver.eliminarNumero();
                /*Metodo para salir del programa*/
                case 5 -> {
                    System.out.println("Muchas gracias por utilziar nuestro programa");
                    return;
                }
            }
        }while(x>=1 && x<=5);
    }
}
