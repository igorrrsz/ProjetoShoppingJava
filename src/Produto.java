public class Produto {
    // definição dos atributos
    private String nome;
    private double preco;
    private Data dataValidade;


    // método construtor

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }


    // métodos de acesso

    // getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }


    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nPreço: R$ " + String.format("%.2f", preco) +
                "\nData de validade : " + dataValidade;
    }

    public static boolean estaVencido(Data dataValidade) {
        Data dataAtual = new Data();

        // Compara a data de validade com a data atual
        if (dataValidade.getAno() < dataAtual.getAno() || (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() < dataAtual.getMes()) || (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() < dataAtual.getDia())) {
            return true; // Está vencido
        } else {
            return false; // Não está vencido
        }
    }
}

