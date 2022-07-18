import java.util.Arrays;

public class finddupe {
    public int fun(int a[]){
        int dupe;
        Arrays.sort(a);
        //Time complexity O(n)
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1])
                return a[i];
        }
        /*Time complexity O(n2)
        for(int i=0;i<a.length-1;i++){
            dupe=a[i];
            for(int j=i+1;j<a.length;j++){
                if(a[j]==dupe){
                    return dupe;
                }

            }
        }*/
        return -1;
    }
    public static void main(String args[]){
        int a[]={1,5,7,2,8,9,-2,-9,4,6};
        finddupe o =new finddupe();
        System.out.println(o.fun(a));
    }
}
