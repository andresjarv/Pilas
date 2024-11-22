// cree un programa que tome números aleatoriamente y que calcule la factorial y 
//ordene de manera ascendente la pila

// 1: ordene de manera descendente la pila

// 2: que busque uno de los registros y lo elimine

// 3: se debe mostrar la pila ordenada después de eliminar

package Pilas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class punto9 {
    public Stack<Integer> LlenarPila(Stack<Integer> pila, int tamano) {

        for (int i = 0; i < tamano; i++) {
            pila.push(Factorial((int) (Math.random() * 10 + 1)));
        }
        System.out.println("Se lleno la pila con el Factorial de cada elemento.");
        return pila;
    }

    public int Factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void mostrarPila(Stack<Integer> pila) {
        System.out.println(pila);

    }

    public Stack<Integer> OrdenarPila(Stack<Integer> pila) {
        List<Integer> lista = new ArrayList<>(pila);
        Collections.sort(lista, Collections.reverseOrder());
        pila.clear();
        pila.addAll(lista);
        return pila;
    }

    public String BuscarElemento(Stack<Integer> pila, int elemento) {

        String mensaje = "";
        Stack<Integer> pilaAux = new Stack<>();

        while (!pila.isEmpty()) {
            int actual = pila.pop();
            if (actual != elemento) {
                pilaAux.push(actual);
            } else {                
                break;
            }
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }
        
        return mensaje;
    }
}