package com.example.studentdemo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;
import java.util.jar.Attributes;

/**
 * Created by subho on 22/3/17.
 */

public class MainActivity extends Activity {
    private TextView editView;
    private EditText editName;
    private EditText editDepartment;
    private EditText editRoll;
    private EditText editPhone;
    private Button buttonReset;
    private Button buttonSave;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editView = (TextView) findViewById(R.id.edit_view);
        editName = (EditText) findViewById(R.id.edit_name);
        editDepartment = (EditText) findViewById(R.id.edit_department);
        editRoll = (EditText) findViewById(R.id.edit_rollnumber);
        editPhone = (EditText) findViewById(R.id.edit_phonenumber);
        buttonReset = (Button) findViewById(R.id.button_reset);
        buttonSave = (Button) findViewById(R.id.button_save);

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editName.setText("");
                editDepartment.setText("");
                editRoll.setText("");
                editPhone.setText("");
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog_layout);
                dialog.setTitle("Student Form");
                TextView textName = (TextView) dialog.findViewById(R.id.text_name);
                TextView textDept = (TextView) dialog.findViewById(R.id.text_dept);
                TextView textRoll = (TextView) dialog.findViewById(R.id.text_roll);
                TextView textPhone = (TextView) dialog.findViewById(R.id.text_phone);
                textName.setText("Name :"+editName.getText().toString());
                textDept.setText("Department Name :"+editDepartment.getText().toString());
                textRoll.setText("Roll No :"+editRoll.getText().toString());
                textPhone.setText("Phone No :"+editPhone.getText().toString());
                dialog.show();

            }
        });

    }
}
