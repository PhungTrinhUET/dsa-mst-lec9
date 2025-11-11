package graphs;
import java.io.*;import java.util.*;
public class KruskalMain {
    public static void main(String[] args)throws Exception{if(args.length<1)return;EdgeWeightedGraph G=readGraph(args[0]);
        KruskalMST mst=new KruskalMST(G);System.out.printf("MST weight: %.3f%n",mst.weight());for(Edge e:mst.edges())System.out.println(e);}
    static EdgeWeightedGraph readGraph(String path)throws Exception{try(BufferedReader br=new BufferedReader(new FileReader(path))){
        int V=Integer.parseInt(br.readLine().trim());int E=Integer.parseInt(br.readLine().trim());EdgeWeightedGraph G=new EdgeWeightedGraph(V);
        for(int i=0;i<E;i++){String[] a=br.readLine().trim().split("\s+");int v=Integer.parseInt(a[0]);int w=Integer.parseInt(a[1]);
            double wt=Double.parseDouble(a[2]);G.addEdge(new Edge(v,w,wt));}return G;}}
}
