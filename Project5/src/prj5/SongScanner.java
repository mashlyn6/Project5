package prj5;

public class SongScanner {

    public LinkedSongList<Song> scanSongs(String songFile) {
        LinkedSongList<Song> songList = new LinkedSongList<Song>();
        try
        {
            Scanner file = new Scanner(new File(songFile));
            int index = 0;
            file.nextLine();
            while (file.hasNextLine())
            {
                String[] songArray = file.nextLine().split(" *, *");
                for (int i = 0; i < songArray.length; i++)
                {
                    songList.add(new Song(songArray[i], songArray[i+1]), Integer.valueOf(songArray[i+2], songArray[i+3]), index;
                    index += 2;
                }
            }
        }
        catch (FileNotFoundException e)
        {
             //should we do something with this?
        }
        return songList;
    }

                                 //I dont think we need either of the methods below but I'm not sure
    public SONGLIST getSongList() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public void sortByTitle() {
        // TODO
    }
}
