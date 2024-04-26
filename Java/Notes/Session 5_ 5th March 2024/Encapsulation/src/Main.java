public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Eashaan";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer eashaan = new EnhancedPlayer("Eashaan");
        EnhancedPlayer eashaan = new EnhancedPlayer("Eashaan", 200, "Sword");
        System.out.println("Initial health is "+ eashaan.healthRemaining());
    }
}
