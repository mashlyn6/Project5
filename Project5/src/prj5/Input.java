package prj5;

/**
 * @author 
 * @version
 * This class begins the program by creating a PersonScanner and SongScanner 
 */
public class Input {

  /**
   * creates a new PersonScanner and SongScanner using the given file
   * @param the file that the PersonScanner and SongScanner will use
   */
  public static void main(String[] args)
  {
      PersonScanner scanner1 = new PersonScanner(args);
      SongScanner scanner2 = new SongScanner(args);
  }  
}
