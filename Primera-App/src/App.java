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

        String texto = "Esto es un texto largo dentro de un String";

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
        texto.re
    }
}
