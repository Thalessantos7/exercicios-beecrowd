package Iniciante;

import java.util.Scanner;

public class Iniciante2632 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int w = sc.nextInt();
            int h = sc.nextInt();
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();

            String magic = sc.next();
            int level = sc.nextInt();
            int cx = sc.nextInt();
            int cy = sc.nextInt();

            int damage = 0;
            int radius = 0;

            switch (magic) {

                case "fire":

                    damage = 200;
                    radius = (level == 1) ? 20 : (level == 2) ? 30 : 50;

                    break;

                case "water":

                    damage = 300;
                    radius = (level == 1) ? 10 : (level == 2) ? 25 : 40;

                    break;

                case "earth":

                    damage = 400;
                    radius = (level == 1) ? 25 : (level == 2) ? 55 : 70;

                    break;

                case "air":

                    damage = 100;
                    radius = (level == 1) ? 18 : (level == 2) ? 38 : 60;

                    break;

            }

            int closestX = Math.max(x0, Math.min(cx, x0 + w));
            int closestY = Math.max(y0, Math.min(cy, y0 + h));

            long dx = cx - closestX;
            long dy = cy - closestY;

            long dist2 = dx * dx + dy * dy;
            long radius2 = (long) radius * radius;

            if (dist2 <= radius2) {

                System.out.println(damage);

            } else {

                System.out.println(0);

            }

        }

        sc.close();

    }

}