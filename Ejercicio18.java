import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero(de hasta 5 cifras): ");
        long num = sc.nextLong();
        if(num<10){
            System.out.print("La primera cifra de ese número es "+num);
        }
        if(num>=10 && num<100){
            System.out.print("La primera cifra de ese número es "+num/10);
        }
        if(num>=100 && num<1000){
            System.out.print("La primera cifra de ese número es "+num/100);
        }
        if(num>=1000 && num<10000){
            System.out.print("La primera cifra de ese número es "+num/1000);
        }
        if(num>=10000 && num<100000){
            System.out.print("La primera cifra de ese número es "+num/10000);
        }
    }
}
