public class Retangulo {
    private float altura;
    private float largura;

    public Retangulo() {
        this.altura = 0;
        this.largura = 0;
    }

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo(Ponto o) {
        this.altura = 0;
        this.largura = 0;
    }

    public Retangulo(float altura, float largura, Ponto o) {
        this.altura = altura;
        this.largura = largura;
    }

    public float calcularArea() {
        return altura * largura;
    }

    public boolean temInterseccao(Retangulo r) {
        return false;
    }
}
