/**
 * Clase que representa un círculo.
 */
public class Circulo extends Figura {
    private double radio;
    private int numLados = 1;

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
    }

    /**
     * Calcula el área del círculo.
     */
    @Override
    public void calcularArea() {
        this.area = Math.PI * Math.pow(radio, 2);
    }

    /**
     * Retorna el número de lados del círculo.
     */
    @Override
    public int getNumLados() {
        return numLados;
    }
}
