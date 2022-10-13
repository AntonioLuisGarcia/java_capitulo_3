import java.util.Scanner;

public class Eje2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("que cantidad de euros quieres saber en pesetas? ");
    float euros = sc.nextFloat();
    float pesetas = 166.386f;
    System.out.printf(euros+" son ");
    System.out.print(Math.round(euros*pesetas));
    System.out.print(" pesetas");
    sc.close();
    }
    }