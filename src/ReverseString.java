public class ReverseString {

    public static void main(String[] args) {

        String sentence="America is a great country";
        StringBuilder reverse= new StringBuilder(sentence);
        String print = reverse.reverse().toString();
        System.out.println("Here is reverse string   "+ print);


        StringBuffer sent2=new StringBuffer(sentence);
        String print2=sent2.reverse().toString();
        System.out.println("   "+print2);



    }
}
