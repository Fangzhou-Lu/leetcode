import java.util.*;

public class Solution133 {
    
      class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
  }

   UndirectedGraphNode clone (UndirectedGraphNode node,Map<Integer,UndirectedGraphNode> map) {
          if(node==null) return null;
          if(map.containsKey(node.label)) return map.get(node.label);
          UndirectedGraphNode  newNode= new UndirectedGraphNode(node.label);
          map.put(node.label,newNode);

          for(UndirectedGraphNode n:node.neighbors) {
              newNode.neighbors.add(clone(n,map));
          }
          return  newNode;
   }

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
          Map<Integer,UndirectedGraphNode> map = new HashMap<>();
          return clone(node,map);
    }
    

    public static void main (String[] args) {


    }
}
