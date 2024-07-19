package GS09_DesignPatterns.StructuralDP.FlyWeightDP.ForestGame;

import java.util.ArrayList;
import java.util.List;

class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw(String canvas) {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
        System.out.println("Trees drawn on "+ canvas);
    }
}

