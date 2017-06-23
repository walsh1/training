
public class blah {

	public int add(int a, int b){
		return a + b;
	}

	public String doStuff(){
		int i=0;
		String returnMe = "";
		while(i<10){
			int temp = i +10;
			returnMe += returnMe + i + " " + temp + ".";
			i++;
		}
		return returnMe;
	}



}
