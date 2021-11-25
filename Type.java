class Type implements Token {
	String type;

	public Type(String t){
		type = t;
	}

	public Type(){
		type = "";
	}

	String getType(){
		return type;
	}

	public String toString(int t){
		return type;
	}
}
