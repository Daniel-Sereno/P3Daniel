package br.unibave.geometria;

public class Circulo extends Forma {
    private double raio;
    public Circulo (String nome, String cor, double raio){
        super(nome, cor);
        this.raio = raio;
    }


    public double calcularArea(double raio) {
        return (3.14*raio*raio);
    }

    public double calcularPerimetro(double raio) {
        return (2*3.14*raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
