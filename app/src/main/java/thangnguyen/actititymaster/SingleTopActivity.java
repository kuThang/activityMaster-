package thangnguyen.actititymaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by thangnguyen on 16/11/20.
 */
public class SingleTopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        if(!isTaskRoot()){
//            finish();
//        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletop);
        findViewById(R.id.button_singleTop_activity_call_me).setOnClickListener(onClickButtonSingleTopActivityCallItself);
        findViewById(R.id.button_singleTop_activity_call_standard_activity).setOnClickListener(onClickButtonSingleTopActivityCallStandardActivity);
        findViewById(R.id.button_singleTop_activity_call_standard_activity_with_CLEAR_TASK).setOnClickListener(onClickButtonSingleTopActivityCallStandardActivityWithCLEARTASK);
        findViewById(R.id.button_singleTop_activity_call_standard_activity_with_CLEAR_TOP).setOnClickListener(onClickButtonSingleTopActivityCallStandardActivityWithCLEARTOP);

        findViewById(R.id.button_singleTop_activity_call_singleInstance_activity).setOnClickListener(onClickButtonSingleTopActivityCallSingleInstanceActivity);
    }

    View.OnClickListener onClickButtonSingleTopActivityCallItself = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleTopActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonSingleTopActivityCallStandardActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), StandardActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonSingleTopActivityCallStandardActivityWithCLEARTASK = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), StandardActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonSingleTopActivityCallStandardActivityWithCLEARTOP = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), StandardActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonSingleTopActivityCallSingleInstanceActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleInstanceActivity.class);
            startActivity(intent);
        }
    };
}
