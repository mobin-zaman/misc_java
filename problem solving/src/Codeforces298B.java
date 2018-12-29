import java.util.Scanner;

public class Codeforces298B {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sx = scan.nextInt();
        int sy = scan.nextInt();
        int ex = scan.nextInt();
        int ey = scan.nextInt();

        String str = scan.nextLine();
        int count = 0;

        double distance = dist(sx, sy, ex, ey);

        for (int i = 0; i < n; i++) {
            double new_distance;
            int temp_sx = sx;
            int temp_sy = sy;
            if (str.charAt(i) == 'E') {
                temp_sx++;
            } else if (str.charAt(i) == 'S') {
                temp_sy--;
            } else if (str.charAt(i) == 'W') {
                temp_sx--;
            } else {
                temp_sy++;
            }
            new_distance = dist(temp_sx, temp_sy, ex, ey);
            if (new_distance < distance) {
                distance = new_distance;
                count++;
                if (str.charAt(i) == 'E') {
                    sx++;
                } else if (str.charAt(i) == 'S') {
                    sy--;
                } else if (str.charAt(i) == 'W') {
                    sx--;
                } else {
                    sy++;
                }
            }

        }
        System.out.println(count);
    }



    public static double dist(int sx,int sy,int ex,int ey){
        return Math.sqrt(((sx-ex)*(sx-ex))-((sy-ey)*(sy-ey)));
    }
}
