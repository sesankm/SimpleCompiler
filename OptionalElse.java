public class OptionalElse implements Token {
	int e;

	public OptionalElse(){}
	public OptionalElse(int e){
		e = e;
	}


	public String toString(int t){
		if(e == 0)
			return "";
		return "else";
	}
}
