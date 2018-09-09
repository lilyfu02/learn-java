public class Main {
    public static void main(String[] args) {
        for(int a = 1; a <= 9; a++){
            for(int x = 1; x<=a;x++){
                System.out.print( x +"x"+ a +"=" + (a*x) + "  ");
            }
            System.out.println();
        }
    }
}
