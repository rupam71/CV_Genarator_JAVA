package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button prev, save, edit;
    EditText name, address, phone, dateofbirth, nationality, hobby, language, school, college, occupation, date, carobj, email;
    TextView getName, getAddress, getPhone, getDateofbirth, getNationality, getHobby, getLanguage, getSchool, getCollege, getOccupation, getDate, getCarobj, getEmail, personal, personal2,  personal3, personal4;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DatabaseHelper helper = new DatabaseHelper(this);

        save = (Button) findViewById(R.id.save);
        prev = (Button) findViewById(R.id.prev);
        edit = (Button) findViewById(R.id.edit);

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        phone = findViewById(R.id.phone);
        dateofbirth = findViewById(R.id.dateofbirth);
        nationality = findViewById(R.id.nationality);
        hobby = findViewById(R.id.hobby);
        language = findViewById(R.id.language);
        school = findViewById(R.id.school);
        college = findViewById(R.id.college);
        occupation = findViewById(R.id.occupation);
        date = findViewById(R.id.date);
        email = findViewById(R.id.email);
        carobj = findViewById(R.id.carobj);



        getName = findViewById(R.id.tv1);
        getAddress = findViewById(R.id.tv2);
        getPhone = findViewById(R.id.tv3);
        getDateofbirth = findViewById(R.id.tv4);
        getNationality = findViewById(R.id.tv5);
        getHobby = findViewById(R.id.tv6);
        getLanguage = findViewById(R.id.tv7);
        getSchool = findViewById(R.id.tv8);
        getCollege = findViewById(R.id.tv9);
        getOccupation = findViewById(R.id.tv10);
        getDate = findViewById(R.id.tv12);
        getCarobj = findViewById(R.id.tv11);
        getEmail = findViewById(R.id.tv14);
        personal = findViewById(R.id.tv100);
        personal2 = findViewById(R.id.tv101);
        personal3 = findViewById(R.id.tv102);
        personal4 = findViewById(R.id.tv103);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!name.getText().toString().isEmpty() && !address.getText().toString().isEmpty() && !phone.getText().toString().isEmpty() && !dateofbirth.getText().toString().isEmpty() && !nationality.getText().toString().isEmpty() && !hobby.getText().toString().isEmpty() && !language.getText().toString().isEmpty() && !school.getText().toString().isEmpty() && !college.getText().toString().isEmpty() && !occupation.getText().toString().isEmpty() && !date.getText().toString().isEmpty() && !email.getText().toString().isEmpty() && !carobj.getText().toString().isEmpty()) {
                    if (helper.insert(name.getText().toString(), address.getText().toString(), phone.getText().toString(), dateofbirth.getText().toString(), nationality.getText().toString(), hobby.getText().toString(), language.getText().toString() , school.getText().toString(), college.getText().toString(), occupation.getText().toString() , date.getText().toString(), email.getText().toString(), carobj.getText().toString())) {
                        Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_LONG).show();

                        getName.setText("");
                        getAddress.setText("");
                        getPhone.setText("");
                        getDateofbirth.setText("");
                        getNationality.setText("");
                        getHobby.setText("");
                        getLanguage.setText("");
                        getSchool.setText("");
                        getCollege.setText("");
                        getOccupation.setText("");
                        getCarobj.setText("");
                        getDate.setText("");
                        getEmail.setText("");
                        personal.setText("");
                        personal2.setText("");
                        personal3.setText("");
                        personal4.setText("");

                    } else {
                        Toast.makeText(MainActivity.this, "NOT Inserted", Toast.LENGTH_LONG).show();
                    }
                } else {
                    name.setError("Enter NAME");
                    address.setError("Enter Address");
                    phone.setError("Enter Phone");
                    dateofbirth.setError("Enter Date Of Birth");
                    nationality.setError("Enter Nationality");
                    hobby.setError("Enter Hobby");
                    language.setError("Enter Language");
                    school.setError("Enter School Name");
                    college.setError("Enter College Name");
                    occupation.setError("Enter Occupation");
                    date.setError("Enter Date");
                    email.setError("Enter Email");
                    carobj.setError("Enter Career Objective");
                }
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getName.setText(helper.getName());
                getAddress.setText(helper.getAddress());
                getEmail.setText(helper.getEmail());
                getPhone.setText(helper.getPhone());

                getCarobj.setText(helper.getCarobj());
                getDate.setText( "Date : "+ helper.getDate());

                getDateofbirth.setText( "Dateofbirth : "+ helper.getDateofbirth());
                getNationality.setText( "Nationality : "+ helper.getNationality());
                getHobby.setText(       "Hobby : "+ helper.getHobby());
                getLanguage.setText(    "Language : "+ helper.getLanguage());
                getSchool.setText(      "School : "+ helper.getSchool());
                getCollege.setText(     "College : "+ helper.getCollege());
                getOccupation.setText(  "Occupation : "+ helper.getOccupation());
                personal.setText("CURRICULUM VITAE");
                personal2.setText("Personal Details");
                personal3.setText("CAREER OBJECTIVE");
                personal4.setText("I declare that the above information is true to the best of my knowledge.");
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText(helper.getName());
                address.setText(helper.getAddress());
                phone.setText(helper.getPhone());
                dateofbirth.setText(helper.getDateofbirth());
                nationality.setText(helper.getNationality());
                hobby.setText(helper.getHobby());
                language.setText(helper.getLanguage());
                school.setText(helper.getSchool());
                college.setText(helper.getCollege());
                occupation.setText(helper.getOccupation());
                date.setText(helper.getDate());
                email.setText(helper.getEmail());
                carobj.setText(helper.getCarobj());
            }
        });

    }
}