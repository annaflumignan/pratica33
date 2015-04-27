import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {

    public static void main(String[] args) {
        Matriz matriz1 = new Matriz(3, 3);
        double[][] n = matriz1.getMatriz();
        n[0][0] = 1;
        n[0][1] = 1;
        n[0][2] = 1;
        n[1][0] = 1;
        n[1][1] = 1;
        n[1][2] = 1;
        n[2][0] = 1;
        n[2][1] = 1;
        n[2][2] = 1;
        Matriz matriz2 = new Matriz(3, 3);
        double[][] n2 = matriz2.getMatriz();
        n2[0][0] = 1;
        n2[0][1] = 1;
        n2[0][2] = 1;
        n2[1][0] = 1;
        n2[1][1] = 1;
        n2[1][2] = 1;
        n2[2][0] = 1;
        n2[2][1] = 1;
        n2[2][2] = 1;
        Matriz soma = matriz2.soma(matriz1);
        Matriz prod = matriz1.prod(matriz1);
        System.out.println("Matriz original 1: " + matriz1);
        System.out.println("Matriz original 2: " + matriz2);
        System.out.println("Matriz Soma: " + soma);
        System.out.println("Matriz Prod: " + prod);
    }
}