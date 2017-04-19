package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonScanner {
    private DoublyLinkedList<Person> peopleList;
    
    public PersonScanner() {
        peopleList = new DoublyLinkedList<Person>();
    }
    
    public PersonScanner(String fileName) throws FileNotFoundException {
        this();
        this.scanPeople(fileName);
    }
    
    public void scanPeople(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
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
