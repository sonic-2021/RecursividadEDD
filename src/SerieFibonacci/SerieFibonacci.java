/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerieFibonacci;

import java.util.Scanner;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/05/2021
 *
 */
public class SerieFibonacci {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Serie Fibonacci
        // 1,1,2,3,5,8,13,21,34,55,89,144,233,377
        SerieFibonacci objSerie = new SerieFibonacci();

        System.out.println("Introduce N");
        int n = sc.nextInt();
        System.out.println("Recursividad: " + objSerie.recursivoFibonacci(n));
        System.out.println("Mediante cliclo: " + objSerie.cicloFibonacci(n));

    }

    //Creando el metodo recursivo para la sucesión Fibonacci
    public int recursivoFibonacci(int n) {

        if (n == 1 || n == 2) { //Caso base 
            return 1;

        } else {
            //Dominio problema(n-1);
            return recursivoFibonacci(n - 1) + recursivoFibonacci(n - 2);

        }
    }

    public int cicloFibonacci(int n) {
        int fibo = 0, p = 1, s = 0;
        for (int i = 0; i < n; i++) {
            fibo = p + s;
            p = s;
            s = fibo;
        }
        return fibo;
    }

}
