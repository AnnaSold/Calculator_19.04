package anna.calculator;

import java.util.MissingFormatArgumentException;

public class Recktangle {
    double a, b;

    public Recktangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static double calculateAreaRecktangle(double a, double b) throws NullExeption {
        if ((a < 0) || (b < 0))
            throw new NullExeption("Вы не ввели значение");

        double area = 0;
        area = a * b;
        return area;


}
}
