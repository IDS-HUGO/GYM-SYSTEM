import java.util.Scanner;

public class Gerente extends Usuario{
    private String rol = "Gerente";

    public String getUser() {
        return super.getUser();
    }
    public String getPass() {
        return super.getPass();
    }

    public String getRol() {
        return rol;
    }

    public Gerente(){
        this.user = "Victor.escobarb";
        this.pass = "Bonilla$24";
    }

    
    public void verMenu() {
        Scanner leer = new Scanner(System.in);
        int opc;

        do {
        System.out.println("BUEN DIA "+this.user+" QUE DESEA REALIZAR: ");
        System.out.println(
            "1.- Agregar Clientes\n"+
            "2.- Ver datos del Cliente\n"+
            "3.- Editar Cliente\n"+
            "4.- Eliminar cliente\n"+
            "5.- Agregar Inventario\n"+
            "6.- Editar inventario\n"+
            "7.- Eliminar Inventario\n"+
            "8.- Buscar maquina de inventario\n"+
            "9.- Ver clientes\n"+
            "10.-Ver inventario\n"+
            "11.-Cerrar sesion");
            opc = leer.nextInt();
            while (opc <=0 || opc > 11) {
                System.out.println("Seleccione una opcion dentro del rango");
                opc = leer.nextInt();
            }
        } while (opc != 11);
    }

    public void agregarNuevoCliente() {}

    public void buscarCliente() {}

    public void actualizarCliente(){}

    public void eliminarCliente(){}

    public void agregarInventario(){}
    
    public void buscarInventario(){}

    public void eliminarInventario(){}

    public void editarInventario(){}

    public void mostrarClientes(){}

    public void cerrarSesion(){
        System.out.println("Vuelva pronto :)\nSaliendo...");
    }

}

    


