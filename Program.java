public class Program implements Token {
	String id;
	Memberdecls m;

	public Program(String i, Object m){
		id = i;
		m = (Memberdecls) m;
	}

	public String toString(int i){
		return id + m.toString();
	}
}
