import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int puntos = 0; 
        System.out.println("Test de fidelidad");
        System.out.println("A continuación le haré una serie de preguntas para comprobar si su pareja le es fiel o no la respuesta deberá ser v(verdadero) o f(falso)");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
            
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora searregla el pelo y se asea con más frecuencia (si es mujer).\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n Verdadero o Falso");
        respuesta = System.console().readLine();
        if(respuesta.equals("v")){
            puntos += 3;
        }
        if(puntos<= 10){
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        if(puntos>=11 && puntos<=22){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }
        if(puntos>=22 && puntos<=30){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
