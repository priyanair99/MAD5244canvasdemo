package com.example.canvasdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables
        ImageView imageView = findViewById(R.id.imageView);
        Bitmap b = Bitmap.createBitmap( 300, 500, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        Paint paintbrush = new Paint();
//drawing stuff
        canvas.drawColor(Color.BLUE);

        paintbrush.setColor(Color.BLACK);

        // @TODO: Add your code to draw things
        canvas.drawLine(10,50,200,50,paintbrush);

        paintbrush.setColor(Color.WHITE);

        canvas.drawRect(150, 150, 200, 200, paintbrush);

        canvas.drawCircle(200,200, 10,paintbrush);

       //set text size
        paintbrush.setTextSize(40);


        canvas.drawText("HELLO WORLD", 10, 400, paintbrush);

        imageView.setImageBitmap(b);
    }
}
