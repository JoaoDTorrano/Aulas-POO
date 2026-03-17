import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        cliente1.setNome("Willian");
        cliente1.setCpf(456850321);
        cliente2.setNome("Juan");
        cliente2.setCpf(616842321);
        cliente3.setNome("Joao");
        cliente3.setCpf(214142241);

        conta1.setCliente(cliente1);
        conta2.setCliente(cliente2);
        conta3.setCliente(cliente3);

        conta1.setSaldo(1000);
        conta2.setSaldo(5000);
        conta3.setSaldo(2500);

        conta1.setLimite(500);
        conta2.setLimite(2500);
        conta3.setLimite(1250);

        System.out.println("Saldo atual: ");
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());

        conta1.sacar(500);
        conta2.sacar(500);
        conta3.sacar(1000);

        System.out.println("Saldo depois do saque: ");
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());

        conta1.deposita(1000);
        conta2.deposita(1000);
        conta3.deposita(1000);

        System.out.println("Saldo depois de depositar: ");
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());

    }
}
