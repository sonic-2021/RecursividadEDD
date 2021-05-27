/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizRecursiva;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 26/05/2021
 *
 */
public class Matriz {

    public static void main(String args[]) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        mostrarMatriz(matriz, 0, 0);

    }

    public static void mostrarMatriz(int[][] matriz, int i, int j) {

        //
        System.out.print(matriz[i][j] + "  ");
        if (i != matriz.length - 1 || j != matriz[i].length - 1) {
            if (j == matriz[i].length - 1) {
                j = 0;
                i++;
                System.out.println("");
            } else {
                j++;
            }
            mostrarMatriz(matriz, i, j);
        }
    }
  

}
