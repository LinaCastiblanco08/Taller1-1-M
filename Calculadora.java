/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Lina Castiblanco
 */
public class Calculadora {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
     
        while (true){
        System.out.println("Calculadora: ");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division ");
        System.out.println("5. Seno ");
        System.out.println("6. Coseno ");
        System.out.println("7. Tangente ");
        System.out.println("8. Raiz ");
        System.out.println("9. Potencia ");
        System.out.println("10. IVA ");
        System.out.println("11. Salir ");
        System.out.println("Sleccionar una opcion: ");
            
        int opcion = leer.nextInt();
       
        if(opcion == 11){
            System.out.println("Saliendo... ");
            break;
        }
        double r = 0;
       
        switch(opcion){
            case 1:
                r = sumar(leer);
                break;
            case 2:
                r = restar(leer);
                break;
            case 3:
                r = multiplicar(leer);
                break;
            case 4:
                r = dividir(leer);
                break;
                case 5:
                r = seno(leer);
                break;
            case 6:
                r = coseno(leer);
                break;
            case 7:
                r = tangente(leer);
                break;
            case 8:
                r = raiz(leer);
                break;
            case 9:
                r = potencia(leer);
                break;
            case 10:
                r = IVA(leer);
                break;
            default:
                System.out.println("Opcion invalida");
                continue;
        }
        System.out.println("El resultado es: "+r);
        }
        leer.close();
    }
    public static double sumar(Scanner leer) {
        System.out.print("Ingrese el primer número: ");
        double num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();
        return num1 + num2;
    }
    public static double restar(Scanner leer) {
        System.out.print("Ingrese el primer número: ");
        double num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();
        return num1 - num2;
    }
     public static double multiplicar(Scanner leer) {
        System.out.print("Ingrese el primer número: ");
        double num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();
        return num1 * num2;
    }
     public static double dividir(Scanner leer) {
        System.out.print("Ingrese el dividendo: ");
        double dividendo = leer.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = leer.nextDouble();
       
         if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
         }
         return dividendo / divisor;
     }
     public static double seno(Scanner leer) {
        System.out.print("Ingrese el ángulo en grados: ");
        double angulo = Math.toRadians(leer.nextDouble());
        return Math.sin(angulo);
     }
     public static double coseno(Scanner leer) {
        System.out.print("Ingrese el ángulo en grados: ");
        double angulo = Math.toRadians(leer.nextDouble());
        return Math.cos(angulo);
    }
     public static double tangente(Scanner leer) {
        System.out.print("Ingrese el ángulo en grados: ");
        double angulo = Math.toRadians(leer.nextDouble());
        return Math.tan(angulo);
    }
     public static double raiz(Scanner leer) {
        System.out.print("Ingrese el número: ");
        double numero = leer.nextDouble();
        System.out.print("Ingrese el índice de la raíz: ");
        double indice = leer.nextDouble();
        return Math.pow(numero, 1.0 / indice);
     }
     public static double potencia(Scanner leer) {
        System.out.print("Ingrese el número: ");
        double numero = leer.nextDouble();
        System.out.print("Ingrese el exponente: ");
        double exponente = leer.nextDouble();
        return Math.pow(numero, exponente);
    }
    public static double IVA(Scanner leer) {
        System.out.print("Ingrese el valor: ");
        double valor = leer.nextDouble();
        System.out.print("Ingrese el porcentaje de IVA: ");
        double porcentajeIVA = leer.nextDouble();
        return valor * (porcentajeIVA / 80);
    }
}
