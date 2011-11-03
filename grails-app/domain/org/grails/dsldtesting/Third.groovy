package org.grails.dsldtesting

import java.util.Date;

class Third {
	int first
	Integer second
	String third
	Date fourth
	
	static mapping = {
		
		table
		groups
		tablePerHierarchy
//		tablePerSubclass
		cache
		version
		sort
		column
		
		// not referencing the fields, so should be void
		first //TYPE:java.lang.Void
		second//TYPE:java.lang.Void
		third//TYPE:java.lang.Void
		fourth//TYPE:java.lang.Void
		id//TYPE:java.lang.Void
		
	}

	static embedded = {
		
	}
	
	static transients = {
		
	}
	
    static constraints = {
		// these all should be object types since they do not refer to
		// the field, but rather to a constraint method on that field
		first // TYPE:java.lang.Void
		second // TYPE:java.lang.Void
		third // TYPE:java.lang.Void
		fourth // TYPE:java.lang.Void
		id //TYPE:java.lang.Void
    }
}
