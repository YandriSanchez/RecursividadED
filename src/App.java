import java.util.Scanner;

import Controladores.EjerciciosRecursivos;

public class App {
    public static void main(String[] args) throws Exception {
        EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese que cantidad de numeros quiere sumar: ");
        int n1 = sc.nextInt();
        int suma = ejercicios.sumaConsecutivos(n1);
        System.out.println("La suma de los numeros Consecutivos: "+suma);

        System.out.println("Ingrese que cantidad de serie fibonacci: ");
        int n2 = sc.nextInt();
        int fibonaccis = ejercicios.fibonacci(n2);
        System.out.println("La suma de los ultimos numeros es: "+fibonaccis);

        int potencia = ejercicios.potencia(5, 3);
        System.out.println("La potencia de los numeros es: "+potencia);

        int digitos = ejercicios.calcularDigitos(12345);
        System.out.println("La suma de los digitos es: "+digitos);

        sc.close();
    }
}
