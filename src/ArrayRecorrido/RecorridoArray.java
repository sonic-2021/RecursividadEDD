/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayRecorrido;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 24/05/2021
 *
 */
public class RecorridoArray {

    public static void main(String args[]) {
        int arreglo[] = {1, 10, 3, 4, 5, 6};
        int array[] = {1};
        mostrarArreglo(arreglo, 0);
        int elementoBuscado = 10;
        int n = buscarNumero(arreglo, elementoBuscado, 0);
        if (n != -1) {
            System.out.println("Posicion del elemento=" + n);

        } else {
            System.out.println("El elemento no se encontro en el arreglo");
        }
        System.out.println("Suma=" + sumaElementos(arreglo, 0));
        System.out.println("Multiplicacion=" + multiElementos(arreglo, 0));
        }

    public static void mostrarArreglo(int[] arreglo, int indice) {

        if (indice != arreglo.length) { //Caso base, se termina cuando el indice, sea igual a la magnitud del arreglo
            System.out.println("[" + indice + "]=" + arreglo[indice]);
            mostrarArreglo(arreglo, indice + 1); //Dominio

        }

    }

    //Metodo para buscar un elemento de forma recursiva
    public static int buscarNumero(int[] arreglo, int numero, int indice) {
        if (indice == arreglo.length) {
            return -1;
        }
        if (arreglo[indice] == numero) { //Caso base

            return indice;
        } else {

            return buscarNumero(arreglo, numero, indice + 1); //Dominio
        }

    }

    //Metodo para realizar la suma de los valores del arreglo
    public static int sumaElementos(int arreglo[], int indice) {
        if (arreglo.length == 1) { //Cuando el arregl solo tiene un valor
            return arreglo[indice];
        } else if (indice == arreglo.length) { //Caso base, cuado el indice sea igual al tamaño del arreglo
            return 0;
        } else {
            return arreglo[indice] + sumaElementos(arreglo, indice + 1);
        }
    }

    //Metodo para realizar una mutiplicacion
    public static int multiElementos(int arreglo[], int indice) {
        if (arreglo.length == 1) { //Cuando el arregl solo tiene un valor
            return arreglo[indice];
        } else if (indice == arreglo.length) { //Caso base, cuado el indice sea igual al tamaño del arreglo
            return 1;
        } else {
            return arreglo[indice] * multiElementos(arreglo, indice + 1);
        }
    }
 
}
