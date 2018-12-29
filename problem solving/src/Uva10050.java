import java.util.Scanner;

class Uva10050{
    public static void Uva10050(String args[]){
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T!=0){
            int n=scan.nextInt();
            int p=scan.nextInt();
            int[] arr = new int[p+1];
            boolean[] hartal=new boolean[n+1];
            for(int i=0;i<p;i++) arr[i]=scan.nextInt();

            for(int i=0;i<p;i++){
                for(int j=arr[i];j<=n;j=j+arr[i]){
                   hartal[j]=true;
                }
            }
            for(int i=6;i<=n;i+=7) {
                hartal[i]=false;
            }
            for(int i=7;i<=n;i+=7){
                hartal[i]=false;
            }

            int count=0;
            for(int i=1;i<=n;i++) if(hartal[i]) count++;
            System.out.println(count);
            T--;
        }
    }
}
