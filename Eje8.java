import java.util.Scanner;

public class Eje8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Cuantas horas ha trabajado? ");
    int horas = sc.nextInt();
    System.out.println("ha ganado "+horas*12);
    sc.close();
    }
    }