package graphs;
public class UF {
    private final int[] p,r; public UF(int n){p=new int[n];r=new int[n];for(int i=0;i<n;i++)p[i]=i;}
    public int find(int x){while(x!=p[x]){p[x]=p[p[x]];x=p[x];}return x;}
    public boolean connected(int a,int b){return find(a)==find(b);}
    public void unite(int a,int b){int x=find(a),y=find(b);if(x==y)return;if(r[x]<r[y])p[x]=y;else if(r[x]>r[y])p[y]=x;else{p[y]=x;r[x]++;}}
}
