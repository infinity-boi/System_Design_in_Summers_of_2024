package GS09_DesignPatterns.BehavioralDP.StrategyDP.Calculator;

// Concrete strategies implement the algorithm while following the base strategy interface.
// The interface makes them interchangeable in the context.
class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
