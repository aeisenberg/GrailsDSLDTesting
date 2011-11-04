This grails project exercises the grails.dsld DSL descriptor file and provides a kind of unit testing for that file.

### DSLD and hard-coded DSL support that is already implemented, but not tested in this project

##### Domain classes
* dynamic finders
* where queries
* Abstract domain classes


##### TagLibs
* Extra references available inside of tags


##### Services
* Autowired service references in other Grails artifacts

##### Controllers
* Extra references available inside of actions


##### Unit testing
* Mocking domain
* Mocking service
* Mocking tag
* Mocking controller
* JUnit asserts, etc

### DSLD and hard-coded support that is implemented and tested

##### Domain classes
* GormStaticAPI
* GormValidationAPI
* GormInstanceAPI
* Constraints
* hasMany
* hasOne
* belongsTo
* mappings

### Unimplemented Grails DSLs