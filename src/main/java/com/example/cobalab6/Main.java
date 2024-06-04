package com.example.cobalab6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private static final String USERNAME = "Dani";
    private static final String PASSWORD = "666";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form Login");

        GridPane loginGrid = new GridPane();
        loginGrid.setHgap(10);
        loginGrid.setVgap(10);
        loginGrid.setPadding(new Insets(0, 0, 0, 20));

        // Label "Halaman Login"
        Label loginTitleLabel = new Label("Halaman Login");
        loginTitleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        loginGrid.add(loginTitleLabel, 0, 0, 2, 1);

        Label userNameLabel = new Label("User Name:");
        TextField userNameField = new TextField();
        loginGrid.add(userNameLabel, 0, 1);
        loginGrid.add(userNameField, 1, 1);

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        loginGrid.add(passwordLabel, 0, 2);
        loginGrid.add(passwordField, 1, 2);

        Label messageLabel = new Label();
        messageLabel.setStyle("-fx-text-fill: red;");
        loginGrid.add(messageLabel, 1, 6, 2, 1);

        Button signInButton = new Button("Sign in");
        GridPane.setMargin(signInButton, new Insets(0, 0, 0, 100));
        loginGrid.add(signInButton, 1, 4);

        VBox loginBox = new VBox(20, loginGrid);
        loginBox.setAlignment(Pos.CENTER);

        Scene loginScene = new Scene(loginBox, 300, 250);

        signInButton.setOnAction(e -> {
            String userName = userNameField.getText();
            String password = passwordField.getText();

            if (USERNAME.equals(userName) && PASSWORD.equals(password)) {
                messageLabel.setText("");
                showSuccessPage(primaryStage, loginScene, userName);
            } else {
                messageLabel.setText("Password atau Username Salah");
            }
        });

        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    private void showSuccessPage(Stage primaryStage, Scene loginScene, String Username) {
        VBox successBox = new VBox(10);
        successBox.setAlignment(Pos.CENTER); //sukses slebew

        Label successLabel = new Label("Halo " + Username); //halo ngap
        successBox.getChildren().add(successLabel);

        Button backButton = new Button("Kembali");
        successBox.getChildren().add(backButton);

        backButton.setOnAction(e -> primaryStage.setScene(loginScene));

        Scene successScene = new Scene(successBox, 300, 250);

        primaryStage.setScene(successScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
