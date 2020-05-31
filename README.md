# APiRest hecha en spring boot

## Esta es un Api rest desarrollado en java con el framework Sring Boot


Para delplegar el proyecto es necesario tener un instalado java JDK y Mysql

El API corre en localhost:8080/

La coneccion a la base de datos se realiza con:


- user: root
- password: password
- host: localhost
- port: 3306

direcciones:

1. **Documentacion completa: http://localhost:8080/swagger-ui.html**

2. Get: http://localhost:8080/employees

4. Get: http://localhost:8080/employees/{employeesId}

5. Post: http://localhost:8080/eemployees/create

ejemplo de post:   
    {    
        "name": "Yonatan",  
        "lastName": "Cuervo",  
        "documentId": "1234567",  
        "birthDate": "1992-05-31",  
        "joiningDateCompany": "2020-05-01",  
        "position": "developer",  
        "wage": 2350000  
    }  

