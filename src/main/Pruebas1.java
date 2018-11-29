package main;

public class Pruebas1 {

    public static void main(String[] args) {

        int[][] m1 = {{72, 79, 76}, {65, 64, 32}};
        int[][] m2 = {{12, -3, 5}, {2, -8, 1 / 3}, {4, 7, 2}};

        int fil_m1 = m1.length;
        int col_m1 = m1[0].length;

        int fil_m2 = m2.length;
        int col_m2 = m2[0].length;

        if (col_m1 != fil_m2) {
            throw new RuntimeException("No se pueden multiplicar las matrices");
        } else {
            int[][] multiplicacion = new int[fil_m1][col_m2];

            for (int x = 0; x < multiplicacion.length; x++) {
                for (int y = 0; y < multiplicacion[x].length; y++) {
                    for (int z = 0; z < col_m1; z++) {
                        multiplicacion[x][y] += m1[x][z] * m2[z][y];                       
                    }
                    System.out.println(multiplicacion[x][y]);
                }
            }

        }
    }

}
