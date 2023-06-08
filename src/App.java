import java.util.Scanner;
import classes.Triaangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Triaangulo t = new Triaangulo();

        System.out.println("INFORME OS LADOS DO PRIMEIRO TRIÂNGULO: ");        
        t.a = sc.nextDouble();
        t.b = sc.nextDouble();
        t.c = sc.nextDouble();

        double areaT1 = t.CalculoAreaTriangulo();        

        System.out.println("INFORME OS LADOS DO SEGUNDO TRIÂNGULO: ");        
        t.a = sc.nextDouble();
        t.b = sc.nextDouble();
        t.c = sc.nextDouble();

        double areaT2 = t.CalculoAreaTriangulo();

        System.out.printf("ÁREA DO TRIÂNGULO 1: %.2f\n", areaT1);
        System.out.printf("ÁREA DO TRIÂNGULO 2: %.2f\n ", areaT2);

        if (areaT1 > areaT2) {
            System.out.println("O TRIÂNGULO 1 TEM MAIOR ÁREA");
        } else {
            System.out.println("O TRIÂNGULO 2 TEM MAIOR ÁREA");
        }
        sc.close();
    }
}
