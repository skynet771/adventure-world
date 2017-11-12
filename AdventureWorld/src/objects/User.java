 
package objects;

import java.util.ArrayList;

/**
 * Store user data.
 * photos list is used for the photos uploaded by the user
 * map list is used for keep track of how much of the map is conquered by the user.
 * Every time when he conquer region the map has to be modified 
 * @author Admin
 */
public class User {
    private String userName;
    private String email;
    private short age;
    private Gender gender;
    private int points;
    private String photoAvatar;
    private ArrayList<String> photos;
    
    private ArrayList<String> map; 
}
