package GS09_DesignPatterns.StructuralDP.FlyWeightDP.ForestGame;

import java.util.HashMap;
import java.util.Map;

class TreeFactory {
    private static Map<Integer, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        int hash = key.hashCode();
        TreeType result = treeTypes.get(hash);
        if (result == null) {
            result = new TreeType(name, color, texture);
            treeTypes.put(hash, result);
            System.out.println(hash + " TreeType created");
        }
        return result;
    }
}

