import java.util.Stack;

public class MetodoPila {
    public Stack<Integer> LlenarPila(int[][] m1, int[][] m2){
        Stack<Integer>pila = new Stack<>();
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                pila.push(m1[i][j]*m2[i][j]);
            }            
        }
        return pila;
    }
    
    public void mostrarPila(Stack<Integer> pila){
        System.out.println(pila);
    }
}
