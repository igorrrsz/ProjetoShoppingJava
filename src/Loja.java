public class Loja {

    // definição dos atributos

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private int quantMaxProduto;
    private Produto[] estoqueProdutos;

    // métodos construtores

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantMaxProdutos];
    }



    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantMaxProdutos];
    }

    // métodos de entrada

    // getters
    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        if (salarioBaseFuncionario == 0.0) {
            return -1;
        } else {
            return salarioBaseFuncionario;
        }
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public int getQuantMaxProduto() {
        return quantMaxProduto;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void setQuantMaxProduto(int quantMaxProduto){
        this.quantMaxProduto = quantMaxProduto;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // método toString

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nQuantidade de funcionários: " + quantidadeFuncionarios +
                "\nSalário base dos funcionários: R$ " + String.format("%.2f", salarioBaseFuncionario) +
                "\nGastos com salário: R$ " + String.format("%.2f", gastosComSalario()) +
                "\nTamanho da loja: " + tamanhoDaLoja() +
                "\nQuantidade de produtos: " + quantMaxProduto +
                "\n" + endereco +
                "\nData de fundação: " + dataFundacao;

    }

    // método gastosComSalario

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
    }

    // método tamanhoDaLoja

    public char tamanhoDaLoja () {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <=30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    // método imprimeProdutos

    public void imprimeProdutos(){
        System.out.println("Produtos da loja:");
        for (int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] !=  null){
                System.out.println(estoqueProdutos[i]);
            }
        }
    }

    // método insereProduto
    public boolean insereProduto(Produto produto){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }

        System.out.println("Estoque cheio. Procedimento não concluído. ");
        return false;
    }

    // método removeProduto

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                System.out.println("Produto removido com sucesso.");
                return true;
            }
        }

        System.out.println("Produto não encontrado no estoque. Procedimento não concluído.");
        return false;
    }

}












