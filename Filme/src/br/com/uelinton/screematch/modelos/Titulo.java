package br.com.uelinton.screematch.modelos;

public class Titulo {
    private  String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private double mediaDasAvaliacoes;


    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setMediaDasAvaliacoes(double mediaDasAvaliacoes) {
        this.mediaDasAvaliacoes = mediaDasAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes ++;
        mediaDasAvaliacoes = somaAvaliacoes/totalDeAvaliacoes;
    }

    public double pegaMedia(){
        return somaAvaliacoes/totalDeAvaliacoes;
    }


}
