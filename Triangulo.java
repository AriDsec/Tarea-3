/**
 * Clase que representa un triángulo.
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;
    private int numLados = 3;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    public Triangulo(int i, int j, int k) {
    }

    /**
     * Calcula el área del triángulo.
     */
    @Override
    public void calcularArea() {
        this.area = (base * altura) / 2;
    }

    /**
     * Retorna el número de lados del triángulo.
     */
    @Override
    public int getNumLados() {
        return numLados;
    }
}
