package lambda.implementation.three.modal;

public class Person 
{
	private Integer pId;
	private String pName;
	private String pEmail;
	
	public Person(Integer pId, String pName, String pEmail) 
	{
		this.pId = pId;
		this.pName = pName;
		this.pEmail = pEmail;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpEmail() {
		return pEmail;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	@Override
	public String toString()
	{
		return "Person [pId=" + pId + ", pName=" + pName + ", pEmail=" + pEmail + "]";
	}
	
	

}
