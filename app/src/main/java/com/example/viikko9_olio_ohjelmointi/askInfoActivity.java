package com.example.viikko9_olio_ohjelmointi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class askInfoActivity extends AppCompatActivity {

    private UserStorage storage;
    private User newUser;
    private EditText txtFirstName;
    private EditText txtLastName;
    private EditText txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_info);

        storage = UserStorage.getInstance();
        newUser = null;

        txtFirstName = findViewById(R.id.editTextFirstName);
        txtLastName = findViewById(R.id.editTextLastName);
        txtEmail = findViewById(R.id.editTextEmail);
    }

    public void createNewUser(View view)    {
        RadioGroup rgStudyType = findViewById(R.id.rgStudyType);
        String tite = "Tietotekniikka";
        String tuta = "Tuotantotalous";
        String late = "Laskennallinen tekniikka";
        String sate = "Sähkötekniikka";
        switch (rgStudyType.getCheckedRadioButtonId()) {
            case R.id.radioButtonTITE:
                newUser = new User(txtFirstName.getText().toString(), txtLastName.getText().toString(), txtEmail.getText().toString(), tite);
                storage.addUser(newUser);
                break;

            case R.id.radioButtonTUTA:
                newUser = new User(txtFirstName.getText().toString(), txtLastName.getText().toString(), txtEmail.getText().toString(), tuta);
                storage.addUser(newUser);
                break;

            case R.id.radioButtonLATE:
                newUser = new User(txtFirstName.getText().toString(), txtLastName.getText().toString(), txtEmail.getText().toString(), late);
                storage.addUser(newUser);
                break;

            case R.id.radioButtonSATE:
                newUser = new User(txtFirstName.getText().toString(), txtLastName.getText().toString(), txtEmail.getText().toString(), sate);
                storage.addUser(newUser);
                break;

            default:
                System.out.println("Anna käyttäjän tiedot!");
        }
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
    }
}