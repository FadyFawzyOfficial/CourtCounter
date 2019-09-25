package com.engineerfadyfawzi.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA( int score )
    {
        TextView scoreView = ( TextView ) findViewById( R.id.team_a_score );
        scoreView.setText( String.valueOf( score ) );
    }
}