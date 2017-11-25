package com.example.healer.pyeonchang;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by ssop6 on 2017-11-22.
 */

public class NickNameDialog extends Dialog {

    Button button;
    EditText editText;
    TextView textView;

    private String nickName;

    public NickNameDialog(@NonNull Context context) {
        super(context);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_dialog);

        button = findViewById(R.id.dialog_button);
        editText = findViewById(R.id.dialog_edit_text);
        textView = findViewById(R.id.dialog_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    nickName = editText.getText().toString();
                    dismiss();

                }
            });
        }

    public String getText() {
        return nickName;
    }

    public void setText(String text) {
        this.nickName= text;
        editText.setText(text);
        editText.setFocusable(true);
    }
}
