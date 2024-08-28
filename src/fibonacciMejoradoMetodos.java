import java.util.Scanner;

public class fibonacciMejoradoMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posiciones;

        System.out.print("!Hola¡ Ingresa la posicion que deseas saber en la serie de fibonacci: ");
        posiciones = scanner.nextInt();

        if (posiciones < 0 ) {
            System.out.println("La posicion no puede ser negativa. ");
        } else {
            int resultados = obteniendoFibonacci(posiciones);

            System.out.println("El valor en la posicion " + posiciones + " de la serie de Fibonacci es " +resultados);

        }
        scanner.close();
    }

    public static int obteniendoFibonacci(int n) {
        if ( n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fib1 = 0;
            int fib2 = 1;
            int fibN = 1;

            for (int i = 2; i <= n; i++) {
                fibN = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibN;
            }

            return fibN;

        }
    }
}
