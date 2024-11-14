package br.unibave.geometria;

public class Triangulo extends Poligono {
    private double base, lado1, lado2, altura;

    public Triangulo(String nome, String cor, int qtdLados, double base, double lado1, double lado2, double altura){
        super(nome, cor, qtdLados);
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }


    public double calcularArea(double base, double altura) {
        return (base*altura)/2;
    }

    public double calcularPerimetro(double base, double lado1, double lado2) {
        return base+lado1+lado2;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
