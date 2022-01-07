package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button AnswerOne;
    Button AnswerTwo;
    TextView Story;
    int index = 0;

  Stories [] StoryBank = new Stories[] {
          new Stories( R.string.T1_Story , R.string.T1_Ans1 , R.string.T1_Ans2),
          new Stories( R.string.T2_Story , R.string.T2_Ans1 , R.string.T2_Ans2),
          new Stories( R.string.T3_Story , R.string.T3_Ans1 , R.string.T3_Ans2),
  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        AnswerOne = (Button) findViewById(R.id.buttonTop);
        AnswerTwo = (Button) findViewById(R.id.buttonBottom);
        Story = (TextView) findViewById(R.id.storyTextView);




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        AnswerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 0){
                    index = 2;
                    Story.setText(StoryBank[index].getStories());
                    AnswerOne.setText(StoryBank[index].getAnswer1());
                    AnswerTwo.setText(StoryBank[index].getAnswer2());
                }else if (index == 2 ){
                    Story.setText(R.string.T6_End);
                    AnswerOne.setVisibility(View.INVISIBLE);
                    AnswerTwo.setVisibility(View.INVISIBLE);
                }else if (index == 1 ){
                    index = 2;
                    Story.setText(StoryBank[index].getStories());
                    AnswerOne.setText(StoryBank[index].getAnswer1());
                    AnswerTwo.setText(StoryBank[index].getAnswer2());
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        AnswerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 0 ) {
                index = 1;
                    Story.setText(StoryBank[index].getStories());
                    AnswerOne.setText(StoryBank[index].getAnswer1());
                    AnswerTwo.setText(StoryBank[index].getAnswer2());
                }else if (index == 2){
                    Story.setText(R.string.T5_End);
                    AnswerOne.setVisibility(View.INVISIBLE);
                    AnswerTwo.setVisibility(View.INVISIBLE);
                }else if (index == 1 ){
                    Story.setText(R.string.T4_End);
                    AnswerOne.setVisibility(View.INVISIBLE);
                    AnswerTwo.setVisibility(View.INVISIBLE);
                }
        }
        });

    }
}
