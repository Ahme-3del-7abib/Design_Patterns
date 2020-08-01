package C_Builder_Design_pattern;

public class Program_Main {

    public static void main(String[] args) {

        Player player = new Player.Builder("Mohamed Salah", "Liverpool")
                .height(178)
                .salary(500000)
                .phone("01091739782")
                .twitterAccount("ahmed.a.habib2020@gmail.com")
                .build();

        System.out.println(player.getName());

    }
}
