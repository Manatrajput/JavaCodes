public class CricketPlayer {
    String name;
    int age;
    String country;

    public void CricketPlayer (String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

    public static void main(String[] args) {
        CricketPlayer player1 = new CricketPlayer();
        CricketPlayer player2 = new CricketPlayer();

        player1.displayInfo();
        System.out.println();
        player2.displayInfo();
    }
}

