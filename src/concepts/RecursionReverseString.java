package concepts;

public class RecursionReverseString
{
    public String reverseString(String str)
    {
        if(str.isEmpty())
        {
            return str;
        }
        else
        {
            return reverseString(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args)
    {
        RecursionReverseString rs = new RecursionReverseString();
        String r1 = rs.reverseString("RYG");
        System.out.println(r1);
    }
}