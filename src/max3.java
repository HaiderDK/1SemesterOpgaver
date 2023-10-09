public class max3 {
    public static void main(String[] args) {
        int a=2;
        int b=17;
        int c=69;

// vores metode udregner først max b og c så max a og resultatet af det først max
        int d=max(a,max(b,c));
        System.out.println(" Det største tal er: " +d);
    }
    
// metoden
    static int max(int x, int y){
        if (x>y)
            return x;
        else
            return y;
    }
}
