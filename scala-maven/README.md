Tools needed for productive scala devlopment
--------------------------------------------
1. Maven 3+
2. IntelliJ IDEA 15+

To generate maven scala project
-------------------------------
```
$> mvn org.apache.maven.plugins:maven-archetype-plugin:3.0.1:generate
             -DarchetypeGroupId=net.alchim31.maven
	     -DarchetypeArtifactId=scala-archetype-simple
	     -DarchetypeVersion=1.6
	     
	     -DgroupId=demo.scala
	     -DartifactId=scala-maven
	     -Dversion=1.0
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
```
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-shade-plugin</artifactId>
	<version>2.4.3</version>
	<executions>
	    <execution>
		<phase>package</phase>
		<goals>
		    <goal>shade</goal>
		</goals>
		<configuration>
		    <filters>
			<filter>
			    <artifact>*:*</artifact>
			    <excludes>
				<exclude>META-INF/*.SF</exclude>
				<exclude>META-INF/*.DSA</exclude>
				<exclude>META-INF/*.RSA</exclude>
			    </excludes>
			</filter>
		    </filters>
		    <createDependencyReducedPom>false</createDependencyReducedPom>
		    <shadedClassifierName>ProjectFinalName</shadedClassifierName>
		    <minimizeJar>true</minimizeJar>
		    <transformers>
			<!-- add Main-Class to manifest file -->
			<transformer
				implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
			    <mainClass>com.demo.MainClass</mainClass>
			</transformer>
		    </transformers>
		</configuration>
	    </execution>
	</executions>
</plugin>

```

Comment the following line in scala maven plugin section
--------------------------------------------------------
 ```
 <arg>-make:transitive</arg>
 
 ```


Import project in IntelliJ


Then mvn clean package and do whatever you want :)
