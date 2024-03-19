import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variables
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        boolean flag = true;

        // menu
        while (flag) {
            System.out.println("*** Calculadora ***");
            System.out.println("ingrese 1_Sumar");
            System.out.println("ingrese 2_Restar");
            System.out.println("ingrese 3_Dividir");
            System.out.println("ingrese 4_Multiplicar");

            System.out.println("Ingrese opcion");
            try {
            int opcion = leer.nextInt();

            

            // int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        for (int i = 0; i < 5; i++) { // 5 segundos
                            Thread.sleep(1000);
                            System.out.println("Sleep " + i);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("ingrese primer numero");
                    num1 = leer.nextInt();
                    System.out.println("ingrese segundo numero");
                    num2 = leer.nextInt();
                    Suma suma = new Suma(num1, num2);
                    System.out.println("La suma es: " + suma.mostrarResultado());
                    break;
                case 2:
                    System.out.println("ingrese primer numero");
                    num1 = leer.nextInt();
                    System.out.println("ingrese segundo numero");
                    num2 = leer.nextInt();
                    Resta resta = new Resta(num1, num2);
                    System.out.println("La resta es: " + resta.mostrarResultado());
                    break;
                case 3:
                    System.out.println("ingrese primer numero");
                    num1 = leer.nextInt();
                    System.out.println("ingrese segundo numero");
                    num2 = leer.nextInt();
                    Division dividir = new Division(num1, num2);
                    System.out.println("La division es: " + dividir.mostrarResultado());
                    break;
                case 4:
                    System.out.println("ingrese primer numero");
                    num1 = leer.nextInt();
                    System.out.println("ingrese segundo numero");
                    num2 = leer.nextInt();
                    Multiplicacion multiplicar = new Multiplicacion(num1, num2);
                    System.out.println("La multiplicacion es: " + multiplicar.mostrarResultado());
                    break;
                default:
                    System.out.println("opcion no existe");
                    break;
            }

            } catch (Exception e) {
            System.out.println(" ingrese solo numero de opcion");
        }

            leer.nextLine();
            System.out.println("Si desa continuar con otra opercacion ingrese s, sino Enter u otro caracter");
            String respuesta = leer.nextLine();
            if (respuesta.equals("s")) {
                flag = true;
            } else {
                System.out.println("Muchas gracias");
                flag = false;
            }
        }
        leer.close();
        do {

        } while(opcion !=0);

    }

}