package ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Collection;
import ee.bcs.koolitus.muisikratt2.spring_app.entity.Employee;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.CollectionResource;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.EmployeeResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CollectionAssembler {

	public Iterable<CollectionResource> toResources(final List<Collection> collections) {
		final List<CollectionResource> resources = new ArrayList<>();
		for (Collection collection : collections) {
			resources.add(
					CollectionResource.builder()
							.id(collection.getId())
							.collectionName(collection.getCollectionName())
							.build());
		}
		return resources;
	}
}
