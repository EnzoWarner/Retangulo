
public class Main {
    public static void main(String[] args) {
        // Instanciando quatro objetos Retangulo usando cada um dos construtores disponíveis
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo(5, 10);
        Ponto ponto = new Ponto(3, 4);
        Retangulo retangulo3 = new Retangulo(ponto);
        Retangulo retangulo4 = new Retangulo(6, 8, ponto);

        // Exibindo a área de cada retângulo
        System.out.println("Área do retângulo 1: " + retangulo1.calcularArea());
        System.out.println("Área do retângulo 2: " + retangulo2.calcularArea());
        System.out.println("Área do retângulo 3: " + retangulo3.calcularArea());
        System.out.println("Área do retângulo 4: " + retangulo4.calcularArea());

        // Verificando se há interseção entre dois retângulos
        boolean interseccao12 = retangulo1.temInterseccao(retangulo2);
        System.out.println("Interseção entre retângulo 1 e retângulo 2: " + interseccao12);
    }
}