import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el valor a : ");
        double a = sc.nextDouble();
        System.out.print("Por favor, introduzca el valor b : ");
        double b = sc.nextDouble();
        double x = -b/a;
        if(a==0){
            System.out.println("No hay solución a esta ecuación");
        }else{
            System.out.printf(" En esta ecuación "+a+"x "+b+" = 0, x = "+x);
        }

    }
    }