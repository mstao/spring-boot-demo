#!/bin/bash

port=11001
image=demo
name=demo-service

if [ -z $1 ]; then
    echo "<<< Using default port $port"
else
    echo "<<< Set port to $1"
    $port=$1
fi

echo "<<< Fetch container id of $name"
CID=$(docker ps | grep "demo-service" | awk '{print $1}')

if [ "$CID" != "" ];then
  echo "<<< Stop and remove old container for $name"
  docker stop $CID
  docker rm $CID
fi

echo "<<< Remove old image $image"
docker rmi $image

echo "<<< Start to build docker image $image"
docker build -t $image .

echo "<<< Start new container port: $port for $name"
docker run -d -p $port:8080 --name $name $image