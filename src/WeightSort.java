import java.util.*;

public class WeightSort {

    public static String orderWeight(String strng) {
        if(strng.equals(""))
            return "";

        //create String array from string
        String[] stringArray = strng.split(" ");
        int length=stringArray.length;

        if(length == 1)
            return strng;

        // create integer List from StringArray
        List<Integer> integerList =  new ArrayList<>();
        for(int i=0; i<length; i++) {
            try{
                integerList.add(Integer.valueOf(stringArray[i])) ;
            }
            catch(NumberFormatException e){
                return strng;
            }
        }

        //create IntegerList to store weight
        List<Integer> weightList = new ArrayList<>();;

        //calculate weight
        for(Integer i: integerList){
            int weight = 0;
            int temp = i;
            while (temp > 0) {
                weight += temp % 10;
                temp = temp / 10;
            }

            weightList.add(weight);

        }

        //sort elements by their weight and String order
        for (int i = 0; i < length-1; i++)
            for (int j = 0; j < length-i-1; j++) {
                int equality =String.valueOf(integerList.get(j)).compareTo(String.valueOf(integerList.get(j+1)));

                if (weightList.get(j) > weightList.get(j+1) || (weightList.get(j).equals(weightList.get(j+1)) && equality > 0))
                {
                    //swap elements via using flip2
                    int flip1= weightList.get(j);
                    weightList.set(j,weightList.get(j+1));
                    weightList.set(j+1,flip1);

                    //swap elements via using flip2
                    int flip2 = integerList.get(j);
                    integerList.set(j,integerList.get(j+1));
                    integerList.set(j+1,flip2);
                }
            }

        String finalResult = "";
        for(int i=0; i<length; i++){
            finalResult += integerList.get(i)+" ";
        }
        finalResult=finalResult.trim();
        return finalResult;
    }


    public static void main(String[] args) {
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123 9 81 72"));
    }
}
