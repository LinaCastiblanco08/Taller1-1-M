/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora - Funciones disponibles:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Seno");
        System.out.println("6. Coseno");
        System.out.println("7. Tangente");
        System.out.println("8. Raiz enesima");
        System.out.println("9. Potencia enesima");
        System.out.println("10. Calcular porcentaje de IVA");

        System.out.print("Ingrese el numero de la operacion deseada: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = sumar(scanner);
                break;
            case 2:
                resultado = restar(scanner);
                break;
            case 3:
                resultado = multiplicar(scanner);
                break;
            case 4:
                resultado = dividir(scanner);
                break;
            case 5:
                resultado = seno(scanner);
                break;
            case 6:
                resultado = coseno(scanner);
                break;
            case 7:
                resultado = tangente(scanner);
                break;
            case 8:
                resultado = raizEnesima(scanner);
                break;
            case 9:
                resultado = potenciaEnesima(scanner);
                break;
            case 10:
                resultado = calcularPorcentajeIVA(scanner);
                break;
            default:
                System.out.println("Opcion no valida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }

    private static double sumar(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    private static double restar(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    private static double multiplicar(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    private static double dividir(Scanner scanner) {
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();
        
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        
        return dividendo / divisor;
    }

    private static double seno(Scanner scanner) {
        System.out.print("Ingrese el valor del angulo en grados: ");
        double angulo = scanner.nextDouble();
        return Math.sin(Math.toRadians(angulo));
    }

    private static double coseno(Scanner scanner) {
        System.out.print("Ingrese el valor del angulo en grados: ");
        double angulo = scanner.nextDouble();
        return Math.cos(Math.toRadians(angulo));
    }

    private static double tangente(Scanner scanner) {
        System.out.print("Ingrese el valor del angulo en grados: ");
        double angulo = scanner.nextDouble();
        return Math.tan(Math.toRadians(angulo));
    }

    private static double raizEnesima(Scanner scanner) {
        System.out.print("Ingrese el valor al que desea calcular la raiz: ");
        double numero = scanner.nextDouble();
        System.out.print("Ingrese el indice de la raiz: ");
        double indice = scanner.nextDouble();
        return Math.pow(numero, 1.0 / indice);
    }

    private static double potenciaEnesima(Scanner scanner) {
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        double exponente = scanner.nextDouble();
        return Math.pow(base, exponente);
    }

    private static double calcularPorcentajeIVA(Scanner scanner) {
        System.out.print("Ingrese el monto: ");
        double monto = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de IVA: ");
        double porcentajeIVA = scanner.nextDouble();
        return monto * (1 + porcentajeIVA / 100);
    }
}

