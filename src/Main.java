public class Main {
    public static void main(String[] args) {

        Cliente david = new Cliente();
        david.setNome("David Moreira");

        Conta cc = new ContaCorrente(david);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(david);
        cp.depositar(200);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(50, cp);

        cp.imprimirExtrato();
        cc.imprimirExtrato();


    }
}
