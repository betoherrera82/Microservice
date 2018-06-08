package mx.overcast.microservice.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.overcast.microservice.messages.Message;
import mx.overcast.microservice.services.RegardsService;

@RestController
@RequestMapping(
		path = "/microservice"
		)
public class Endpoint {
	
	@Autowired
	private RegardsService regardsService;

	@RequestMapping(
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			path = "/regards"
			)
	public Message regards(Message message) {
		return regardsService.sayHi(message);
	}
}
