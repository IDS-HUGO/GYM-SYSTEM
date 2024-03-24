import java.util.ArrayList;
import java.util.Scanner;
public class Gerente {
    private Cliente cliente;
    private Plan plan;
    public Gerente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void verMenu() {
        int opcion;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("BUEN DIA GERENTE QUE DESEA REALIZAR: ");
            System.out.println("1) Agregar Clientes  2)Ver datos del Cliente 3)Editar Cliente  4)Eliminar cliente  5)Agregar Inventario \n 6)Editar inventario  7)Eliminar Inventario  8)Buscar maquina de inventario  9)Ver clientes  10)Ver inventario");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    agregarNuevoCliente();
                    break;
                case 2:
                    buscarCliente();
                    break;
                case 3:
                    actualizarCliente();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                    Aparatos ob1 = new Aparatos();
                    ob1.agregarInventario();
                    break;
                case 6:
                    editarInventario();
                    break;
                case 7:
                    eliminarInventario();
                    break;
                case 8:
                    buscarInventario();
                    break;
                case 9:
                    mostrarClientes();
                    break;
                case 10:
                    
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion<0 && opcion>7);
    }

    public void agregarNuevoCliente() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("------------------------------------");
            System.out.println("\nIngrese los datos del cliente:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el tipo de plan");
            String plan = scanner.nextLine();
            System.out.println("Ingrese el monto de su plan");
            int monto = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Fecha inicial:");
            String fechainicio = scanner.nextLine();
            System.out.println("Fecha final");
            String fechaFinal = scanner.nextLine();

            Plan planCliente = new Plan(monto,plan,fechainicio,fechaFinal);
            cliente.planCliente(planCliente);
            Cliente nuevoCliente = new Cliente(nombre, id);
            cliente.listaClientes(nuevoCliente);
            System.out.println("Cliente agregado exitosamente.");
            System.out.println("---------------------------------");
            System.out.println("¿Desea agregar otro cliente?  SI: 1\n NO: Digite cualquier otro numero");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
        } while(opcion == 1);

        Gerente ob3 = new Gerente(cliente);
        ob3.verMenu();
    }

    public void buscarCliente() {
        Scanner leer = new Scanner(System.in);
        int busqueda;
        System.out.println("---------------------");
        System.out.println("Ingrese el id del cliente a buscar");
        busqueda = leer.nextInt();
        ArrayList<Cliente> listaClientes = cliente.getListaClientes();
        ArrayList<Plan> listaPlanesCliente = cliente.getPlanCliente();
        if(!cliente.getListaClientes().equals(null)){ 
        for (int i = 0; i<listaClientes.size();i++){
            Cliente nuevoCliente = listaClientes.get(i);
            Plan planCliente = listaPlanesCliente.get(i);
            if(busqueda == nuevoCliente.getId()){
                    System.out.println("CLIENTE ENCONTRADO:");
                    System.out.println("NOMBRE :" + nuevoCliente.getNombre());
                    System.out.println("ID: " + nuevoCliente.getId());
                    System.out.println("TIPO DE PLAN:" + planCliente.getPlan());
                    System.out.println("MONTO PAGADO :" + planCliente.getMonto());
                    System.out.println("FECHA INICIAL DE PLAN: " + planCliente.getFechaInicio());
                    System.out.println("FECHA FINAL DE PLAN" + planCliente.getFechaFin());
            }
        }
        }else{  
            System.out.println("CLIENTE NO ENCONTRADO");
            
        }
        Gerente ob3 = new Gerente(cliente);
        ob3.verMenu();
    }


    public void actualizarCliente(){
        Scanner leer = new Scanner(System.in);
        int busqueda;
        System.out.println("INGRESE EL ID DEL CLIENTE QUE DESEA ACTUALIZAR");
        busqueda = leer.nextInt();
        ArrayList<Cliente> listaClientes = cliente.getListaClientes();
        ArrayList<Plan> listaPlanesCliente = cliente.getPlanCliente();
        for (int i = 0; i<listaClientes.size();i++){
            Cliente nuevoCliente = listaClientes.get(i);
            Plan planCliente = listaPlanesCliente.get(i);
            if(busqueda == nuevoCliente.getId()){
                System.out.println("QUE DESEA EDITAR DEL CLIENTE:  1)NOMBRE 2)TIPO DE PLAN 3)MONTO O PAGO DEL PLAN 4)FECHA INICIAL DEL PLAN  5)FECHA FINAL DEL PLAN");
                int editar = leer.nextInt();
                leer.nextLine();
                switch (editar) {
                    case 1:
                        System.out.println("Nombre actual :" + nuevoCliente.getNombre());
                        System.out.println("Ingrese el nombre nuevo");
                        String editar1 = leer.nextLine();
                        nuevoCliente.setNombre(editar1);
                        System.out.println(nuevoCliente.getNombre());
                        break;
                    case 2:
                        System.out.println("Plan actual :" + planCliente.getPlan());
                        System.out.println("Ingrese el plan nuevo");
                        String plan = leer.nextLine();
                        planCliente.setPlan(plan);
                        break;
                    case 3:
                        System.out.println("Monto actual " + planCliente.getMonto());
                        System.out.println("Ingrese el monto nuevo");
                        int monto = leer.nextInt();
                        planCliente.setMonto(monto);
                        break;
                    
                    case 4:
                        System.out.println("Fecha inicial actual " + planCliente.getFechaFin());
                        System.out.println("Ingrese la fecha nueva");
                        String fechaInicial = leer.nextLine();
                        planCliente.setFechaInicio(fechaInicial);
                        break;
                    case 5:
                        System.out.println("Fecha final actual" + planCliente.getFechaFin());
                        System.out.println("Ingrese la fecha final nueva " );
                        String fechaFinal = leer.nextLine();
                        planCliente.setFechaFin(fechaFinal);
                        break;
                    default:
                        System.out.println("ERROR VUELVA A INTENTARLO");
                        break;
                }
            }else{
                System.out.println("CLIENTE NO ENCONTRADO");
            }
        }
        
        Gerente ob3 = new Gerente(cliente);
        ob3.verMenu();

    }
    public void eliminarCliente(){

        Gerente ob3 = new Gerente(cliente);
        ob3.verMenu();
    }
    
    public void buscarInventario(){
        Gerente ob3 = new Gerente(cliente);
        ob3.verMenu();
    }
    public void eliminarInventario(){
        Gerente ob3 = new Gerente(cliente);
        ob3.verMenu();
    }
    public void editarInventario(){
        Gerente ob3 = new Gerente(cliente);
        ob3.verMenu();
    }

    public void mostrarClientes(){
        System.out.println("CLIENTES REGISTRADOR:");
        ArrayList<Cliente> listaClientes = cliente.getListaClientes();
        ArrayList<Plan> listaPlanesCliente = cliente.getPlanCliente();
        for (int i = 0; i<listaClientes.size();i++){
            Cliente nuevoCliente = listaClientes.get(i);
            Plan planCliente = listaPlanesCliente.get(i);
                System.out.println("-----------------------------");
                System.out.println("NOMBRE :" + nuevoCliente.getNombre());
                System.out.println("ID: " + nuevoCliente.getId());
                System.out.println("TIPO DE PLAN:" + planCliente.getPlan());
                System.out.println("MONTO PAGADO :" + planCliente.getMonto());
                System.out.println("FECHA INICIAL DE PLAN: " + planCliente.getFechaInicio());
                System.out.println("FECHA FINAL DE PLAN" + planCliente.getFechaFin());
        }
        Gerente ob3 = new Gerente(cliente);
        ob3.verMenu();
    }

}

    


