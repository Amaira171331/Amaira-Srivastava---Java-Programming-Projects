public class LightBoard
{
  private boolean[][] lights;


  public LightBoard(int numRows, int numCols)
  {
    lights = new boolean[numRows][numCols];
    for (int r = 0; r < numRows; r++) {
      for (int c = 0; c < numCols; c++) {
        lights[r][c] = Math.random() < 0.4; // 40 percent probability
      }
    }
  }

  /** Evaluates the light at (row, col) based on the given rules. */
  public boolean evaluateLight(int row, int col)
  {
    int countOn = 0;
    for (int r = 0; r < lights.length; r++) {
      if (lights[r][col]) {
        countOn++;
      }
    }

    if (lights[row][col]) {
      if (countOn % 2 == 0) {
        return false;
      }
    } else {
      if (countOn % 3 == 0) {
        return true;
      }
    }
    return lights[row][col];
  }
}
