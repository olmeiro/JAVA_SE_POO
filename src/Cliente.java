import java.util.Objects;

public class Cliente {

    private String name;
    private String n_cuenta;
    private double saldo;

    public Cliente(String name, String n_cuenta, double saldo) {
        this.name = name;
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(n_cuenta, cliente.n_cuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(n_cuenta);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
