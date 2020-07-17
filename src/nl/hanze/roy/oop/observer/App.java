package nl.hanze.roy.oop.observer;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.HashMap;

public class App extends Application {
    public static final String[] stockNames = {"IBM", "AAPL", "GOOGO"};

    public static HashMap<String, XYChart.Series> series = new HashMap<>();

    private LineChart lineChart;

    @Override 
    public void start(Stage stage) {
        this.initStocks();

        lineChart = this.createLineChart();

        for (String stockName : stockNames) {
            series.put(stockName, createSeries(stockName));
        }

        Group root = new Group(lineChart);
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    private LineChart createLineChart() {
        NumberAxis xAxis = new NumberAxis(1960, 2020, 10);
        xAxis.setLabel("Time");
        NumberAxis yAxis = new NumberAxis(0, 350, 50);
        yAxis.setLabel("Price");
        LineChart linechart = new LineChart(xAxis, yAxis);
        linechart.setTitle("Stock prices");

        return linechart;
    }

    private XYChart.Series createSeries(String stockName) {
        XYChart.Series series = new XYChart.Series();
        series.setName(stockName);
        lineChart.getData().add(series);

        return series;
    }

    private void initStocks() {
        StockGenerator stockGen = new StockGenerator();

        new Stock(stockGen, "IBM");
        new Stock(stockGen, "AAPL");
        new Stock(stockGen, "GOOGO");

        new Thread(new UpdateStock(stockGen, "IBM", 97.0f)).start();
        new Thread(new UpdateStock(stockGen, "AAPL", 174.6f)).start();
        new Thread(new UpdateStock(stockGen, "GOOGO", 267.4f)).start();
    }

    public static void updateStock(String stock, float price, int step) {
        int chartStep = 1960 + step * 10;

        Platform.runLater(() ->
                App.series.get(stock).getData().add(new XYChart.Data(chartStep, price))
        );
    }
}
