package GS09_DesignPatterns.BehavioralDP.IteratorDP.SocialNetwork;

// The common interface for all iterators.
interface ProfileIterator {
    Profile getNext();
    boolean hasMore();
}
