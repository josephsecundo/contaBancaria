public class ContaTerminall {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        String saldo = scanner.nextLine();

        System.out.println("Olá, " + nomeCliente + "! Sua conta de número " + numeroConta + " na agência " +numeroAgencia + " foi criada com sucesso!");
        System.out.println("Seu saldo é: R$ " + saldo);
    }
}
