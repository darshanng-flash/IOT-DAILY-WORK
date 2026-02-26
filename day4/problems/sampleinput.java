//counting of words from the given string
package day4.problems;

public class sampleinput {
    public static void main(String[] args) {
        String str = "java is easy";
        String[] words = str.split("\\s+"); 
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
    }

}
/*or int count=1;
for(int i =0;i<s.length();i++){
if(s.charAt(i)==' '){
count++;
}
}
System.out.println(count);*/