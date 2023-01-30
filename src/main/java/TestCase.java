class TestCase {
    public static void main(String[] args){
        System.out.println(getFactorial(5,1));
    }

    public static int getFactorial(int n, int fact) {
        if(n<1)
            return fact;
        return getFactorial(n-1, fact * n);
    }
}
