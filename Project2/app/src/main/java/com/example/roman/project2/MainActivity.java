package com.example.roman.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Maak statische punt waarden
    final int BUITEN_PUNTEN = 3;
    final int BINNEN_PUNTEN = 2;
    final int VRIJ_PUNTEN = 1;
    //Teams beginnen met 0 punten
    int team_1_score = 0;
    int team_2_score = 0;
    String team_1_naam = "Team 1";
    String team_2_naam = "Team 2";
    EditText team_1_naam_et;
    EditText team_2_naam_et;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* spel knoppen hieronder*/

    /* reset het spel */
    /* gebruik een view om makkelijk te vinden welke id's worden ingedrukt */
    public void herstartSpel(View v) {
        team_1_score = 0;
        team_2_score = 0;

        updateScore1(team_1_score);
        updateScore2(team_2_score);

        team_1_naam_et = findViewById(R.id.setTeamNaam1);
        team_2_naam_et = findViewById(R.id.setTeamNaam2);

        team_1_naam = team_1_naam_et.getText().toString();
        team_2_naam = team_2_naam_et.getText().toString();

        updateNaam1(team_1_naam);
        updateNaam2(team_2_naam);
    }
    /* scores worden hier uitgedeeld */
    /* Nogmaals wordt hier een view gebruikt om in de java code te vinden op welke knoppen er zijn gedrukt */
        public void updateScores(View v){
            /* switch met verschillende resultaten, v.getId() vangt de ID op van de gedrukte knop(view) */
            switch(v.getId()){
            /* "als de id die gevonden 'R.id.team1plus' is dan geef je WIN_PUNTEN aan team_1_score en etc voor alle andere knoppen*/
                case R.id.team1buiten:
                    team_1_score += BUITEN_PUNTEN;
                    break;
                case R.id.team1binnen:
                    team_1_score += BINNEN_PUNTEN;
                    break;
                case R.id.team1vrij:
                    team_1_score += VRIJ_PUNTEN;
                    break;

                case R.id.team2buiten:
                    team_2_score += BUITEN_PUNTEN;
                    break;
                case R.id.team2binnen:
                    team_2_score += BINNEN_PUNTEN;
                    break;
                case R.id.team2vrij:
                    team_2_score += VRIJ_PUNTEN;
                    break;
                default:
                    break;
            }
            /* de variabelen worden geupdate naar de TextView */
            updateScore1(team_1_score);
            updateScore2(team_2_score);
    }
    /* hier worden de variabelen van de teams geupdate in de app */

    public void updateScore1(int score){
            /* een type TextView variabele wordt aangemaakt met de gevonden TextView bij 'R.id.team1score' */
            TextView scoreLabel = (TextView) findViewById(R.id.team1score);
            /* de aangemaakte variabel wordt aangeroepen en een nieuwe waarde gegeven door setText. Deze wordt ook geconverteerd naar String met de int waarde van 'score' (team_1_score) */
            scoreLabel.setText(String.valueOf(score));
    }
    /* herhaling van hierboven met de andere team */
    public void updateScore2(int score){
            TextView scoreLabel = (TextView) findViewById(R.id.team2score);
            scoreLabel.setText(String.valueOf(score));
    }

    public void updateNaam1(String teamNaam){
        TextView naamLabel = (TextView) findViewById(R.id.team1naam);
        naamLabel.setText(String.valueOf(teamNaam));
    }

    public void updateNaam2(String teamNaam){
        TextView naamLabel = (TextView) findViewById(R.id.team2naam);
        naamLabel.setText(String.valueOf(teamNaam));
    }
}
