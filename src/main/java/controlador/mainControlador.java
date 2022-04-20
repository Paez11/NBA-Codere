package controlador;

import utils.lee;

public class mainControlador {

    /**
     * Metodo que sera llamado en el main de la clase ejecutable y que sera el inicio del programa, es decir, llamara al
     * switch del menu principal hasta que el usuario decida salir
     */
    public void run() {

        int opcion=-1;
        do {
            //
            opcion= lee.Entero();
            switchMenuPrincipal(opcion);
        }while(opcion!=0);
        lee.Print("Adios");
    }

    /**
     * Metodo que contendra el switch principal que redirigira en cada case a  uno de los menus para hacer las operaciones
     * en cada coleccion
     * @param opcion variable primitiva entera que recibira para seleccionar un posible case del switch
     */
    private void switchMenuPrincipal(int opcion) {

        switch(opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 0:
                break;
            default:
                lee.Print("Error");
                break;

        }
    }
}
