//binary search using recursion
public class recursion2 {
    public static void main(String[] args) {
        int ar[]={1,12,23,45,56,78,88};
        int tar=78;
        int l=ar.length-1;
        int f=search(ar,tar,0,l);
        System.out.println(f);
    }
    static int search(int[] ar,int tar,int s,int e)
    {
        
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(tar==ar[m])
        {
            return m;
        }
        if(tar<ar[m])
        {
            return search(ar,tar,s,e=m-1);
        }
        return search(ar,tar,s=m+1,e);
}
}
