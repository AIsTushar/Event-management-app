package edu.ewubd.loginandsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    EditText location,type, phone, rent,size, des;
    ImageView detailImage1,detailImage2, detailImage3, detailImage4;

    Button btn_save, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        location = findViewById(R.id.location);
        type = findViewById(R.id.type);
        phone = findViewById(R.id.phone);
        rent = findViewById(R.id.rent);
        size = findViewById(R.id.size);
        des = findViewById(R.id.description);

        detailImage1 = findViewById(R.id.detailImage1);
        detailImage2 = findViewById(R.id.detailImage2);
        detailImage3 = findViewById(R.id.detailImage3);
        detailImage4 = findViewById(R.id.detailImage4);

        btn_back = findViewById(R.id.btn_back);
        btn_save = findViewById(R.id.btn_save);



        Bundle bundle = getIntent().getExtras();


        if(bundle != null){

            location.setText(bundle.getString("location"));
            type.setText(bundle.getString("type"));
            phone.setText(bundle.getString("phone"));
            rent.setText(bundle.getString("rent"));
            size.setText(bundle.getString("size"));
            des.setText(bundle.getString("description"));
            Glide.with(this).load(bundle.getString("Image1")).into(detailImage1);
            Glide.with(this).load(bundle.getString("Image2")).into(detailImage2);
            Glide.with(this).load(bundle.getString("Image3")).into(detailImage3);
            Glide.with(this).load(bundle.getString("Image4")).into(detailImage4);


        }

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

//        Button save
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Latter
            }
        });

    }
}