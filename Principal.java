import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
               
                System.out.println("Digite o nome da loja:");
                String nome = scanner.nextLine();

                System.out.println("Digite a quantidade de funcionários:");
                int quantidadeFuncionario = scanner.nextInt();
                scanner.nextLine();  

                System.out.println("Digite o salário base dos funcionários:");
                double salarioFuncionario = scanner.nextDouble();
                scanner.nextLine();  

                System.out.println("Digite o nome da rua:");
                String nomeDaRua = scanner.nextLine();

                System.out.println("Digite a cidade:");
                String cidade = scanner.nextLine();

                System.out.println("Digite o estado:");
                String estado = scanner.nextLine();

                System.out.println("Digite o país:");
                String pais = scanner.nextLine();

                System.out.println("Digite o CEP:");
                String cep = scanner.nextLine();

                System.out.println("Digite o número:");
                String numero = scanner.nextLine();

                System.out.println("Digite o complemento:");
                String complemento = scanner.nextLine();

                Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

                System.out.println("Digite o dia de fundação:");
                int dia = scanner.nextInt();

                System.out.println("Digite o mês de fundação:");
                int mes = scanner.nextInt();

                System.out.println("Digite o ano de fundação:");
                int ano = scanner.nextInt();

                Data dataFundacao = new Data(dia, mes, ano);

                System.out.println("Digite a quantidade máxima de produtos no estoque:");
                int maxProdutos = scanner.nextInt();

                Loja loja = new Loja(nome, quantidadeFuncionario, salarioFuncionario, endereco, dataFundacao, maxProdutos);

                System.out.println("Loja criada com sucesso:");
                System.out.println(loja);

            } else if (opcao == 2) {
                System.out.println("Digite o nome do produto:");
                String nome = scanner.nextLine();

                System.out.println("Digite o preço do produto:");
                int preco = scanner.nextInt();

                System.out.println("Digite o dia de validade:");
                int diaValidade = scanner.nextInt();

                System.out.println("Digite o mês de validade:");
                int mesValidade = scanner.nextInt();

                System.out.println("Digite o ano de validade:");
                int anoValidade = scanner.nextInt();

                Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

                Produto produto = new Produto(nome, preco, dataValidade);

                Data dataAtual = new Data(20, 10, 2023);
                if (produto.estaVencido(dataAtual)) {
                    System.out.println("PRODUTO VENCIDO");
                } else {
                    System.out.println("PRODUTO NÃO VENCIDO");
                }

                System.out.println("Produto criado com sucesso:");
                System.out.println(produto);

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}
