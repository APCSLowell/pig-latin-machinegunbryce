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

  char [] vowels = {'a', 'e','i','o','u'};
  int loc = -1;
  for(int i = 0; i < word.length(); i++){
    for(int j = 0; j < 5; j++){
      if(word.charAt(i) == vowels[j]){
        loc = i;
        return loc;
      }
    }
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        // more code should go here
 if(sWord.length() == 0){
  return "";
}
if(findFirstVowel(sWord) == -1)
  {
    return sWord + "ay";
  }

  else if(findFirstVowel(sWord) == 0){
   String str = sWord;
   str = str + "way";
   return str;
  }else if(sWord.substring(0,2).equals("qu")){
  String str = sWord;
  str = str.substring(2) + "quay";
  return str;
  }else if(findFirstVowel(sWord) != -1){
    String str = sWord;
    str = sWord.substring(findFirstVowel(sWord)) + sWord.substring(0,findFirstVowel(sWord)) + "ay";
    return str;
  }
  else
  {
    return "ERROR!";
  }
    }
}//end PigLatin class
