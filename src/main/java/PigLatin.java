import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String sWord) {
 char [] v = {'a', 'e','i','o','u'};
  int d = -1;
  for(int i = 0; i < word.length(); i++){
    for(int j = 0; j < 5; j++){
      if(word.charAt(i) == vowels[j]){
        d = i;
        return d;
      }
    }
        return -1;
    }

    public String pigLatin(String sWord) {
	    if(findFirstVowel(sWord) == -1) {
		    return sWord + "ay";
	    }
	    else if(findFirstVowel(sWord)==0){
		String k = sWord;
		    k = k +"way";
		    return k;
	    }
	    else if(sWord.substring(0,2).equals("qu")){
		    String a = sWord;
		    a = a.substring(2) + "quay";
		    return a;
	    }
	    else if(findFirstVowel(sWord) !=){
		    String s = sWord;
		    s = sWord.substring(findFirstVowel(sWord)) + sWord.substring(0,findFirstVowel(sWord)) + "ay";
		    return a;
	    }
	    else {
		    return "Error";
	    }}
	    
    }

