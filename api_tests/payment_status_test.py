import requests


def test_payment_status():
    response = requests.get("https://reqres.in/api/users/2")
    assert response.status_code == 200
    print(response.json())

