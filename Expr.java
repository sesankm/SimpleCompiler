public class Expr implements Token {
	String id;
	Args args;
	Name name;
	Expr e;
	Expr e2;
	Expr e3;
	BinOp bo;
	Type type;

	char c;
	boolean charset = false;

	int i;
	boolean intset = false;

	float f;
	boolean floatset = false;

	boolean b;
	boolean boolset = false;

	public Expr(Object n){
		name = (Name) n;
	}

	public Expr(String i){
		id = i;
	}

	public Expr(String i, Object a){
		id = i;
		args = (Args) a;
	}

	public Expr(char c){
		c = c;
		charset = true;
	}

	public Expr(int c){
		i = c;
		intset = true;
	}

	public Expr(float c){
		f = c;
		floatset = true;
	}

	public Expr(boolean c){
		b = c;
		boolset = true;
	}

	public Expr(Object b, Object e){
		try{
			bo = (BinOp) b;
		} catch (Exception ex) {
			type = (Type) b;
		}
		e = (BinOp) e;
	}

	public Expr(Object e1, Object e2, Object e3){
		e = (Expr) e1;
		e2 = (Expr) e2;
		e3 = (Expr) e3;
	}

	public String toString(int t){
		if(args != null)
			return id + "(" + args.toString() + ")";
		else if(id != null)
			return id + "()";
		else if(name != null)
			return name.toString();
		else if(charset)
			return String.valueOf(c);
		else if(floatset)
			return String.valueOf(f);
		else if(intset)
			return String.valueOf(i);
		else if(boolset)
			return String.valueOf(b);
		else if(e!= null && e2 == null && e3 == null){
			if(type != null)
				return "(" + type.toString() + ")" + e.toString();
			else if(bo != null)
				return bo.toString() + " " + e.toString();
			else
				return "(" + e.toString() + ")";
		}
		else if(e2 != null && e3 != null){
			return "(" + e.toString() + "?" + e2.toString() + ":" + e3.toString() + ")";
		}
		return id;
	}
}
