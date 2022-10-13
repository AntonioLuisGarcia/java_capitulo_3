import java.util.Scanner;

public class Eje9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Cual es el radio del cono? ");
    int radio = sc.nextInt();
    System.out.print("¿Cual es la altura del cono? ");
    int altura = sc.nextInt();
    System.out.println("el aerea es: "+String.format("%.2f", radio*radio*altura*Math.PI/3) );
    sc.close();
    }
    }