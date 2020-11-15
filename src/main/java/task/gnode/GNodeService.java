package task.gnode;

import java.util.List;

public interface GNodeService {
    List<GNode> walkGraph(GNode node);

    List<List<GNode>> getPaths(GNode node);
}
