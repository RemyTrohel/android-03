package wildcodeschool.fr.simpleui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button   sendButton;
    EditText firstName;
    EditText lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.editText);
        lastName = findViewById(R.id.editText2);

        sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                String firstNameValue = firstName.getText().toString();
                String lastNameValue = lastName.getText().toString();
                String toastText = context.getString(R.string.toast_text) + " " + firstNameValue + " " + lastNameValue;
                Toast.makeText(context, toastText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
