public class PrintLineList implements Token {
	PrintList p;

	public PrintLineList(){}

	public PrintLineList(Object p){
		p = (PrintList) p;
	}


	public String toString(int t){
		if(p == null)
			return "";
		return p.toString();
	}
}
