package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonScanner {
    private DoublyLinkedList<Person> peopleList;
    
    public PersonScanner(String fileName) throws FileNotFoundException {
        peopleList = new DoublyLinkedList<Person>();
        this.scanPeople(fileName);
    }
    
    public void scanPeople(String data) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("MusicSurveyData.csv"));
        scan.useDelimiter(",");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
    
    public DoublyLinkedList<Person> getPeopleList() {
        return peopleList;
    }
}
