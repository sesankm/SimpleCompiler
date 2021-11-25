public class Fielddecl implements Token {
	Optionalfinal f;
	Type tp;
	String id;
	Optionalexpr e;
	int lit;

	public Fielddecl(Object f, Object t, String id, Object e){
		f = (Optionalfinal) f;
		tp = (Type) t;
		id = id;
		e = (Optionalexpr) e;
	}

	public Fielddecl(Object t, String id, int lit){
		tp = (Type) t;
		id = id;
		lit = lit;
	}

	public String toString(int t){
		if(f == null)
			return tp.toString() + " " + id + "[" + Integer.toString(lit) + "]";
		return f.toString() + " " + tp.toString() + " " + id + (String) e.toString();
	}
}
