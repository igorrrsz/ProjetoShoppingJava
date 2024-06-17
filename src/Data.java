public class Data {
    // definição dos atributos

    private int dia;
    private int mes;
    private int ano;

    // método construtor

    public Data(int dia, int mes, int ano) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else {
            System.out.println("A data inserida é inválida! Setando para a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public Data() {
        this.dia = 20;
        this.mes = 10;
        this.ano = 2023;
    }

    // métodos de acesso

    // getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // setters

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // método verificador do ano bissexto
    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) { // Verifica se é bissexto
            return true; // é bissexto
        }
        else {
            return false; // não é bissexto
        }
    }
    // método verificador da data

    private boolean verificaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false; // verifica se o mês é válido
        }
        if (dia < 1) {
            return false; // verifica se o dia é positivo

        }
        if (ano < 1) { // verifica se o ano é positivo
            return false;
        }

        if (mes == 2 && verificaAnoBissexto()) {
            return dia <= 29; // Fevereiro tem 29 dias em anos bissextos
        }
        else if (mes == 2) {
            return dia <= 28; // Fevereiro tem 28 dias em anos não bissextos
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        else {
            return dia <= 31;
        }
    }

    // método to String

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

}


