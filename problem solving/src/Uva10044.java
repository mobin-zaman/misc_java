import java.util.*;

public class Uva10044 {
    public static void Uva10044(String args[]) {

        Scanner scan = new Scanner(System.in);

        int T;
        T = scan.nextInt();

        while (T != 0) {
            int p, n;
            p = scan.nextInt();
            n = scan.nextInt();
            int map_counter=0;
            HashMap<String, Integer> map = new HashMap<>();
            String str;
            String author;
            scan.next();
            for (int i = 0; i < p; i++) {
                System.out.println("in for " + i);
                str = scan.nextLine();
                System.out.println(str);
                int next_start = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ',' && str.charAt(j - 1) == '.') {
                        author = (str.substring(next_start, j - 1));
                        System.out.println(author);
                        next_start = j + 1;
                    } else if (str.charAt(j) == ':') {
                        author = (str.substring(next_start, j - 1));
                        System.out.println(author);
                        break;
                    }

                }

            }
            T--;
        }
    }
    public static void insert(HashMap <String, Integer> map,String str,int n){
        if(!map.containsKey(str)){
            map.put(str,n);
        }
    }
}
