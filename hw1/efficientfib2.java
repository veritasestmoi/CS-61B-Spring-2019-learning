package hw1;

public class efficientfib2 {
    public static int fib2(int n, int k, int f0, int f1) {
        if(n==k){
            return f0;
        }else{
            return fib2(n, k+1, f1, f0+f1);
        }
}
}

// /https://yintelligence.tech/2021/02/28/2021-02-28-Introduction-to-Java/