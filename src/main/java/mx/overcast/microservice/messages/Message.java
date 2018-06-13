package mx.overcast.microservice.messages;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(
		value = "Message",
		description = "Mensaje para operaciones de saludo"
		)
public class Message {

	@ApiModelProperty(
			name = "user",
			value = "Usuario a enviar",
			notes = "Usuario a enviar. Se deben enviar su nombre y apellido paterno.",
			required = true
			)
	private User user;
	
	@ApiModelProperty(
			name = "regards",
			value = "Saludo respondido por la aplicacion",
			notes = "Saludo respondido por la aplicacion. No es necesario enviar",
			required = false
			)
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
