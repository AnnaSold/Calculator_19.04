package anna.calculator;

import java.util.MissingFormatArgumentException;

public class Recktangle {
    double a, b;

    public Recktangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static double calculateAreaRecktangle(double a, double b) {
        if ((a < 0) || (b < 0)) try {
            throw new NullExeption("Вы не ввели значение");
        } catch (NullExeption e) {
            throw new RuntimeException(e);
        }
        double area = 0;
        area = a * b;
        return area;
    }
}
