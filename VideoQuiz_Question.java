package application_nav_drawer_2.com.nav_drawer_2;

public class VideoQuiz_Question{

    public Integer mQuestion_1[]={
            R.raw.vid1,
            R.raw.vid2,
            R.raw.vid3
    };


    final String mChoice[][]={
            {"hello","hungry","fruit"},
            {"want","house","hurt"},
            {"thanks","morning","water"}

    };

   private String mCorrectAnswer[]={
            "hello","house","water"};


    public Integer getQuestion_1(int a){
        Integer question=mQuestion_1[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=mChoice[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1=mChoice[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2=mChoice[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswer[a];
        return answer;
    }
}

