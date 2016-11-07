package lifecircle.activity.demo.sde.sdu.edu.activitylifecircle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondaryActivity extends AppCompatActivity {

    //当Activity被创建时调用的方法
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Log.i("Activity02", "onCreate()");
        System.out.println("我是第2个Activity的onCreate(),我开始运行了");
    }
    //当Activity用户可见时调用的方法
    protected void onStart() {
        super.onStart();
        Log.i("Activity02", "onStart()");
        System.out.println("我是第2个Activity的onStart(),你们可以看到我了");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("Activity02", "onRestart()");
        System.out.println("我是第2个Activity的onRestart(),我重新来了");
    }
    //当Activity获得焦点时调用的方法
    protected void onResume() {
        super.onResume();
        Log.i("Activity02", "onResume()");
        System.out.println("我是第2个Activity的onResume()方法，我获得焦点了");
    }
    //当Activity失去焦点时调用的方法
    protected void onPause() {
        super.onPause();
        Log.i("Activity02", "onPause()");
        System.out.println("我是第2个Activity的onPause()方法，我被Pause了");
    }

    //当Activity用户不可见时调用的方法
    protected void onStop() {
        super.onStop();
        Log.i("Activity02", "onStop()");
        System.out.println("我是第2个Activity的onStop()方法，我被stop了");
    }
    //当Activity被销毁时调用的方法
    protected void onDestroy() {
        super.onStop();
        Log.i("Activity02", "onDestroy()");
        System.out.println("我是第2个Activity的onDestroy()方法，我被销毁了");
    }


}
