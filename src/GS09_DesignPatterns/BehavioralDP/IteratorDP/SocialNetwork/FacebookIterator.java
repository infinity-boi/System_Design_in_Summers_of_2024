package GS09_DesignPatterns.BehavioralDP.IteratorDP.SocialNetwork;

import java.util.List;

// The concrete iterator class.
class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId;
    private String type;
    private int currentPosition = 0;
    private List<Profile> cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
        lazyInit();
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    @Override
    public Profile getNext() {
        if (hasMore()) {
            return cache.get(currentPosition++);
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < cache.size();
    }
}
