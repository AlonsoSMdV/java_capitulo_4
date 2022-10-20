import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero(de hasta 5 cifras): ");
        long num = sc.nextLong();
        if(num<10){
            System.out.print("El número es capicuo");
        }else if(num>=10 && num<100){
            if (num/10 == num%10){
                System.out.print("El número es capicuo");
            }else{
                System.out.print("El número no es capicuo");
            }
        }else if(num>=100 && num<1000){
            if(num/100 == num%10){
                System.out.print("El número es capicuo");
            }else{
                System.out.print("El número no es capicuo");
            }
        }else if(num>=1000 && num<10000){
            if(num/1000 == num%10 && ((num/100)%10 == (num/10)%10)){
                System.out.print("El número es capicuo");
            }else{
                System.out.print("El número no es capicuo");
            }
        }else if(num>=10000 && num<100000){
            if(num/10000 == num%10 && ((num/1000)%10 == (num/10)%10)){
                System.out.print("El número es capicuo");
            }else{
                System.out.print("El número no es capicuo");
            }
        }
    }
}
