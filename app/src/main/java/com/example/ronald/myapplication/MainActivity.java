package com.example.ronald.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.ronald.myapplication.R.color.maroon;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onStop(){
        super.onStop();
    }
    protected void onStart(){
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

    public void clickHandler(View view) {


        Button btn = (Button) view;
        int id = btn.getId();
        boolean clicked = isChosen(btn);
        int index = idnum(id);
        if( clicked == true && locked[index] == false) {
            btn.setBackgroundColor(-3355444);
        }
        else{
            btn.setBackgroundColor(-16777216);
        }
        Log.d("MainActivity", btn.getId() +"");
    }
    public int idnum(int id){
        int i;
        int[] buttons= new int[15];
        buttons = setbuttons();
        for( i =0; i<15; i++){
            if(buttons[i] == id){
                break;
            }
        }


        return i;
    }

    public boolean isChosen(Button btn){
        ColorDrawable buttonColor = (ColorDrawable) btn.getBackground();
        int colorId = buttonColor.getColor();
        if(colorId == -16777216){
            return true;
        }
        else return false;
    }

    public boolean player = false;
    public static boolean[] locked = new boolean[15];
    public static void locked(){
        for(int i = 0; i<15;i++)
            locked[i]=false;

    }
    public void changeTurn(View view) {
        TextView t = (TextView) findViewById(R.id.textView3);
        if(player == false) {
            t.setText("Player 2's turn");
            t.setTextSize(30);
            t.setTextColor(maroon);
            player = true;
        }
        else{
            t.setText("Player 1's turn");
            player = false;
        }
        int[] buttons= new int[15];
        buttons = setbuttons();
        for(int buttonid = 0; buttonid<15; buttonid++){
            int currentbtn = buttons[buttonid];
            Button btn = (Button) findViewById(currentbtn);
            ColorDrawable buttonColor = (ColorDrawable) btn.getBackground();
            int colorId = buttonColor.getColor();
            if(colorId == -16777216){
                locked[buttonid] = true;
            }

        }
        if(ifAll() == true){
            if(player == false){
                t.setText("Player 2 wins");
            }
            else{
                t.setText("Player 1 wins");
            }
            Button winner = new Button(this);
            winner.setText("would you like to play again?");
        }
    }
    public boolean ifAll(){
        boolean all = true;
        for(int i = 0; i<15; i++){
            if(locked[i]== false){
                all = false;
                break;
            }
        }
        return all;
    }

    private int[] setbuttons() {
        int[] buttons= new int[15];
        buttons[0] = 2131492949;
        buttons[1] = 2131492950;
        buttons[2] = 2131492947;
        buttons[3] = 2131492951;
        buttons[4] = 2131492952;
        buttons[5] = 2131492954;
        buttons[6] = 2131492955;
        buttons[7] = 2131492956;
        buttons[8] = 2131492953;
        buttons[9] = 2131492957;
        buttons[10] = 2131492958;
        buttons[11] = 2131492959;
        buttons[12] = 2131492960;
        buttons[13] = 2131492946;
        buttons[14] = 2131492961;


        return buttons;
    }

    public void restartClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
