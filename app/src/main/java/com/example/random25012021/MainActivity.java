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
    Button mBtnRandom,mBtnAddRange,mBtnReset;
    TextView mTvResult;
    ArrayList<Integer> mArrNumbers;
    Random mRandom;
    String mTextResult = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ
        mEdtSoMin = findViewById(R.id.editTextSMin);
        mEdtSoMax = findViewById(R.id.editTextSMax);
        mBtnRandom = findViewById(R.id.buttonRandom);
        mTvResult = findViewById(R.id.textViewResult);
        mBtnAddRange = findViewById(R.id.buttonAddRange);
        mBtnReset = findViewById(R.id.buttonReset);

        mArrNumbers = new ArrayList<>();
        mRandom = new Random();

        // Sự kiện

        mBtnAddRange.setOnClickListener(new View.OnClickListener() {
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


                int sMin = Integer.parseInt(textSMin);
                int sMax = Integer.parseInt(textSMax);

                if (sMax <= sMin){
                    sMax = sMin + 1;
                    mEdtSoMax.setText(String.valueOf(sMax));
                }

                mArrNumbers.clear();

                for (int i = sMin; i <= sMax ; i++) {
                    mArrNumbers.add(i);
                }
            }
        });

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mArrNumbers.size() > 0){
                    // Random ngẫu nhiên 1 vị trí bất trong mảng
                    int randomIndex = mRandom.nextInt(mArrNumbers.size());
                    // Từ vị trí ngẫu nhiên mình sẽ truy cập để lấy dữ liệu của vị trí này
                    int value = mArrNumbers.get(randomIndex);
                    // Sâu chuỗi các kết quả để hiển thị
                    if (mArrNumbers.size() == 1){
                        mTextResult +=  value;
                    }else{
                        mTextResult +=  value + " - ";
                    }
                    mTvResult.setText(mTextResult);
                    // Khi hiển thị kết quả thì xóa phần tử random để lần sau không xuất hiện lại
                    mArrNumbers.remove(randomIndex);
                }else{
                    Toast.makeText(MainActivity.this, "Kết thúc", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}