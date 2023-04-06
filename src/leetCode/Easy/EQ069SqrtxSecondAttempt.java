package leetCode.Easy;

public class EQ069SqrtxSecondAttempt {
    public static int mySqrt(int x) {
        if(x==0)return 0;
        int ans=0;
       int left=1,right=x;
       while(left<=right){
           int mid=left+(right-left)/2;
           if(x/mid==mid)
               return mid;
           else if(x/mid<mid)
               right=mid-1;
           else{
               left=mid+1;
               //ans=mid;
           }
       }

        return left-1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(37));
    }
}
