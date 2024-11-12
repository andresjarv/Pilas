import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        MetodoPila mP = new MetodoPila();
        Metodos mM = new Metodos();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz");
        n = sc.nextInt();
        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];

        m2 = mM.llenarMatriz(m2);
        m1 = mM.llenarMatriz(m1);

        Stack<Integer> pila = new Stack();
        pila = mP.LlenarPila(m1, m2);

        mP.mostrarPila(pila);
    }
}