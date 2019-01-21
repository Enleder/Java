package MundoPc;

public class Monitor {

    private int idMonitor;
    private String Marca;
    private double tamanio;
    private int contadorMonitores;

    public Monitor (){
        contadorMonitores = ++contadorMonitores
    };

    public Monitor (String m, double t){
        this();
        this.Marca = m;
        this.tamanio = t;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return Marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", Marca='" + Marca + '\'' +
                ", tamanio=" + tamanio +
                ", contadorMonitores=" + contadorMonitores +
                '}';
    }
}
