import java.util.Scanner;

public class Eje1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este progrma nos muestra la multiplicacion de dos numeros enteros ");
    System.out.println("Por favor, introduzca el primer numero ");
    int n1 = sc.nextInt();
    System.out.println("Introduzca el segundo ");
    int n2 = sc.nextInt();
    System.out.print(n1);
    System.out.print("*");
    System.out.println(n2+" = ");
    System.out.println(n1*n2);
    sc.close();
    }
    }
    