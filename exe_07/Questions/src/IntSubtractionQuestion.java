package questions;
public class IntSubtractionQuestion extends IntArithmeticQuestion
{
    public IntSubtractionQuestion(int num1, int num2)
    {
        super(num1,num2);
    }
    public void Create()
    {
        int MAX_NUM=10;
        do
        {
            num1=(int)(1+Math.random()*MAX_NUM);
            num2=(int)(1+Math.random()*MAX_NUM);
        }while(num2>num1);
    }
    public void SetNumbers(int num1, int num2)
    {
        if(num1>=num2)
        {
        this.num1=num1;
        this.num2=num2;
        }
        else
        {
            this.num1=num2;
            this.num2=num1;
            System.out.println("The two numbers were swapped.");
        }
    }
    @Override
    String getQuestion()
    {
        return "How much is " + num1 + "-" + num2;
    }
    @Override
    int getCorrectAnswer()
    {
        correctanswer=num1-num2;
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
