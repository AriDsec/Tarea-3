/**
 * Creador: Ariel Fernandez Chacon
 * version: 1.1.0
 * Fecha ultima modificacion: 20/03/23 Hora: 11:00 pm
 * 
 * 
 * Definicion de las clases:
 * Clase abstracta que representa una figura geométrica.
 */
public abstract class Figura implements Comparable<Figura> {
    protected double area;

    /**
     * Calcula el área de la figura.
     */
    public abstract void calcularArea();

    /**
     * Retorna el número de lados de la figura.
     */
    public abstract int getNumLados();

    /**
     * Compara la figura actual con otra figura por su área y número de lados.
     * @param otraFigura La figura a comparar con la figura actual.
     * @return -1 si la figura actual es menor, 0 si son iguales, 1 si la figura actual es mayor.
     */
    @Override
    public int compareTo(Figura otraFigura) {
        if (this.area < otraFigura.area) {
            return -1;
        } else if (this.area > otraFigura.area) {
            return 1;
        } else { // Si tienen la misma área, se compara por número de lados
            if (this.getNumLados() < otraFigura.getNumLados()) {
                return -1;
            } else if (this.getNumLados() > otraFigura.getNumLados()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
