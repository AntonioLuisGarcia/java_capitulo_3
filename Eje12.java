import java.util.Scanner;

public class Eje12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Que nota has sacado en el primer examen? ");
    float examen1 = sc.nextFloat();
    System.out.print("¿Que nota quieres sacar en el trimestre? ");
    float trimestre = sc.nextFloat();
    double examen2 = (trimestre - examen1*0.4)/0.6;
    System.out.println("Necesitas sacar un "+String.format("%.2f",examen2));
    sc.close();
    }
    }