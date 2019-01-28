public class Factorial {
    private int factorial_iterative(int n){

        int total =1;
        for(int x=1; x<=n; x++)
            total*=x;
        return total;

    }

    private int factorial_recursive(int n){

        if(n<=1)
            return n;
        return n * factorial_recursive(n-1);

    }

    public int factorial(int n, String type){

        int answer=0;
        if(type.equals("iterative")){
            answer=factorial_iterative(n);
        } else if(type.equals("recursive")) {
            answer=factorial_recursive(n);
        }

        return answer;

    }
}