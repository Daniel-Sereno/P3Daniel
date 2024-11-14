package br.unibave.geometria;

public class Retangulo extends Poligono {

    private double base, altura;

    public Retangulo(String nome, String cor, int qtdLados, double base, double altura){
        super(nome, cor, qtdLados);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(double base, double altura) {
        return base*altura;
    }

    public double calcularPerimetro(double base, double altura) {
        return 2*(base+altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
