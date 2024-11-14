package br.unibave.geometria;

public class Forma {

    private String nome;
    private String cor;

    public Forma(){

    }
    public Forma(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }



    public double calcularArea(){
        return 1.11;
    }
    public double calcularPerimetro() {
        return 1.11;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "cor='" + cor + '\'' +
                ", Forma='" + nome + '\'' +
                '}';
    }
}



