public class Practice{
    public static void main(String[] args){
        Graph graph = new Graph(4,true);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.printGraph();
    }
    class Graph{
        int[][] graph;
        int vertices;
        boolean isDirected;
        Graph(int vertices, boolean isDirected){
            graph = new int[vertices][vertices];
            this.isDirected = isDirected;
        }
        void removeEdge(int src, int dest){
            if(isValid(src,dest)){
                graph[src][dest] = 0;
                if(! isDirected)
                graph[dest][src] = 0;
            }
            else {
                System.out.println("")
            }
        }
    }
}