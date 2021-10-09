public class drawTriangle {

    public static void draw(int n){
        for (int i=0;i<=n;i++){
            for(int j=1; j<=i;j++)
                System.out.print("*");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        draw(10);
    }
}
