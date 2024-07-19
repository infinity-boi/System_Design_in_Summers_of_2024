package GS09_DesignPatterns.BehavioralDP.IteratorDP.SocialNetwork;

import java.util.List;

// Profile class to represent user profiles.
class Profile {
    private String id;
    private String email;
    private List<String> friends;
    private List<String> coworkers;

    public Profile(String id, String email, List<String> friends, List<String> coworkers) {
        this.id = id;
        this.email = email;
        this.friends = friends;
        this.coworkers = coworkers;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getFriends() {
        return friends;
    }

    public List<String> getCoworkers() {
        return coworkers;
    }
}