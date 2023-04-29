package homeWorkClass13;

public class Task1 {
    public static void main(String[] args) {
       /* How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever*/
        String sentence="This is sentence i want to reverse";
        String[] words=sentence.split(" ");
        for (String word : words) {
            StringBuilder sb=new StringBuilder(word);
            sb=sb.reverse();
            String str=sb.toString();
            System.out.print(str+" ");

        }


    }
}
