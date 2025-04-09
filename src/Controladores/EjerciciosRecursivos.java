package Controladores;

public class EjerciciosRecursivos{

    public int llamadasRecursivas=1;
    public int sumaConsecutivos(int n){

        int idActual = llamadasRecursivas++;

        System.out.println("llamada "+idActual+
                " con numero n="+n);

        if(n==0){
            System.out.println("llamada "+idActual+
                " caso base alcanzado"+n);
            return 0;
        }
        System.out.println("llamada "+idActual+
                " Llamando recursivamente con n="+(n-1));
        int resultadoParcial = sumaConsecutivos(n-1);

        int resultado = n + resultadoParcial;

        System.out.println("llamada "+idActual+
                " sumando "+n+" al resultado de "+resultadoParcial+
                " = "+resultado);

        System.out.println("llamada a "+idActual+
                " retorno "+resultado);
        
        return resultado;
    }

    public int fibonacci(int n){
        if(n==0){
            return 0;
        } else if (n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int potencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
        } 
        return base * potencia(base, exponente - 1);
    }

    public int calcularDigitos(int numero){
        if (numero < 10){
            return numero;
        }
        return (numero % 10) + calcularDigitos(numero / 10);
    }
}