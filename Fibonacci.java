
public class Fibonacci{

    private int fibonacci_recursive(int n){
        if (n<=1)
            return n;
        return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);

    }

    private int fibonacci_iterative(int n){
        if (n<=1) {
            return n;
        }

        int first=0;
        int next=1;
        int nth;
        int total=first+next;

        for(int i=2; i<=n; i++) {
            nth = first + next;
            first = next;
            next = nth;

            total =+ nth;

        }
        return total;

    }

    public int fibonacci(int n, String type){

        int answer = 0;
        if(type.equals("iterative")){
            answer=fibonacci_iterative(n);
        } else if(type.equals("recursive")) {
            answer=fibonacci_recursive(n);
        }

        return answer;

    }
}