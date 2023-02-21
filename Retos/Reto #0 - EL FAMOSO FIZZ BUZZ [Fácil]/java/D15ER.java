/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

package com.mycompany.reto0;

import java.util.ArrayList;

/**
 *
 * @author MdiazOtazu
 */
public class D15ER {

    public static void main(String[] args) {
        
        
        ArrayList<Integer> FizzBuzz = new ArrayList();
        ArrayList<Integer> Fizz = new ArrayList();
        ArrayList<Integer> Buzz = new ArrayList();
        ArrayList<Integer> numeros_ordinarios = new ArrayList();
        
        for( int i = 1 ; i < 101 ; i++){
            if( i % 3 == 0 && i%5 == 0 ){
                System.out.println("FizzBuzz");
                FizzBuzz.add(i);
            }else if(i % 3 == 0){
                System.out.println("Fizz");
                Fizz.add(i);
            }else if(i % 5 == 0){
                System.out.println("Buzz");
                Buzz.add(i);                
            }else{
                System.out.println(i);
                numeros_ordinarios.add(i);
            }
        }
        
        System.out.println("\n");
        System.out.println("Contador de Fizz = " + Fizz.size());
        System.out.println(Fizz);
        System.out.println("Contador de Buzz = " + Buzz.size());
        System.out.println(Buzz);
        System.out.println("Contador de FizzBuzz = " + FizzBuzz.size());
        System.out.println(FizzBuzz);
        System.out.println("Contador de numeros ordinarios = " + numeros_ordinarios.size());
        System.out.println(numeros_ordinarios);
                
    }
}
