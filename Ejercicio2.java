
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
        int hora = sc.nextInt();
    if((hora >= 6) && (hora  <= 12)){
        System.out.print("Buenos días");
    }
    if((hora>=13) && (hora<=20)){
        System.out.print("Buenas tardes");
    }
    if((hora>=21) && (hora<=5)){
        System.out.print("Buenas noches");
    }

    }
    }