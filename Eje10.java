import java.util.Scanner;

public class Eje10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantos Mb quieres convertir en Kb ");
    int Mb = sc.nextInt();
    System.out.println("Son "+Mb*1000+" Kb");
    sc.close();
    }
    }