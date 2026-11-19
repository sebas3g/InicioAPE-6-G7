import java.util.Scanner;

public class Ejercicio1_APE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] gastos = new double[7];
        double total = 0;

        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Ingrese el gasto del día " + (i + 1) + ": ");
            gastos[i] = sc.nextDouble();
            total += gastos[i];
        }

        double promedio = total / gastos.length;
        int diasIncremento = 0;

        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedio) {
                gastos[i] = gastos[i] * 1.10; 
                diasIncremento++;
            }
        }

        System.out.printf("\nGasto total inicial: %.2f\n", total);
        System.out.printf("Promedio diario inicial: %.2f\n", promedio);
        System.out.println("Días que sufrieron incremento del 10%: " + diasIncremento);
        
        System.out.println("\nArreglo actualizado (en orden inverso):");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf("Día %d: %.2f\n", (i + 1), gastos[i]);
        }
        
    }
}
