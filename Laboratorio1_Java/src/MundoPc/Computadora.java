package MundoPc;

public class Computadora {


    private int idComputadora;
    private String nombre;
    private monitor monitor;
    private teclado teclado;
    private raton raton;

    //Constructor vacio
    public Computadora(){idComputadora = ++idComputadora};

    //Constructor completo
    public Computadora(String n, monitor m, teclado t, raton r){
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

    public monitor getMonitor() {
        return monitor;
    }

    public teclado getTeclado() {
        return teclado;
    }

    public raton getRaton() {
        return raton;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(monitor monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(teclado teclado) {
        this.teclado = teclado;
    }

    public void setRaton(raton raton) {
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
