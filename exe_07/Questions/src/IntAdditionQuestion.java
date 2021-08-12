package questions;
public class IntAdditionQuestion extends IntArithmeticQuestion
{
    public IntAdditionQuestion(int num1, int num2)
    {
        super(num1,num2);
    }
    public void Create()
    {
        int MAX_NUM=10;
        num2=(int)(1+Math.random()*MAX_NUM/2);
        num1=(int)(1+Math.random()*MAX_NUM);
    }
    public void SetNumbers(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    @Override
    String getQuestion()
    {
        return "How much is " + num1 + "+" + num2;
    }
    @Override
    int getCorrectAnswer()
    {
        correctanswer=num1+num2;
        return correctanswer;
    }
    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }
}
