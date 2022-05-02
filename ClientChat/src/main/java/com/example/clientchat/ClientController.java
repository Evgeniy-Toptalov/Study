package com.example.clientchat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class ClientController {
/*
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

 */

    @FXML
    public TextField messageTextArea;


    @FXML
    public Button sendMessageButton;


    @FXML
    public TextArea chatTextArea;


    @FXML
    public ListView userList;

    private Network network;
    private ClientChat application;

    public void sendMessage() {
        String message = messageTextArea.getText();
        chatTextArea.appendText(DateFormat.getTimeInstance().format(new Date()) + " ");
        messageTextArea.requestFocus();
        appendMessageToChat(message);
        try {
            network.sendMessage(message);
        } catch (IOException e) {
            application.showErrorDialog("Ошибка передачи данных по сети");
        }
    }

    public void appendMessageToChat(String message) {
        if (!message.isEmpty()) {
            chatTextArea.appendText(message);
            chatTextArea.appendText(System.lineSeparator());
            messageTextArea.clear();
        }
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
        network.waitMessages(new Consumer<String>() {
            @Override
            public void accept(String message) {
                appendMessageToChat(message);
            }
        });
    }

    public ClientChat getApplication() {
        return application;
    }

    public void setApplication(ClientChat application) {
        this.application = application;
    }



}