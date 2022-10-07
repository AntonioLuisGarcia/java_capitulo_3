import java.util.Scanner;

public class Eje3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("que cantidad de pesetas quieres saber en euros? ");
    int pesetas = sc.nextInt();
    System.out.println(pesetas/160);
    sc.close();
    }
    }