package org.grails.dsldtesting

import java.util.Date;

class Second {
	
	int first
	Integer second
	String third
	Date fourth
	
	static belongsTo = [oneFirst:First]


    static constraints = {
		// these all should be object types since they do not refer to
		// the field, but rather to a constraint method on that field
		first //TYPE:java.lang.Void
		second //TYPE:java.lang.Void
		third //TYPE:java.lang.Void
		fourth //TYPE:java.lang.Void
		oneFirst //TYPE:java.lang.Void
    }
}
