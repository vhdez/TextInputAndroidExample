package sla.org.textinputandroidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextInputExample extends AppCompatActivity {
    private Button updateTextButton;
    private TextView displayText;
    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_example);

        // wire up the layout's controls with their fields in this class
        updateTextButton = findViewById(R.id.UpdateTextButton);
        displayText = findViewById(R.id.DisplayText);
        inputText = findViewById(R.id.InputText);

        // wire up updateTextButton to method that gets called when it's clicked
        updateTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the text from inputText and update displayText with that text
                displayText.setText(inputText.getText());
                // clear the text in inputText
                inputText.setText("");
            }
        });
    }
}
