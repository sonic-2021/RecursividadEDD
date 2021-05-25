/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumaNumeros;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/05/2021
 *
 */
public class SumaNumeros {

    public static void main(String args[]) {
        //Suma los numeros naturales hasta N de forma recursiva
        int n = 9;
        System.out.println("Suma: " + sumaRecursiva(n));
        System.out.println("Factorial: "+factorialRecursivo(n));
    }

    public static int sumaRecursiva(int n) {
        if (n == 1) { //Caso base
            return 1;
        } else {
            return n + sumaRecursiva(n - 1); //Dominio
        }

    }

    public static int factorialRecursivo(int n) {
        if (n == 1) { //Caso base
            return 1;

        } else {
            return n * factorialRecursivo(n - 1); //Dominio
        }
    }

}
