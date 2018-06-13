package mx.overcast.microservice.messages;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(
		value = "User",
		description = "Objeto que representa al usuario."
		)
public class User {

	@ApiModelProperty(
			name = "firstName",
			notes = "Nombre del usuario. Requerido",
			value = "Nombre del usuario. Requerido",
			required = true
			)
	private String firstName;
	
	@ApiModelProperty(
			name = "lastName",
			notes = "Apellido del usuario. Requerido",
			value = "Apellido del usuario. Requerido",
			required = true
			)
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
