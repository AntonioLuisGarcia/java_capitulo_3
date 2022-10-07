import java.util.Scanner;

public class Eje7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Diga los precios de la lista de la compra ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int n4 = sc.nextInt();
    int n5 = sc.nextInt();
    System.out.println("el total con IVA es: "+(n1+n2+n3+n4+n5)/1.21);
    sc.close();
    }
    }