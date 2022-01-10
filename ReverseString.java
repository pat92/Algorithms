
public class ReverseString
{
    public static void main(String[] args) {
    String str = "abc";
    String nstr = "";
    char ch;
    
    System.out.println("Original word -> "+str);

    for(int i = 0 ; i<str.length() ; i++){
        ch = str.charAt(i); //fetches the string at string
        nstr = ch+nstr; // adds the char to the front of the string    
    }
		
	System.out.println(" Reverse word -> "+nstr);
		
		
	}
}
