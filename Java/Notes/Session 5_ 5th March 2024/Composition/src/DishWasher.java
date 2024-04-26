public class DishWasher {
    boolean hasWorkToDo;

//    public DishWasher(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Dishwasher is working...");
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
