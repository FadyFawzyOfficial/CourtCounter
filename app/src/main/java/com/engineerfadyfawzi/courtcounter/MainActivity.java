package com.engineerfadyfawzi.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreTeamA = 0;
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    
    /**
     * Increase the score for Team A by 1 point.
     *
     * @param view
     */
    public void addOneForTeamA( View view )
    {
        displayForTeamA( 1 );
    }
    
    /**
     * Increase the score for Team A by 2 points.
     *
     * @param view
     */
    public void addTwoForTeamA( View view )
    {
        displayForTeamA( 2 );
    }
    
    /**
     * Increase the score for Team A by 3 points.
     *
     * @param view
     */
    public void addThreeForTeamA( View view )
    {
        displayForTeamA( 3 );
    }
    
    /**
     * Displays the given score for Team A.
     *
     * @param score
     */
    public void displayForTeamA( int score )
    {
        TextView scoreView = ( TextView ) findViewById( R.id.team_a_score );
        scoreView.setText( String.valueOf( score ) );
    }
}