import java.util.ArrayList;

public class Delimiters
{
  private String openDel;
  private String closeDel;

  public Delimiters(String open, String close)
  {
    openDel = open;
    closeDel = close;
  }

  /** Returns ArrayList of delimiters from the array "tokens" */
  public ArrayList<String> getDelimitersList(String[] tokens)
  {
    ArrayList<String> result = new ArrayList<String>();
    for (String token : tokens) {
      if (token.equals(openDel) || token.equals(closeDel)) {
        result.add(token);
      }
    }
    return result;
  }

  /** Returns true/false if the delimiters are balanced */
  public boolean isBalanced(ArrayList<String> delimiters)
  {
    int openCount = 0;
    for (String d : delimiters) {
      if (d.equals(openDel)) {
        openCount++;
      } else if (d.equals(closeDel)) {
        openCount--;
        if (openCount < 0) {
          return false; // more close than open
        }
      }
    }
    return openCount == 0;
  }
}
