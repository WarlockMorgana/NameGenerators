package Names;
import java.util.*;

public class FirstNames {
	//this is a demonstration list, suggest names pls
	private String[] scifiFirstNamesM = {"Baart"};
	private String[] scifiMidNamesM = {"Waart"};
	private String[] scifiLastNames = {"Copter"};
	private String[] scifiSuffix = {"the Great"};
	
	private String[] scifiFirstNamesF = {"Baarta"};
	private String[] scifiMidNamesF = {"Waartie"};
	
	
	private String[] epicFirstNamesM = {"Zeus"};
	private String[] epicMidNamesM = {"Lancelot"};
	private String[] epicLastNames = {"Odinson"};
	private String[] epicSuffix = {"the Great"};
	
	private String[] epicFirstNamesF = {"Hera"};
	private String[] epicMidNamesF = {"Athena"};
	
	private String[] modernFirstNamesM = {"Jesper"};
	private String[] modernMidNamesM = {"Eryk"};
	private String[] modernLastNames = {"Starbright"};
	private String[] modernSuffix = {"the Great"};
	
	private String[] modernFirstNamesF = {"Katana"};
	private String[] modernMidNamesF = {"Alyn"};
	
	private String firstName;
	private String midName;
	private String lastName;
	private String suffix;
	private String name;
	
	public FirstNames(int genre, int gender) {
		Random r = new Random ();
		
		int i=0;
		
		switch (genre){
		
		case 1:
			//scifi names
			if(gender == 0) {
				i = r.nextInt(scifiFirstNamesM.length);
				firstName = scifiFirstNamesM[i];
				i = r.nextInt(scifiMidNamesM.length);
				midName = scifiMidNamesM[i];
				i = r.nextInt(scifiLastNames.length);
				lastName = scifiLastNames[i];
				i = r.nextInt(scifiSuffix.length);
				suffix = scifiSuffix[i];
				
				name = firstName + " "+ midName + " "+ lastName + " "+suffix;
			}
			else if (gender==1) {
				i = r.nextInt(scifiFirstNamesF.length);
				firstName = scifiFirstNamesF[i];
				i = r.nextInt(scifiMidNamesF.length);
				midName = scifiMidNamesF[i];
				i = r.nextInt(scifiLastNames.length);
				lastName = scifiLastNames[i];
				i = r.nextInt(scifiSuffix.length);
				suffix = scifiSuffix[i];
				
				name = firstName + " "+ midName + " "+ lastName + " "+suffix;
			}
			
			break;
			
		case 2:
			//traditional epic fantasy names
			
			if(gender == 0) {
				i = r.nextInt(epicFirstNamesM.length);
				firstName = epicFirstNamesM[i];
				i = r.nextInt(epicMidNamesM.length);
				midName = epicMidNamesM[i];
				i = r.nextInt(epicLastNames.length);
				lastName = epicLastNames[i];
				i = r.nextInt(epicSuffix.length);
				suffix = epicSuffix[i];
				
				name = firstName + " "+ midName + " "+ lastName + " "+suffix;
			}
			else if (gender==1) {
				i = r.nextInt(epicFirstNamesF.length);
				firstName = epicFirstNamesF[i];
				i = r.nextInt(epicMidNamesF.length);
				midName = epicMidNamesF[i];
				i = r.nextInt(epicLastNames.length);
				lastName = epicLastNames[i];
				i = r.nextInt(epicSuffix.length);
				suffix = epicSuffix[i];
				
				name = firstName + " "+ midName + " "+ lastName + " "+suffix;
			}
			break;
			
		case 3:
			//modern supernatural names
			if(gender == 0) {
				i = r.nextInt(modernFirstNamesM.length);
				firstName = modernFirstNamesM[i];
				i = r.nextInt(modernMidNamesM.length);
				midName = modernMidNamesM[i];
				i = r.nextInt(modernLastNames.length);
				lastName = modernLastNames[i];
				i = r.nextInt(modernSuffix.length);
				suffix = modernSuffix[i];
				
				name = firstName + " "+ midName + " "+ lastName + " "+suffix;
			}
			else if (gender==1) {
				i = r.nextInt(modernFirstNamesF.length);
				firstName = modernFirstNamesF[i];
				i = r.nextInt(modernMidNamesF.length);
				midName = modernMidNamesF[i];
				i = r.nextInt(modernLastNames.length);
				lastName = modernLastNames[i];
				i = r.nextInt(modernSuffix.length);
				suffix = modernSuffix[i];
				
				name = firstName + " "+ midName + " "+ lastName + " "+suffix;
			}
			break;
		
		}
	}

	
	public String getName() {
		return name;
	}

}
