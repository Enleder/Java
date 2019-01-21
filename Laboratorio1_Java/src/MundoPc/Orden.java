package MundoPc;

public class Orden {

    private int idOrdden;
    //Declaracion del arreglo de computadoras
    private final Computadora computadoras[];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private static final int maxComputadoras = 100;

    public Orden() {

        this.idOrdden = ++idOrdden;
        //Se instancia el arreglo de computadoras
        computadoras = new Computadora[maxComputadoras];
    }

    public agregarComputadora (Computadora c){

        if(contadorComputadoras < maxComputadoras){//Si las computadoras no superan el maximo del arreglo

            computadoras[contadorComputadoras++] = c; //incrementamos el contador de computadoras (porque empieza en 0) y agregamos una computadora.

        }else {

            system.out.println("Se ha superado el maximo de computadoras: " + maxComputadoras);
        }


    }

}
