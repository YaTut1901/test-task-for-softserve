package task.gnode.impl.service;

import task.gnode.GNode;
import task.gnode.GNodeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GNodeServiceImpl implements GNodeService {
    public List<GNode> walkGraph(GNode node) {
        GNode[] children = node.getChildren();
        ArrayList<GNode> result = new ArrayList<>();
        result.add(node);
        if (children.length != 0) {
            for (GNode child : children) {
                result.addAll(walkGraph(child));
            }
        }
        return result;
    }

    public List<List<GNode>> getPaths(GNode node) {
        return findPaths(new ArrayList<>(), node, new ArrayList<>());
    }

    private static List<List<GNode>> findPaths(List<List<GNode>> paths,
                                               GNode node, List<GNode> path) {
        if (node == null) {
            return paths;
        }

        path.add(node);

        if (node.getChildren().length == 0) {
            paths.add(path);
            return paths;
        }
        Arrays.stream(node.getChildren())
                .forEach(vertice -> findPaths(paths, vertice, new ArrayList<>(path)));
        return paths;
    }
}
