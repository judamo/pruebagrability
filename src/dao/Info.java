/*
 * Esta clase es responsable de la variable matriz
 * responsabilidad 1 : inicializar segun el tamaño enviado por el bo
 *
 */
package dao;

/**
 *
 * @author juan
 */
public class Info {

    private int[][][] matriz;

    public Info() {
        
    }

    public int[][][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][][] matriz) {
        this.matriz = matriz;
    }
    
    public void updateMatriz(int x, int y, int z, int value) {

        matriz[x - 1][y - 1][z - 1] = value;
        //System.out.println(" Actualizado " + x + " " + y + " " + z + " con " + value);

    }

    public void inicializarMatriz(int tamano) {

        matriz = new int[tamano][tamano][tamano];

        int sizeZ = matriz.length;
        int sizeX = matriz.length;
        int sizeY = matriz.length;
        for (int i = 0; i < sizeZ; i++) { //recorro z
            //recorro la z
            for (int j = 0; j < sizeX; j++) { //recorro x

                for (int k = 0; k < sizeY; k++) { //recorro y

                    matriz[j][k][i] = 0;

                }

            }
        }

    }
}
