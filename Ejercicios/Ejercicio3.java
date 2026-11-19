import java.util.Scanner;

public class Ejercicio3_APE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes (n): ");
        int n = sc.nextInt();

        int[] notas = new int[n];
        int sumaNotas = 0;
        int aprobados = 0;
        int reprobados = 0;

        // 1. Llenado del arreglo con validación (0 a 20)
        for (int i = 0; i < n; i++) {
            int notaIngresada;
            do {
                System.out.print("Ingrese la nota del Estudiante " + (i + 1) + " (0 - 20): ");
                notaIngresada = sc.nextInt();
                if (notaIngresada < 0 || notaIngresada > 20) {
                    System.out.println("Error: La nota debe estar entre 0 y 20. Intente nuevamente.");
                }
            } while (notaIngresada < 0 || notaIngresada > 20);

            notas[i] = notaIngresada;
            sumaNotas += notas[i];

            // Conteo de aprobados y reprobados
            if (notas[i] >= 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // 2. Promedio general evitando división entera
        double promedio = (double) sumaNotas / n;

        // 3. Resultados
        System.out.printf("\nPromedio general del curso: %.2f\n", promedio);
        System.out.println("Cantidad de aprobados (nota >= 14): " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);

        // 4. Lista de estudiantes estrictamente por debajo del promedio
        System.out.println("\nEstudiantes con nota estrictamente por debajo del promedio:");
        boolean hayDebajoPromedio = false;
        for (int i = 0; i < n; i++) {
            if (notas[i] < promedio) {
                System.out.println("- Estudiante " + (i + 1) + " (Nota: " + notas[i] + ")");
                hayDebajoPromedio = true;
            }
        }

        if (!hayDebajoPromedio) {
            System.out.println("Ningún estudiante tiene una nota por debajo del promedio.");
        }

        sc.close();
    }
}
