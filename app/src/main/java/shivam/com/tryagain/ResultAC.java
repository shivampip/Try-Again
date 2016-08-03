package shivam.com.tryagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultAC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_ly);
    }

    public void retry(View v){
        Intent i= new Intent(this, MainActivity.class);
        this.startActivity(i);
    }

    //Added from Github site
    //Added from Master site
    public void gitDemo(){
        int a=12;
    }

}
