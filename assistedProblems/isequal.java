package assistedProblems;

public class isequal {
    public static int rev(int num){
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            }
            return rev;
    }
    public static void main(String[] args) {
        int num=2167;
        int cnt=0;
        int tem=num;
        int need=num;
        int use=rev(num);
        while(tem>0){
            cnt++;
            tem=tem/10;
        }
        int c1=cnt/2,c2=cnt/2,fh=0,sh=0;
        if((cnt&1)==1){
            System.out.println("Impossible: ");
        }
        else{
            while(c1-->0){
                fh=fh*10+use%10;
                use=use/10;
            }
            while(c2-->0){
                sh=sh*10+use%10;
                use=use/10;
            }
            if(((fh+sh)*(fh+sh))==need){
                System.out.println("Possible: "+fh+" "+sh);
        }else{
            System.out.println("Impossible: "+fh+" "+sh);
        }

    }

    }
}
