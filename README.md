# demo-docker-volumes
 
Docker volumes

1. Create a Dockerfile with de volume definition
2. docker build -t demo-volumes .
3. docker run -p 8081:8080 -v ~/dev/volumes:/tmp demo-volumes -rm
4. docker container ls
5. docker exec -it d93 bash
