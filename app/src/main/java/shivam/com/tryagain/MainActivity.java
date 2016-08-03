package shivam.com.tryagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int n,um,am;       //um=user move , am=AI move
    TextView clue,count,com,user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clue= (TextView) findViewById(R.id.clue);
        count= (TextView) findViewById(R.id.count);
        com= (TextView) findViewById(R.id.com);
        user= (TextView) findViewById(R.id.user);

        n=25;
    }


    public void one( View v){
        n-=1;
        um=1;
        update();
    }

    public void two( View v){
        n-=2;
        um=2;
        update();
    }

    public void three( View v){
        n-=3;
        um=3;
        update();
    }

    private void update(){
        count.setText(n+"");

        clue.setText("Computer is thinking....");
        comTurn();

        clue.setText("Your turn");
    }


    private void comTurn(){

        //Logic

        if(n%4==0){
            am=3;
        }
        else if((n+1)%4==0){
            am=2;
        }
        else if((n+2)%4==0){
            am=1;
        }

        n-=am;
        count.setText(n+"");
        user.setText("You picked "+um+" sticks.");
        com.setText("AI picked "+am+" stikcs.");
        if (n==1){
            Intent i= new Intent(this, ResultAC.class);
            this.startActivity(i);
        }
    }

    public void reset (View v){
        n=25;
        clue.setText("Your trun");
        user.setText("");
        com.setText("");
        count.setText(n+"");
    }



}
