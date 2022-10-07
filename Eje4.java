import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Diga dos numeros ");
    int numero1 = sc.nextInt();
    int numero2 = sc.nextInt();
    System.out.println(numero1+numero2);
    System.out.println(numero1-numero2);
    System.out.println(numero1*numero2);
    System.out.println(numero1/numero2);
    sc.close();
    }
    }