package application_video_quiz.com.videoquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity_VideoQuiz extends AppCompatActivity {

        private Video_Library mQuestionLibrary = new Video_Library();

                private TextView mScoreView;
                private TextView mQuestionView;
                private Button mButtonChoice1;
                private Button mButtonChoice2;
                private Button mButtonChoice3;
                private VideoView mVideoView;

                private String mAnswer;
                private int mScore = 0;
                private int mQuestionNumber = 0;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_main__video_quiz);

                        mScoreView = (TextView)findViewById(R.id.score);
                        mQuestionView = (TextView)findViewById(R.id.question);
                        mButtonChoice1 = (Button)findViewById(R.id.choice1);
                        mButtonChoice2 = (Button)findViewById(R.id.choice2);
                        mButtonChoice3 = (Button)findViewById(R.id.choice3);
                        mVideoView=findViewById(R.id.video_quiz);

                        updateQuestion();

                    String path = "android.resource://" + getPackageName() + "/" + R.raw.vid1;
                    mVideoView.setVideoPath(path);
                    mVideoView.start();
                    mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {
                            mp.setLooping(true);
                        }
                    });

                        //Start of Button Listener for Button1
                        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
                                @Override
                                public void onClick(View view){
                                        //My logic for Button goes in here

                                        if (mButtonChoice1.getText() == mAnswer){
                                                mScore = mScore + 1;
                                                updateScore(mScore);
                                                updateQuestion();
                                                //This line of code is optiona
                                                Toast.makeText(MainActivity_VideoQuiz.this, "correct", Toast.LENGTH_SHORT).show();

                                        }else {
                                                Toast.makeText(MainActivity_VideoQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                                                updateQuestion();
                                        }
                                }
                        });

                        //End of Button Listener for Button1

                        //Start of Button Listener for Button2
                        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
                                @Override
                                public void onClick(View view){
                                        //My logic for Button goes in here

                                        if (mButtonChoice2.getText() == mAnswer){
                                                mScore = mScore + 1;
                                                updateScore(mScore);
                                                updateQuestion();
                                                //This line of code is optiona
                                                Toast.makeText(MainActivity_VideoQuiz.this, "correct", Toast.LENGTH_SHORT).show();

                                        }else {
                                                Toast.makeText(MainActivity_VideoQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                                                updateQuestion();
                                        }
                                }
                        });

                        //End of Button Listener for Button2


                        //Start of Button Listener for Button3
                        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
                                @Override
                                public void onClick(View view){
                                        //My logic for Button goes in here

                                        if (mButtonChoice3.getText() == mAnswer){
                                                mScore = mScore + 1;
                                                updateScore(mScore);
                                                updateQuestion();
                                                //This line of code is optiona
                                                Toast.makeText(MainActivity_VideoQuiz.this, "correct", Toast.LENGTH_SHORT).show();

                                        }else {
                                                Toast.makeText(MainActivity_VideoQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                                                updateQuestion();
                                        }
                                }
                        });

                        //End of Button Listener for Button3



                }
///////////this is where i can't figure out what to use to make it goes to the next video

                private void updateQuestion(){
                        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
                        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
                        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
                        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

                        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                        mQuestionNumber++;
                }

///////////////// this is what I had tried
        
    /*    private void updateQuestion_Video(){
                mVideoView.setVideoPath(mQuestionLibrary.getQuestion(mQuestionNumber));
                mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

                mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                mQuestionNumber++;
        }*/

                private void updateScore(int point) {
                        mScoreView.setText("" + mScore + "/10");
                }
        }
