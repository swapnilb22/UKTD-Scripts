package practice;

public class Returnarray {

	public static void main(String[] args){
		// TODO Auto-generated method stub

	//Handling exception	
	try {
	String[] aType = Returnarrayvalue();
		for (int i=0; i<=aType.length; i+=2) {
			if(i==3) {
				break;
			}
		if (i==4) {
			continue;
		}	
			
		System.out.println(aType[i]);
	}
		}catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
	}


public static String[] Returnarrayvalue() {
	String[] aArray = {"BMW","Volkswegan","Honda","Hyundai","Maruti","Proche","Lamborgini"};
	
	return aArray;
}
}
