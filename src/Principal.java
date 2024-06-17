import java.util.Scanner;
public class Principal {

// método main

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaração das variáveis

        Endereco endereco;
        Data dataFundacao;
        Data dataValidade;
        Data data;
        Produto produto = null;
        Loja loja1 = null;
        int diavalidade = 1;
        int mesvalidade = 1;
        int anovalidade = 1;
        int dia = 1;
        int mes = 1;
        int ano = 1;

        // Menu
        System.out.println("MENU");
        while (true) {
            System.out.println("(1) criar uma loja!");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.println("Você deseja: ");
            String menu = input.nextLine();

            // Condições do menu

            if (menu.equals("1")) { // Criar uma loja

                System.out.println("Informe os dados da sua loja: ");

                System.out.println("Nome: ");
                String nome = input.nextLine();

                System.out.println("Quantidade de funcionários: ");
                int quantfunc = input.nextInt();
                input.nextLine();

                System.out.println("Salário base dos funcionários: ");
                double salariobase = input.nextDouble();
                input.nextLine();

                System.out.println("Quantidade do estoque: ");
                int quantMaxProduto = input.nextInt();
                input.nextLine();

                // Data de Fundação

                System.out.println("Data de fundação: ");

                System.out.println("Dia: ");
                dia = input.nextInt();
                input.nextLine();

                System.out.println("Mês: ");
                mes = input.nextInt();
                input.nextLine();

                System.out.println("Ano: ");
                ano = input.nextInt();
                input.nextLine();

                // Endereço

                System.out.println("Dados do endereço: ");

                System.out.println("Nome da rua: ");
                String rua = input.nextLine();

                System.out.println("Cidade: ");
                String cidade = input.nextLine();

                System.out.println("Estado: ");
                String estado = input.nextLine();

                System.out.println("País: ");
                String pais = input.nextLine();

                System.out.println("Cep: ");
                String cep = input.nextLine();

                System.out.println("Número: ");
                String numero = input.nextLine();

                System.out.println("Complemento: ");
                String complemento = input.nextLine();


                dataFundacao = new Data(dia, mes, ano);
                endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
                loja1 = new Loja(nome, quantfunc, salariobase, endereco, dataFundacao, quantMaxProduto);

                loja1.setNome(nome);
                loja1.setQuantidadeFuncionarios(quantfunc);
                loja1.setSalarioBaseFuncionario(salariobase);
                loja1.setEndereco(endereco);
                loja1.setDataFundacao(dataFundacao);
                loja1.setQuantMaxProduto(quantMaxProduto);

                // criar produto

            } else if (menu.equals("2")) {
                System.out.println("Informe os dados do seu produto: ");

                System.out.println("Nome: ");
                String nomeproduto = input.nextLine();

                System.out.println("Preço: ");
                double preco = input.nextDouble();
                input.nextLine();

                // Data de Validade

                System.out.println("Data de validade: ");

                System.out.println("Dia: ");
                diavalidade = input.nextInt();
                input.nextLine();

                System.out.println("Mês: ");
                mesvalidade = input.nextInt();
                input.nextLine();

                System.out.println("Ano: ");
                anovalidade = input.nextInt();
                input.nextLine();

                dataValidade = new Data(diavalidade, mesvalidade, anovalidade);
                produto = new Produto(nomeproduto, preco, dataValidade);
                produto.setNome(nomeproduto);
                produto.setPreco(preco);
                produto.setDataValidade(dataValidade);

            } else if (menu.equals("3")) {
                break;
            } else {
                System.out.println("Opção inválida! Escolha uma opção válida!");
            }
        }

        // Saída de dados da loja:

        System.out.println("\nInformações da loja: ");

        if (loja1 != null) {
            System.out.println(loja1);

            Data anobissextoloja = new Data(dia, mes, ano);
            System.out.println("O ano de fundação é bissexto ? " + (anobissextoloja.verificaAnoBissexto() ? "Sim" : "Não"));
        }

        // Saída de dados do produto:

        System.out.println("\nInformações do produto: ");
        if (produto != null) {
            System.out.println(produto);

            // Método estaVencido

            dataValidade = new Data(diavalidade, mesvalidade, anovalidade);
            System.out.println("Produto está vencido? " + (Produto.estaVencido(dataValidade) ? "Está vencido" : "Não está vencido"));

            //Método VerificaAnoBissexto

            Data anobissextoproduto = new Data(diavalidade, mesvalidade, anovalidade);
            System.out.println("O ano da validade é bissexto ? " + (anobissextoproduto.verificaAnoBissexto() ? "Sim" : "Não"));
        }
    }
}