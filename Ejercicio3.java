public class Ejercicio3 {
    public static void main(String[] args) {
        String dia;
        System.out.print("Por favor, introduzca un número del  uno al siete y le diré el día de la semana: ");
        dia = (System.console().readLine());
        dia.toLowerCase(); 
        switch(dia) {
        case "1":
        System.out.println("Lunes");
        break;
        case "2":
        System.out.println("Martes");
        break;
        case "3":
        System.out.println("Miércoles");
        break;
        case "4":
        System.out.println("Jueves");
        break;
        case "5":
        System.out.println("Viernes");
        break;
        case "6":
        System.out.println("Sábado");
        break;
        case "7":
        System.out.println("Domingo");
        break;
        default:
        System.out.println("El número no es el correcto");
        }
        }
}
