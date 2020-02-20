package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.Model.User;

public class ParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "data";

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
        btnSubmit = findViewById(R.id.button_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString();
                String name = nameInput.getText().toString();
                int age = Integer.parseInt(ageInput.getText().toString());

                User user = new User(username, name, age);
                Intent intent = new Intent(ParcelableActivity.this, ProfileParcelableActivity.class);
                intent.putExtra(USER_KEY, user);
                startActivity(intent);
            }
        });

    }
}
