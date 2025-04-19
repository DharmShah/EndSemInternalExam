package com.example.endseminternalexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // UI components
    private TextView protitle, protitle2, protitle3, protitle4;
    private TextView proprice, proprice2, proprice3, proprice4;
    private ImageView proimg, proimg2, proimg3, proimg4;
    private Button addtocart, addtocart2, addtocart3, addtocart4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        protitle = findViewById(R.id.protitle);
        protitle2 = findViewById(R.id.protitle2);
        protitle3 = findViewById(R.id.protitle3);
        protitle4 = findViewById(R.id.protitle4);

        proprice = findViewById(R.id.proprice);
        proprice2 = findViewById(R.id.proprice2);
        proprice3 = findViewById(R.id.proprice3);
        proprice4 = findViewById(R.id.proprice4);

        // Initialize ImageViews
        proimg = findViewById(R.id.proimg);
        proimg2 = findViewById(R.id.proimg2);
        proimg3 = findViewById(R.id.proimg3);
        proimg4 = findViewById(R.id.proimg4);

        // Initialize Buttons
        addtocart = findViewById(R.id.addtocart);
        addtocart2 = findViewById(R.id.addtocart2);
        addtocart3 = findViewById(R.id.addtocart3);
        addtocart4 = findViewById(R.id.addtocart4);

        // Set product data (You can customize this or load from database later)
        protitle.setText("Causual T-shirt");
        proprice.setText("$29.99");

        protitle2.setText("Casual Shirt");
        proprice2.setText("$20");

        protitle3.setText("Tv");
        proprice3.setText("$550");

        protitle4.setText("Mobile");
        proprice4.setText("$240.90");

        // Optional: Set static image resources (if you have drawables)
        // proimg.setImageResource(R.drawable.tshirt);
        // proimg2.setImageResource(R.drawable.shirt);
        // proimg3.setImageResource(R.drawable.tv);
        // proimg4.setImageResource(R.drawable.mobile);

        // Set onClick actions
        addtocart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("product", "Causual T-shirt");
            startActivity(intent);
        });

        addtocart2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("product", "Casual Shirt");
            startActivity(intent);
        });

        addtocart3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("product", "Tv");
            startActivity(intent);
        });

        addtocart4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("product", "Mobile");
            startActivity(intent);
        });
    }
}
