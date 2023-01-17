public class Car {
    int age = 0;
    int power = 140;
    int turbo = 50;

    public static void main(String[] args) {
         Car Ford1 = new Car();
         Car Ford2 = new Car();

        System.out.println(Ford1.getAge());
        System.out.println(Ford1.calculateIndex());
        System.out.println(Ford2.power);
        System.out.println(Ford2.upgradePower(140));
        System.out.println(Ford2.calculateIndex());
    }

    int getAge () {
        return age;
    }

    int calculateIndex() {
        return power * 10 + turbo;
    }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }
}
