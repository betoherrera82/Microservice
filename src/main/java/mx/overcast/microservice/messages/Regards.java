package mx.overcast.microservice.messages;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(
		value = "Regards",
		description = "Objeto que representa al saludo."
		)
public class Regards {

	@ApiModelProperty(
			name = "regard",
			notes = "Saludo al usuario. No requerido.",
			value = "Saludo al usuario. No requerido.",
			required = false
			)
	private String regard;

	public String getRegard() {
		return regard;
	}

	public void setRegard(String regard) {
		this.regard = regard;
	}
}
