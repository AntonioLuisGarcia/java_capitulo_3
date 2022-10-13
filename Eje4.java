import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa te devolvera varias cuentas al darle dos numeros ");
    System.out.println("Diga el primer numero");
    double numero1 = sc.nextDouble();
    System.out.println("Diga el segundo numero");
    double numero2 = sc.nextDouble();
    double suma =numero1+numero2;
    double resta =numero1-numero2;
    System.out.printf(numero1+"+"+numero2+" = "+"%.0f\n",suma);
    System.out.printf(numero1+"-"+numero2+" = "+ "%.0f\n",resta);
    System.out.printf(numero1+"*"+numero2+" = "+"%.2f\n",numero1*numero2);
    System.out.printf(numero1+"/"+numero2+" = "+"%.2f\n",numero1/numero2);
    sc.close();
    }
    }