public class InheritanceChallenge {
    public static void main(String[] args) {
        Employee eashaan = new Employee("Eashaan", "20/04/1996", "01/06/2019");
        System.out.println(eashaan);
        System.out.println("Age = "+ eashaan.getAge());
        System.out.println("Collect Pay = "+ eashaan.collectPay());

        Worker employee1 = new Employee("parameters"); // polymorphism
        // new Employee (parameters) -> creating an object of class Employee
        // worker employee1 -> reference of type Worker trying to access Employee
        // Worker is base class -> I can access the object of derived class.


        SalariedEmployee sanyam = new SalariedEmployee("Sanyam", "22/12/1997",
                "03/03/2020", 100000);
        System.out.println(sanyam);
        System.out.println("Age = "+ sanyam.getAge());
        System.out.println("Sanyam's Collect Pay = "+ sanyam.collectPay());

        sanyam.retire();
        System.out.println("Sanyam's Pension Check = "+ sanyam.collectPay());

        HourlyEmployee rupa = new HourlyEmployee("Rupa", "19/04/1998",
                "05/09/2021", 15);
        System.out.println(rupa);
        System.out.println("Rupa's paycheck "+ rupa.collectPay());
        System.out.println("Rupa's Holiday Pay = "+ rupa.getDoublePay());

    }
}
