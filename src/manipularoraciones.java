import java.util.Arrays;
import java.util.Scanner;

public class manipularoraciones {

    private static String oraciones = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            System.out.println("Seleccione una opcion: ");
            int opciones = scanner.nextInt();
            scanner.nextLine();
            salir = resolverOperaciones(opciones, scanner);
        }
    }
    public static void mostrarMenu() {
        System.out.println("\n--- Menú de opciones ---");
        System.out.println(oraciones.isEmpty() ? "1. Crear oración" : "1. Borrar oración");
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
    }

    public static boolean resolverOperaciones(int opcion, Scanner scanner){
        switch (opcion){
            case 1:
                crearOBorrarOracion(scanner);
                break;
            case 2:
                monstrarCantidadCaracteres();
                break;
            case 3:
                monstrarCantidadPalabras();
                break;
            case 4:
                monstrarPalabrasordenadas();
                break;
            case 5:
                devolverPalabraPorNumero(scanner);
                break;
            case 6:
                buscarPalabra(scanner);
                break;
            case 7:
                modificarPalabras(scanner);
                break;
            case 8:
                agregarContenido(scanner);
                break;
            case 9:
                System.out.println("Saliendo del programa...");
                return true;
            default:
                System.out.println("opcion no valida. Intenta nuevamente...");
        }
        return false;
    }

    public static void crearOBorrarOracion(Scanner scanner) {
        if (oraciones.isEmpty()) {
            System.out.println("Ingrese una nueva oracion: ");
            oraciones = scanner.nextLine();
        } else  {
            oraciones =" ";
            System.out.println("Oracion borrada. ");
        }
    }
    public static void monstrarCantidadCaracteres(){
        System.out.println("Cantidad de caracteres: " +oraciones.length());
    }

    public static void monstrarCantidadPalabras() {
        String[] palabras = oraciones.split("\\s+");
        System.out.println("Cantidad de palabras: " +palabras.length);
    }

    public static void monstrarPalabrasordenadas() {
        String[] palabras = oraciones.split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Palabras ordenadas alfabeticamente: " + String.join(", ", palabras));
    }

    public static void devolverPalabraPorNumero(Scanner scanner) {
        String[] palabras = oraciones.split("\\s+");
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        if (numero > 0 && numero <= palabras.length) {
            System.out.println("La palabra en la posicion " +numero+ " es: " +palabras[numero - 1]);
        } else {
            System.out.println("Numero invalido. Intente nuevamente. ");
        }
    }

    public static void buscarPalabra(Scanner scanner) {
        System.out.println("Ingrese la palabra que desea buscar: ");
        String palabra = scanner.nextLine();
        int posicion = oraciones.indexOf(palabra);
        if (posicion != -1) {
            System.out.println("Palabra encontrada en la posicion " +(posicion + 1) + ". ");
        } else {
            System.out.println("Palabra no encontrada. ");
        }
    }

    public static void modificarPalabras(Scanner scanner) {
        System.out.println("Ingrese la palabra que desea modificar: ");
        String palabraAntigua = scanner.nextLine();
        if (oraciones.contains(palabraAntigua)) {
            System.out.println("Ingrese la nueva palabra: ");
            String palabraNueva = scanner.nextLine();
            oraciones = oraciones.replaceFirst(palabraAntigua, palabraNueva);
            System.out.println("Oracion modificada: " +oraciones);
        } else {
            System.out.println("Palabra no encontrada. Intente nuevamente. ");
        }
    }

    public static void agregarContenido(Scanner scanner) {
        System.out.println("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        oraciones += " " + contenido;
        System.out.println("ORacion actualizada: " + oraciones);
    }
}
