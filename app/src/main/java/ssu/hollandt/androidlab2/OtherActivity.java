package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_KEY = "USER_NAME";

    private TextView welcomeText;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        returnButton = findViewById(R.id.navigate_button);


        welcomeText = findViewById(R.id.welcome_text);
        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        if(name == null || name.isEmpty())
        {
            name = "not bob";
        }
        welcomeText.setText("welcome, " + name);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
