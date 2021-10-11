//Problem
public class ex4 {
    public static void windowPosSum(int[] a, int n)  {
        for(int i=0; i<=a.length;i++){
            if(a[i]<1){
                continue;
            }
                for(int j=0;j<=i+3;j++){
                    a[i]= a[i+j];
                }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
    
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
      }
}

//UTIL Contains the collections framework, legacy collection classes, event model, date and time facilities, internationalization, and miscellaneous utility classes (a string tokenizer, a random-number generator, and a bit array).