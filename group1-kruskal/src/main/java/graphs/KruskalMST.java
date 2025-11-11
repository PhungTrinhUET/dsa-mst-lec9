package graphs;
import java.util.*;
public class KruskalMST {
    private final List<Edge> mst=new ArrayList<>(); private double weight=0.0;
    public KruskalMST(EdgeWeightedGraph G){PriorityQueue<Edge> pq=new PriorityQueue<>();for(Edge e:G.edges())pq.add(e);
        UF uf=new UF(G.V());while(!pq.isEmpty()&&mst.size()<G.V()-1){Edge e=pq.poll();int v=e.either(),w=e.other(v);
        if(!uf.connected(v,w)){uf.unite(v,w);mst.add(e);weight+=e.weight();}}}
    public Iterable<Edge> edges(){return mst;} public double weight(){return weight;}
}
