echo 作業ディレクトリに移動
cd ~/workspace/multi-project-by-springboot/docker/

echo dockerを起動
docker-compose -f docker-compose.yml -p multi-project-by-springboot up --build -d
