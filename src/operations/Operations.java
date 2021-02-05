package operations;

public class Operations {

    public static double calcul(double a, double b, char operator) {
        return operator =='+' ? a + b : operator =='-' ? a - b : operator =='/' ? a / b : a * b;
    }
}
