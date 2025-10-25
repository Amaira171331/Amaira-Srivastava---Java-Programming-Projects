public class APCalender
{
  /** Returns true/false if year is a leap year */
  private static boolean isLeapYear(int year)
  {
    if (year % 400 == 0) return true;
    if (year % 100 == 0) return false;
    return year % 4 == 0;
  }

  /** Returns the number of leap years between year1 and year2 */
  public static int numberOfLeapYears(int year1, int year2)
  {
    int count = 0;
    for (int y = year1; y <= year2; y++) {
      if (isLeapYear(y)) {
        count++;
      }
    }
    return count;
  }

  /** Returns day of week on first day of the year */
  private static int firstDayOfYear(int year)
  {
    return 0;
  }

  /** Month, day, and year specify the nth day of the year so returns n */
  private static int dayOfYear(int month, int day, int year)
  {
    return 1;
  }

  /** Returns day of the week for a given date. */
  public static int dayOfWeek(int month, int day, int year)
  {
    int firstDay = firstDayOfYear(year);
    int nthDay = dayOfYear(month, day, year);
    return (firstDay + nthDay - 1) % 7;
  }
}
