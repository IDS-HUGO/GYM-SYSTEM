import java.util.Scanner;
public class Administrador {

    public void verCliente(){
        Scanner leer =new Scanner(System.in);
        int opcion;
        do{
        System.out.println("QUE DESEA REALIZAR:\n 1)VER CLIENTE 2)VER MENSUALIDAD 3)VER INVENTARIO");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("INGRESE UN NUMERO CORRECTO");
                break;
        }
        }while(opcion<0 || opcion>3);

    }
}
