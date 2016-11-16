package CompositePattern;

/**
 * Created by xhon on 16-11-16.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("Donald","CEO", 4000);

        Employee headSales = new Employee("Barack","Head Sales", 2000);

        Employee headMarketing = new Employee("George","Head Marketing", 1000);

        Employee clerk1 = new Employee("Renal","Marketing", 800);
        Employee clerk2 = new Employee("Bill","Marketing", 600);

        Employee salesExecutive1 = new Employee("Abraham","Sales", 500);
        Employee salesExecutive2 = new Employee("John","Sales", 400);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
