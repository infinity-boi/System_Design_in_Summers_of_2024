package GS09_DesignPatterns.BehavioralDP.IteratorDP.SocialNetwork;

// The collection interface must declare a factory method for producing iterators.
interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}
