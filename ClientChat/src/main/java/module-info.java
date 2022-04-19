module com.example.clientchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clientchat to javafx.fxml;
    exports com.example.clientchat;
}