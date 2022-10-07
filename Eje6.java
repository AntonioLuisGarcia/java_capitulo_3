import java.util.Scanner;

public class Eje6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cual es la base del triangulo ");
    int x = sc.nextInt();
    System.out.print("Cual es la altura del triangulo ");
    int y = sc.nextInt();
    System.out.println("el area es "+x*y/2);
    sc.close();
    }
    }