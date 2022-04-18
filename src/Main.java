
public class Main {
    // 1
    public static void main(String[] args) {
    Phone phone1 = new Phone();
    Phone phone2 = new Phone();
    Phone phone3 = new Phone();
    phone1.setNumber(342352354);
    phone1.setModel("apple");
    phone1.setWeight(33);
    phone2.setNumber(345236745);
    phone2.setModel("samsung");
    phone2.setWeight(31);
    phone3.setNumber(354532399);
    phone3.setModel("honor");
    phone3.setWeight(23);
        System.out.println(phone1.getNumber() + "\t" + phone1.getModel() + "\t" + phone1.getWeight() + "\n");
        System.out.println(phone2.getNumber() + "\t" + phone2.getModel() + "\t" + phone2.getWeight() + "\n");
        System.out.println(phone3.getNumber() + "\t" + phone3.getModel() + "\t" + phone3.getWeight() + "\n");
        phone1.getNumber();
        phone1.receiveCall("Tom");
        phone2.getNumber();
        phone2.receiveCall("John");
        phone3.getNumber();
        phone3.receiveCall("Ben");
        phone1.receiveCall("Ann", 555555);
    // 2
    Person person1 = new Person();
    Person person2 = new Person("Ivanov Ivan Ivanovich", 20);
    // 4
    Reader[] reader = new Reader[3];
}
}

