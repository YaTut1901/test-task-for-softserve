package task.gnode.impl.model;

import task.gnode.GNode;

public class GNodeImpl implements GNode {
    private String name;
    private GNode[] children;

    public GNodeImpl(String name, GNode[] children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public GNode[] getChildren() {
        return children;
    }
}
