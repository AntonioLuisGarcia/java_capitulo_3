import java.util.Scanner;

public class Eje3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("que cantidad de pesetas quieres saber en euros? ");
    int pesetas = sc.nextInt();
    float euros = 166.386f;
    System.out.println(Math.round(pesetas/euros));
    sc.close();
    }
    }