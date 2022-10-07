import java.util.Scanner;

public class Eje2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("que cantidad de euros quieres saber en pesetas? ");
    int euros = sc.nextInt();
    System.out.println(euros*160);
    sc.close();
    }
    }