package GS09_DesignPatterns.BehavioralDP.IteratorDP.SocialNetwork;

import java.util.ArrayList;
import java.util.List;

// The application class configures collections and iterators and then passes them to the client code.
class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public void config(boolean useFacebook) {
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile("1", "user1@example.com", List.of("2", "3"), List.of("3")));
        profiles.add(new Profile("2", "user2@example.com", List.of("1"), List.of("1", "3")));
        profiles.add(new Profile("3", "user3@example.com", List.of("1", "2"), List.of("1", "2")));

        if (useFacebook) {
            this.network = new Facebook(profiles);
        }
        // if working with LinkedIn
        // this.network = new LinkedIn(profiles);

        this.spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.config(true);

        Profile testProfile = new Profile("1", "user1@example.com", List.of("2", "3"), List.of("3"));
        app.sendSpamToFriends(testProfile);
        app.sendSpamToCoworkers(testProfile);
    }
}
