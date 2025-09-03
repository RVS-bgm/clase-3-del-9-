import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra ");
        String palabra = scanner.nextLine();

        System.out.println("La palabra ingresada es "+ palabra);


        System.out.println("Ingrese una letra");
        String letra = scanner.nextLine();

        System.out.println("La palabra ingresada es: "+ palabra);
        System.out.println("La letra ingresada es: " + letra);




        System.out.println("Convierte el texto en un arreglo de caractes");
        char[] letr = palabra.toCharArray();
        System.out.println(letr[0]);
        for(char let: letr){
            System.out.println(let);
        }


        System.out.println(palabra.charAt(0));








    }
}
