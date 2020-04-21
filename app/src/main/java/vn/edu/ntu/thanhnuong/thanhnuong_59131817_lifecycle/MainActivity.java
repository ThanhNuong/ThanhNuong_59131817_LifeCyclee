package vn.edu.ntu.thanhnuong.thanhnuong_59131817_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifeCycle", "onCreate called");
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strData = spf.format(new Date());
        txtTG.setText(strData);

        //phương thức Toast cho phương thức onCreate
        Toast.makeText(getApplicationContext(),"onCreate called", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifeCycle", "onStart called");

        //phương thức Toast cho phương thức onStart
        Toast.makeText(getApplicationContext(),"onStart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifeCycle", "onRestart called");
        //phương thức Toast cho phương thức onRestart
        Toast.makeText(getApplicationContext(),"onRestart called", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifeCycle", "onResume called");

        //phương thức Toast cho phương thức onResume
        Toast.makeText(getApplicationContext(),"onResume called", Toast.LENGTH_SHORT).show();

        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strData = spf.format(new Date());
        txtTG.setText(strData);

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifeCycle", "onPause called");
        //phương thức Toast cho phương thức onResume
        Toast.makeText(getApplicationContext(),"onResume called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifeCycle", "onStop called");
        //phương thức Toast cho phương thức onStop
        Toast.makeText(getApplicationContext(),"onStop called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifeCycle", "onDestroy called");
        //phương thức Toast cho phương thức onDestroy
        Toast.makeText(getApplicationContext(),"onDestroy called", Toast.LENGTH_SHORT).show();
    }

//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        Log.d("lifeCycle", "onRestoreInstanceState called");
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        Log.d("lifeCycle", "onSaveInstanceState called");
//    }
}

