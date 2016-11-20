package thangnguyen.actititymaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by thangnguyen on 16/11/20.
 */
public class SingleInstanceActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleinstance);
        findViewById(R.id.button_singleInstance_activity_call_me).setOnClickListener(onClickButtonSingleInstanceActivityCallItself);
        findViewById(R.id.button_singleInstance_activity_call_singleTask_activity).setOnClickListener(onClickButtonSingleInstanceActivityCallSingleTaskActivity);
    }
    View.OnClickListener onClickButtonSingleInstanceActivityCallItself = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleInstanceActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonSingleInstanceActivityCallSingleTaskActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleTaskActivity.class);
            startActivity(intent);
        }
    };
}
