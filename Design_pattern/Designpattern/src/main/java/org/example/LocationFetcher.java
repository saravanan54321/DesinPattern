package org.example;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LocationFetcher {
    public static void main(String[] args) throws Exception {
        String apiUrl = "http://ip-api.com/json";

        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = in.readLine()) != null) {
            response.append(line);
        }

        in.close();

        JSONObject json = new JSONObject(response.toString());

        double latitude = json.getDouble("lat");
        double longitude = json.getDouble("lon");

        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }
}
