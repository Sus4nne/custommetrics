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
#### Create a Grafana dashboard