package com.example.random25012021;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    // 1 : Khai báo
    EditText mEdtSoMin,mEdtSoMax;
    Button mBtnRandom;
    TextView mTvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ
        mEdtSoMin = findViewById(R.id.editTextSMin);
        mEdtSoMax = findViewById(R.id.editTextSMax);
        mBtnRandom = findViewById(R.id.buttonRandom);
        mTvResult = findViewById(R.id.textViewResult);


        // Sự kiện
        // Call back function
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textSMin = mEdtSoMin.getText().toString();
                String textSMax = mEdtSoMax.getText().toString();

                // Kiểm tra smin hoặc smax có bị bỏ trống hay không
                if (textSMin.length() <= 0 || textSMax.length() <= 0){
                    // Khi sử dụng hàm chỉ quan chức năng , tham số truyền vào và giá trị trả về
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập đủ thông tin",Toast.LENGTH_LONG).show();
                    return;
                }

//                int = Integer
//                boolean = Boolean
//                float = Float

                int sMin = Integer.parseInt(textSMin);
                int sMax = Integer.parseInt(textSMax);

                if (sMax <= sMin){
                    sMax = sMin + 1;
                    mEdtSoMax.setText(String.valueOf(sMax));
                }

                Random random = new Random();
                int result = random.nextInt(sMax - sMin + 1) + sMin;
                mTvResult.setText(String.valueOf(result));
            }
        });
        //0 -10
        //for (int i=smin, i<=smax,i++) {
        //    arr[smax - i]=i;
        //}


        // Task 5 : Xử lý random không bị trùng
        // Task 6 : Xử lý hiển thị kết quả = 1 - 2 - 3 - 4 - 5
        // Task 7 : Khi hết số random thì thông báo

    }

}