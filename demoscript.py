import requests
import time
import random

start_time = time.time()
total_amount = 0
total_orders = 0
print('Starting at {}'.format(start_time))
while time.time() - start_time < 120:
    amount = random.randint(2, 12)
    total_amount += amount
    total_orders += 1
    print('>> Order {} with {} pastries, total = {}'.format(total_orders, amount, total_amount))
    response = requests.post('http://localhost:8080/pastries', data={'amount': amount})
    print('Response from pastry shop: {}'.format(response.text))
    time.sleep(25)

print('Done')
print('Total pastries ordered: {}'.format(total_amount))
print('Total orders: {}'.format(total_orders))