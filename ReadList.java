public class ReadList implements Token {
	Name n;
	ReadList r;

	public ReadList(Object n){
		n = (Name) n;
	}

	public ReadList(Object n, Object r){
		n = (Name) n;
		r = (ReadList) n;
	}

	public String toString(int t){
		if(r == null)
			return n.toString();
		return n.toString() + "," + r.toString();
	}
}
