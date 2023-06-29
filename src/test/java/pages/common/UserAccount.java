package pages.common;

public class UserAccount {
	
	
	private String accountReference;
	private String userId;
	private String password;
	
	public UserAccount(String accountReference, String userId, String password) {
		this.accountReference = accountReference;
		this.userId = userId;
		this.password = password;
	}
	
	public String getAccountReference() {
		return accountReference;
	}
	public void setAccountReference(String accountReference) {
		this.accountReference = accountReference;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	 

}
