package lifecircle.activity.demo.sde.sdu.edu.activitylifecircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    //当Activity被创建时调用的方法
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate()");
        System.out.println("我是第1个Activity的onCreate()");
    }
    //当Activity用户可见时调用的方法
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart()");
        System.out.println("我是第1个Activity的onStart()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart()");
        System.out.println("我是第1个Activity的onRestart()");
    }
    //当Activity获得焦点时调用的方法
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume()");
        System.out.println("我是第1个Activity的onResume()");
    }
    //当Activity失去焦点时调用的方法
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause()");
        System.out.println("我是第1个Activity的onPause()");
    }

    //当Activity用户不可见时调用的方法
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop()");
        System.out.println("我是第1个Activity的onStop()");
    }
    //当Activity被销毁时调用的方法
    protected void onDestroy() {
        super.onStop();
        Log.i("MainActivity", "onDestroy()");
        System.out.println("我是第1个Activity的onDestroy()");
    }
    //界面中按钮点击事件
    public void click(View view){
        //创建一个Intent对象，通过这个对象开启第2个Activity
        Intent intent=new Intent(this,SecondaryActivity.class);
        startActivity(intent);
    }
}
