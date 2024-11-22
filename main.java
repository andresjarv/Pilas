package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class main{
    public static void main(String[] args) {
        punto9 p9 = new punto9();
        Scanner leer = new Scanner(System.in);
        Stack<Integer> stack = new Stack();
        int tamano = 0;
        int opt = 0;
        boolean bandera = true;        
        
        while (bandera) {
            System.out.println("Ingrese la opcion que desea: ");
            System.out.println("1. Llenar pila");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Ordenar pila");
            System.out.println("4. Buscar y eliminar un elemento");
            System.out.println("5. salir");
            while (!leer.hasNextInt()) {
                System.out.println("Ingrese una opcion valida");
                leer.next();
            }
            opt = leer.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Ingrese el tamaño de la Pila Aleatoria: ");
                    tamano = leer.nextInt();
                    p9.LlenarPila(stack, tamano);
                    break;

                case 2:
                    p9.mostrarPila(stack);
                    break;

                case 3:
                    p9.OrdenarPila(stack);
                    System.out.println("Pila ordenada correctamente.");                    
                    break;

                case 4:
                    System.out.println("Ingrese el elemento a eliminar: ");
                    int elemento = leer.nextInt();
                    String mensaje = p9.BuscarElemento(stack, elemento);
                    System.out.println(mensaje);
                    
                    p9.mostrarPila(stack);
                
                    
                    break;
                case 5:
                    System.out.println("saliendo del programa");
                    bandera = false;
                    break;

                default:
                    System.out.println("pagina en mantenimiento");
                    break;
            }
        }
        
        
    }
}