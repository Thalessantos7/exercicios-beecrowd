package Iniciante;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Iniciante3250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();
        int s = sc.nextInt();
        int g = sc.nextInt();
        int u = sc.nextInt();
        int d = sc.nextInt();
        
        int[] dist = new int[f + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        dist[s] = 0;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            
            if (curr == g) {
                System.out.println(dist[curr]);
                
                return;
            }
            
            int upFloor = curr + u;
            
            if (upFloor <= f && dist[upFloor] == -1) {
                dist[upFloor] = dist[curr] + 1;
                queue.add(upFloor);
            }
            
            int downFloor = curr - d;
            
            if (downFloor >= 1 && dist[downFloor] == -1) {
                dist[downFloor] = dist[curr] + 1;
                queue.add(downFloor);
            }
        }
        
        System.out.println("use the stairs");

        sc.close();
    }
}