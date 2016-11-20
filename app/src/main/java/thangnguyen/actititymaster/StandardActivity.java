package thangnguyen.actititymaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by thangnguyen on 16/11/20.
 */
public class StandardActivity extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        findViewById(R.id.button_standard_activity_call_itself).setOnClickListener(onClickButtonStandardActivityCallItself);
        findViewById(R.id.button_standard_activity_call_itself_with_clear_top).setOnClickListener(onClickButtonStandardActivityCallItselfWithCLEAR_TOP);
        findViewById(R.id.button_standard_activity_call_itself_with_clear_task).setOnClickListener(onClickButtonStandardActivityCallItselfCLEAR_TASK);
        findViewById(R.id.button_standard_activity_call_itself_with_single_top).setOnClickListener(onClickButtonStandardActivityCallItselfSINGLE_TASK);

        findViewById(R.id.button_standard_activity_call_singleTop_Activity).setOnClickListener(onClickButtonStandardActivityCallSingleTopActivity);
        findViewById(R.id.button_standard_activity_call_singleTask_Activity).setOnClickListener(onClickButtonStandardActivityCallSingleTaskActivity);
    }

    View.OnClickListener onClickButtonStandardActivityCallItself = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), StandardActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonStandardActivityCallItselfWithCLEAR_TOP = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), StandardActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonStandardActivityCallItselfCLEAR_TASK = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), StandardActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonStandardActivityCallItselfSINGLE_TASK = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), StandardActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonStandardActivityCallSingleTopActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleTopActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickButtonStandardActivityCallSingleTaskActivity = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SingleTaskActivity.class);
            startActivity(intent);
        }
    };
}
