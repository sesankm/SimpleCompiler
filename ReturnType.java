public class ReturnType implements Token {
	Type type;

	public ReturnType(){}

	public ReturnType(Object t){
		type = (Type) t;
	}

	public String toString(int t){
		if(type == null)
			return "";
		return type.toString();
	}
}
