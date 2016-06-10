/*
 * esta clases es la encargada de solicitar y enviar informacion 
 * responsabilidad decirle a la clase info.java que genere la mariz segun
 * el tamaño
 *
 */
package controlador;

import dao.Info;

/**
 *
 * @author juan
 */
public class ControladorBo {
    private final Info info;
    private int tamano;

    public ControladorBo() {
        info = new Info();
    }
    
    public int[][][] iniciarMatriz(int tamano){
        this.tamano = tamano;
        info.inicializarMatriz(tamano);
        return info.getMatriz();
    
    }

    public void updateMatriz(int x, int y, int z, int value) {
        info.updateMatriz(x, y, z, value);
    }

    public int[][][] getMatriz() {
        return info.getMatriz();
    }
    
    public String obtenerMatrizByPrint(){
        String msg = "";
        int[][][] m3d = this.getMatriz();
        int sizeX = m3d.length;
        int sizeY = m3d.length;
        int sizeZ = m3d.length;
        
        for (int i = 0; i < sizeZ; i++) { //recorro z
            //recorro la z
            for (int j = 0; j < sizeX; j++) { //recorro x

                for (int k = 0; k < sizeY; k++) { //recorro y

                    msg += " " + m3d[j][k][i];

                }

                msg += "\n";
            }
            msg += "\n";
        }
        
        return msg;
        
    }
    
    public int query(int x0, int y0, int z0, int xn, int yn, int zn) {
         
        int[][][] m3d = this.getMatriz();
        int n =  tamano;
        int zini = z0 - 1;
        int zfi = zn;

        int xini = x0 - 1;
        int xfi = xn - 1;

        int yini = y0 - 1;
        int yfi = yn - 1;

        int acu = 0;

        boolean status = false;

        for (int i = zini; i < zfi; i++) { //recorro z
            //recorro la z
            for (int j = yini; j < n; j++) { //recorro x

                if (status) {
                    xini = 0;
                }

                for (int k = xini; k < n; k++) { //recorro y

                    int value = m3d[k][j][i];
                    acu += value;

                }

                status = true;

            }
        }

        return acu;
    }
}
