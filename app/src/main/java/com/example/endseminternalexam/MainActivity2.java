package com.example.endseminternalexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private Button back, add, sub, addtocart;
    private TextView protitle, prodesc, proprice, prosize, qua;
    private RadioButton s, m, l, xl;
    private ImageView proimg;

    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find views
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        addtocart = findViewById(R.id.addtocart);
        prodesc = findViewById(R.id.prodesc);
        protitle = findViewById(R.id.protitle);
        proprice = findViewById(R.id.proprice);
        prosize = findViewById(R.id.prosize);
        qua = findViewById(R.id.qua);
        s = findViewById(R.id.s);
        m = findViewById(R.id.m);
        l = findViewById(R.id.l);
        xl = findViewById(R.id.xl);
        proimg = findViewById(R.id.proimg);

        // Example static data
        String title = "Casual T-shirt";
        String description = "Premium cotton T-shirt with a comfortable fit and stylish design. Perfect for casual wear.";
        String price = "$29.99";

        protitle.setText(title);
        prodesc.setText(description);
        proprice.setText(price);

        // Quantity Button Listeners
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity += 1;
                qua.setText(String.valueOf(quantity));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity > 0) {
                    quantity -= 1;
                    qua.setText(String.valueOf(quantity));
                }
            }
        });

        // Add to cart logic
        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back to MainActivity or cart screen
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Optional: handle size selection (if needed)
    }
}
