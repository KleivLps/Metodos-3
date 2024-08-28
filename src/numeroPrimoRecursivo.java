public class numeroPrimoRecursivo {
    public static boolean numeroprimoRecursivo(int numero, int divisor) {
        if (numero <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return numeroprimoRecursivo(numero, divisor - 1);
    }

    public static boolean numeroPrimo(int numero) {
        return numeroprimoRecursivo(numero, numero - 1);
    }

    public static void main(String[] args) {
        System.out.println(numeroPrimo(17));
        System.out.println(numeroPrimo(4));
    }
}
