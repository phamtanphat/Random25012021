package com.example.random25012021;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Random : 0 ~ 1
        // Viết random chạy từ 5 ~ 10


//        double value = Math.round(Math.random() * 5 ) + 5;
//        Log.d("BBB","Giá trị random = " + value);

//        int a = 10;

        // Kiểu dữ liệu đối tượng (Khởi tạo vùng nhớ và có địa chỉ)
//        Random random = new Random();
//
//        // Xử lý random trong 5 -> 10
//        for (int i = 0; i < 50; i++) {
//            int value = random.nextInt(10 - 5 + 1) + 5;
//            Log.d("BBB","Giá trị = " + value);
//        }



        // Yêu cầu về nhà
        // Task 1 : Kiểm tra người dùng phải nhập đủ số min và số max
        // Task 2 : Kiểm tra giá trị max không được bé hơn hoặc bằng số min
        //                    Xử lý : smax = smin + 1
        // Task 3 : Xử lý random trong khoảng số max và số min
        // Task 4 : Hiển thị giá trị random lên textview



    }
}