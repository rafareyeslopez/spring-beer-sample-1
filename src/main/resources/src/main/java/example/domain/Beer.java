package example.domain;


import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Beer {

	@Id
    private String id;
	
    @Field
    private String name;

    @Field
    private float abv;

    @Field("brewery_id")
    private String brewery;

    @Field
    private String description;

    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public float getAbv() {
        return abv;
    }

    public String getBrewery() {
        return brewery;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Beer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", abv=").append(abv);
        sb.append(", brewery='").append(brewery).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
