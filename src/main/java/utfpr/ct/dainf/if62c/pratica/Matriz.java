package utfpr.ct.dainf.if62c.pratica;

/**
 * Representa uma matriz de valores {@code double}.
 * @author Wilson Horstmeyer Bogadao <wilson@utfpr.edu.br>
 */
public class Pratica33 {

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        Matriz transp = orig.getTransposta();
        System.out.println("Matriz original: " + orig);
        System.out.println("Matriz transposta: " + transp);
        Matriz matriz1 = new Matriz(2, 2);
        double[][] n = matriz1.getMatriz();
        n[0][0] = 1;
        n[0][1] = 2;
        n[1][0] = 2;
        n[1][1] = 2;
        Matriz matriz2 = new Matriz(2, 2);
        double[][] n2 = matriz2.getMatriz();
        n2[0][0] = 1;
        n2[0][1] = 2;
        n2[1][0] = 2;
        n2[1][1] = 2;
        Matriz soma = matriz1.soma(matriz1);
        Matriz prod = matriz1.prod(matriz1);
        System.out.println("Matriz original: " + soma);
        System.out.println("Matriz original: " + prod);
    }
}