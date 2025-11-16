package ma.enset.ensetbot.web;


import ma.enset.ensetbot.agents.AgentAI;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChatController {
private AgentAI agentAI;

 public ChatController(AgentAI agentAI) {
     this.agentAI = agentAI;
 }
 @GetMapping (value = "/chat" , produces = MediaType.TEXT_PLAIN_VALUE)
    public String AskAgent(String query) {
         return agentAI.askAagent(query);
    }
}