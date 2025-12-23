package com.lee.baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Application1854 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb=new StringBuilder();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());


            int start=1;

            ArrayList<Node>[]connections=new ArrayList[n+1];
            for(int j=1;j<=n;j++){
                connections[j]=new ArrayList<>();
            }

            for(int l=0; l<m; l++){
                st=new StringTokenizer(br.readLine());
                int x=Integer.parseInt(st.nextToken());
                int y=Integer.parseInt(st.nextToken());
                int z=Integer.parseInt(st.nextToken());

                connections[x].add(new Node(y,z));
            }

            int[] dist=new int[n+1];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dist[start]=0;

            boolean[] visited=new boolean[n+1];

            PriorityQueue<PqFormat>pq=new PriorityQueue<>();
            pq.add(new PqFormat(start,0));
            ArrayList<Integer>list=new ArrayList<>();
            while(!pq.isEmpty()){
                PqFormat now=pq.poll();
                list.add(now.dist);
                if(visited[now.index])continue;
                visited[now.index]=true;
                for(Node node:connections[now.index]){
                    if(dist[node.next]>dist[now.index]+node.cost){
                        dist[node.next]=dist[now.index]+node.cost;
                        pq.add(new PqFormat(node.next,dist[node.next]));
                    }
                }
            }


            sb.append("-1\n");
            for(int u=2;u<=n;u++){
                if(dist[u]==Integer.MAX_VALUE){
                    sb.append("-1\n");
                }else{
                    sb.append(dist[u]).append("\n");
                }
            }


        System.out.println(sb);
    }

    static class Node{
        int next;
        int cost;

        public Node(int next, int cost){
            this.next=next;
            this.cost=cost;
        }
    }

    static class PqFormat implements Comparable<PqFormat>{
        int index;
        int dist;

        PqFormat(int index, int dist){
            this.index=index;
            this.dist=dist;
        }

        @Override
        public int compareTo(PqFormat o) {
            return this.dist-o.dist;
        }
    }
}
