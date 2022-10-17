FROM tomcat
WORKDIR /usr/local/tomcat/
RUN curl https://jdbc.postgresql.org/download/postgresql-42.5.0.jar --output ./lib/postgresql-42.5.0.jar 
