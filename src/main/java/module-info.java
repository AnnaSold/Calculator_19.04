module anna.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens anna.calculator to javafx.fxml;
    exports anna.calculator;
}