public class RollLoadedDie {
    public static void main(String[] args) {
        double r = Math.random();
        int res;
        if( r < 1.0/8.0) res = 1;
        else if(r < 2.0/8.0) res = 2;
        else if(r < 3.0/8.0) res = 3;
        else if(r < 4.0/8.0) res = 4;
        else if(r < 5.0/8.0) res = 5;
        else res = 6;
        System.out.println(res);
    }
}
