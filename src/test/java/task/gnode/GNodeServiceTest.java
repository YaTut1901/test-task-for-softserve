package task.gnode;

import task.gnode.impl.model.GNodeImpl;
import task.gnode.impl.service.GNodeServiceImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class GNodeServiceTest {

    private static GNode head;
    private static GNodeService service;
    private static List<GNode> walkGraphExpected;
    private static List<List<GNode>> pathsExpected;

    @BeforeClass
    public static void setUp() {
        service = new GNodeServiceImpl();
        pathsExpected = new ArrayList<>();
        GNode node4 = new GNodeImpl("node4", new GNode[0]);
        GNode node5 = new GNodeImpl("node5", new GNode[0]);
        GNode node6 = new GNodeImpl("node6", new GNode[0]);
        GNode node7 = new GNodeImpl("node7", new GNode[0]);
        GNode node8 = new GNodeImpl("node8", new GNode[0]);
        GNode node9 = new GNodeImpl("node9", new GNode[0]);
        GNode node10 = new GNodeImpl("node10", new GNode[0]);
        GNode node11 = new GNodeImpl("node11", new GNode[0]);
        GNode node12 = new GNodeImpl("node12", new GNode[0]);
        GNode node1 = new GNodeImpl("node1", new GNode[] {node4, node5, node6});
        GNode node2 = new GNodeImpl("node2", new GNode[] {node7, node8, node9});
        GNode node3 = new GNodeImpl("node3", new GNode[] {node10, node11, node12});
        head = new GNodeImpl("head", new GNode[] {node1, node2, node3});
        walkGraphExpected = new ArrayList<>(List.of(head, node1, node2, node3, node4, node5, node6,
                node7, node8, node9, node10, node11, node12));
        walkGraphExpected.sort(Comparator.comparing(GNode::getName));
        pathsExpected.add(new ArrayList<>(List.of(head, node1, node4)));
        pathsExpected.add(new ArrayList<>(List.of(head, node1, node5)));
        pathsExpected.add(new ArrayList<>(List.of(head, node1, node6)));
        pathsExpected.add(new ArrayList<>(List.of(head, node2, node7)));
        pathsExpected.add(new ArrayList<>(List.of(head, node2, node8)));
        pathsExpected.add(new ArrayList<>(List.of(head, node2, node9)));
        pathsExpected.add(new ArrayList<>(List.of(head, node3, node10)));
        pathsExpected.add(new ArrayList<>(List.of(head, node3, node11)));
        pathsExpected.add(new ArrayList<>(List.of(head, node3, node12)));

    }

    @Test
    public void walkGraphTest() {
        List<GNode> actual = service.walkGraph(head);
        actual.sort(Comparator.comparing(GNode::getName));
        assertEquals("Method return unsuitable value", walkGraphExpected, actual);
    }

    @Test
    public void getPathsTest() {
        List<List<GNode>> actual = service.getPaths(head);
        assertEquals(pathsExpected, actual);
    }
}