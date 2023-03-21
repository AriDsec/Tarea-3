public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Figura
        Figura rectangulo = new Rectangulo(4, 5);
        Figura circulo = new Circulo(3);
        Figura triangulo = new Triangulo(3, 4, 5);

        // Imprimir las áreas de las figuras
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        // Comparar dos figuras por su área y número de lados
        int comparacion = rectangulo.compareTo(circulo);
        if (comparacion > 0) {
            System.out.println("El rectángulo tiene mayor área que el círculo.");
        } else if (comparacion < 0) {
            System.out.println("El círculo tiene mayor área que el rectángulo.");
        } else {
            System.out.println("El rectángulo y el círculo tienen la misma área.");
        }

        // Comparar dos figuras por su área y número de lados
        comparacion = triangulo.compareTo(rectangulo);
        if (comparacion > 0) {
            System.out.println("El triángulo tiene mayor área que el rectángulo.");
        } else if (comparacion < 0) {
            System.out.println("El rectángulo tiene mayor área que el triángulo.");
        } else {
            System.out.println("El triángulo y el rectángulo tienen la misma área.");
        }
    }
}

