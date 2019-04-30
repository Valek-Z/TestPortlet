# TestPortlet
Test portlet for the eXo-platform

Maven build:

mvn clean package install -Pplf-tomcat-spring

Copy the resulting  .zip file to 

However, in order to deploy this portlet using Spring in JBoss, the following dependencies are required during execution:

These dependencies were already packed in the created webapps.war file.



Copy these above dependencies to addon-template-packaging-1.0.zip/webapps.war! / WEB-INF / lib /
spring-beans-2.5.5.jar
spring-context-2.5.5.jar
spring-core-2.5.5.jar
spring-web-2.5.5.jar

 on $ PLATFORM_EXO_HOME / platform-x.x.x / Lib, then expand this portlet as usual.
 
Therefore, you can deploy this portlet in platform:

Install eXo Platform add-on from catalog $ PLATFORM_EXO_HOME / platform-x.x.x /:

    ./addon install addon-template
