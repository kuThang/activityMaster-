package thangnguyen.actititymaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by thangnguyen on 16/11/20.
 */
public class SingleTaskActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletask);
        findViewById(R.id.button_singleTask_activity_call_me).setOnClickListener(onClickButtonSingleTaskActivityCallItself);
        findViewById(R.id.button_singleTask_activity_call_singleTop_activity).setOnClickListener(onClickButtonSingleTaskActivityCallSingleTopActivity);
        findViewById(R.id.button_singleTask_activity_call_singleInstance_activity).setOnClickListener(onClickButtonSingleTaskActivityCallSingleInstanceActivity);
    }

    View.OnClickListener onClickButtonSingleTaskActivityCallItself = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleTaskActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonSingleTaskActivityCallSingleTopActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleTopActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonSingleTaskActivityCallSingleInstanceActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleInstanceActivity.class);
            startActivity(intent);
        }
    };
}
