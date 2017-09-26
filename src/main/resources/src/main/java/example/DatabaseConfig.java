package example;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableCouchbaseRepositories
public class DatabaseConfig extends AbstractCouchbaseConfiguration {


    @Override
    protected String getBucketName() {
        return "beer-sample";
    }

    @Override
    protected String getBucketPassword() {
        return "";
    }

	@Override
	protected List<String> getBootstrapHosts() {
		   return Arrays.asList("127.0.0.1");
	}

}
