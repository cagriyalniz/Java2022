package homeWorkWeek3.first;

public class Main {
    public static void main(String[] args) {
/*        Person p = new Person();
        p.City = "izmit";
        p.id = 1;
        p.FirstName = "cagri";
        p.LastName = "yalniz";
        Customer c = new Customer();
        c.FirstName = "A firmasi";
        c.City = "Londra";

        CustomerManager cm = new CustomerManager(p);
        cm.Save();

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();*/

        CustomerManager cm = new CustomerManager(new Customer(), new MilitaryCreditManager());
        cm.Save();
        cm.GiveCredit();
        CustomerManager cm2 = new CustomerManager(new Customer(), new TeacherCreditManager());
        cm2.Save();
        cm2.GiveCredit();


    }
}
