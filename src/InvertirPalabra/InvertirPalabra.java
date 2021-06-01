/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertirPalabra;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 31/05/2021
 *
 */
public class InvertirPalabra {

    public static void main(String ars[]) {
        String palabra="Hola";
        System.out.println("Palabra: "+palabra+"\nPalabra inverida: "+invertirPalabra(palabra, palabra.length()-1));
    }

    public static String invertirPalabra(String palabra, int longitud) {
        if (longitud ==0) { //Caso base
            return palabra.charAt(longitud)+""; //Como devuelve un char, si le agregamos unas comillas se borra el error
        } else {
            return palabra.charAt(longitud) +(invertirPalabra(palabra, longitud - 1));
        }
    }

}
