public class Metodos {
    public int[][] llenarMatriz(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int)(Math.random()*50+1);
            }
        }        
        return m;
    }
}
