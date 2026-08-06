# loja-assincrona

loja-assincrona/
├── docker-compose.yml
├── backend-spring/
│   ├── Dockerfile
│   ├── pom.xml (ou build.gradle)
│   └── src/
└── frontend-angular/
    ├── Dockerfile
    ├── nginx.conf
    ├── package.json
    └── src/

Docker 
Kafka
conteiner
	- Bild/start conteiners do projeto: docker compose up -d
	- Ver o status dos contêineres ativos: docker compose ps
	- Ver os logs (mensagens de erro/saída): docker compose logs -f
	- Parar e remover tudo o que foi criado: docker compose down
	- Forma de interagir com o terminal do conteiner: docker exec -it kafka bash
	- Forma de interagir com o terminal do conteiner com imagens ultra leves linux Alpine por exemplo: docker exec -it kafka sh
	- Sair do Contêiner: exit
	
	Para e remove o contêiner e subir novamente em segundo plano
	- docker compose down
	- docker compose up -d
	
	Para os contêineres e apaga todos os volumes associados a eles (-v) e subir novamente em segundo plano
	- docker compose down -v
	- docker compose up -d
	
	Verificar se o Kafka já subiu e está pronto para uso
	- docker compose logs -f kafka
	
	Quando aparecerem mensagens indicando que o Broker iniciou com sucesso (ou quando parar de jorrar texto), pode dar um Ctrl + C para sair dos logs e voltar a criar os tópicos zerados!
	
	Extas
		- Exemplo do script para criar um topico interagindo com o conteiner:
		docker exec -it kafka bash, no terminal, terá algo parecido com [appuser@kafka kafka]$
		
		Criar um tópico:
		kafka-topics.sh --create --topic meu-topico-01 --bootstrap-server localhost:9092
		
		Listar os tópicos existentes:
		kafka-topics.sh --list --bootstrap-server localhost:9092
		
		Iniciar um "Console Producer" (para enviar mensagens manualmente pelo terminal):
		kafka-console-producer.sh --topic meu-topico-01 --bootstrap-server localhost:9092
		(Depois disso, basta digitar qualquer texto e dar Enter para publicar mensagens no topico)