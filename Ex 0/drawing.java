public class drawing {
    

    public static void main(String[] args){
        for(int i=0; i<=5; i++){ //Outer loop work for rows  
            for(int j=1;j<=i;j++){ //inner loop for columns  
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
