public class RightTriangle {
    double sideA;
    double sideB;

    public RightTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public static void main(String[] args) {
        RightTriangle triangle0 = new RightTriangle(1, 50);
        triangle0.calculateHypotenuse();
        RightTriangle triangle1 = new RightTriangle(85, 85.3);
        triangle1.calculateCathetus();
    }

    public void calculateHypotenuse() {
        if (sideA <= 0) {
            throw new IllegalArgumentException("sideA must be greater than 0.");
        } else if (sideB <= 0) {
            throw new IllegalArgumentException("sideB must be greater than 0.");
        }
        System.out.println("Hypotenuse | " + Math.hypot(sideA, sideB));
    }

    public void calculateCathetus() {
        double squaredCathetus;
        if (sideA == sideB) {
            throw new IllegalArgumentException("Hypotenuse and cathetus should not be equal.");
        } else if (sideA <= 0) {
            throw new IllegalArgumentException("sideA must be greater than 0.");
        } else if (sideB <= 0) {
            throw new IllegalArgumentException("sideB must be greater than 0.");
        }
        squaredCathetus = Math.pow(Math.max(sideA, sideB), 2) - Math.pow(Math.min(sideA, sideB), 2);
        System.out.println("Cathetus   | " + Math.sqrt(squaredCathetus));
    }
}
