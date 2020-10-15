package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList, p);
      return null;
   }

   public <T extends Graph> void extractedMethod(List<T> graphList, String p) {
	   
	   for(T item : graphList) {
		   if(item.contains(p))
			   System.out.println(item);
	   }
	   
   }
}

class Node extends Graph{
}

class Edge extends Graph{
}

class Graph {
	String name;
	
	boolean contains(String p) {
		return name.contains(p);
	}
}