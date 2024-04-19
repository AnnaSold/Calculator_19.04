package anna.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.MissingFormatArgumentException;

public class HelloController {
    @FXML
    Label label1;
    @FXML
    TextField field1;
    @FXML
    TextField field2;

    public void doPlus() {
        System.out.println("+");
        label1.setText("+");
        int num1 = Integer.parseInt(field1.getText());
        int num2 = Integer.parseInt(field2.getText());
        double result = num1 + num2;
        label1.setText(String.valueOf(result));
    }

    public void doMinus() {
        System.out.println("+");
        label1.setText("+");
    }

    public void calculateAreaRecktangle() throws NullExeption {
        double result = 0;

        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());
            if ((num1 <0 ) || (num2 <0)) throw new NullExeption("Вы не ввели значение");
            result = Recktangle.calculateAreaRecktangle(num1, num2);
            label1.setText(String.valueOf(result));
        } catch (NullPointerException e) {
            String s = e.getMessage();
            label1.setText(s);
        }

    }
}