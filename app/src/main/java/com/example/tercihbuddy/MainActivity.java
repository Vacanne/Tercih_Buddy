/*
Author: Mustafa Can Ince
 */
package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.FirebaseFirestore;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class MainActivity extends AppCompatActivity {

    private Button tercihlistem_button;
    private Button aramakriterleri_button;
    private Button alanlarbolumler_button;
    private Button sehirveuniversitesecimi_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FirebaseFirestore db = FirebaseFirestore.getInstance();

        sehirveuniversitesecimi_button = findViewById(R.id.sehir_ve_universite_secimi_button);
        tercihlistem_button            = findViewById(R.id.tercih_listem);
        aramakriterleri_button         = findViewById(R.id.arama_kriterleri_button);
        alanlarbolumler_button         = findViewById(R.id.alanlar_bölümler_button);

        sehirveuniversitesecimi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,sehirveuniversitesecimi.class);
                startActivity(intent);
            }
        });
        tercihlistem_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tercihlistemactivityopen();
            }
        });
        aramakriterleri_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aramakriterleri_activityyopen();
            }
        });
        alanlarbolumler_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alanlarbolumler_activityopen();
            }
        });


       /* // Create a new thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://mu.edu.tr/");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("User-Agent", "Mozilla/5.0");
                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200) {
                        System.out.println("Website working properly.");
                    } else {
                        System.out.println("Website is not working properly!!");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });

        // Start the thread
        thread.start();*/


        Thread imageThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    URL imageUrl = new URL("https://upload.wikimedia.org/wikipedia/tr/3/3c/Android-Marshmallow-logo-.jpg");
                    HttpURLConnection connection = (HttpURLConnection) imageUrl.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("User-Agent", "Mozilla/5.0");
                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200) {
                        // Get the size of the image
                        int contentLength = connection.getContentLength();
                        // read the image data
                        InputStream inputStream = connection.getInputStream();
                        // write the image data to a byte array
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        int totalBytesRead = 0;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                            totalBytesRead += bytesRead;
                        }
                        // Close the input and output streams
                        inputStream.close();
                        outputStream.close();
                        // Get the byte array
                        byte[] imageData = outputStream.toByteArray();
                        // Check if the image is the same size as the original
                        if (totalBytesRead == contentLength) {
                            System.out.println("Image downloaded successfully.");
                        } else {
                            System.out.println("Error downloading image: size does not match.");
                        }
                    } else {
                        System.out.println("Error downloading image: HTTP response code " + responseCode);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        imageThread.start();
    }

    public void opensehirveuniversitesecimi() {

    }
    public void tercihlistemactivityopen() {
        Intent intent = new Intent(this, Tercih_Listem.class);
        startActivity(intent);
    }
    public void aramakriterleri_activityyopen() {
        Intent intent = new Intent(this, arama_kriterleri.class);
        startActivity(intent);
    }

    public void alanlarbolumler_activityopen() {
        Intent intent = new Intent(this, alanlarbolumler.class);
        startActivity(intent);
    }

}
