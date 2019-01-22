package MundoPc;

public class Computadora {


    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    //Constructor vacio
    public Computadora(){idComputadora = ++idComputadora;}

    //Constructor completo
    public Computadora(String n, Monitor m, Teclado t, Raton r){
        this(); //llamada al constructor por defecto que inicializa el contador de id.
        this.nombre = n;
        this.monitor = m;
        this.teclado = t;
        this.raton = r;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Teclado getTeclado() { return teclado; }

    public Raton getRaton() {
        return raton;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", monitor=" + monitor +
                ", teclado=" + teclado +
                ", raton=" + raton +
                '}';
    }
}
