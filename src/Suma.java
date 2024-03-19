public class Suma extends Operacion {

    // constructor
    public Suma(int num1, int num2) {
        super(num1, num2);
    }

    public double resultado() {
        return num1+num2;
    }

    @Override
    public double mostrarResultado() {
        //return super.mostrarResultado();
        return resultado();
    }

    /* @Override
    public double mostrarResultado(int num1, int num2) {
        super.mostrarResultado(num1, num2);
        int resultado = mostrarResultado(num1 + num2);
        System.out.println("la suma " + num1 + "+" + num2 + " = " + resultado);
    } */
}
