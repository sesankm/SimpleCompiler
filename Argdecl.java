public class Argdecl implements Token {
	Type type;
	String id;
	int i = 0;

	public Argdecl(Object t, String id){
		type = (Type) t;
		id = id;
	}

	public Argdecl(Object t, String id, int i){
		type = (Type) t;
		id = id;
		i = i;
	}


	public String toString(int t){
		if(i  != 0)
			return type.toString() + " " + id + "[]";
		return type.toString() + " " + id;
	}
}
