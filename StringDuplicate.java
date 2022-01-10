
public class StringDuplicate
{
    
    
	public static void main(String[] args) {
		String duplicates1 = "hellomyffrand";
		Boolean duplicate = false;
		char[] ch = new char[duplicates1.length()];
		for(int i=0; i < duplicates1.length; i++ ){
		     ch[i] = duplicates1.charAt(i);
		}
		
		for(int j = 0; j < ch.length(); j++){
		    for(int k= j+1; k < ch.length(); k ++ ){
		        if(k!=j && ch[k]==ch[j])
		            duplicate = true;
		            
		    }
		}
		if(duplicate){
		    System.out.println("String contains duplicates");
		}
	}
}
