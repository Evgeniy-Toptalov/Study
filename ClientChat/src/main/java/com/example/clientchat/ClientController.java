package com.example.clientchat;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.util.Date;

public class ClientController {

    @FXML
    public TextField messegeField;
    @FXML
    public Button sendMessegeButton;
    @FXML
    public TextArea messageTextArea;
    @FXML
    public ListView userList;

    public void appendMessegeToChat(ActionEvent actionEvent) {
        if (!messegeField.getText().isEmpty()) {
            messageTextArea.appendText(DateFormat.getDateTimeInstance().format(new Date()));
            messageTextArea.appendText(System.lineSeparator());
            if (!userList.getSelectionModel().isEmpty()){
                String sender = userList.getSelectionModel().getSelectedItems().toString();
                messageTextArea.appendText(sender + ": ");
            } else {
                messageTextArea.appendText("Я: ");
            }
            messageTextArea.appendText(messegeField.getText().trim());
            messageTextArea.appendText(System.lineSeparator());
            messageTextArea.appendText(System.lineSeparator());
            messegeField.setFocusTraversable(true);
            requestFocus();
            messegeField.clear();
        }

    }

    private void requestFocus() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                messegeField.requestFocus();
            }
        });
    }
}