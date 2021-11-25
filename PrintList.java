public class PrintList implements Token {
	Expr e;
	PrintList p;

	public PrintList(Object e){
		e = (Name) e;
	}

	public PrintList(Object e, Object p){
		e = (Name) e;
		p = (PrintList) p;
	}

	public String toString(int t){
		if(p == null)
			return e.toString();
		return e.toString() + "," + p.toString();
	}
}
