package ssu.hollandt.androidlab2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button navigateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigateButton = (Button) findViewById(R.id.navigate_button);

            navigateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //symbol class Intent does not exist
                    Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                    startActivity(intent);
                }
            });

        }

    }



