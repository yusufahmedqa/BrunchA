public class RomveString {
    public static void main(String[] args) {
        String ori="America";

        String ne =ori.replaceAll("[AaEeIiOoUu]","");
        System.out.println(ne);
    }
}
