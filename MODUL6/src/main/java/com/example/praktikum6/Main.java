package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));


        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("nama"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(
                new Mahasiswa(1, "Nara", "2210119220033"));
        tableView.getItems().add(
                new Mahasiswa(2, "Adika", "2210817310004"));
        tableView.getItems().add(
                new Mahasiswa(3, "Ado", "2210817310003"));
        tableView.getItems().add(
                new Mahasiswa(4, "Arib", "22101280033"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}