public class FivePerLine {
    public static void main(String[] args) {
        for(int i = 1000; i <= 2000; i++){
            if(i % 5 == 0 && i > 1000){
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}
