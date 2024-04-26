public enum Topping {
    MUSTARD,
    PICKLES,
    LEMON,
    TOMATO,
    POTATO;

    public double getPrice() {
//        return 0.5;
        return switch(this) {
            case PICKLES -> 1.5;
            case MUSTARD -> 1.0;
            default -> 0.0;
        };
    }

}
