public class Refrigerator {
    boolean hasWorkToDo;

//    public Refrigerator(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Food is stored in Refrigator.");
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
