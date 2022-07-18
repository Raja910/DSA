public class kadanes_algo {
    public static void main(String ags[]){
        int[] a={-5,4,1,-6,8,0,10,-12,14};
        int maxsum=0,cursum=0;             //maxsum=Integer.MIN_VALUE when all values are negative like {-46,-83,-12,-14}
        //Time Complextiy: O(n)
        for(int i=0;i<a.length;i++){
            cursum+=a[i];
            if(cursum>maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        System.out.println(maxsum);
        /*
        Time complexity : O(n2)
        int maxsum=Integer.MIN_VALUE,k=0,p=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum>maxsum){
                    k=i;p=j;
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum+" "+k+" "+p+" "+a.length);*/
    }
}
