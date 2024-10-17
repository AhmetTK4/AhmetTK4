# Base image olarak resmi Tomcat 10 kullanıyoruz
FROM tomcat:10.1
FROM openjdk:23

# WAR dosyasını hedef klasörden alıp Tomcat webapps klasörüne kopyalıyoruz
ARG WAR_FILE=target/*.war
COPY ${WAR_FILE} /usr/local/tomcat/webapps/app.war

# Tomcat 8080 portunu dışa açıyoruz
EXPOSE 8080
