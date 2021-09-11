package com;

/*
Price provided by IEX cloud using their free version of API
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.net.HttpURLConnection;

public class Stock {
    private String company;
    private String ticker;
    private double price;

    static String url = "https://sandbox.iexapis.com/stable/tops?";
    static String token = "Tpk_b1ca02b1fbdf4690aee1d9a2e013170f";
    static String symbols = "mvis";

    static String query = String.format("token=%s&symbols=%s",
            URLEncoder.encode(token, StandardCharsets.UTF_8),
            URLEncoder.encode(symbols, StandardCharsets.UTF_8));

    public Stock(String name, String ticker, double price) {
        this.company = name;
        this.ticker = ticker;
        this.price = price;
    }

    public String getName() {
        return this.company;
    }

    public String getTicker() {
        return this.ticker;
    }

    public double getPrice() {
        return this.price;
    }


    // In GUI application will evolve into a searching method
    public static String askForTicker() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What ticker symbol would you like to look up?");

        // Error check for a specific string and has to be a valid ticker

        return inputScanner.nextLine();
    }

    public static void main(String[] args) throws IOException {
//        String ticker = askForTicker();

        URL targetUrl = new URL(url + query);
        HttpURLConnection connection = (HttpURLConnection) targetUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        int responseCode = connection.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);




//        System.out.println("The ticker you asked for was: " + ticker);

//        Stock AMD = new Stock("Advanced Micro Devices", "AMD", 110.0);
//        System.out.println("The current price of " + AMD.getName() + " is " + AMD.getPrice());

    }
}
