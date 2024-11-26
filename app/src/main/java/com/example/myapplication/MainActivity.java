package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 뷰 선언
    private Spinner spinnerMode;
    private Button btnAddVeg, btnAddMeat, btnAddDairy;
    private Button btnVeg1, btnVeg2, btnMeat1, btnMeat2, btnDairy1, btnDairy2;
    private Button btnNav1, btnNav2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // XML 레이아웃 설정

        // 뷰 초기화
        spinnerMode = findViewById(R.id.spinnerMode);

        btnAddVeg = findViewById(R.id.btnAddVeg);
        btnAddMeat = findViewById(R.id.btnAddMeat);
        btnAddDairy = findViewById(R.id.btnAddDairy);

        btnVeg1 = findViewById(R.id.btnVeg1);
        btnVeg2 = findViewById(R.id.btnVeg2);
        btnMeat1 = findViewById(R.id.btnMeat1);
        btnMeat2 = findViewById(R.id.btnMeat2);
        btnDairy1 = findViewById(R.id.btnDairy1);
        btnDairy2 = findViewById(R.id.btnDairy2);

        btnNav1 = findViewById(R.id.btnNav1);
        btnNav2 = findViewById(R.id.btnNav2);

        // 클릭 이벤트 설정
        setButtonClickListeners();
    }

    private void setButtonClickListeners() {
        // 채소 추가 버튼
        btnAddVeg.setOnClickListener(v -> showToast("채소 추가 버튼 클릭됨"));

        // 육류 추가 버튼
        btnAddMeat.setOnClickListener(v -> showToast("육류 추가 버튼 클릭됨"));

        // 유제품 추가 버튼
        btnAddDairy.setOnClickListener(v -> showToast("유제품 추가 버튼 클릭됨"));

        // 채소 버튼들
        btnVeg1.setOnClickListener(v -> showToast("채소 버튼 1 클릭됨"));
        btnVeg2.setOnClickListener(v -> showToast("채소 버튼 2 클릭됨"));

        // 육류 버튼들
        btnMeat1.setOnClickListener(v -> showToast("육류 버튼 1 클릭됨"));
        btnMeat2.setOnClickListener(v -> showToast("육류 버튼 2 클릭됨"));

        // 유제품 버튼들
        btnDairy1.setOnClickListener(v -> showToast("유제품 버튼 1 클릭됨"));
        btnDairy2.setOnClickListener(v -> showToast("유제품 버튼 2 클릭됨"));

        // 하단 네비게이션 버튼들
        btnNav1.setOnClickListener(v -> showToast("네비게이션 버튼 1 클릭됨"));
        btnNav2.setOnClickListener(v -> showToast("네비게이션 버튼 2 클릭됨"));
    }

    // 토스트 메시지를 표시하는 메서드
    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
