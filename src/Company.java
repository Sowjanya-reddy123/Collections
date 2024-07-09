import java.util.ArrayList;
import java.util.LinkedList;

public class Company {
    public static void main(String[] args) {
        ArrayList<String> employee=new ArrayList<>();
        employee.add("sahithi");
        employee.add(0,"Sowjanya");
        employee.add("joshna");
        employee.add("swetha");
        employee.add(1,"nikitha");
        employee.add("gowthami");


        System.out.println(employee);

        LinkedList<String> names=new LinkedList<>();
        names.add("chinnu");
        names.add("junnu");
        names.add("chotu");

        employee.addAll(names);

        System.out.println(employee);



    }

}

