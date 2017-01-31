Tools needed for productive scala devlopment
--------------------------------------------
1. Maven
2. IntelliJ IDEA

To generate maven scala project
-------------------------------
```
$> mvn org.apache.maven.plugins:maven-archetype-plugin:2.2:generate -DarchetypeGroupId=net.alchim31.maven -DarchetypeArtifactId=scala-archetype-simple -DarchetypeVersion=1.6 -DgroupId=demo.scala -DartifactId=scala-maven -Dversion=1.0
```

Add the following test dependency in pom.xml file
-------------------------------------------------
```
<dependency>
	<groupId>org.specs2</groupId>
	<artifactId>specs2-junit_${scala.compat.version}</artifactId>
	<version>2.4.16</version>
	<scope>test</scope>
</dependency>
```

Add the maven shade plugin to make an uber jar with dependencies
----------------------------------------------------------------


Comment the following line in scala maven plugin section
--------------------------------------------------------
 ```<arg>-make:transitive</arg>```


Import project in IntelliJ


Then mvn clean package and do whatever you want :)
