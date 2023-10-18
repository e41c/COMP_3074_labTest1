package ca.gbc.labtest1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.graphics.Color;



public class SecondActivity extends AppCompatActivity {
    private RelativeLayout secondLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar toolbar = findViewById(R.id.toolbar); // Use the correct Toolbar class
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(R.string.second_activity_title);

        // Enable the up button in the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Define the colorListView variable
        ListView colorListView = findViewById(R.id.colorListView); // Initialize the colorListView variable
        secondLayout = findViewById(R.id.secondLayout);

        String[] colors = {"Blue", "Red", "Green"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, colors);
        colorListView.setAdapter(adapter);

        colorListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String colorName = colors[position];
                int color = Color.BLACK;
                switch (colorName) {
                    case "Blue":
                        color = Color.BLUE;
                        break;
                    case "Red":
                        color = Color.RED;
                        break;
                    case "Green":
                        color = Color.GREEN;
                        break;
                }
                secondLayout.setBackgroundColor(color);
            }
        });
    }
}

