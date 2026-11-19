public class Ejercicio2_APE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] piezas = new int[10];
        
        int sumaIndicesPares = 0;
        int contadorImparMayor15 = 0;
        int sumaTotal = 0;

        // 1. Ingreso de datos
        for (int i = 0; i < piezas.length; i++) {
            System.out.print("Ingrese piezas fabricadas en el turno (índice " + i + "): ");
            piezas[i] = sc.nextInt();
        }

        // 2. Recorrido y evaluación de condiciones
        for (int i = 0; i < piezas.length; i++) {
            sumaTotal += piezas[i];

            // Suma de índices pares (0, 2, 4, 6, 8)
            if (i % 2 == 0) {
                sumaIndicesPares += piezas[i];
            }

            // Cantidad impar y mayor a 15
            if (piezas[i] % 2 != 0 && piezas[i] > 15) {
                contadorImparMayor15++;
            }
        }

        // 3. Cálculo de promedio exacto
        double promedioGeneral = (double) sumaTotal / piezas.length;

        // 4. Resultados
        System.out.println("\nSuma de piezas en índices pares: " + sumaIndicesPares);
        System.out.println("Turnos con producción impar y mayor a 15: " + contadorImparMayor15);
        System.out.printf("Promedio general de producción: %.2f\n", promedioGeneral);

        sc.close();
    }
}
