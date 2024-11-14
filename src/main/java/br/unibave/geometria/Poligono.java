package br.unibave.geometria;

public class Poligono extends Forma {

    private int qtdLados;

    public Poligono(String nome, String cor, int qtdLados){
        super(nome, cor);
        this.qtdLados = qtdLados;
    }

    @Override
    public double calcularArea() {
        return 2.22;
    }

    @Override
    public double calcularPerimetro(){
        return 2.22;
    }

    public int getQtdLados() {
        return qtdLados;
    }

    public void setQtdLados(int qtdLados) {
        this.qtdLados = qtdLados;
    }
}
