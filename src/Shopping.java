import java.util.Arrays;


public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // construtor

    public Shopping(String nome, Endereco endereco, int quantMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantMaxLojas];
    }

    // getters

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // método toString

    @Override

    public String toString() {
        return "Nome: " + nome +
                "\nEndereço: " + endereco +
                "\nQuantidade de lojas: " + Arrays.toString(lojas);
    }

    // método insereLoja

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }

        System.out.println("Não há espaço suficiente. Procedimento não concluído.");
        return false;
    }

    // método removeLoja

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                System.out.println("Loja removida com sucesso.");
                return true;
            }
        }

        System.out.println("Loja não encontrada. Procedimento não concluído.");
        return false;
    }

    // método quantidadeLojasPorTipo

    public int quantidadeLojasPorTipo(String tipoDeLoja) {
        int count = 0;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null) {
                if (tipoDeLoja.equals("Cosmético")) {
                    if (lojas[i] instanceof Cosmetico) {
                        count++;
                    }
                } else if (tipoDeLoja.equals("Vestuário")) {
                    if (lojas[i] instanceof Vestuario) {
                        count++;
                    }
                } else if (tipoDeLoja.equals("Bijuteria")) {
                    if (lojas[i] instanceof Bijuteria) {
                        count++;
                    }
                } else if (tipoDeLoja.equals("Alimentação")) {
                    if (lojas[i] instanceof Alimentacao) {
                        count++;
                    }
                } else if (tipoDeLoja.equals("Informática")) {
                    if (lojas[i] instanceof Informatica) {
                        count++;
                    }
                } else {
                    return -1; // Tipo de loja inválido
                }
            }
        }

        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0;

        for (int i = 0; i < lojas.length; i++) {
            Informatica informatica = (Informatica) lojas[i];
            double valorSeguro = informatica.getSeguroEletronicos();
            if (valorSeguro > maiorValorSeguro) {
                maiorValorSeguro = valorSeguro;
                lojaMaisCara = informatica;
            }
        }

        return lojaMaisCara;
    }

}
