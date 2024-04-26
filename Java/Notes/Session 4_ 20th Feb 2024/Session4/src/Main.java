public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            Student s = new Student("AB123" + i,
                    switch(i) {
                case 1 -> "Eashaan";
                case 2 -> "Rupa";
                case 3 -> "Jahnavi";
                case 4 -> "Aditi";
                case 5 -> "Harry";
                default -> "Anonymous";
                    },
                    "20/04/1996",
                    "Java Class");
            System.out.println(s);
        }
    }
}
