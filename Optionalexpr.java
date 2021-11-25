public class Optionalexpr implements Token {
	Expr e;

	public Optionalexpr(){}
	public Optionalexpr(Object p){
		e = (Expr) p;
	}


	public String toString(int t){
		if(e == null)
			return "";
		return e.toString();
	}
}
