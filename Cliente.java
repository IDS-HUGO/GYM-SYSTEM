import java.util.ArrayList;
public class Cliente {
    private ArrayList listClientes = new ArrayList<String>();
    private ArrayList planCliente = new ArrayList<String>();
    private int id;
    private String nombre;
    
    public ArrayList getListClientes() {
        return listClientes;
    }
    public void setListClientes(ArrayList listClientes) {
        this.listClientes = listClientes;
    }
    public ArrayList getPlanCliente() {
        return planCliente;
    }
    public void setPlanCliente(ArrayList planCliente) {
        this.planCliente = planCliente;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
