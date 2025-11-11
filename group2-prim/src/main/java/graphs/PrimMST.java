package graphs;
import java.util.*;
public class PrimMST {
    private final boolean[] marked; private final Edge[] edgeTo; private final double[] distTo;
    private final PriorityQueue<Integer> pq; private final List<Edge> mst=new ArrayList<>(); private double weight=0.0;
    public PrimMST(EdgeWeightedGraph G){int V=G.V();marked=new boolean[V];edgeTo=new Edge[V];distTo=new double[V];
        Arrays.fill(distTo,Double.POSITIVE_INFINITY);pq=new PriorityQueue<>(Comparator.comparingDouble(i->distTo[i]));
        distTo[0]=0.0;pq.add(0);while(!pq.isEmpty()){int v=pq.poll();if(marked[v])continue;marked[v]=true;
        if(edgeTo[v]!=null){mst.add(edgeTo[v]);weight+=edgeTo[v].weight();}for(Edge e:G.adj(v)){int w=e.other(v);
        if(marked[w])continue;if(e.weight()<distTo[w]){distTo[w]=e.weight();edgeTo[w]=e;pq.add(w);}}}}
    public Iterable<Edge> edges(){return mst;} public double weight(){return weight;}
}
