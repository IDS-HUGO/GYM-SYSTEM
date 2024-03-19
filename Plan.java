public class Plan{
    private int monto;
    private String fechaInicio;
    private String fechaFin;
    private String plan;
    
    public Plan(int monto,String plan,String fechaInicio,String fechaFin){
        this.plan = plan;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getPlan() {
        return plan;
    }
    public int getMonto() {
        return monto;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public String getFechaFin() {
        return fechaFin;
    }

}