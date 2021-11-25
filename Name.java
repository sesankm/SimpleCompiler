public class Name implements Token {
	String id;
	Expr e;

	public Name(String i){
		id = i;
	}

	public Name(String i, Object e){
		id = i;
		e = (Expr) e;
	}

	public String toString(int t){
		if(e != null)
			return id + "[" + e.toString() + "]";
		return id;
	}
}
