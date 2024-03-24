import java.util.ArrayList;
public class Cliente {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Plan> planCliente = new ArrayList<>();
    private int id;
    private String nombre;

    public Cliente() {
        
    }
    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }


    public ArrayList<Plan> getPlanCliente() {
        return planCliente;
    }

    public void planCliente(Plan plan) {
        planCliente.add(plan);
    }

    public void listaClientes(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
}