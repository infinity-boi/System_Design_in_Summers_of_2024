package GS09_DesignPatterns.BehavioralDP.StrategyDP.Calculator;

// The strategy interface declares operations common to all supported versions of some algorithm.
// The context uses this interface to call the algorithm defined by the concrete strategies.
interface Strategy {
    int execute(int a, int b);
}

