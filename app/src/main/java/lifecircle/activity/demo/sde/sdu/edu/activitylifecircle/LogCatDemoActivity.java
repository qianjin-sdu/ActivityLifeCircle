package lifecircle.activity.demo.sde.sdu.edu.activitylifecircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LogCatDemoActivity extends AppCompatActivity {

    //当Activity被创建时调用的方法
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_cat_demo);
        Log.v("LogCatDemo", "Verbose");
        Log.d("LogCatDemo", "Debug");
        Log.i("LogCatDemo", "info");
        Log.w("LogCatDemo", "Warming");
        Log.e("LogCatDemo", "Error");
    }
}
