public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();


        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "João";


        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);
    }
}
