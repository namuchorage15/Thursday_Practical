public class CountVowelConsonant {
	public static void main(String[] args) {
		String str="My name is namu";
		int countVowels=0;
		int Consonants=0;
		char c;
		System.out.println(str);
		c=str.charAt(0);	
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
              countVowels++;

            }
            else
            {
              Consonants++;

            }
        }
			
			
		System.out.println("vowels count in string:"+countVowels);
		System.out.println("Consonates count in string: "+Consonants);
		}

}

