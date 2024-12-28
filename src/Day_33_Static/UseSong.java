package Day_33_Static;

import java.util.ArrayList;
import java.util.Arrays;

// template class - the instruction to execute code from main()- runner CLass
public class UseSong {
    public static void main(String[] args) {
        Song song1 = new Song("Waka Waka");
        System.out.println(song1);

        Song song2 = new Song("Jingle Bell",3.2);
        System.out.println(song2);

        Song song3 = new Song("Hit Em Up",3.56,"2pac","Rap" );
        System.out.println(song3);

        System.out.println("****************************************************");
        String str1 = "one"; // created string using String literals
        String str2 = new String("two"); // using the 'new' key word

        String [] allStr = {str1,str2}; //Stored Non - Primitive / Object type

        //str1 str1 ------> Object type data ----> String
        // song1 song2 song3 ------> Object type data -----> song

        Song [] allSongs = {song1,song2,song3};
        // get me info for all songs
        System.out.println(Arrays.toString(allSongs));
        // get me info fpr 2nd song
        System.out.println(allSongs[1]);
        // how many songs i have total
        System.out.println("Num of Songs; "+allSongs.length);
// find me the song that has length more than 3.3
        for (Song eachSong: allSongs){
            if (eachSong.length>3.3){
                System.out.println(eachSong);
            };

        }

        System.out.println("****************************************************");
        ArrayList<Song>allSoongsInList = new ArrayList<>();
        allSoongsInList.addAll(Arrays.asList(song1,song2,song3));

        for (Song each: allSoongsInList){
            System.out.println(each.name);
        }

    }
}
