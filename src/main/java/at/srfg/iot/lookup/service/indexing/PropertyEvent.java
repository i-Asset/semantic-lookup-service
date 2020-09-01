package at.srfg.iot.lookup.service.indexing;

import at.srfg.iot.classification.model.ConceptProperty;

public class PropertyEvent extends IndexingEvent<ConceptProperty> {

	public PropertyEvent(ConceptProperty source) {
		super(source);
	}
	public PropertyEvent(ConceptProperty source, boolean delete) {
		super(source, delete);
	}

}