import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente1 = new Cliente("LUCIA lUX", "123456789");
        Cliente cliente2 = new Cliente("Ana Pingacho", "987654321");

        CuentaCorriente cuentaCorriente = new CuentaCorriente("432423432423", cliente1);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("23423423423", cliente2);

        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nInformación de la cuenta corriente:");
                    cuentaCorriente.mostrarInformacion();
                    System.out.println("\nInformación de la cuenta de ahorro:");
                    cuentaAhorro.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("\nIngrese el monto a transferir: ");
                    double montoTransferir = scanner.nextDouble();
                    if (cuentaCorriente.getSaldo() >= montoTransferir) {
                        cuentaCorriente.retirar(montoTransferir);
                        cuentaAhorro.depositar(montoTransferir);
                        System.out.println("Transferencia realizada exitosamente.");
                    } else {
                        System.out.println("Fondos insuficientes para transferir.");
                    }
                    break;

                case 3:
                    System.out.print("\nSeleccione la cuenta (1. Corriente, 2. Ahorro): ");
                    int cuentaSeleccionada = scanner.nextInt();
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetirar = scanner.nextDouble();

                    if (cuentaSeleccionada == 1) {
                        cuentaCorriente.retirar(montoRetirar);
                    } else if (cuentaSeleccionada == 2) {
                        cuentaAhorro.retirar(montoRetirar);
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;

                case 4:
                    System.out.print("\nSeleccione la cuenta (1. Corriente, 2. Ahorro): ");
                    cuentaSeleccionada = scanner.nextInt();
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDepositar = scanner.nextDouble();

                    if (cuentaSeleccionada == 1) {
                        cuentaCorriente.depositar(montoDepositar);
                    } else if (cuentaSeleccionada == 2) {
                        cuentaAhorro.depositar(montoDepositar);
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
