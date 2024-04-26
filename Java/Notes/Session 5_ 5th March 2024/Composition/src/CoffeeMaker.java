public class CoffeeMaker {
    boolean hasWorkToDo;

//    public CoffeeMaker(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void brewCoffee(){
        if(hasWorkToDo) {
            System.out.println("Coffee is Brewing...");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
}
