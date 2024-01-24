import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
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
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  sNew = lowerCase(word);
  sNew = onlyChar(sNew);
  for(int i =0; i < word.length() / 2; i++)
    {
      if(sNew.charAt(i) != sNew.charAt(sNew.length() - (i + 1)))
      {
        return false;
      }
    }
  return true;
}
public static String lowerCase(String guh)
{
    return guh.toLowercase();
}
public static String onlyChar(String wuh)
{
   String sNew = new String();
   sNew = "";
   for(int i = 0; i < wuh.length(); i++)
    {
       if(Charater.isLetter(wuh.charAt(i)))
       {
         sNew = sNew + wuh.charAt(i);
       }
    }
   return sNew;
} 
}
