public class Main {
    public static void main(String[] args) {
        System.out.println(F(7));
    }
    // 38 = 10 10 10 5 2 1
    // 16 = 10 5 1

    public static void getExchange(int num){
        int coin = 0;
        //coin = (num>=10)?10:(num>=5)?5:(num>=2)?2:(num>=1)?1:0;

        if(num>=10) coin = 10;
        else if(num>=5) coin = 5;
        else if(num>=2) coin = 2;
        else if(num>=1) coin = 1;

        if(coin != 0){
            System.out.println(coin);
            getExchange(num-coin);
        }
    }


    /*public static void getExchange(int num){
        if(num>=10){
            System.out.println(10);
            getExchange(num-10);
        }else if(num>=5){
            System.out.println(5);
            getExchange(num-5);
        }else if(num>=2){
            System.out.println(2);
            getExchange(num-2);
        }else if(num>=1){
            System.out.println(1);
            getExchange(num-2);
        }
    }*/

    public static int min(int a, int b){
        return (a<b)?a:b;

        /*if(a<b) return a;
        else return b;*/
    }

    public static void sayHi(String name){
        sayHi(name);
        System.out.println("hello "+name);
    }
    public static int f(int x){
        return x*x;
    }


    public static int F(int n) {
        if (n > 2)
            return F(n-1) + G(n-2);
        else return 1;
    }
    public static int G(int n) {
        if (n > 2)
                return G(n-1) + F(n-2);
        else return 1;
    }

    //System.out.println(F(7))
    /*F(7) = F(n-1) + G(n-2) = F(6)+G(5) = 8 + 5 = 13
    F(6) = F(n-1) + G(n-2) = F(5)+G(4) = 5 + 3 = 8
    F(5) = F(n-1) + G(n-2) = F(4)+G(3) = 3 + 2 = 5
    F(4) = F(n-1) + G(n-2) = F(3)+G(2) = 2 + 1 = 3
    F(3) = F(n-1) + G(n-2) = F(2)+G(1) = 1 + 1 = 2
    F(2) = 1
    G(1) = 1
    G(2) = 1
    G(3) = G(n-1) + F(n-2) = G(2)+F(1) = 1+1 = 2
    F(1) = 1
    G(4) = G(n-1) + F(n-2) = G(3)+F(2) = 2+1=3
    G(5) = G(n-1) + F(n-2) = G(4)+F(3) = 3+2 = 5*/




    /*public static int F(int n) {
        if (n > 3) return F(n-2) + F(n/2);
        else return n;
    }

    // System.out.println(F(9))
    F(9) = F(n-2) + F(n/2) = F(7)+F(4) = 8+4=12
    F(7) = F(n-2) + F(n/2) = F(5)+F(3) = 5+3=8
    F(5) = F(n-2) + F(n/2) = F(3)+F(2) = 3+2=5
    F(3) = 3
    F(2) = 2
    F(4) = F(n-2) + F(n/2) = F(2)+F(2) = 4*/

}
