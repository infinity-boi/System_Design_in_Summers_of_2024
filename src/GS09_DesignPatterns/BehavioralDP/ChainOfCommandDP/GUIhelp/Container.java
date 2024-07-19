package GS09_DesignPatterns.BehavioralDP.ChainOfCommandDP.GUIhelp;

import java.util.ArrayList;
import java.util.List;

// Containers can contain both simple components and other containers as children.
// The chain relationships are established here. The class inherits showHelp behavior from its parent.
abstract class Container extends Component {
    protected List<Component> children = new ArrayList<>();

    public void add(Component child) {
        children.add(child);
        child.container = this;
    }
}
