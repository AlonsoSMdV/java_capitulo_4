import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el valor a : ");
        double a = sc.nextDouble();
        System.out.print("Por favor, introduzca el valor b : ");
        double b = sc.nextDouble();
        System.out.print("Por favor, introduzca el valor c : ");
        double c = sc.nextDouble();
        double t = b*b+4*a*c;
        double x = (-b+Math.sqrt(t))/(2*a);
        double x2 = (-b-Math.sqrt(t))/(2*a);
        if(t>=0){
            System.out.printf(" En esta ecuación "+a+"x^2 "+b+"x "+c+" = 0, x = "+x);
            System.out.printf(" En esta ecuación "+a+"x^2 "+b+"x "+c+" = 0, x = "+x2);
        }else{
            System.out.println("No hay solución a esta ecuación");
        }

    }
    }