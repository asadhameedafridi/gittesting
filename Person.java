import java.io.Serializable;
public class Person implements Serializable{

	private String fName;
	private String lName;

	public Person(){
	fName="";
	lName="";
	}
	
	public Person(String f, String l){
		this.fName = f;
		this.lName=l;
			}

	public String getFName(){
		return fName;
	}
	
	public String getLName(){
		return lName;
	}

}
