package GS09_DesignPatterns.BehavioralDP.MediatorDP.AccountManager;

// The mediator interface declares a method used by components to notify the mediator about various events.
interface Mediator {
    void notify(Component sender, String event);
}

