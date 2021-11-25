public class BinOp implements Token {
	String op;
	public BinOp(String o){
		this.op = o;
	}

	public String toString(int t){
		return op;
	}
}
