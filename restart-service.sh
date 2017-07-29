docker-compose stop $1 
docker-compose rm -f $1
docker-compose build --no-cache $1
docker-compose up -d $1

