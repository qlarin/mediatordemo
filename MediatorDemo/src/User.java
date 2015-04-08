
public class User {

	private String nickname;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public User(String nickname){
		this.nickname = nickname;
	}
	
	public void sendMessage(String message){
		ChatRoom.showMessage(this, message);
	}
}
