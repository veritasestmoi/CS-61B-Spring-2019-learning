// def larger(x, y):
//     if(x>y):
//         return x
//     return y

// print(larger(-5,10));


public class larger{

    public static int large(int x, int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static void main(String[] args){
        System.out.println(large(-5,12));
    }

}