package mx.overcast.microservice.messages;

public class Message {

	private User user;
	private Regards regards;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Regards getRegards() {
		return regards;
	}
	public void setRegards(Regards regards) {
		this.regards = regards;
	}
}
