module projeto.java {
    requires javafx.controls;
    requires javafx.fxml;

    opens projeto.java to javafx.fxml;
    exports projeto.java;
}
