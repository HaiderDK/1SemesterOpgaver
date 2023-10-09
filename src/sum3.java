public class sum3 {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c=18;
        int sum;

        sum=sum(a,b,c);
        System.out.println(" summen er " +sum);
    }

// hvis vi skrev void i stedet for int vil metoden ikke have en return værdi

    static int sum(int a, int b, int c){
        int result=a+b+c;
        return result;
    }
}
