import java.util.Scanner;

public class SimpletronSimulador {
    public static void main(String[] args) {
        int[] memoria = new int[100];
        int ubicacion = 0;

        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instruccion ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(String.format("%02d ?", ubicacion));
            int dato = scanner.nextInt();
            memoria[ubicacion] = dato;

            if (dato == -9999) {
                System.out.println("*** Se completo la carga del programa ***");
                break;
            }

            ubicacion++;
        }

        int contador = 0;
        System.out.println("*** Empieza la ejecucion del programa ***");

        while (true) {
            int instruccion = memoria[contador];
            int opcode = instruccion / 100;
            int operandos = instruccion % 100;

            if (opcode == 43) {
                System.out.println("*** La ejecucion del programa ha finalizado ***");
                break;
            }

            contador++;
        }
    }
}