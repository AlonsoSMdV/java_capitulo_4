public class Ejercicio1 {
    public static void main(String[] args) {
    String dia;
    System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca  a primera hora ese día: ");
    dia = (System.console().readLine());
    dia.toLowerCase(); 
    switch(dia) {
    case "lunes":
    System.out.println("Programación");
    break;
    case "martes":
    System.out.println("Sistemas Informáticos");
    break;
    case "miércoles":
    System.out.println("Entornos de desarrollo");
    break;
    case "jueves":
    System.out.println("Programación");
    break;
    case "viernes":
    System.out.println("fOL");
    break;
    case "sábado":
    case "domingo":
    System.out.println("¡Ese día no hay clase!");
    break;
    default:
    System.out.println("El día introducido no es correcto.");
    }
    }
    }