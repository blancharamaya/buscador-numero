package proyecto.controlador;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    int numero;
    public void verNumero(){
        System.out.println(numeros);
    }

    public void buscarNumero(){
        System.out.print("Digite el numero que desea buscar: ");
        boolean resultado = true;
        numero = input.nextInt();
        /*limpiando buffer*/
        input.nextLine();
        for(int i=0;i<numeros.size();i++) {
            if (numero == numeros.get(i)) {
                System.out.println("El numero " + numero + " fue encontrado, en la posicion " + i);
                break;
            }else{
                for (Integer integer : numeros) {
                    if (numero != integer) {
                        resultado = false;
                        break;
                    }
                }
            }
        }
        if(!resultado){
            System.out.println("El numero" + numero + " no fue encontrado");
        }
    }
    public void agregarNumero(){
        System.out.print("Digite el numero que desea agregar: ");
        numero = input.nextInt();
        /*limpiando buffer*/
        input.nextLine();
        numeros.add(numero);
    }

    public void eliminarNumero(){
        int posicion;
        boolean resultado = true;
        System.out.print("Digite el numero que quiere eliminar: ");
        numero = input.nextInt();
        /*limpiando buffer*/
        input.nextLine();
        for(int i=0;i<numeros.size();i++) {
            if (numero == numeros.get(i)) {
                posicion = i;
                numeros.remove(posicion);
                System.out.println("El numero " + numero + " fue eliminado");
                break;
            }else{
                resultado = false;
            }
        }
        if(!resultado){
            System.out.println("El numero " + numero + " no esta en el arreglo");
        }
    }

}
