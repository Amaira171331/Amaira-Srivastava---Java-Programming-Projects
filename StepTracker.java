public class StepTracker
{
  private int minSteps;     //minimum steps for active day
  private int totalSteps;   //total steps together
  private int numDays;      //number of days total tracked
  private int activeDays;   //number of days where you were active

  /** Initalizes values */
  public StepTracker(int min)
  {
    minSteps = min;
    totalSteps = 0;
    numDays = 0;
    activeDays = 0;
  }

  /** Finds total steps for one day */
  public void addDailySteps(int steps)
  {
    totalSteps = totalSteps + steps;
    numDays = numDays + 1;
    if (steps >= minSteps) {
      activeDays = activeDays + 1;
    }
  }

  /** Returns number of active days */
  public int activeDays()
  {
    return activeDays;
  }

  /** Returns the average number of steps per day */
  public double averageSteps()
  {
    if (numDays == 0) {
      return 0.0;
    }
    return (double) totalSteps / numDays;
  }
}
