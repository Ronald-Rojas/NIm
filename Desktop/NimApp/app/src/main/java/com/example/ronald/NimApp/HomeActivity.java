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
<<<<<<< HEAD
import android.widget.Toast;

import com.example.ronald.nimapp.R;

import java.util.Random;

import static com.example.ronald.nimapp.R.layout.activity_game;
import static com.example.ronald.nimapp.R.layout.activity_game_ai;
=======

import com.example.ronald.nimapp.R;

import static com.example.ronald.nimapp.R.layout.activity_game;
>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
import static com.example.ronald.nimapp.R.layout.activity_home;
import static com.example.ronald.nimapp.R.layout.activity_settings;
import static com.example.ronald.nimapp.R.layout.activity_win;


public class HomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
<<<<<<< HEAD
        //Starts the game on the home screen
=======
>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

<<<<<<< HEAD
/**   ###########
   ###############        __-----__          ##
 ##################    ###          \       ####
 ################## #### #            \     # ##
  ####################            \~~\  \   ,##",
   #################       /~~\    \## \  \"     :
     ###############       \    \   \##" /       :
              #######       \### \    /         :
              #############  \###/             :
                ########                       :
                  ######   __                  :
                   ####   /\                  /
        ############ ###    \\______________/
     ##################     \ __         / /
   ####################\__    \  \---\,/ /
   ###################    \     \_____/ /
    #################       \_________/
    ###############
     ###########
 **/
=======

>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
<<<<<<< HEAD
=======

>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
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
<<<<<<< HEAD
        }
        return super.onOptionsItemSelected(item);
    }
    // "onePlayer" decides if it will be single player game with an AI or a two players with two people
    public boolean onePlayer = true;
    public int rowNumPicked = 4;
    // this method will register the button that was pressed
    // then change the visual representation of the button pressed
=======

        }

        return super.onOptionsItemSelected(item);
    }
    public boolean onePlayer = false;

>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
    public void changecolor(View view) {


        Button btn = (Button) view;
        int id = btn.getId();
        int index = idnum(id);
<<<<<<< HEAD
        int rowNumcurrent;
        if(index < 3) rowNumcurrent = 1;
        else if(index < 8) rowNumcurrent = 2;
        else rowNumcurrent = 3;
        if(rowNumcurrent == rowNumPicked || rowNumPicked == 4){
            rowNumPicked = rowNumcurrent;
            if(picked[index] && !locked[index]) {
            btn.setBackgroundColor(-3355444);
            picked[index] = false;
            }
            else{
                btn.setBackgroundColor(-16777216);
                picked[index] = true;
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "stay on the same row bub", Toast.LENGTH_SHORT).show();
        }
    }
    // idnum
=======

        if( picked[index] == true && locked[index] == false) {
            btn.setBackgroundColor(-3355444);
            picked[index] = false;
        }
        else{
            btn.setBackgroundColor(-16777216);
            picked[index] = true;
        }
    }
>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
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
<<<<<<< HEAD
    public boolean[][] rows = new boolean[3][];
    public void resetRows() {
        for(int i = 0; i<3 ; i++){
            rows[0][i] = false;
        }
        for(int i = 0; i<5; i++){
            rows[1][i] = false;
        }
        for(int i = 0 ; i<7; i++){
            rows[2][i] = false;
        }
    }
    // This "SomethingPicked function will check to see if the user made a move on at least one button
    public boolean somethingPicked(){
        boolean change = false;
        for( int i =0; i<15; i++){
            if(picked[i] != locked[i]){
                change = true;
            }
        }
        return change;
    }
    // "changeTurn" will be called on a two player game
    // it will change the turn from first to second player and vice versa
    public void changeTurn(View view) {
        TextView t = (TextView) findViewById(R.id.playerTurn);
        LinearLayout background = (LinearLayout) findViewById(R.id.game);
        boolean change = somethingPicked();
        if(change) {
            rowNumPicked = 4;
            if (player == false) {
                t.setText("Player 2's turn");
                player = true;
                background.setBackgroundColor(-1348352);
            } else {
                t.setText("Player 1's turn");
                player = false;
                background.setBackgroundColor(-1336832);
            }
            int[] buttons = new int[15];
            buttons = setbuttons();
            for (int buttonid = 0; buttonid < 15; buttonid++) {
                int currentbtn = buttons[buttonid];
                Button btn = (Button) findViewById(currentbtn);
                ColorDrawable buttonColor = (ColorDrawable) btn.getBackground();
                int colorId = buttonColor.getColor();
                if (colorId == -16777216) {
                    locked[buttonid] = true;
                }

            }
            if (ifAll() == true) {
                setContentView(activity_win);
                t = (TextView) findViewById(R.id.winText);
                if (player == false) {
                    t.setText("Player 1 wins!");
                } else {
                    t.setText("Player 2 wins!");

                }
            }
        }
    }
    //"changeTurnAI" will be called on a one player game
    public void changeTurnAI(View view) {
        /**the algorithm for solving Nim involves finding out how many times you
         * can divide each row by 4, then the remainder of that by 2, than the
         * remainder of that by 1. Then you find out if the number of 4's 2's and 1's
         * can be divided into pairs. The if there is a not paired 4, 2, or 1, you must
         * subtract that amount on your turn. By following these rules the computer will always
         * win if it goes first and will only win when it goes second if the player makes a
         * mistake.
         * This will work the majority of the time but there are certain combinatiosn that this
         * does not work with this algorithm. These instances were accounted for.
         * for a more detailed explanation on how to win at nim visit the url below
         * http://www.archimedes-lab.org/How_to_Solve/Win_at_Nim.html
         */
        boolean change = somethingPicked();
        if(change) {
            rowNumPicked = 4;
            TextView t = (TextView) findViewById(R.id.playerTurn);
            LinearLayout background = (LinearLayout) findViewById(R.id.game);
            t.setText("AI's turn");
            background.setBackgroundColor( -1348352);
            int[] buttons = new int[15];
            buttons = setbuttons();
            for (int buttonid = 0; buttonid < 15; buttonid++) {
                int currentbtn = buttons[buttonid];
                Button btn = (Button) findViewById(currentbtn);
                ColorDrawable buttonColor = (ColorDrawable) btn.getBackground();
                int colorId = buttonColor.getColor();
                if (colorId == -16777216) {
                    locked[buttonid] = true;
                }

            }
            if (ifAll() == true) {
                setContentView(activity_win);
                t = (TextView) findViewById(R.id.winText);
                if (player == false) {
                    setContentView(R.layout.activity_win);
                    TextView winner = (TextView) findViewById(R.id.winText);
                    winner.setText("Too Bad! You lose!");
                }
            }
            aiMove(t);


            t.setText("Player's turn");
            background.setBackgroundColor(-1336832);
        }
        else{
            Toast.makeText(getApplicationContext(), "You need to click at least one button",Toast.LENGTH_SHORT).show();
        }
    }

    private TextView aiMove(TextView t) {
        int row1Total = 0;
        int row2Total = 0;
        int row3Total = 0;
        int row1_4 = 0;
        int row1_2 = 0;
        int row1_1 = 0;
        int row2_4 = 0;
        int row2_2 = 0;
        int row2_1 = 0;
        int row3_4 = 0;
        int row3_2 = 0;
        int row3_1 = 0;
        int Subtract = 0;
        // the following 3 for loops detemines how many buttons have not been pressed yet
        for (int i = 0; i < 3; i++) {
            if (locked[i] == false) {
                row1Total++;
            }
        }

        for (int i = 3; i < 8; i++) {
            if (locked[i] == false) {
                row2Total++;
            }
        }

        for (int i = 8; i < 15; i++) {
            if (locked[i] == false) {
                row3Total++;
            }
        }

        // All of these "if" loops are needed in order to find out if there are 4,2, or 1, unclicked
        // buttons in each of the rows
        if (row1Total / 4 == 1) {
            row1Total = row1Total - 4;
            row1_4 = 1;
        }
        if (row1Total / 2 == 1) {
            row1Total = row1Total - 2;
            row1_2 = 1;
        }
        if (row1Total / 1 == 1) {
            row1Total--;
            row1_1 = 1;
        }
        if (row2Total / 4 == 1) {
            row2Total = row2Total - 4;
            row2_4 = 1;
        }
        if (row2Total / 2 == 1) {
            row2Total = row2Total - 2;
            row2_2 = 1;
        }
        if (row2Total / 1 == 1) {
            row2Total--;
            row2_1++;
        }
        if (row3Total / 4 == 1) {
            row3Total = row3Total - 4;
            row3_4 = 1;
        }
        if (row3Total / 2 == 1) {
            row3Total = row3Total - 2;
            row3_2 = 1;
        }
        if (row3Total / 1 == 1) {
            row3Total--;
            row3_1 = 1;
        }

        // The following three if statements will decide if the AI will
        // add 4,2, or 1 to the total it needs to subtract by
        boolean Subtract4 = false;
        boolean Subtract2 = false;
        boolean Subtract1 = false;
        if ((row1_4 + row2_4 + row3_4) % 2 != 0) {
            Subtract += 4;
            Subtract4 = true;

        }
        if ((row1_2 + row2_2 + row3_2) % 2 != 0) {
            Subtract += 2;
            Subtract2 = true;

        }
        if ((row1_1 + row2_1 + row3_1) % 2 != 0) {
            Subtract += 1;
            Subtract1 = true;
        }

        boolean toRow1 = true;
        boolean toRow2 = true;
        boolean toRow3 = true;
        // if "Subtract" = 0 then the player has not made a mistake
        // and the AI will make a random move
        if (Subtract == 0) {
            //Todo add random, 1 to 3, number of clicks to a random row
            //ToDo make sure to check for completed rows
            Random rand = new Random();
            int randrow = rand.nextInt(3) ;
            Subtract = rand.nextInt(3) + 1;
            boolean ok = false;
            int currentRowTotal = 0;
            while(!ok){
                currentRowTotal = 0;
                if(randrow == 0 ){
                    if(row1_1 == 1) currentRowTotal ++;
                    if(row1_2 == 1) currentRowTotal += 2;
                    if(row1_4 == 1) currentRowTotal += 4;
                    if( Subtract <= currentRowTotal){
                        ok = true;
                    }
                    else{
                        Subtract = rand.nextInt(3) +1;
                        randrow = rand.nextInt(3);
                    }
                }
                else if(randrow == 1){
                    if(row2_1 == 1) currentRowTotal ++;
                    if(row2_2 == 1) currentRowTotal += 2;
                    if(row3_4 == 1) currentRowTotal += 4;
                    if(Subtract <= currentRowTotal){
                        ok = true;
                    }
                    else{
                        Subtract = rand.nextInt(3) + 1;
                        randrow = rand.nextInt(3);
                    }
                }
                else{
                    if(row3_1 == 1) currentRowTotal ++;
                    if(row3_2 == 1) currentRowTotal += 2;
                    if(row3_4 == 1) currentRowTotal += 4;
                    if(Subtract <= currentRowTotal){
                        ok = true;
                    }
                    else{
                        Subtract = rand.nextInt(3) + 1;
                        randrow = rand.nextInt(3);
                    }
                }
            }
            if (randrow == 0) {
                while (Subtract != 0) {
                    if (!locked[0]) {
                        locked[0] = true;
                        Button btn = (Button) findViewById(R.id.button1);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[1]) {
                        locked[1] = true;
                        Button btn = (Button) findViewById(R.id.button2);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[2]) {
                        locked[2] = true;
                        Button btn = (Button) findViewById(R.id.button3);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    break;
                }
            } else if (randrow == 1) {
                while (Subtract != 0) {
                    if (!locked[3]) {
                        locked[3] = true;
                        Button btn = (Button) findViewById(R.id.button4);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[4]) {
                        locked[4] = true;
                        Button btn = (Button) findViewById(R.id.button5);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[5]) {
                        locked[5] = true;
                        Button btn = (Button) findViewById(R.id.button6);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[6]) {
                        locked[6] = true;
                        Button btn = (Button) findViewById(R.id.button7);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[7]) {
                        locked[7] = true;
                        Button btn = (Button) findViewById(R.id.button8);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    break;

                }
            } else {
                while (Subtract != 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (!locked[8]) {
                        locked[8] = true;
                        Button btn = (Button) findViewById(R.id.button9);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[9]) {
                        locked[9] = true;
                        Button btn = (Button) findViewById(R.id.button10);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[10]) {
                        locked[10] = true;
                        Button btn = (Button) findViewById(R.id.button11);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[11]) {
                        locked[11] = true;
                        Button btn = (Button) findViewById(R.id.button12);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[12]) {
                        locked[12] = true;
                        Button btn = (Button) findViewById(R.id.button13);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[13]) {
                        locked[13] = true;
                        Button btn = (Button) findViewById(R.id.button14);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[14]) {
                        locked[14] = true;
                        Button btn = (Button) findViewById(R.id.button15);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    break;
                }
            }
        }
        // else it will make the correct move at the right row
        else {
            if (Subtract4) {
                if (row1_4 == 0) {
                    toRow1 = false;
                }
                if (row2_4 == 0) {
                    toRow2 = false;
                }
                if (row3_4 == 0) {
                    toRow3 = false;
                }
            }
            if (Subtract2) {
                if (row1_2 == 0) {
                    toRow1 = false;
                }
                if (row2_2 == 0) {
                    toRow2 = false;
                }
                if (row3_2 == 0) {
                    toRow3 = false;
                }
            }
            if (Subtract1) {
                if (row1_1 == 0) {
                    toRow1 = false;
                }
                if (row2_1 == 0) {
                    toRow2 = false;
                }
                if (row3_1 == 0) {
                    toRow3 = false;
                }
            }
            // the following many "if" and " else" statements will decide the row to go
            // depending on the the situation that the robot finds itself in
            if (Subtract == 3 && row1_1 + row1_2 + row1_4 + row2_1 + row2_2 + row2_4 + row3_1 + row3_2 + row3_4 == 2) {
                Subtract = 2;
                if (row1_2 == 1) {
                    toRow1 = true;
                    toRow2 = false;
                    toRow3 = false;
                } else if (row2_2 == 1) {
                    toRow1 = false;
                    toRow2 = true;
                    toRow3 = false;
                } else {
                    toRow1 = false;
                    toRow2 = false;
                    toRow3 = true;
                }
            }
            if (Subtract == 7 && row3_1 + row3_2 + row3_4 != 3) {
                if (row1_1 + row1_4 == 2 || row2_1 + row2_4 == 2 || row3_1 + row3_4 == 2) {
                    Subtract = 3;
                    if (row1_1 + row1_4 == 2) {
                        toRow1 = true;
                        toRow2 = false;
                        toRow3 = false;
                    } else if (row2_1 + row2_4 == 2) {
                        toRow1 = false;
                        toRow2 = true;
                        toRow3 = false;
                    } else if (row3_1 + row3_4 == 2) {
                        toRow1 = false;
                        toRow2 = false;
                        toRow3 = true;
                    } else {
                        if (row1_4 == 1) {
                            toRow1 = true;
                            toRow2 = false;
                            toRow3 = false;
                        } else if (row2_4 == 1) {
                            toRow1 = false;
                            toRow2 = true;
                            toRow3 = false;
                        } else {
                            toRow1 = false;
                            toRow2 = false;
                            toRow3 = true;
                        }
                    }
                } else {
                    Subtract = 1;
                    if (row1_4 == 1) {
                        toRow1 = true;
                        toRow2 = false;
                        toRow3 = false;
                    } else if (row2_4 == 1) {
                        toRow1 = false;
                        toRow2 = true;
                        toRow3 = false;
                    } else {
                        toRow1 = false;
                        toRow2 = false;
                        toRow3 = true;
                    }
                }
            }

            if (toRow1) {
                while (Subtract != 0) {
                    if (!locked[0]) {
                        locked[0] = true;
                        Button btn = (Button) findViewById(R.id.button1);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[1]) {
                        locked[1] = true;
                        Button btn = (Button) findViewById(R.id.button2);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[2]) {
                        locked[2] = true;
                        Button btn = (Button) findViewById(R.id.button3);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                }
            } else if (toRow2) {
                while (Subtract != 0) {
                    if (!locked[3]) {
                        locked[3] = true;
                        Button btn = (Button) findViewById(R.id.button4);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[4]) {
                        locked[4] = true;
                        Button btn = (Button) findViewById(R.id.button5);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[5]) {
                        locked[5] = true;
                        Button btn = (Button) findViewById(R.id.button6);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[6]) {
                        locked[6] = true;
                        Button btn = (Button) findViewById(R.id.button7);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[7]) {
                        locked[7] = true;
                        Button btn = (Button) findViewById(R.id.button8);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }

                }
            } else {
                while (Subtract != 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (!locked[8]) {
                        locked[8] = true;
                        Button btn = (Button) findViewById(R.id.button9);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[9]) {
                        locked[9] = true;
                        Button btn = (Button) findViewById(R.id.button10);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[10]) {
                        locked[10] = true;
                        Button btn = (Button) findViewById(R.id.button11);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[11]) {
                        locked[11] = true;
                        Button btn = (Button) findViewById(R.id.button12);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[12]) {
                        locked[12] = true;
                        Button btn = (Button) findViewById(R.id.button13);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[13]) {
                        locked[13] = true;
                        Button btn = (Button) findViewById(R.id.button14);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                    if (!locked[14]) {
                        locked[14] = true;
                        Button btn = (Button) findViewById(R.id.button15);
                        btn.setBackgroundColor(-16777216);
                        Subtract--;
                        if (Subtract == 0) break;
                    }
                }
            }
            if (ifAll() == true) {
                setContentView(activity_win);
                t = (TextView) findViewById(R.id.winText);
                if (player == false) {
                    setContentView(R.layout.activity_win);
                    TextView winner = (TextView) findViewById(R.id.winText);
                    winner.setText("Congratulations! You beat the Master Ai!");
                }
            }
        }
        return t;
    }

    // this function checks to see if all the buttons have been chosen
    public boolean ifAll(){
        boolean allClicked = true;
        for(int i = 0; i<15; i++){
            Log.d("MainActivity", locked[i] + "");
            if(locked[i]== false){
                allClicked = false;
                break;
            }
        }
        return allClicked;
    }
=======
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

>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
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

<<<<<<< HEAD
    }

    public void startNewGame(View view) {
        if(!onePlayer) {
            setContentView(activity_game);
            reset();
        }
        else{
            setContentView(activity_game_ai);
            reset();
            if(!first){
                TextView t = (TextView) findViewById(R.id.playerTurn);
                aiMove(t);
            }

        }
=======

    }

    public void startNewGame(View view) {
        setContentView(activity_game);
        reset();
>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
    }

    public void goHome(View view) {
        setContentView(activity_home);
    }

    public void settings(View view) {
        setContentView(activity_settings);
    }

    public void twoPlayer(View view) {
        onePlayer = false;
<<<<<<< HEAD
        TextView numberPlayers = (TextView) findViewById(R.id.numPlayers);
        numberPlayers.setText("The game will be in two players");
=======
>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
    }

    public void onePlayer(View view) {
        onePlayer = true;
<<<<<<< HEAD
        TextView numberPlayers = (TextView) findViewById(R.id.numPlayers);
        numberPlayers.setText("You will battle the AI!");

    }

    public boolean first = true;
    public void goFirst(View view) {
        first = true;
    }

    public void goSecond(View view) {
        first = false;
=======
>>>>>>> 0c46544ad7e4b642ed610514642b568800ce2aeb
    }
}