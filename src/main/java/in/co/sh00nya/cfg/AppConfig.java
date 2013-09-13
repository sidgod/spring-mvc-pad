package in.co.sh00nya.cfg;

import in.co.sh00nya.util.MsgRepoHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public MsgRepoHandler msgRepoHandler() {
		return new MsgRepoHandler();
	}

}
