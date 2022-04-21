import java.io.Serializable;
import java.util.Objects;

public class Phone {
    private int number;
    private String model;
    private int weight;
    static int count;
    Phone(int number, String model, int weight)
    {
        Phone test = new Phone(222222, "first");
        count++;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    Phone() {
        count++;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "\t" + number);
    }

    public void setNumber(int number) {

        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setModel(String model) {

        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public void setWeight(int weight) {

        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }

    public void sendMessage(int... array) {
        for (int a : array) {

            System.out.print(a + "\t");

        }
    }

    // переопределения
    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return number == phone.number && weight == phone.weight && (model == phone.model ||
                (model != null && model.equals(phone.getModel())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
