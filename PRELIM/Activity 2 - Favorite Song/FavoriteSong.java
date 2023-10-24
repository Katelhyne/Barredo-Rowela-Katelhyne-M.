public class FavoriteSong {
    public static void main(String[] args) {
        String songLyrics =" Love you 'til the last of snow disappears\n Love you 'til a rainy day becomes clear\n Never knew a love like this, now I can't let go\n I'm in love with you, and now you know";
        System.out.println("Title: I Like You So Much,You'll Know It");
        System.out.println("Song by Ysabelle Cuevas");
        System.out.println("");
        
        // Split the song lyrics into the lines
        String[] lines = songLyrics.split("\n");

        // Display the first four lines of the song lyrics
        for (int i = 0; i < 4 && i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}