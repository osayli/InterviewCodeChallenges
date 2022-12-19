public class Challenge {

    public static boolean PrimeString(String s)

    {
        if (s.length()==1)
            return true;

        for (int i = 0; i < s.length() / 2; i++)
        {
            String sControl=s.replace(s.substring(0,i+1),"");
            if (sControl.isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeString("xyxy"));
    }
}



