package questions;
public class GeneralIntQuestion extends IntQuestion
{
    private int num;
    public GeneralIntQuestion(int num)
    {
        this.num=num;
    }
    public void Create()
    {
        int MAX_NUM=10;
        num=(int)(1+Math.random()*MAX_NUM);
    }
    @Override
    String getQuestion()
    {
        return "What is the double of number " + num + " ?";
    }
    @Override
    int getCorrectAnswer()
    {
        correctanswer=num*2;
        return correctanswer;
    }
    public int getNum()
    {
        return num;
    }
}
