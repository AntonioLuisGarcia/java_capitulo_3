import java.util.Scanner;

public class Eje11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantos Kb quieres convertir en Mb ");
    int Kb = sc.nextInt();
    System.out.println("Son "+Kb*0.001+" Mb");
    sc.close();
    }
    }