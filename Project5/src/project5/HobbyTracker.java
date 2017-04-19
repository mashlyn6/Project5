package project5;

/**
 * Stores information regarding a song's
 * like and heard stats based on hobby
 * 
 * @author Truman Heberle trumanh
 * @version 4.15.2017
 */
public class HobbyTracker {
    private int readHeard;
    private int readLiked;
    private int artHeard;
    private int artLiked;
    private int sportsHeard;
    private int sportsLiked;
    private int musicHeard;
    private int musicLiked;
    private int readHeardP;
    private int readLikedP;
    private int artHeardP;
    private int artLikedP;
    private int sportsHeardP;
    private int sportsLikedP;
    private int musicHeardP;
    private int musicLikedP;
    private int read = ;
    private int art = 0;
    private int sports = 0;
    private int music = 0;
    private DoublyLinkedList<Person> list;
    
    public HobbyTracker(DoublyLinkedList<Person> list1) {
        list = list1;
    }
    
    public double readPercentageH() {
        return readHeard / read;
    }
    
    public double readPercentageL() {
        return readLiked / read;
    }
    
    public double artPercentageH() {
        return artHeard / art;
    }
    
    public double artPercentageL() {
        return artLiked / art;
    }
    
    public double sportsPercentageH() {
        return sportsHeard / sports;
    }
    
    public double sportsPercentageL() {
        return sportsLiked / sports;
    }
    
    public double musicPercentageH() {
        return musicHeard / music;
    }
    
    public double musicPercentageL() {
        return musicLiked / music;
    }
    
    public int getPercentage(HobbyEnum, String) {
        for (int x = 0; x < list.getSize(), x++)
        {
            if (list.getEntry(x).getHobby() == Read)
            {
                if (list.getEntry(x).getHeard().equals("yes"))
                {
                    readHeard++;
                    read++;
                }
                if (list.getEntry(x).getLiked().equals("yes"))
                {
                    readLiked++;
                    read++;
                }
            }
            if (list.getEntry(x).getHobby() == Art)
            {
                if (list.getEntry(x).getHeard().equals("yes"))
                {
                    artHeard++;
                    art++;
                }
                if (list.getEntry(x).getLiked().equals("yes"))
                {
                    artLiked++;
                    art++;
                }
            }
            if (list.getEntry(x).getHobby() == Sports)
            {
                if (list.getEntry(x).getHeard().equals("yes"))
                {
                    sportsHeard++;
                    sports;
                }
                if (list.getEntry(x).getLiked().equals("yes"))
                {
                    sportsLiked++;
                    sports;
                }
            }
            if (list.getEntry(x).getHobby() == Music)
            {
                if (list.getEntry(x).getHeard().equals("yes"))
                {
                    musicHeard++;
                    music++;
                }
                if (list.getEntry(x).getLiked().equals("yes"))
                {
                    musicLiked++;
                    music++;
                }
            }
        }
    }
}
