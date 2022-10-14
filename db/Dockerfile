FROM postgres
RUN mkdir /app
COPY ./schema.sql /app/schema.sql
CMD psql -f /app/schema.sql -U postgres booking -h db 
