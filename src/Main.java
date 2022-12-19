public class Main {
    public static void main(String[] args) {

        String s1 = "I try to learn something from this.And it happens.";

        int count = 0;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i) !=' ')
                if (s1.charAt(i) !='.')
                count++;
        }

        System.out.println("Total number of characters in a string without spaces is " + count + " . Thank you google, you're the best");

    }



}