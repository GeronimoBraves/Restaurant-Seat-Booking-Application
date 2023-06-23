package com.example.sfc2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class About extends AppCompatActivity {

//    private EditText feedbackNameEdt, feedbackPhoneEdt, feedbackEmailEdt,feedbackLocationEdt,feedbackDateEdt,feedbackDineEdt,feedbackFoodEdt,feedbackOverallEdt,feedbackSpeedEdt,feedbackExpEdt,feedbackCommentEdt;
//    private Button sendDatabtn;
//
//    // creating a variable for our
//    // Firebase Database.
//    FirebaseDatabase firebaseDatabase;
//
//    // creating a variable for our Database
//    // Reference for Firebase.
//    DatabaseReference databaseReference;
//
//    // creating a variable for
//    // our object class
//    FeedbackInfo feedbackInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        Button button1 = findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, Menu2.class);
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.button7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this, Branches.class);
                startActivity(intent);
            }
        });

//        feedbackNameEdt = findViewById(R.id.idEdtFeedbackName);
//        feedbackPhoneEdt = findViewById(R.id.idEdtFeedbackPhoneNumber);
//        feedbackEmailEdt = findViewById(R.id.idEdtFeedbackEmail);
//        feedbackLocationEdt = findViewById(R.id.idEdtFeedbackLocation);
//        feedbackDateEdt = findViewById(R.id.idEdtFeedbackDate);
//        feedbackDineEdt = findViewById(R.id.idEdtFeedbackDine);
//        feedbackFoodEdt = findViewById(R.id.idEdtFeedbackFood);
//        feedbackOverallEdt = findViewById(R.id.idEdtFeedbackOverall);
//        feedbackSpeedEdt = findViewById(R.id.idEdtFeedbackSpeed);
//        feedbackExpEdt = findViewById(R.id.idEdtFeedbackExp);
//        feedbackCommentEdt = findViewById(R.id.idEdtFeedbackComment);
//
//        // below line is used to get the
//        // instance of our Firebase database.
//        firebaseDatabase = FirebaseDatabase.getInstance();
//
//        // below line is used to get reference for our database.
//        databaseReference = firebaseDatabase.getReference("FeedbackInfo");
//
//        // initializing our object
//        // class variable.
//        feedbackInfo = new FeedbackInfo();
//
//        sendDatabtn = findViewById(R.id.idBtnSendData);
//
//        sendDatabtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                // getting text from our edittext fields.
//                String name = feedbackNameEdt.getText().toString();
//                String phone = feedbackPhoneEdt.getText().toString();
//                String email = feedbackEmailEdt.getText().toString();
//                String location = feedbackLocationEdt.getText().toString();
//                String date = feedbackDateEdt.getText().toString();
//                String dine = feedbackDineEdt.getText().toString();
//                String food = feedbackFoodEdt.getText().toString();
//                String overall = feedbackOverallEdt.getText().toString();
//                String speed = feedbackSpeedEdt.getText().toString();
//                String exp = feedbackExpEdt.getText().toString();
//                String comment = feedbackCommentEdt.getText().toString();
//
//                // below line is for checking whether the
//                // edittext fields are empty or not.
//                if (TextUtils.isEmpty(name) && TextUtils.isEmpty(phone) && TextUtils.isEmpty(email) && TextUtils.isEmpty(location) && TextUtils.isEmpty(dine) && TextUtils.isEmpty(date) && TextUtils.isEmpty(overall) && TextUtils.isEmpty(speed) && TextUtils.isEmpty(food) && TextUtils.isEmpty(exp) && TextUtils.isEmpty(comment)) {
//                    // if the text fields are empty
//                    // then show the below message.
//                    Toast.makeText(About.this, "Please add some data.", Toast.LENGTH_SHORT).show();
//                } else {
//                    // else call the method to add
//                    // data to our database.
//                    addDatatoFirebase(name, phone, email, location,dine,date,food,overall,speed,exp,comment);
//                }
//            }
//        });
    }
//    private void addDatatoFirebase(String name, String phone, String email, String location, String dine, String date, String food, String overall, String speed, String exp, String comment) {
//        // below 3 lines of code is used to set
//        // data in our object class.
//        feedbackInfo.setFeedbackName(name);
//        feedbackInfo.setFeedbackContactNumber(phone);
//        feedbackInfo.setFeedbackEmail(email);
//        feedbackInfo.setFeedbackLocation(location);
//        feedbackInfo.setFeedbackDine(dine);
//        feedbackInfo.setFeedbackDate(date);
//        feedbackInfo.setFeedbackFood(food);
//        feedbackInfo.setFeedbackOverall(overall);
//        feedbackInfo.setFeedbackSpeed(speed);
//        feedbackInfo.setFeedbackExp(exp);
//        feedbackInfo.setFeedbackComment(comment);
//
//        // we are use add value event listener method
//        // which is called with database reference.
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                // inside the method of on Data change we are setting
//                // our object class to our database reference.
//                // data base reference will sends data to firebase.
//                databaseReference.setValue(feedbackInfo);
//
//                // after adding this data we are showing toast message.
//                Toast.makeText(About.this, "data added", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//                // if the data is not added or it is cancelled then
//                // we are displaying a failure toast message.
//                Toast.makeText(About.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
}


