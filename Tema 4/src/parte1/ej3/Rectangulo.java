package parte1.ej3;

public class Rectangulo {
    // Atributos
    private int x1 = 0;
    private int x2 = 0;
    private int y1 = 0;
    private int y2 = 0;

    // Override
    @Override
    public String toString() {
        return "Rectángulo: (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")";
    }

    // Ancho valor absoluto
    public int getAncho() {
        return Math.abs(x2 - x1);
    }

    // Alto valor absoluto
    public int getAlto() {
        return Math.abs(y2 - y1);
    }

    // Perimetro
    public int getPerimetro() {
        return 2 * (getAlto() + getAncho());
    }

    // Area
    public int getArea() {
        return getAlto() * getAncho();
    }

    // Constructor
    public Rectangulo(int x1, int y1, int x2, int y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    // Getters
    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    // Setters
    public void setX1(int x1) {
        if (x1 >= 0) {
            this.x1 = x1;
        } else {
            throw new IllegalArgumentException("x1 no puede ser negativo.");
        }
    }

    public void setX2(int x2) {
        if (x2 >= 0) {
            this.x2 = x2;
        } else {
            throw new IllegalArgumentException("x2 no puede ser negativo.");
        }
    }

    public void setY1(int y1) {
        if (y1 >= 0) {
            this.y1 = y1;
        } else {
            throw new IllegalArgumentException("y1 no puede ser negativo.");
        }
    }

    public void setY2(int y2) {
        if (y2 >= 0) {
            this.y2 = y2;
        } else {
            throw new IllegalArgumentException("y2 no puede ser negativo.");
        }
    }
}
