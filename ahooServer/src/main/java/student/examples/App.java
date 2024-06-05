package student.examples;

public class App {
    public static void main(String[] args) {
        TV tv = new TV(55);
        Fridge fridge = new Fridge(550);

        tv.standBy();
        fridge.switchOn();

        System.out.println(tv.isOn());
        System.out.println(fridge.isOn());
    }
}
