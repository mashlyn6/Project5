package prj5;

/**
 * Contains information about a song
 * 
 * @author Truman Heberle trumanh
 * @version 4.15.2017
 */
public class Song {
    private String title;
    private String artist;
    private int year;
    private String genre;
    private int songNum;
    private Tracker tracker;
    
    public Song(String title1, String artist1, int year1, String genre1, int songNum1) {
        title = title1;
        artist = artist1;
        year = year1;
        genre = genre1;
        songNum = songNum1;
        tracker = new Tracker();
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void addData(Person person) {
        if (person.getLiked(songNum)) {
            tracker.addHear(person.getHobby(), person.getMajor(), person.getRegion());
            tracker.addLike(person.getHobby(), person.getMajor(), person.getRegion());
        }
        else if (person.getHeard(songNum)) {
            tracker.addHear(person.getHobby(), person.getMajor(), person.getRegion());
        }
    }
    
    public Tracker getTracker() {
        return tracker;
    }
}