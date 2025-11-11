package graphs;
import java.util.*;
public class EdgeWeightedGraph {
    private final int V; private int E; private final List<List<Edge>> adj;
    public EdgeWeightedGraph(int V){this.V=V;this.E=0;adj=new ArrayList<>(V);for(int i=0;i<V;i++)adj.add(new ArrayList<>());}
    public int V(){return V;} public int E(){return E;}
    public void addEdge(Edge e){int v=e.either(),w=e.other(v);adj.get(v).add(e);adj.get(w).add(e);E++;}
    public Iterable<Edge> adj(int v){return adj.get(v);}
    public Iterable<Edge> edges(){List<Edge> list=new ArrayList<>();boolean[][] seen=new boolean[V][V];
        for(int v=0;v<V;v++)for(Edge e:adj.get(v)){int w=e.other(v);if(!seen[v][w]){list.add(e);seen[v][w]=seen[w][v]=true;}}return list;}
}
