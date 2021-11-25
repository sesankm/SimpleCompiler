public class Stmt implements Token {
	Expr e;
	Stmt s;
	OptionalElse oe;
	Name n;
	ReadList r;
	PrintList p;
	PrintLineList pl;
	String id;
	Args a;
	String op;
	Optionalsemi os;
	Fielddecls f;
	Stmts ss;

	boolean ret = false;
	boolean read = false;
	boolean print = false;
	boolean printl = false;

	public Stmt(Object o, Object s, Object oe){
		e = (Expr) e;
		s = (Stmt) s;
		oe = (OptionalElse) oe;
	}

	public Stmt(Object e, Object s){
		e = (Expr) e;
		s = (Stmt) s;
	}

	public Stmt(Object n, Object e, String eq){
		n = (Expr) n;
		e = (Expr) e;
	}

	public Stmt(Object r, int i){
		try{
			r = (ReadList) r;
			read = true;
		}
		catch( Exception ex) {
			p = (PrintList) p;
			print = true;
		}
	}

	public Stmt(Object pl){
		pl = (PrintLineList) pl;
		printl = true;
	}

	public Stmt(String i){
		id = i;
	}

	public Stmt(String i, Object a){
		id = i;
		a = (Args) a;
	}

	public Stmt(){
		ret = true;
	}
	
	public Stmt(boolean r, Object e){
		ret = r;
		e = (Expr) e;
	}

	public Stmt(Object n, String op){
		n = (Name) n;
		op = op;
	}

	public Stmt(Object f, Object s, Object os, int t){
		f = (Fielddecls) f;
		s = (Stmts) ss;
		os = (Optionalsemi) os;
	}

	public String toString(int t){
		if(oe != null)
			return "if (" + e.toString() + ")" + s.toString();
		else if(e != null && s != null)
			return "while (" + e.toString() + ")" + s.toString();
		else if(read)
			return "read " + r.toString() + ")";
		else if(print)
			return "print " + p.toString() + ")";
		else if(printl)
			return "println " + pl.toString() + ")";
		else if(id != null && a == null)
			return id.toString() + "()";
		else if(id != null && a != null)
			return id.toString() + "(" + a.toString() + ")";
		else if (ret == true && e != null)
			return "return " + e.toString();
		else if(ret == true)
			return "return";
		else if(n != null && op != null)
			return n.toString() + op.toString();
		return "[" + f.toString() + ss.toString() + "]" + os.toString();
	}
}
