package graphs;
public class Edge implements Comparable<Edge> {
    private final int v, w; private final double weight;
    public Edge(int v, int w, double weight){this.v=v;this.w=w;this.weight=weight;}
    public double weight(){return weight;}
    public int either(){return v;}
    public int other(int x){return x==v?w:v;}
    public int compareTo(Edge that){return Double.compare(this.weight,that.weight);}
    public String toString(){return v+"-"+w+" "+weight;}
}
