public class numeroPrimo {

    public static boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;
        }
        for (int i= 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 1) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(esPrimo(17));
        System.out.println(esPrimo(4));
    }
}
