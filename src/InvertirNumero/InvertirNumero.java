/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertirNumero;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 31/05/2021
 *
 */
public class InvertirNumero {

    public static void main(String args[]) {
        int num=254;
        System.out.println("Numero:"+num+"\nInvertido con recursividad:"+invertirNumero(num,2));

    }

    public static int invertirNumero(int num, int pos) {
        if (num < 10) { //Caso base
            return num;
        } else {
            return (num % 10) * (int) Math.pow(10, pos) + (invertirNumero(num / 10, pos - 1));
        }
    }

}
