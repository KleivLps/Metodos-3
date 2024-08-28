import java.util.Scanner;

public class adivinarPalabra {

    public static void main(String[] args) {
        String[] palabras = { "casa", "perro", "gato", "computadora", "telefono", "libro"};
        String palabraSeleccionada = palabras[(int) (Math.random() * palabras.length)];
        char[] pista = new char[palabraSeleccionada.length()];
        int intentosRestantes = 6;

        for (int i = 0; i < pista.length; i++) {
            pista[i]= '_';
        }

        Scanner scanner = new Scanner(System.in);
        boolean palabraAdivinada = false;

        System.out.println("¡Bienvenido a A D I V I N A  L A  P A L A B R A !");
        System.out.println("Tienes " + intentosRestantes + " intentos para adivinar la palabra. ");
        System.out.println("Pista: " + String.valueOf(pista));

        while (intentosRestantes > 0 && !palabraAdivinada) {
            System.out.println("Ingresa una letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            boolean letraEncontrada = false;
            for (int i = 0 ; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letra) {
                    pista[i] = letra;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                intentosRestantes--;
                System.out.println("Letra incorrecta. Te quedan " + intentosRestantes + " intentos.");
            } else {
                System.out.println("¡Bien hecho! Pista: " +String.valueOf(pista));
            }

            if (String.valueOf(pista).equals(palabraSeleccionada)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Adivinaste la palabra: " +palabraSeleccionada);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("Lo siento, se te acabaron los intentos. La palabra era: "+palabraSeleccionada);
        }
        scanner.close();
    }
}
