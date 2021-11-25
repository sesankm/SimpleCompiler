public class Optionalsemi implements Token {
	int s;
	public Optionalsemi(int o){
		s = o;
	}
	public Optionalsemi(){}
	public String toString(int t){
		if(s == 1)
			return ";";
		return "";
	}
}
