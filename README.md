# Taller Numeto 5

Por Luis Esteban Castro

# Enlace al video Explicación

# Solicitudes PostMan
{
	"info": {
		"_postman_id": "b451e86d-5e17-4d67-907e-1882125c0289",
		"name": "New Collection",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "SaveOwner",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n\"username\":\"paco123\",\r\n\"password\":\"paco123\",\r\n\"email\":\"paco@email.com\",\r\n\"personId\":\"3\",\r\n\"name\":\"paco jones\",\r\n\"address\":\"clle11\",\r\n\"neighborhood\":\"engativa\"\r\n}\r\n\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/SecurityTutorial-1.0-SNAPSHOT/api/owners",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"SecurityTutorial-1.0-SNAPSHOT",
						"api",
						"owners"
					]
				}
			},
			"response": []
		},
		{
			"name": "SaveVets",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n\"username\":\"vet123\",\r\n\"password\":\"vet123\",\r\n\"email\":\"vetma@email.com\",\r\n\"name\":\"vet mascota feliz\",\r\n\"address\":\"clle111\",\r\n\"neighborhood\":\"engativa\"\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/SecurityTutorial-1.0-SNAPSHOT/api/vets",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"SecurityTutorial-1.0-SNAPSHOT",
						"api",
						"vets"
					]
				}
			},
			"response": []
		},
		{
			"name": "SaveOfficial",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n\"username\":\"alcaldia123\",\r\n\"password\":\"alcaldia123\",\r\n\"email\":\"alcaldia1@email.com\",\r\n\"name\":\"alcalde12021\"\r\n\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/SecurityTutorial-1.0-SNAPSHOT/api/officials",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"SecurityTutorial-1.0-SNAPSHOT",
						"api",
						"officials"
					]
				}
			},
			"response": []
		},
		{
			"name": "SavePet",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n\"pet_id\":\"pe34\",\r\n\"microchip\":null,\r\n\"name\":\"lulu\",\r\n\"species\":\"dog\",\r\n\"race\":\"labrador\",\r\n\"size\":\"small\",\r\n\"sex\":\"male\",\r\n\"picture\":null,\r\n\"owner\":\r\n    {\r\n    \"username\":\"paco123\"\r\n    }\r\n}\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/SecurityTutorial-1.0-SNAPSHOT/api/pets/paco123",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"SecurityTutorial-1.0-SNAPSHOT",
						"api",
						"pets",
						"paco123"
					]
				}
			},
			"response": []
		},
		{
			"name": "savePetCase",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n\"case_id\":\"caso12223\",\r\n\"created_at\":\"12/11/2021\",\r\n\"type\":null,\r\n\"description\":\"se perdio el perro\",\r\n\"pet\":\r\n    {\r\n    \"pet_id\":\"pa212\"\r\n    }\r\n}\r\n\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/SecurityTutorial-1.0-SNAPSHOT/api/petCases/robo",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"SecurityTutorial-1.0-SNAPSHOT",
						"api",
						"petCases",
						"robo"
					]
				}
			},
			"response": []
		},
		{
			"name": "saveVisist",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n\"visit_id\":\"caso1122\",\r\n\"created_at\":\"12/11/2021\",\r\n\"type\":\"perdida\",\r\n\"description\":\"se perdio el perro\",\r\n\"pet\":\r\n    {\r\n    \"pet_id\":\"pe33\"\r\n    },\r\n\"vet\":\r\n    {\r\n    \"username\":\"vet123\"\r\n    }\r\n}\r\n\r\n",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/SecurityTutorial-1.0-SNAPSHOT/api/visits/vet123/pe33",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"SecurityTutorial-1.0-SNAPSHOT",
						"api",
						"visits",
						"vet123",
						"pe33"
					]
				}
			},
			"response": []
		}
	]
}
