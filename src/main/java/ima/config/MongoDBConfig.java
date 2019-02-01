package ima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@ComponentScan("en")
public class MongoDBConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "annuaire";
	}

	@Override
	public MongoClient mongoClient() {
		return new MongoClient("localhost");
	}

}
