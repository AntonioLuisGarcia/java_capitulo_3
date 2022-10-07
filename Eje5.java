import java.util.Scanner;

public class Eje5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cual es el ancho del rectangulo ");
    int x = sc.nextInt();
    System.out.print("Cual es el largo del rectangulo ");
    int y = sc.nextInt();
    System.out.println("el area es "+x*y);
    sc.close();
    }
    }