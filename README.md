# Spring_Profile_definition
using @Profile Annotation 

Profiles feature of Spring is allow us to assocoiate set of beans with profile,we typically use profile if we want different set of beans will be loads in different environtment.
for example we have Dao Interface that implemented by 2 classes HibernateDaoImpl and MybatisDaoImpl we annotate this calss with @Repository, @Profile and @PropertySource("properties file name"), and we have another class DataSource that hold 4 fundamental field to achieve DB connection (driverName, url,username and password)and we inject the configuration from properties file using @Value("${}"). and also we create 2 properties file 1st hibernate.properties that hold configuration for hibernate and RDMS(mySQL) and 2nd one is myBatis.propertie that hold the configuration for myBatis and RDMS(Oracle). and then define two inner beans with profile hibernate and mybatis and set the location for each properties file.
in the main method we can use =setProperties("spring.profile.active","activeprofileID") to set which profile we want to be active and based on that the bean will be load.
