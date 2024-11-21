
class CuentaAhorro extends CuentaBancaria {
    private static final double SALDO_MINIMO = 100;

    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(500, numeroCuenta, cliente);
    }

    @Override
    public void retirar(double monto) {
        if (getSaldo() - monto >= SALDO_MINIMO) {
            actualizarSaldo(getSaldo() - monto);
            System.out.println("Retiro exitoso. Nuevo saldo: $" + getSaldo());
        } else {
            System.out.println("No se puede retirar. El saldo debe ser mayor o igual a $" + SALDO_MINIMO);
        }
    }
}
