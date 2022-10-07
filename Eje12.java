import java.util.Scanner;

public class Eje12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Que nota has sacado en el primer examen? ");
    double e1 = sc.nextDouble();
    System.out.print("¿Que nota quieres sacar en el trimestre? ");
    double trimestre = sc.nextDouble();
    double e2 = (trimestre - e1*0.4)/0.6;
    System.out.println("Necesitas sacar un "+e2);
    sc.close();
    }
    }