package thangnguyen.actititymaster;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_standard_activity).setOnClickListener(onClickButtonStandardActivity);
        findViewById(R.id.button_singleTop_activity).setOnClickListener(onClickButtonSingleTopActivity);
        findViewById(R.id.button_singleTask_activity).setOnClickListener(onClickButtonSingleTaskActivity);
        findViewById(R.id.button_singleInstance_activity).setOnClickListener(onClickButtonSingleInstanceActivity);
    }
    private View.OnClickListener onClickButtonStandardActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), StandardActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener onClickButtonSingleTopActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleTopActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener onClickButtonSingleTaskActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleTaskActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener onClickButtonSingleInstanceActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleInstanceActivity.class);
            startActivity(intent);
        }
    };
}
