import java.util.Scanner;

public class Pr5{
    private static long power(long a, long b, long p){
        if(b==1)
         return a;
        else
          return (((long)Math.pow(a,b))%p);
    }
    public static void main(String args[]){
        long P,G,a,b,x,y,ka,kb;
        Scanner sc=new Scanner(System.in);
        P=sc.nextLong();
        System.out.println("The prime no is :"+P);
        G=sc.nextLong();
        System.out.println("The Primitive Root is:"+G);
        a=sc.nextLong();
        System.out.println("The private key for Alice:"+a);
        b=sc.nextLong();
        System.out.println("The private key Bob:"+b);
        x=power(G,a,P);
        System.out.println("The public key for Alice:"+x);
        y=power(G,b,P);
        System.out.println("The public key of Bob:"+y);

        ka=power(y,a,P);
        System.out.println("The secrete key of Alice:"+ka);

        kb=power(x,b,P);
        System.out.println("The secrete key of Bob:"+kb);

    }
}