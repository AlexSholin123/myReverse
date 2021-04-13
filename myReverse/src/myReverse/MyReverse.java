package myReverse;

public class MyReverse {

	public static void main(String[] args) {
		
		System.out.println(reverse("Hello"));

	}
	
	public static String reverse (String word) { // word = "Hello"
		
		char[] wordArray = new char[word.length()]; 
		// word.length() = 5
		// wordArray = {[],[],[],[],[]}
		
		int index = 0;
		for(int i = word.length()-1; i >= 0; i--) { // i = 5-1 = 4
			
			wordArray[index] = word.charAt(i);
			index++;
			/* the start of the for loop
			 * 
			 * index = 0, i = 4
			 * wordArray[0] = word.charAt(4) = "Hello".charAt(4) = o
			 * wordArray = {['o'],[],[],[],[]}
			 * 
			 * index++, i--
			 * index = 1, i = 3
			 * wordArray[1] = word.charAt(3) = "Hello".charAt(3) = l
			 * wordArray = {['o'],['l'],[],[],[]}
			 * 
			 * index++, i--
			 * index = 2, i = 2
			 * wordArray[2] = word.charAt(2) = "Hello".charAt(2) = l
			 * wordArray = {['o'],['l'],['l'],[],[]}
			 * 
			 * index++, i--
			 * index = 3, i = 1
			 * wordArray[3] = word.charAt(1) = "Hello".charAt(1) = e
			 * wordArray = {['o'],['l'],['l'],['e'],[]}
			 * 
			 * index++, i--
			 * index = 4, i = 0
			 * wordArray[4] = word.charAt(0) = "Hello".charAt(0) = H
			 * wordArray = {['o'],['l'],['l'],['e'],['H']}
			 * 
			 * the end of the for loop
			 */
		}
		
		String reversed = "";
		
		for(int i = 0; i < word.length(); i++) {
			reversed += wordArray[i];
			/* the start of the for loop
			 * 
			 * i = 0
			 * reversed = reversed + wordArray[0] = "" + 'o'
			 * reversed = "o"
			 * 
			 * i++
			 * i = 1
			 * reversed = reversed + wordArray[1] = "o" + 'l'
			 * reversed = "ol"
			 * 
			 * i++
			 * i = 2
			 * reversed = reversed + wordArray[2] = "ol" + 'l'
			 * reversed = "oll"
			 * 
			 * i++
			 * i = 3
			 * reversed = reversed + wordArray[3] = "oll" + 'e'
			 * reversed = "olle"
			 *
			 * i++
			 * i = 4
			 * reversed = reversed + wordArray[4] = "olle" + 'H'
			 * reversed = "olleH"
			 * 
			 * the end of the for loop
			 */
		}
		
		return reversed;
	}
}
