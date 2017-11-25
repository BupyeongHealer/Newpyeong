package com.example.healer.pyeonchang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by cmjh9 on 2017-11-21.
 */

public class SelectActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        //이미지 버튼 바인딩
        ImageButton btn_nordic = (ImageButton) findViewById(R.id.btn_nordic);
        ImageButton btn_luge = (ImageButton) findViewById(R.id.btn_luge);
        ImageButton btn_biathlon = (ImageButton) findViewById(R.id.btn_biathlon);

        ImageButton btn_bobsleigh = (ImageButton) findViewById(R.id.btn_bobsleigh);
        ImageButton btn_shorttrack = (ImageButton) findViewById(R.id.btn_shorttrack);
        ImageButton btn_snowboard = (ImageButton) findViewById(R.id.btn_snowboard);

        ImageButton btn_skeleton = (ImageButton) findViewById(R.id.btn_skeleton);
        ImageButton btn_ski_jump = (ImageButton) findViewById(R.id.btn_ski_jump);
        ImageButton btn_speed_skating = (ImageButton) findViewById(R.id.btn_speed_skating);

        ImageButton btn_ice_hockey = (ImageButton) findViewById(R.id.btn_ice_hockey);
        ImageButton btn_alpine = (ImageButton) findViewById(R.id.btn_alpine);
        ImageButton btn_curling = (ImageButton) findViewById(R.id.btn_curling);

        ImageButton btn_cross = (ImageButton) findViewById(R.id.btn_cross);
        ImageButton btn_freestyle = (ImageButton) findViewById(R.id.btn_freestyle);
        ImageButton btn_figure = (ImageButton) findViewById(R.id.btn_figure);

        // 이미지 버튼 Intent ----------------------------------------------------------------------------------
            // 첫번째 줄 ---------------------------------------------------------------------------------------

        btn_nordic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, NordicMain.class);
                startActivity(intent);
            }
        });

        btn_luge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, LugeMain.class);
                startActivity(intent);
            }
        });

        btn_biathlon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, BiathlonMain.class);
                startActivity(intent);
            }
        });

        // 두번째 줄 ---------------------------------------------------------------------------------------

        btn_bobsleigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, BobsleighMain.class);
                startActivity(intent);
            }
        });

        btn_shorttrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, ShorttrackMain.class);
                startActivity(intent);
            }
        });

        btn_snowboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, SnowboardMain.class);
                startActivity(intent);
            }
        });

        // 세번째 줄 ---------------------------------------------------------------------------------------

        btn_skeleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, SkeletonMain.class);
                startActivity(intent);
            }
        });

        btn_ski_jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, SkijumpingMain.class);
                startActivity(intent);
            }
        });

        btn_speed_skating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, SpeedskatingMain.class);
                startActivity(intent);
            }
        });

        // 네번째 줄 ---------------------------------------------------------------------------------------

        btn_ice_hockey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, IcehockeyMain.class);
                startActivity(intent);
            }
        });

        btn_alpine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, AlpineskiingMain.class);
                startActivity(intent);
            }
        });

        btn_curling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, CurlingMain.class);
                startActivity(intent);
            }
        });

        // 다섯번째 줄 ---------------------------------------------------------------------------------------

        btn_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, CrosscountryMain.class);
                startActivity(intent);
            }
        });

        btn_freestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, FreestyleMain.class);
                startActivity(intent);
            }
        });

        btn_figure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, FigureskatingMain.class);
                startActivity(intent);
            }
        });

        // 웹뷰 버튼 바인딩 ----------------------------------------------------------------------

        Button btn_webview = (Button) findViewById(R.id.btn_webview);

        // 웹뷰 버튼 Intent ----------------------------------------------------------------------

        btn_webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this, WebviewActivity.class);
                startActivity(intent);
            }

        });

    }




}
