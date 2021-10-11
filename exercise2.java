// Find largest number

public class exercise2 {
    public static int max(int[] m){
        int maxNum = 0;
        int i = 0;
        while (i<m.length){
            if(maxNum<i){
                maxNum = m[i];
            }i++;
        }return maxNum;
    }

    public static void main(String[] args){
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        System.out.print(max(numbers));
    }
}
