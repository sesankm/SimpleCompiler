public class Stmts implements Token {
	Stmts ss;
	Stmt s;

	public Stmts(Object s, Object ss){
		ss = (Stmts) ss;
		s = (Stmt) s;
	}

	public Stmts(){}

	public String toString(int t){
		if(s != null && ss != null)
			return ss.toString() + s.toString();
		else
			return "";
	}

}
