module com.example.samplequiz1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.samplequiz1 to javafx.fxml;
    exports com.example.samplequiz1;
}