import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el valor de la altura deseada : ");
        double h = sc.nextDouble();
        double g = 9.8 ;
        double x = (2*h)/g;
        if(x >= 0){
            double t = Math.sqrt(x);
            System.out.printf("Tardará %.2f segundos en caer",t);
        }else{
            System.out.printf(" Es una operación imposible");
        }

    }
    }