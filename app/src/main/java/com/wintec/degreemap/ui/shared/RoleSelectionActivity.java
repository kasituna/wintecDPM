 package com.wintec.degreemap.ui.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wintec.degreemap.ui.manager.ManagerLogin;
import com.wintec.degreemap.R;
import com.wintec.degreemap.ui.student.Student_Home;

 public class RoleSelectionActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection);
    }

    // Method for users to select role: [Student] or [Manager]
     public void jumpTo(View view) {
         Intent i = null;
         switch (view.getId()){
             case R.id.btn_student:
                 i = new Intent(this, Student_Home.class);
                 startActivity(i);
                 break;
             case R.id.btn_manager:
                 i = new Intent(this, ManagerLogin.class);
                 startActivity(i);
                 break;

         }
     }



 }