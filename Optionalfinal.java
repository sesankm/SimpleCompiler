public class Optionalfinal implements Token {

	int f = 0;

	public Optionalfinal(){}
	public Optionalfinal(int p){
		f = p;
	}


	public String toString(int t){
		if(f == 0)
			return "";
		return "FINAL";
	}
}
