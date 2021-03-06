package mx.overcast.microservice.services;

import org.springframework.stereotype.Service;

import mx.overcast.microservice.messages.Message;
import mx.overcast.microservice.messages.Regards;
import mx.overcast.microservice.messages.User;

@Service
public class RegardsService {

	public Message sayHi(Message message) {
		User user = message.getUser();
		Regards regard = new Regards();
		
		regard.setRegard("Hi Mr. " + user.getFirstName() + " " + user.getLastName() + "!, How are you today?");
		message.setRegards(regard);
		
		return message;
	}
}
