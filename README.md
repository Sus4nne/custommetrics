### Run the app in a docker compose stack
1. run the script `create-app-image.sh`
2. then run `docker-compose up -d`

### Use http to test the metrics of the pastryshop
Do a POST request to: http://localhost:8080/pastries?amount=1
Use the provided http file: `orderpastry.http` or use your own tool.

### Read the metrics in the browser
Go to: http://localhost:8080/actuator/metrics/pastry.amount.items
and http://localhost:8080/actuator/metrics/pastry.amount.orders

### Use the metrics in Grafana
#### Create a Prometheus data source
In the docker compose stack Prometheus runs at http://prometheus:9090

#### Create a Grafana dashboard
You can add panels for the metrics from scratch. You can also import the provided dashboard. It is the json file in this repo named `Pastry orders-1698403567304.json`.
