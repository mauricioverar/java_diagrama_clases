public class Division extends Operacion{
    public Division(int num1, int num2) {
        super(num1, num2);
    }

    public double resultado() {
        return num1/num2;
    }

    @Override
    public double mostrarResultado() {
        //return super.mostrarResultado();
        return resultado();
    }
}
