public class App {
    public static void main(String[] args) throws Exception {
        //arreglos
        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[3] = 3;
        numeros[4] = 4;

        // otra forma de crear arreglos

        String[] letras = {"a", "b", "c", "d", "e", "f"};

        // length
        System.out.println(numeros.length);

        //recorrer array
        int[] arregloNumerico = new int[10];

        for(int i = 0; i < arregloNumerico.length; i++){
            arregloNumerico[i] = i+1;
            System.out.println(arregloNumerico[i]);
        }

        // for each
        for(int numero : numeros){
            System.out.println(numero);
        }

    }
}
