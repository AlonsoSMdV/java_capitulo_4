import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        long num = sc.nextLong();
        System.out.print("La última cifra de ese número es "+num%10);
    }
}
