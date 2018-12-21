public class Break {
    public static void main(String args[]){
       boolean t=true;

       first:{
           second: {
           third: {
               System.out.println("Before the break");
               if(t) break second;
               System.out.println("this won't execute");
           }
           System.out.println("This is part of second, so won't execute");
           }
       }
        System.out.println("This is after second block");
    }
}
