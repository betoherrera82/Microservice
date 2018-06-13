package mx.overcast.microservice.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mx.overcast.microservice.messages.Message;
import mx.overcast.microservice.services.RegardsService;

@Api(
		description = "API de Saludo Overcast",
		tags = "Regards Endpoint"
		)
@RestController
@RequestMapping(
		path = "/microservice"
		)
public class Endpoint {
	
	@Autowired
	private RegardsService regardsService;

	@ApiOperation(
			value = "Envia un saludo a un usuario.",
			notes = "Envia un saludo a un usuario. Revisar el modelo para determinar los campos requeridos.",
			nickname = "regards"
			)
	@RequestMapping(
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			path = "/regards"
			)
	public @ResponseBody Message regards(@RequestBody Message message) {
		return regardsService.sayHi(message);
	}
}
