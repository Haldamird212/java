import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String palabra = "Inteligencia";
        char letraUsuario;
        boolean letraAdivinada = false;
        char[] letrasCompletar = new char[palabra.length()];
        int intentosMaximos = 10;
        int intentos = 0;
        boolean isAdivinada = false;

        System.out.println("Bienvenido, adivina las letras de la palabra");

        // crear arreglo con las letras
        for (int i = 0; i < palabra.length(); i++) {
            letrasCompletar[i] = '_';
        }

        // bucle de juego
        while (isAdivinada == false && intentos <= intentosMaximos) {
            System.out.println("\nEscribe una letra");
            letraUsuario = scanner.nextLine().toUpperCase().charAt(0);
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.toUpperCase().charAt(i) == letraUsuario) {
                    letraAdivinada = true;
                    letrasCompletar[i] = letraUsuario;
                }else if(letraAdivinada != true){
                    letraAdivinada = false;
                }
                
                if (Arrays.equals(palabra.toCharArray(), letrasCompletar)) {
                    isAdivinada = true;
                }
            }
            System.out.print(letrasCompletar);
            if (letraAdivinada == true) {
                System.out.println("\nLa letra es correcta");
            }else{
                System.out.println("\nLetra incorrecta");
                System.out.println("Te quedan " + (intentosMaximos - intentos));
            }
            letraAdivinada = false;
            intentos = intentos + 1;
        }

        System.out.println("¡¡FELICITACIONES, ADIVINASTE LA PALABRA!!");
    }
}
