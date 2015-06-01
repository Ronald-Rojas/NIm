package com.example.ronald.NimApp;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ronald.nimapp.R;

import static com.example.ronald.nimapp.R.layout.activity_game;
import static com.example.ronald.nimapp.R.layout.activity_home;
import static com.example.ronald.nimapp.R.layout.activity_settings;
import static com.example.ronald.nimapp.R.layout.activity_win;


public class HomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);

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
    public boolean onePlayer = false;

    public void changecolor(View view) {


        Button btn = (Button) view;
        int id = btn.getId();
        int index = idnum(id);

        if( picked[index] == true && locked[index] == false) {
            btn.setBackgroundColor(-3355444);
            picked[index] = false;
        }
        else{
            btn.setBackgroundColor(-16777216);
            picked[index] = true;
        }
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


    public boolean isChosen(Button btn, int index){
        Log.wtf("HomeActiviy", locked[index] + "");

        if(picked[index] == true){
            return true;
        }
        else return false;
    }
    public static boolean[] picked = new boolean[15];

    public boolean player = false;
    public static boolean[] locked = new boolean[15];
    public void reset(){
        for(int i = 0; i<15;i++) {
            locked[i] = false;
            picked[i] = false;

        }
        backgroundreset();


    }

    public void backgroundreset() {
        Log.wtf("HomeActivity", "it worked!" + "");
        Button btn;
        btn = (Button) findViewById(R.id.button1);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button2);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button3);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button4);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button5);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button6);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button7);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button8);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button9);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button10);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button11);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button12);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button13);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button14);
        btn.setBackgroundColor(-3355444);
        btn = (Button) findViewById(R.id.button15);
        btn.setBackgroundColor(-3355444);
    }
    public void changeTurn(View view) {
        TextView t = (TextView) findViewById(R.id.playerTurn);
        LinearLayout background = (LinearLayout) findViewById(R.id.game);

        if(player == false) {
            t.setText("Player 2's turn");
            player = true;
            background.setBackgroundColor( -1348352);
        }
        else{
            t.setText("Player 1's turn");
            player = false;
            background.setBackgroundColor(-1336832);
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
            setContentView(activity_win);
            t = (TextView) findViewById(R.id.winText);
            if(player == false){
                t.setText("Player 1 wins!");
            }
            else{
                t.setText("Player 2 wins!");

            }
        }
    }
    public boolean ifAll(){
        boolean all = true;
        for(int i = 0; i<13; i++){
            Log.d("MainActivity", locked[i] + "");
            if(locked[i]== false){
                all = false;
                break;
            }
        }
        return all;
    }

    private int[] setbuttons() {
        int[] buttons= new int[15];
        buttons[0] = R.id.button1;
        buttons[1] = R.id.button2;
        buttons[2] = R.id.button3;
        buttons[3] = R.id.button4;
        buttons[4] = R.id.button5;
        buttons[5] = R.id.button6;
        buttons[6] = R.id.button7;
        buttons[7] = R.id.button8;
        buttons[8] = R.id.button9;
        buttons[9] = R.id.button10;
        buttons[10] = R.id.button11;
        buttons[11] = R.id.button12;
        buttons[12] = R.id.button13;
        buttons[13] = R.id.button14;
        buttons[14] = R.id.button15;


        return buttons;
    }

    public void restartClick() {
        for(int i = 0; i<15;i++)
            locked[i]=false;
        setContentView(activity_game);


    }

    public void startNewGame(View view) {
        setContentView(activity_game);
        reset();
    }

    public void goHome(View view) {
        setContentView(activity_home);
    }

    public void settings(View view) {
        setContentView(activity_settings);
    }

    public void twoPlayer(View view) {
        onePlayer = false;
    }

    public void onePlayer(View view) {
        onePlayer = true;
    }
}