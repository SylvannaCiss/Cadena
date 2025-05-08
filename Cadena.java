import java.util.Scanner;
public class Caracteres {
    public static void main(String[]args){
        String nombre;
        Scanner entrada = new Scanner(System.in);

        System.out.println("escribe tu nombre: ");
        String nombre = entrada.nextLine(); 

        String apellido; 
        Scanner entrada = new Scanner(System.in);

        System.out.println("escribe tu apellido: ");
        String apellido = entrada.nextLine(); 

        System.out.println("Tu nombre completo es: " + nombre + apellido);




        
    }
}