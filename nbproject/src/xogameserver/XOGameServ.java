package xogameserver;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class XOGameServ extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final Text text;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints4;
    protected final BorderPane borderPane0;
    protected final AnchorPane anchorPane0;
    protected final Button button_start;
    protected final BorderPane borderPane1;
    protected final AnchorPane anchorPane1;
    protected final Button button_stop;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final GridPane gridPane2;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final RowConstraints rowConstraints6;
    protected final AnchorPane anchorPane2;
    protected final Text text0;
    protected final AnchorPane anchorPane3;
    protected final Text online_txt;
    protected final GridPane gridPane3;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final RowConstraints rowConstraints7;
    protected final AnchorPane anchorPane4;
    protected final Text text1;
    protected final AnchorPane anchorPane5;
    protected final Text offline_txt;
    protected final CategoryAxis x;
    protected final NumberAxis y;
    protected final BarChart chart;

    public XOGameServ() {

        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        gridPane = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        text = new Text();
        gridPane0 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints4 = new RowConstraints();
        borderPane0 = new BorderPane();
        anchorPane0 = new AnchorPane();
        button_start = new Button();
        borderPane1 = new BorderPane();
        anchorPane1 = new AnchorPane();
        button_stop = new Button();
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        gridPane2 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        rowConstraints6 = new RowConstraints();
        anchorPane2 = new AnchorPane();
        text0 = new Text();
        anchorPane3 = new AnchorPane();
        online_txt = new Text();
        gridPane3 = new GridPane();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        rowConstraints7 = new RowConstraints();
        anchorPane4 = new AnchorPane();
        text1 = new Text();
        anchorPane5 = new AnchorPane();
        offline_txt = new Text();
        x = new CategoryAxis();
        y = new NumberAxis();
        chart = new BarChart(x, y);

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(356.0);
        setPrefWidth(610.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(text, 59.9765625);
        AnchorPane.setLeftAnchor(text, 210.0);
        AnchorPane.setRightAnchor(text, 312.140625);
        AnchorPane.setTopAnchor(text, 58.1015625);
        text.setLayoutX(210.0);
        text.setLayoutY(84.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("XO Server");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(159.859375);
        text.setFont(new Font(24.0));
        borderPane.setCenter(anchorPane);

        GridPane.setRowIndex(gridPane0, 1);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        borderPane0.setPrefHeight(200.0);
        borderPane0.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(button_start, 27.0);
        AnchorPane.setLeftAnchor(button_start, 59.0);
        AnchorPane.setRightAnchor(button_start, 73.0);
        AnchorPane.setTopAnchor(button_start, 28.0);
        button_start.setLayoutX(62.0);
        button_start.setLayoutY(28.0);
        button_start.setMnemonicParsing(false);
        button_start.setPrefHeight(25.0);
        button_start.setPrefWidth(161.0);
        button_start.setText("Start");
        borderPane0.setCenter(anchorPane0);

        GridPane.setColumnIndex(borderPane1, 1);
        borderPane1.setPrefHeight(200.0);
        borderPane1.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(button_stop, 27.0);
        AnchorPane.setLeftAnchor(button_stop, 59.0);
        AnchorPane.setRightAnchor(button_stop, 73.0);
        AnchorPane.setTopAnchor(button_stop, 28.0);
        button_stop.setLayoutX(59.0);
        button_stop.setLayoutY(28.0);
        button_stop.setMnemonicParsing(false);
        button_stop.setPrefHeight(25.0);
        button_stop.setPrefWidth(161.0);
        button_stop.setText("Stop");
        borderPane1.setCenter(anchorPane1);

        GridPane.setRowIndex(gridPane1, 2);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(100.0);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(text0, 22.0);
        AnchorPane.setLeftAnchor(text0, 20.0);
        AnchorPane.setRightAnchor(text0, 19.232421875);
        AnchorPane.setTopAnchor(text0, 22.0);
        text0.setLayoutX(20.0);
        text0.setLayoutY(35.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Online Users :");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text0.setWrappingWidth(113.767578125);
        text0.setFont(new Font(13.0));

        GridPane.setColumnIndex(anchorPane3, 1);
        anchorPane3.setPrefHeight(200.0);
        anchorPane3.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(online_txt, 42.0);
        AnchorPane.setLeftAnchor(online_txt, 14.0);
        AnchorPane.setRightAnchor(online_txt, 88.86328125);
        AnchorPane.setTopAnchor(online_txt, 42.0);
        online_txt.setLayoutX(14.0);
        online_txt.setLayoutY(56.0);
        online_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        online_txt.setStrokeWidth(0.0);
        online_txt.setText("5");
        online_txt.setWrappingWidth(89.13671875);
        online_txt.setFont(new Font(13.0));

        GridPane.setColumnIndex(gridPane3, 1);

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(100.0);

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(100.0);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane4.setPrefHeight(200.0);
        anchorPane4.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(text1, 22.0);
        AnchorPane.setLeftAnchor(text1, 20.0);
        AnchorPane.setRightAnchor(text1, 19.232421875);
        AnchorPane.setTopAnchor(text1, 22.0);
        text1.setLayoutX(20.0);
        text1.setLayoutY(35.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Offline Users");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text1.setWrappingWidth(113.767578125);
        text1.setFont(new Font(13.0));

        GridPane.setColumnIndex(anchorPane5, 1);
        anchorPane5.setPrefHeight(200.0);
        anchorPane5.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(offline_txt, 42.7373046875);
        AnchorPane.setLeftAnchor(offline_txt, 51.0);
        AnchorPane.setRightAnchor(offline_txt, 51.86328125);
        AnchorPane.setTopAnchor(offline_txt, 40.9716796875);
        offline_txt.setLayoutX(51.0);
        offline_txt.setLayoutY(55.0);
        offline_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        offline_txt.setStrokeWidth(0.0);
        offline_txt.setText("5");
        offline_txt.setWrappingWidth(89.13671875);
        offline_txt.setFont(new Font(13.0));

        x.setLabel("label");
        x.setSide(javafx.geometry.Side.BOTTOM);

        y.setLabel("number");
        y.setSide(javafx.geometry.Side.LEFT);
        GridPane.setRowIndex(chart, 1);
        chart.setTitle("Users");

        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        anchorPane.getChildren().add(text);
        gridPane.getChildren().add(borderPane);
        gridPane0.getColumnConstraints().add(columnConstraints1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints4);
        anchorPane0.getChildren().add(button_start);
        gridPane0.getChildren().add(borderPane0);
        anchorPane1.getChildren().add(button_stop);
        gridPane0.getChildren().add(borderPane1);
        gridPane.getChildren().add(gridPane0);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getColumnConstraints().add(columnConstraints4);
        gridPane1.getRowConstraints().add(rowConstraints5);
        gridPane2.getColumnConstraints().add(columnConstraints5);
        gridPane2.getColumnConstraints().add(columnConstraints6);
        gridPane2.getRowConstraints().add(rowConstraints6);
        anchorPane2.getChildren().add(text0);
        gridPane2.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(online_txt);
        gridPane2.getChildren().add(anchorPane3);
        gridPane1.getChildren().add(gridPane2);
        gridPane3.getColumnConstraints().add(columnConstraints7);
        gridPane3.getColumnConstraints().add(columnConstraints8);
        gridPane3.getRowConstraints().add(rowConstraints7);
        anchorPane4.getChildren().add(text1);
        gridPane3.getChildren().add(anchorPane4);
        anchorPane5.getChildren().add(offline_txt);
        gridPane3.getChildren().add(anchorPane5);
        gridPane1.getChildren().add(gridPane3);
        gridPane.getChildren().add(gridPane1);
        getChildren().add(gridPane);
        getChildren().add(chart);

    }
}
