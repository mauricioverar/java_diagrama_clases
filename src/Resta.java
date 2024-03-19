public class Resta extends Operacion {
    //att
    //double resta;

//    public Resta(int num1, int num2, double resta) {
//        super(num1, num2);
//        this.resta = resta;
//    }
     //constructor
    public Resta(int num1, int num2) {
        super(num1, num2);
    }

    public double resultado() {
        return num1-num2;
    }

    @Override
    public double mostrarResultado() {
        //return super.mostrarResultado();
        return resultado();
    }
}
