import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Inicialização de dados da conta, futuramente, utilizarei listas ou DB*/
        String nome = "Josevaldo Silvestre Ciqueira";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 1325.23;

        for (int i = 0; i < 10; i++) {
            System.out.printf("*");
        }
        System.out.println();
        System.out.printf("""
                Nome:            %s
                Tipo conta:      %s
                Saldo inicial:   %.2f
                """, nome, tipoDeConta, saldoDaConta);
        for (int i = 0; i < 10; i++) {
            System.out.printf("*");
        }
        //Fim Inicialização de dados do cliente
        System.out.println("\n");

        int operacoes;
        double deposito;
        double transferencia;

        Scanner leitor = new Scanner(System.in);

        do {

            deposito = 0;
            transferencia = 0;

            System.out.printf("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:\n""");

            operacoes = leitor.nextInt();
            System.out.println();

            switch (operacoes){
                case 1:
                    System.out.printf("O valor disponível na conta é de R$%.2f\n", saldoDaConta);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    deposito = leitor.nextDouble();
                    if (deposito < 0){
                        System.out.println("Operação inválida.");
                    } else {
                        saldoDaConta += deposito;
                        System.out.printf("Saldo atualizado: R$%.2f\n", saldoDaConta);
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    transferencia = leitor.nextDouble();
                    if ((saldoDaConta-transferencia) < 0){
                        System.out.println("Saldo insuficiente!");
                    } else if (transferencia < 0) {
                        System.out.println("Operação Inválida!");
                    } else {
                        saldoDaConta -= transferencia;
                        System.out.printf("Saldo atualizado: R$%.2f", saldoDaConta);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();

        } while (operacoes != 4);



    }


}
