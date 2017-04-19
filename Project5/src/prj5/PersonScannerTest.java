package prj5;

import java.io.FileNotFoundException;

import student.TestCase;

/**
 * Tests the PersonScanner class
 * 
 * @author Truman Heberle trumanh
 * @version 4.18.2017
 */
public class PersonScannerTest extends TestCase {
    private PersonScanner ps;
    
    /**
     * Runs before each test case
     */
    public void setUp() {
        ps = new PersonScanner();
    }
    
    public void testScanPeople() {
        try {
            ps.scanPeople("MusicSurveyDataTest1.csv");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}