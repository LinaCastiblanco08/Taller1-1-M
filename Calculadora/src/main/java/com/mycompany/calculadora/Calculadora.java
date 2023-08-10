/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Calculadora {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
      
        while (true){
        System.out.println("Calculadora: ");
        System.out.println("Elegir la operacion que desea realizar ");
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
        
        int opcion = leer.nextInt();
        }
        
        double resultado = 0;
        
        switch(opcion){
            case 1:
                resultado = sumar(leer);
                break;
            case 1:
                resultado = sumar(leer);
                break;
        }
                
                
        System.out.println("Escribir el primer numero ");
        num1 = leer.nextInt();
        System.out.println("Escribir el segundo numero ");
        num2 = leer.nextInt();
        System.out.println("Escribir el porcentaje del iva ");
        iva = leer.nextInt();
        
        
