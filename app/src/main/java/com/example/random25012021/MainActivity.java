package com.example.random25012021;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //built-in function
        //Random 0 ~ 1
        //double value = Math.random();
        // Làm tròn >= 0.5
        //int value2 = Math.round(1.5f);
        // Làm tròn xuống
        //double value3 = Math.floor(1.99);
        // Làm tròn lên
        //double value4 = Math.ceil(1.01);
        // Tính căn bậc 2
        //double value5 = Math.sqrt(9);
        //int value6 = Math.abs(-10);

        //Log.d("BBB","Trị tuyệt đối = " + value6);
        // Khi sử dụng hàm
        // 1 : Tham số truyền vào là gì : ctrl + P
        // 2 : Giá trị trả về

        // Phím nhanh gợi ý sữa lỗi : alt + enter
//        Log.d("BBB" , String.valueOf(value));
    }
}