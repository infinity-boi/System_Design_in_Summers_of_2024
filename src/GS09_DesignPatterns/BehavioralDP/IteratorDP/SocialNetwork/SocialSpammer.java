package GS09_DesignPatterns.BehavioralDP.IteratorDP.SocialNetwork;

// Here is another useful trick: you can pass an iterator to a client class instead of giving it access to a whole collection.
class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println("Sending email to: " + profile.getEmail() + ". Message: " + message);
        }
    }
}
