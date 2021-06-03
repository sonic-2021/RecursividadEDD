/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExponenteNumero;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 2/06/2021
 *
 */
public class ExponenteNumero {

    public static void main(String args[]) {
        ExponenteNumero ObjEx = new ExponenteNumero();

        System.out.println("El exponente  es " + ObjEx.Exponente(10, -2));
    }

    public double Exponente(int n, int ex) {
        /*
         Caso base
         */

        if (ex == 0) {
            return 1;
        } else if (ex == 1) {
            return n;
        } else if (ex < 0) {
            return Exponente(n, ex + 1) / n;

        } else {
            return n * Exponente(n, ex - 1);
        }

    }

}


