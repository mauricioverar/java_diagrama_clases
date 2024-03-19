public class Operacion {
    // atributos
    protected int num1;
    protected int num2;

    // constructor vacio // no es necesario
    public Operacion() {
    }

    // constructor (puede tener otro nombre)
    public Operacion(int num1, int num2) {
        this.num1 = num1; // guardar los atributos protegidos en vars num1 y num2
        this.num2 = num2;
    }

    // metodo
    public double mostrarResultado() { // double para resultado de division
        return 0; // acá debe ir el sout
    }

    // getter y setter (se pueden llamar de otra manera, por convencion se usa get y set)
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
