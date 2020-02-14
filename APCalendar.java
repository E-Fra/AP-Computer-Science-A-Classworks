

public class APCalendar
{
    public static void main(String[] args)
    {
        System.out.println(numberOfLeapYears(1, 30));
    }
    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
        for(int i = year1; i <= year2; i++)
        {
            if(isLeapYear(i))
                count ++;
        }
        return count; //very simple for loop, just checks for leap years within a given range
    }
    public static int dayOfWeek(int month, int day, int year)
    {
        int start = firstDayOfYear(year); //find the day of 1/1
        int variableDay = dayOfYear(month, day, year); //find the day of the date we have
        int weekDay = (start + variableDay - 1) % 7; /// gets rid of the weeks, remainder is the day
        return weekDay;
    }
}
