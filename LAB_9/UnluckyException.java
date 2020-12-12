public class UnluckyException extends Exception
{
    public String getMessage(){
        return "Error -> Unlucky exception out there";
    }

    public String getAdvice(){
        return "Advice -> Better don't divide by 13";
    }

}
