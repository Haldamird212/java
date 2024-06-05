public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // variables
        // declararción
        int numero;
        numero = 3;

        // tipos de variables
        int entero = 7;
        double decimales = 3.45454545;

        char character = 'f';
        String cadena = "Hola a todos";

        boolean verdadero = false;

        System.out.println(numero);
        System.out.println(decimales);
        System.out.println(entero);
        System.out.println(character);
        System.out.println(cadena);
        System.out.println(verdadero);

        // metodos de String

        String texto = "   Esto es un texto largo dentro de un String   ";

        // length()
        int longitud = texto.length();
        System.out.println(longitud);

        // charAt()
        char caracter = texto.charAt(4);
        System.out.println(caracter);

        // substring()
        String subString = texto.substring(5, 16);
        System.out.println(subString);

        // toLowerCase()
        String minusculas = texto.toLowerCase();
        System.out.println(minusculas);

        // toUpperCase()
        String mayusculas = texto.toUpperCase();
        System.out.println(mayusculas);

        // indexOf()
        int indice = texto.indexOf("largo");
        System.out.println(indice);

        // replace()
        String reemplazo = texto.replace("texto", "parrafo");
        System.out.println(reemplazo);
        
        //contains
        boolean isContain = texto.contains("String");
        System.out.println("¿Tiene la palabra String? " + isContain);

        //trim
        String sinEspacios = texto.trim();
        System.out.println(sinEspacios);

        /*
         * OPERADORES
         * 
         * + suma
         * - resta
         * * multiplicación
         * / división
         * % módulo
         * = asignacion
         * ++ incremental
         * -- decremental
         * == igual que
         * != distinto que
         * > mayor que
         * < menor que
         * && and
         * || or
         * ! not
         */

         // IF ELSE
        int edad = 19;

        if(edad > 18){
            System.out.println("Puedes entrar a la disco");
        } else if(edad == 18){
            System.out.println("Tienes la edad justa para entrar");
        } else {
            System.out.println("No tienes edad sufucuente para entrar");
        }

        // SWITCH
        String bebida = "café";

        switch (bebida) {
            case "café":
                System.out.println("A mi tambien me gusta el café");
                break;

            case "mate":
                System.out.println("Debes ser argentino, paraguayo o uruguayo");
                break;
        
            default:
                break;
        }

    }
}