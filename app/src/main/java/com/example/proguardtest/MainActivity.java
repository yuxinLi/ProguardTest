package com.example.proguardtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String toastTip = "toast in MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, new MyFragment()).commit();
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                methodWithGlobalVariable();
                methodWithLocalVariable();
                Utils utils = new Utils();
                utils.methodNormal();
//                NativeUtils.methodNative();
                NativeUtils.methodNotNative();
//                Connector.getDatabase();
            }
        });
    }

    public void methodWithGlobalVariable() {
        Toast.makeText(MainActivity.this, toastTip, Toast.LENGTH_SHORT).show();
    }

    public void methodWithLocalVariable() {
        String logMessage = "log in MainActivity";
        logMessage = logMessage.toLowerCase();
        System.out.println(logMessage);
    }

}
