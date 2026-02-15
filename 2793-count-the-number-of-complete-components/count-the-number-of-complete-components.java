class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int cnt = 0;
        
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] vis = new boolean[n];
       
       for(int i=0;i<n;i++){
           if(!vis[i]){
              Queue<Integer> q = new LinkedList<>();
              q.offer(i);
              vis[i] = true;
              int nodes = 0;
              int edgeCount = 0;

              while(!q.isEmpty()){
                int node = q.poll();
                nodes++;
                edgeCount += adj.get(node).size();

                for(int nbr : adj.get(node)){
                    if(!vis[nbr]){
                        vis[nbr] = true;
                        q.offer(nbr);
                    }
                }
              }
            edgeCount /= 2;

            if(edgeCount == nodes*(nodes-1)/2){
                    cnt++;
            }
        }
       }
    return cnt;
    }
}
