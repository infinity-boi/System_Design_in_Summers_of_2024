package GS09_DesignPatterns.BehavioralDP.IteratorDP.SocialNetwork;

import java.util.ArrayList;
import java.util.List;

// Each concrete collection is coupled to a set of concrete iterator classes it returns.
class Facebook implements SocialNetwork {
    // Simulate the social graph data
    private List<Profile> profiles;

    public Facebook(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public List<Profile> socialGraphRequest(String profileId, String type) {
        // Simulate fetching profiles
        List<Profile> result = new ArrayList<>();
        for (Profile profile : profiles) {
            if (type.equals("friends") && profile.getFriends().contains(profileId)) {
                result.add(profile);
            } else if (type.equals("coworkers") && profile.getCoworkers().contains(profileId)) {
                result.add(profile);
            }
        }
        return result;
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }
}
