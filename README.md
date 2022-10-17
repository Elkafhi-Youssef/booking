### BOOking

# how to run the app:

```
docker-compose up -d
```
then:
```
./gradlew war
```
( _this must be run for changes to take effect._ )


then visit `localhost/booking-1.0` or [localhost](http://localhost/booking-1.0)

# importing schema to postgres:

after running the docker containers run `./gradlew migrate` 
