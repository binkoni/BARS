package com.example.bars;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.firebase.database.*;
import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    String sort = "id";
    private String objectName;

    ImageLoadTask task;
    ImageView imageView;
    TextView ratingView;
    RatingBar ratingBar;
    TextView abvView;
    TextView nameView;
    TextView styleView;
    TextView companyView;
    TextView commentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        objectName = intent.getStringExtra("id"); // 찾은 맥주의 이름을 "id" key로 intent에 담아 ResultActivity로 전달해줘야됩니다.
        Log.d("tag", "objectName : " + objectName);   //확인

        imageView = findViewById(R.id.image_view);
        ratingView = findViewById(R.id.rating_view);
        ratingBar = findViewById(R.id.ratingBar);
        abvView = findViewById(R.id.abv_view);
        nameView = findViewById(R.id.name_view);
        styleView = findViewById(R.id.style_view);
        companyView = findViewById(R.id.company_view);
        commentView = findViewById(R.id.comment_view);

        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        getFirebaseDatabase();
    }

    public void getFirebaseDatabase(){
        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.e("getFirebaseDatabase", "key: " + dataSnapshot.getChildrenCount());

                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {
                    String key = postSnapshot.getKey();
                    FirebasePost get = postSnapshot.getValue(FirebasePost.class);

                    if (objectName.equals(get.id)) {
                        Log.d("getFirebaseDatabase", "key: " + key);
                        Log.d("getFirebaseDatabase", "info: " + get.id +" / "+  get.name);

                        task = new ImageLoadTask(get.image, imageView); task.execute();
                        ratingView.setText(Double.toString(get.rating));
                        ratingBar.setRating(Float.valueOf(String.valueOf(get.rating)));
                        abvView.setText(get.ABV);
                        nameView.setText(get.name);
                        styleView.setText(get.style);
                        companyView.setText(get.company);
                        commentView.setText(get.comment);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w("getFirebaseDatabase","loadPost:onCancelled", databaseError.toException());
            }
        };
        Query sortbyAge = FirebaseDatabase.getInstance().getReference().child("id_list").orderByChild(sort);    //id값으로 DB sorting
        sortbyAge.addListenerForSingleValueEvent(postListener);
    }

}