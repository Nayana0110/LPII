import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Pr4 {
    public static void main(String args[]){
        int p,q,n,z,e,d=0,i;
        Scanner sc=new Scanner(System.in);
        int msg=sc.nextInt();
        System.out.println("The msg is:"+msg);
        double c;
        BigInteger msgback;

        p=sc.nextInt();
        System.out.println("The First Prime number:"+p);

        q=sc.nextInt();
        System.out.println("The Second Prime number:"+q);

        //n is called modulas for encryption and decryption
        n=p*q;
        System.out.println("The value of n:"+n);

        z=(p-1)*(q-1);
        System.out.println("The value of z:"+z);

        //e is coprime to z
        // e is for public key exponent
        for(e=2; e<z; e++){
            if(gcd(e,z)==1){
                break;
            }
              
        }
        System.out.println("The value of e:"+e);

        for(i=0; i<=9; i++){
            int x=1+(i*z);
            // d is for private key exponent
            if(x%e==0){
                d=x/e;
                break;
            }
        }
        System.out.println("The private key exponent:"+d);

        c=(Math.pow(msg, e))%n;
        System.out.println("The Encrypted msg:"+c);

        // converting int value of n to BigInteger
        BigInteger N= BigInteger.valueOf(n);

        // converting float value of c to BigInteger
        BigInteger C=BigDecimal.valueOf(c).toBigInteger();
        msgback=(C.pow(d)).mod(N);
        System.out.println("The Decrypted msg:"+msgback);



    }
    static int gcd(int e, int z){
        if(e==0)
         return z;
        else
          return gcd(z%e, e);
    }
    
}
