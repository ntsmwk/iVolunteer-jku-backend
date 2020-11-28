package at.jku.cis.iVolunteer.marketplace.meta.core.property.definition.flatProperty;

import org.springframework.stereotype.Component;

import at.jku.cis.iVolunteer.model.meta.core.property.PropertyType;
import at.jku.cis.iVolunteer.model.meta.core.property.definition.flatProperty.FlatPropertyDefinition;

@Component
public class FlatPropertyDefinitionInitializer {

	
	public <T> FlatPropertyDefinition<T> createPropertyDefinition(String name, PropertyType type, String tenantId){
		return new FlatPropertyDefinition<>(name, type, tenantId);
	}
	
}
