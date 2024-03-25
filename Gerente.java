import java.util.Scanner;

public class Gerente extends Usuario{
    private String rol = "Gerente";
    
    public Gerente(){
        this.user = "Victor.escobarb";
        this.pass = "Bonilla$24";
    }

    public String getUser() {
        return super.getUser();
    }
    public String getPass() {
        return super.getPass();
    }
    public String getRol() {
        return rol;
    }

    
    public void verMenu() {
        Scanner leer = new Scanner(System.in);
        int opc;

        do {
        System.out.println("\nBUEN DIA "+this.user+" QUE DESEA REALIZAR: ");
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

            switch (opc) {
                case 1: agregarNuevoCliente(); 
                    break;
                case 2: buscarCliente();
                    break;
                case 3: actualizarCliente();
                    break;
                case 4: eliminarCliente();
                    break;
                case 5: 
                    break;
                case 6: editarInventario();
                    break;
                case 7: eliminarInventario();
                    break;
                case 8: buscarInventario();
                    break;
                case 9: mostrarClientes();
                    break;
                case 10: 
                    break;
                case 11: cerrarSesion();
                    break;
            }

        } while (opc != 11);
    }

    public void agregarNuevoCliente() {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        do {
        Cliente newCliente = new Cliente();
        Plan newPlan = new Plan();

        System.out.print("\nIngrese los datos del cliente: \nNombre: ");
        String nombre = scanner.next();

        System.out.print("ID-Cliente: ");
        int id =  scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el tipo de plan: ");
        String plan = scanner.next();

        System.out.println("Ingrese el monto del plan: ");
        int monto = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Fecha inicial:");
        String fechainicio = scanner.nextLine();
        
        System.out.println("Fecha final");
        String fechaFinal = scanner.nextLine();

        newCliente.setId(id);
        newCliente.setNombre(nombre);
        newPlan.setPlan(plan);
        newPlan.setMonto(monto);
        newPlan.setFechaInicio(fechainicio);
        newPlan.setFechaFin(fechaFinal);
        
        newCliente.listaClientes(newCliente);
        newCliente.planCliente(newPlan);

        System.out.println("\nDesea agregar otro cliente\n1.- Si\n2.- No");
        opc =  scanner.nextInt();

        while (opc<=0||opc>2) {
            System.out.println("Eliga una opcion dentro del rango");
            opc =  scanner.nextInt();
        }

        System.out.println("Clientes: "+newCliente.getListaClientes().size());
        } while (opc!=2);
    }

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

    


