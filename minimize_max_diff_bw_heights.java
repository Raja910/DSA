import java.util.Arrays;

public class minimize_max_diff_bw_heights {
    public int mmdbh(int a[],int n,int k){
        Arrays.sort(a);
        a[0]=  a[0]>=k ? a[0]-k : a[0]+k;
        a[n]=a[n]>=k?a[n]-k:a[n]+k;
        return a[n]-a[0];
    }
    public static void main(String args[]){
        int arr[]=  {3, 9, 12, 16, 20};
        int k=2;
        minimize_max_diff_bw_heights o= new minimize_max_diff_bw_heights();
        System.out.println(o.mmdbh(arr,arr.length-1,k));
    }
}
