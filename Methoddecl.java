public class Methoddecl implements Token {
	ReturnType r;
	String i;
	Argdecl a;
	Fielddecls f;
	Stmts s;
	Optionalsemi o;


	public Methoddecl(Object r, String i, Object a, Object f, Object s, Object o){
		r = (ReturnType) r;
		i =  i;
		a = (Argdecl) a;
		f = (Fielddecls) f;
		s = (Stmts) s ;
		o = (Optionalsemi) o;
	}

	public String toString(int i){
		return r.toString() + i + "(" + a.toString() + ")" + "{" + f.toString() + s.toString() + o.toString();
	}
}
