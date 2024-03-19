public class Multiplicacion extends Operacion{

    public double resultado() {
        return num1*num2;
    }

    public Multiplicacion(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public double mostrarResultado() {
        //return super.mostrarResultado();
        return resultado();
    }
/*
    // atributos
    private int num1;
    private int num2;

    //constructor vacio

    public Multiplicacion() {
    }

    //constructor
    public Multiplicacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    //metodo
    public int mostrarResultado() {
        return num1*num2;
    }

 */
}
