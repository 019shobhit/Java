import java.util.Stack;

public class NextGreaterUsingStack {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[n-1]);
        int[] ans = new int[n];
        ans[n-1] =-1;
        for(int i=n-2;i>=0;i--){
            while(st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                st.push(arr[i]);
                ans[i] = -1;
            }else{
                ans[i]=st.peek();
                st.push(arr[i]);
            }
        }
        for(int i : ans){
            System.out.print(i +" ");
        }
    }
}
