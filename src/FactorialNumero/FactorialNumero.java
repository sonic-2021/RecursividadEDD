/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactorialNumero;

/**
 *
 * @author CxrlosMX
 */
public class FactorialNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactorialNumero factorial = new FactorialNumero();
        int n = 5;

        System.out.println("Factorial Recursividad " + factorial.factorialRecursivo(n));
        System.out.println("Factorial Bucle: " + factorial.factorialBucle(n));
    }

    public int factorialRecursivo(int a) {
        if (a >= 0) { //Validamos que el numero introducido sea mayor o igual a 0
            if (a == 0) { //Caso base, el resultado que por logica nos dara si introducimos 0
                return 1;
            } else {
                //System.out.println("a"+a);
                return a * factorialRecursivo(a - 1);
            }
        } else {
            return 0;
        }
    }

    public int factorialBucle(int n) {
        int factor = 1;
        if (n >= 0) {
            while (n != 0) {
                factor = factor * n;
                n--;
            }
            return factor;
        } else {
            return 0;
        }
    }
}
