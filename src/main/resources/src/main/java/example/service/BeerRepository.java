package example.service;

import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import example.domain.Beer;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "beer", path = "beer")
//@ViewIndexed(designDoc  = "beer", viewName = "byName")
public interface BeerRepository extends CrudRepository<Beer, String> {

//    List<Beer> findAll();
//    
@View(viewName="byName")    
List<Beer> findByName(@Param(value = "name") String name);

}
