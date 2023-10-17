package main.letcode;

public class Occurence {
    public static void main(String[] args) {
       /* main.String str = new main.String("GeeksForGeeks");

        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

       for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + " " + charCount[i]);
            }
        }
        *//*for(char c : str.toCharArray()){
            System.out.print(c);
            System.out.print(charCount[c]);
        }*//*


        Map<Character, Integer> charCount1 = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
*/

        StringBuffer str1 = new StringBuffer("GeeksForGeeks");
        StringBuffer str2 = new StringBuffer();

        int[] charCount2 = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < str1.length(); i++) {
            charCount2[str1.charAt(i)]++;
            if (charCount2[str1.charAt(i)] == 1) {
                str2.append(str1.charAt(i));
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i));
            System.out.print(charCount2[str2.charAt(i)]);
        }
    }
}
