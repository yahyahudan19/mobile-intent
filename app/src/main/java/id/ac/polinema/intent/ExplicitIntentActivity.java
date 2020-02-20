package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    private Button submit;
    private EditText nameInput;
    private TextView outputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        nameInput = findViewById(R.id.input_name);
        submit = findViewById(R.id.submit);
        outputText = findViewById(R.id.text_output);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringInputName = nameInput.getText().toString();
                String stringOutputText = "Hello " + stringInputName + ", Congratulations!";

                outputText.setText(stringOutputText);
            }
        });


    }
}
