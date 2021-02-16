Proyecto desarrollado con JAVA EE. 
      
      -Capa de datos: JPA, JTA

      -Capata de logica de negocio: EJB

      -Capa de presentacion: 
                  
                   *  Modo 1: Servlet, JSP

                   *  Modo 2: JSF

                   *  Modo 3: JX-RS(API REST), Swagger (documentacion y cliente para ejecutar servicios de la API)

Para ejecutar el proyecto

- modificar el archivo 'persistence.xml' de JPA, para agregar los datos de conexion de su servidor de bases de datos,
puede agregar un DataSource en su servidor tambien y configurarlo con JTA. Tene cuidado de utilizar la unidad de persistencia adecuada
y con el mismo nombre utilizado en las clases DAO (paquete: personal.app.dao).

-Ejecutar el proyecto

-Enlaces:

    * para visualizar la aplicacion con el mantenimiento: http://<<host:puerto>>/crudJavaEE/cliente    ejemplo: http://localhost:8080/crudJavaEE/cliente

    * para visualizar la documentacion de la API Rest con Swagger: http://<<host:puerto>>/crudJavaEE/api/apiee/index.html   ejemplo: http://localhost:8080/crudJavaEE/api/apiee/index.html

