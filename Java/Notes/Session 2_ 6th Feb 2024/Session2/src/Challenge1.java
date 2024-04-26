public class Challenge1 {
    public static void main(String[] args) {
        double var1 = 20.00d;
        double var2 = 80.00d;
        double var3 = (var1 + var2) * 100;
        double remainder = var3 % 40.00d;

        boolean rem = (remainder == 0.00d) ? true : false;
        System.out.println(rem);

        if(!rem){
            System.out.println("Got some remainder");
        }
    }
}
