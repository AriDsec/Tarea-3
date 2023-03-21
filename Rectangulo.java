
/**
 * Clase que representa un rectángulo.
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    private int numLados = 4;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    /**
     * Calcula el área del rectángulo.
     */
    @Override
    public void calcularArea() {
        this.area = base * altura;
    }

    /**
     * Retorna el número de lados del rectángulo.
     */
    @Override
    public int getNumLados() {
        return numLados;
    }
}
