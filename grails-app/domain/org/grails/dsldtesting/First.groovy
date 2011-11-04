package org.grails.dsldtesting

class First {
	
	int first
	Integer second
	String third
	Date fourth
	
	static hasMany = [manySeconds:Second]
	static hasOne = [oneThird:Third]
	

    static constraints = {
		// these all should be object types since they do not refer to
		// the field, but rather to a constraint method on that field
		first //TYPE:java.lang.Void
		second //TYPE:java.lang.Void
		third //TYPE:java.lang.Void
		fourth //TYPE:java.lang.Void
		
		manySeconds //TYPE:java.lang.Void
		oneThird //TYPE:java.lang.Void
    }
	
	def gormValidationAPITesting() {
		def first = new First()
		def res
		res = first.clearErrors()
		res // Should be void, but can't check for that
		res = first.validate(false)
		res //TYPE:java.lang.Boolean
		res = first.hasErrors()
		res //TYPE:java.lang.Boolean 
		res = first.getErrors()
		res //TYPE:org.springframework.validation.Errors
	}
	
	def gormInstanceAPITesting() {
		def first = new First()
		def res
		res = first.lock()
		res //TYPE:org.grails.dsldtesting.First
		res = first.mutex(null)
		res //TYPE:org.grails.dsldtesting.First
		res = first.refresh()
		res //TYPE:org.grails.dsldtesting.First
		res = first.merge()
		res //TYPE:org.grails.dsldtesting.First
		res = first.merge([:])
		res //TYPE:org.grails.dsldtesting.First
		res = first.save()
		res //TYPE:org.grails.dsldtesting.First
		res = first.save([:])
		res //TYPE:org.grails.dsldtesting.First
		res = first.ident()
		res //TYPE:java.io.Serializable
		res = first.attach()
		res //TYPE:org.grails.dsldtesting.First
		res = first.isAttached()
		res //TYPE:java.lang.Boolean
		res = first.discard()
		res // Should be void, but can't check for that
		res = first.delete()
		res // Should be void, but can't check for that
		res = first.delete([:])
		res // Should be void, but can't check for that
	}
	
	def gormStaticAPITesting() {
		def res
		res = First.load(null)
		res //TYPE:org.grails.dsldtesting.First
		res = First.getGormDynamicFinders()
		res //TYPE:java.util.List<org.grails.datastore.gorm.finders.FinderMethod>
		res = First.findAll()
		res //TYPE:java.util.List<org.grails.dsldtesting.First>
		res = First.findAllWhere()
		res //TYPE:java.util.List<org.grails.dsldtesting.First>
		res = First.executeQuery(null)
		res //TYPE:java.util.List<org.grails.dsldtesting.First>
		res = First.executeUpdate(null)
		res //TYPE:java.lang.Integer
		res = First.findWhere()
		res //TYPE:org.grails.dsldtesting.First
		res = First.findOrCreateWhere()
		res //TYPE:org.grails.dsldtesting.First
		res = First.findOrSaveWhere()
		res //TYPE:org.grails.dsldtesting.First
		res = First.list()
		res //TYPE:java.util.List<org.grails.dsldtesting.First>
		res = First.find()
		res //TYPE:org.grails.dsldtesting.First
		res = First.create()
		res //TYPE:org.grails.dsldtesting.First
		res = First.where()
		res //TYPE:grails.gorm.DetachedCriteria<org.grails.dsldtesting.First>
		res = First.saveAll()
		res //TYPE:java.util.List<java.io.Serializable>
		res = First.deleteAll()
		res // should be void, but can't check for that
		res = First.get(null)
		res //TYPE:org.grails.dsldtesting.First
		res = First.proxy(null)
		res //TYPE:org.grails.dsldtesting.First
		res = First.read(null)
		res //TYPE:org.grails.dsldtesting.First
		res = First.load(null)
		res //TYPE:org.grails.dsldtesting.First
		res = First.getAll(null)
		res //TYPE:java.util.List<org.grails.dsldtesting.First>
		res = First.exists(null)
		res //TYPE:java.lang.Boolean
		res = First.getValidationErrorsMap()
		res //TYPE:java.util.Map<org.grails.dsldtesting.First,org.springframework.validation.Errors>
		res = First.getValidationSkipMap()
		res //TYPE:java.util.Map<org.grails.dsldtesting.First,java.lang.Boolean>
		
		// returns object...can we do better?
		First.withCriteria null
		First.withSession null
		First.withNewSession null
		First.withDatastoreSession null
		First.withTransaction null
		First.withNewTransaction null
	}
	
	// this is already fairly well tested in the STS tests, so don't need to do too much here.
	def dynamicFinders() {
		First.findByFirst(null)
		First.findByFirstAndSecond(null, null)
		First.findByFirstAndSecondBetween(null, null, null)
		First.findByFirstBetweenAndSecond(null, null, null)
		First.findByFirstBetweenAndSecondBetween(null, null, null, null)
	}
	
}
