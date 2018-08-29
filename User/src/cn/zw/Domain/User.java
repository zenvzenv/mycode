package cn.zw.Domain;
/**
 *  µÃÂ¿‡
 * @author zhengwei
 *
 */
public class User {
	private String username;
	private String password;
	private String vefiyCode;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVefiyCode() {
		return vefiyCode;
	}
	public void setVefiyCode(String vefiyCode) {
		this.vefiyCode = vefiyCode;
	}
	public User(String username, String password, String vefiyCode) {
		super();
		this.username = username;
		this.password = password;
		this.vefiyCode = vefiyCode;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", vefiyCode=" + vefiyCode + "]";
	}
	
}
