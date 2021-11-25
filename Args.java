public class Args implements Token {
	Expr e;
	Args a;

	public Args(Object e){
		e = (Expr) e;
	}

	public Args(Object e, Object a){
		e = (Expr) e;
		a = (Args) a;
	}

	public String toString(int t){
		if(a == null)
			return e.toString();
		return e.toString() + "," + a.toString();
	}
}
