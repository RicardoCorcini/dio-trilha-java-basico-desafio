import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Informações de operação a serem impressas na tela
        System.out.println("Após informar os dados solicitados precione a tecla ENTER");

        //iniciando o objeto scaner com local padrao US
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitando dados ao cliente
        //solicitando numero da conta
        System.out.println("Digite o Número de sua conta: ");
        int numero = scanner.nextInt();

        //solicitando número da agência
        System.out.println("Digite número de sua Agência: ");
        String agencia= scanner.next();

        //Solicitando o bnme completo do cliente
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente= scanner.next();

        //Solicitanqo que o cliente informe o saldo em conta
        System.out.println("Informe so seu saldo: ");
        double saldo = scanner.nextDouble();

        //As informações serão impressa na tela do termina
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "  + numero + " e seu saldo "+ saldo + " já está disponível para saque.");



    }
}
