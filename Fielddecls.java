public class Fielddecls implements Token {
	Fielddecl f;
	Fielddecls fs;

	public Fielddecls(Object f, Object fs){
		f = (Fielddecl) f;
		fs = (Fielddecl) fs;
	}

	public Fielddecls(){}

	public String toString(int t){
		if(f != null && fs != null)
			return f.toString() + " "  + fs.toString();
		return "";
	}
}
