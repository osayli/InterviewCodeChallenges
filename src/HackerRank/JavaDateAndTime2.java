package HackerRank;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaDateAndTime2 {
    public static String findDay(int month, int day, int year) {
        Date date=new Date(day,month,year);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week in number:"+dayOfWeek);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println("Day of week in text:"+dayWeekText);
        return dayWeekText;
    }
    public static void main(String[] args) {
        System.out.println(findDay(8,5,2015));
    }
}
