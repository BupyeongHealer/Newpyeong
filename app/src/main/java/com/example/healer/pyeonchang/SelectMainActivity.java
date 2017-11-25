package com.example.healer.pyeonchang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by cmjh9 on 2017-11-22.
 */

public class SelectMainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_selector);

        // 이미지 버튼 바인딩 ---------------------------------------------------------------

        ImageButton btn_pyeongchang = (ImageButton) findViewById(R.id.btn_pyeongchang);
        ImageButton btn_board = (ImageButton) findViewById(R.id.btn_board);

        // 이미지 버튼 Intent ---------------------------------------------------------------

        btn_pyeongchang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectMainActivity.this, SelectActivity.class);
                startActivity(intent);
            }
        });

        //Board는 아직 만들어지지 않아서 내버려 두었음.

        btn_board.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
               Intent intent = new Intent(SelectMainActivity.this, BoardActivity.class);
               startActivity(intent);
           }
       });
    }
}
