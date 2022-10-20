import java.util.Scanner;
public class Ejercicio11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("A continuación deberá introducir una hora del día, ");
        System.out.println("primero introducirá la hora y luego los minutos.");
        System.out.print("hora: ");
        int hora = sc.nextInt();
        
        System.out.print("minuto: ");
        int minuto = sc.nextInt();
        int segundosTranscurridos = (hora * 3600) + (minuto * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
        if (segundosHastaMedianoche >= 0){
        System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " +segundosHastaMedianoche + " segundos.");
        }else{
            System.out.print("No es posible un número negaativo");
        }
        }
        }
