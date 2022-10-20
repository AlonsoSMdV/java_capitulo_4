import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca que número desea usar para hacer una pirámide: ");
        String x = System.console().readLine();
        System.out.println("1. Pirámide con vertice hacia arriba");
        System.out.println("2. Pirámide con vertice hacia la izquierda");
        System.out.println("3. Pirámide con vertice hacia la derecha");
        System.out.println("4. Pirámide con vertice hacia abajo");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
            System.out.println("    "+x);
            System.out.println("   "+x+""+x+""+x);
            System.out.println("  "+x+""+x+""+x+""+x+""+x);
            System.out.println(" "+x+""+x+""+x+""+x+""+x+""+x+""+x);
            System.out.println(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
            break;
            case 2:
            System.out.println(x);
            System.out.println(x+""+x);
            System.out.println(x+""+x+""+x);
            System.out.println(x+""+x+""+x+""+x);
            System.out.println(x+""+x+""+x+""+x+""+x);
            System.out.println(x+""+x+""+x+""+x);
            System.out.println(x+""+x+""+x);
            System.out.println(x+""+x);
            System.out.println(x);
            break;
            case 3:
            System.out.println("    "+x);
            System.out.println("   "+x+""+x);
            System.out.println("  "+x+""+x+""+x);
            System.out.println(" "+x+""+x+""+x+""+x);
            System.out.println(x+""+x+""+x+""+x+""+x);
            System.out.println(" "+x+""+x+""+x+""+x);
            System.out.println("  "+x+""+x+""+x);
            System.out.println("   "+x+""+x);
            System.out.println("    "+x);
            break;
            case 4: 
            System.out.println(x+""+x+""+x+""+x+""+x+""+x+""+x+""+x+""+x);
            System.out.println(" "+x+""+x+""+x+""+x+""+x+""+x+""+x);
            System.out.println("  "+x+""+x+""+x+""+x+""+x);
            System.out.println("   "+x+""+x+""+x);
            System.out.println("    "+x);
            break;

        }


    }
    
}
