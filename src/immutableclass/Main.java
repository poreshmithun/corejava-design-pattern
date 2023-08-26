package immutableclass;

/**
 * Demonstrating how to write Immutable class (Employee.java)
 *
 * @author pores
 * @version 04.08.2023
 */
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Address add1 = new Address();
        add1.setCity("Giridih");
        add1.setState("Jharkhand");
        Employee emp1 = new Employee("Mithun", "123", add1);
        System.out.println(emp1);
        add1.setCity("Dhanbad");
        System.out.println(emp1);
        Address add2 = emp1.getAddress();
        add2.setCity("Dhanbad");
        System.out.println(emp1);
    }
}