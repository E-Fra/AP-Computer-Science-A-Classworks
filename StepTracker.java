

public class StepTracker
{
  public static void main(String[] args)
  {
  }
  private int numActiveDays;
  private int totalSteps;
  private int numDays;
  private int minSteps;
  public StepTracker(int minAmount)
  {
      minSteps = minAmount; //sets the threshold amount of steps in a default constructor
      totalSteps = 0; //default values
      numDays = 0;
      numActiveDays = 0;
  }
  public void addDailySteps(int stepsTaken)
  {
      totalSteps += stepsTaken; //adds the steps given to the total
      numDays ++; //increments the days
      if(stepsTaken >= minSteps)
        numActiveDays ++; //checks to see if it as an active day
  }
  public int activeDays()
  {
    return numActiveDays;
  }
  public double averageSteps()
  {
      return ((double)(totalSteps) / numDays);
  }
}
