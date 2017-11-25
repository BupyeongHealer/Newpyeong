package com.example.healer.pyeonchang;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

/**
 * Created by ssop6 on 2017-11-22.
 */

public class BoardActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EditText editText;
    Button sendButton;
    String userName = "";
    ArrayAdapter adapter;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        recyclerView = (RecyclerView) findViewById(R.id.board_list);
        editText = (EditText)findViewById(R.id.board_send_text);
        sendButton = (Button)findViewById(R.id.board_send_button);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        final List<ContentData> boardItems = new ArrayList<ContentData>();
       final BoardRecyclerAdapter adapter =  new BoardRecyclerAdapter(getApplicationContext(), boardItems,R.layout.activity_board);
        recyclerView.setAdapter(adapter);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder time = new StringBuilder();
                Calendar cal = new GregorianCalendar();

                time.append(String.format("%d.%d.%d, %d:%d",
                        cal.get(Calendar.YEAR),
                        cal.get(Calendar.MONTH) + 1,
                        cal.get(Calendar.DAY_OF_MONTH),
                        cal.get(Calendar.HOUR_OF_DAY),
                        cal.get(Calendar.MINUTE)));
                System.out.println(time.toString());
                ContentData chatData = new ContentData(userName, editText.getText().toString(),time.toString());  // 유저 이름과 메세지로 chatData 만들기
                databaseReference.child("message").push().setValue(chatData);  // 기본 database 하위 message라는 child에 chatData를 list로 만들기
                editText.setText("");
            }
        });

        databaseReference.child("message").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                ContentData chatData = dataSnapshot.getValue(ContentData.class);  // chatData를 가져오고
                adapter.addMessage(new ContentData(chatData.getUserName(),chatData.getMessage(),chatData.getTime()));  // adapter에 추가합니다.
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        makeDialog();
    }

    public void makeDialog(){
        final NickNameDialog dialog = new NickNameDialog(this);
        dialog.setOnShowListener(new DialogInterface.OnShowListener(){

            @Override
            public void onShow(DialogInterface dialogInterface) {
            }
        });

        dialog.setOnDismissListener(new DialogInterface.OnDismissListener(){

            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                userName = dialog.getText();
            }
        });

        dialog.show();
    }

}
