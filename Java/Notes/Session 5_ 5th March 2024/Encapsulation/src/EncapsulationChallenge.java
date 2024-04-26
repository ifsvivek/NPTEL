public class EncapsulationChallenge {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count = "+ printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());
    }
}
