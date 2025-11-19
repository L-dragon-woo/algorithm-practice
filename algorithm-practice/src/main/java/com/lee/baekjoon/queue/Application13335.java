package com.lee.baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application13335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int w = sc.nextInt();
        int L = sc.nextInt();
        
        Queue<Integer> trucks = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            trucks.add(sc.nextInt());
        }
        
        // 다리를 0으로 초기화
        for(int i = 0; i < w; i++){
            bridge.add(0);
        }
        
        int time = 0;
        int weightOnBridge = 0;
        
        while(!bridge.isEmpty()){
            time++;
            weightOnBridge -= bridge.poll();
            
            if(!trucks.isEmpty()){
                if(weightOnBridge + trucks.peek() <= L){
                    int truck = trucks.poll();
                    bridge.add(truck);
                    weightOnBridge += truck;
                } else {
                    bridge.add(0);
                }
            }
        }
        
        System.out.println(time);
    }
}
