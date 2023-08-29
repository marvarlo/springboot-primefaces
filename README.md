# springboot-primefaces
Simple Springboot with JSF Primefaces Application.

This is a basic setup configuration for run a full SpringBoot and Primefaces application.
In this release we used:
| Tool | version |
| ------ | ------ |
|[Primefaces]| 13.0|
|JSF [Apache MyFaces] | 4.1|
|[SpringBoot]| 3.1.2|
|[Java JDK]| 17 *|

> * Note: I like to use Amazon Coretto JDk, but you can you any JDK distribution. 
  
This will create a runnable/deployable war file

Compile:
```sh
mvn clean package
```
Run:
```sh
mvn spring-boot: run 
```

![image](https://github.com/marvarlo/springboot-primefaces/assets/11397438/d7f12fdf-a9c4-4dce-97fd-0a42dd25a6c0)

If everything goes fine, the application will be running and listening on port **9090** and in the context **/springjsf**.
You can change these values on the `application.properties` file:

![image](https://github.com/marvarlo/springboot-primefaces/assets/11397438/d891e092-d2f6-479b-846b-c94aef541d82)

When, running, you will see something like this:

![image](https://github.com/marvarlo/springboot-primefaces/assets/11397438/0c2cb9be-9a41-47cd-a791-844d11b2b46f)

If, so, congratulations! you have your site ready for basic development.
Greetings!

[Primefaces]: <https://www.primefaces.org/showcase/getstarted.xhtml>
[Apache MyFaces]: <https://myfaces.apache.org/#/core41>
[SpringBoot]: <https://start.spring.io>
[Java JDK]: <https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html>

