### BOOking

# how to run the app:

```
docker-compose up -d
```
```
./gradlew war
```
( _this must be run for changes to take effect._ )


then visit `localhost/booking-01`

# importing schema to postres:

after running the docker containers run `docker exec --tty --interactive booking-db-1 psql -U postgres` then copy pasete and enter;
