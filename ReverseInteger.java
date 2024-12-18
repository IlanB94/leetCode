    public static int reverse(int x){
        int prev =0;
        int rev=0;
        while(x != 0){
            rev = rev*10 + x%10;
            if((rev - x % 10)/ 10 != prev){
                return 0;
            }
            prev = rev;
            x/=10;
        }
        return rev;
    }
