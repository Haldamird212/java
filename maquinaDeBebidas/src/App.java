import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Bienvenido, por favor seleccione bebida:");
            System.out.println("1. Coca-Cola\n2. Sprite\n3. Fanta\n4. Salir");
    
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste Coca-cola");
                    break;
                
                case 2:
                    System.out.println("Seleccionaste Sprite");
                    break;
                
                case 3:
                    System.out.println("Seleccionaste Fanta");
                    break;
                
                case 4:
                    System.out.println("fin del programa");
                    break;
                
                default:
                    System.out.println("Opción no valida, fin del programa");
                    break;

            }

            System.out.println("¿Te gustaria pedir otra? \n1. si\n2. no");
                opcion = scanner.nextInt();
                if (opcion == 2) {
                    opcion = 4;
                }
        }
            
        scanner.close();
    }
}
