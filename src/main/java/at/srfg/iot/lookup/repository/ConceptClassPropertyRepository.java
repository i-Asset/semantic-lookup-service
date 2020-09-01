package at.srfg.iot.lookup.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import at.srfg.iot.classification.model.ConceptClass;
import at.srfg.iot.classification.model.ConceptClassProperty;
import at.srfg.iot.classification.model.ConceptClassPropertyPK;
import at.srfg.iot.classification.model.ConceptProperty;

public interface ConceptClassPropertyRepository extends CrudRepository<ConceptClassProperty, ConceptClassPropertyPK>{
	@Query("SELECT c.property FROM ConceptClassProperty c WHERE c.conceptClass = ?1 ")
	List<ConceptProperty> getProperties(ConceptClass conceptClass);
	/**
	 * Find the class specific property assignment
	 * @param cClass
	 * @param property
	 * @return
	 */
	Optional<ConceptClassProperty> findByConceptClassAndProperty(ConceptClass cClass, ConceptProperty property);

}