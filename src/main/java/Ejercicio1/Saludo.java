/*
 * Ejercicio 1
 * Crear proyecto maven con la dependencia spring-context y crear una clase Ejercicio1.Saludo con un método imprimirSaludo
 * que imprima un texto por consola.
 * Crear el archivo beans.xml con un bean para la clase Ejercicio1.Saludo.
 * Obtener el bean desde el método main y ejecutar el método imprimirSaludo.
 *
 * Añadimos las dependencias al archivo pom.xml siguientes:
 *  <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.3.15</version>
        </dependency>
 *
 * Estas dependencias se obtienen de buscar org.springframework en la siguiente direccion web:
 * -----> https://mvnrepository.com/artifact/org.springframework/spring-context/5.3.15
 * Estas web tambien son utiles para spring
 * -----> https://spring.io/projects/spring-framework#learn
 * -----> https://start.spring.io/
 *
 * Creamos un archivo en la carpeta resources llamado beans.xml
 */

package Ejercicio1;

public class Saludo {
    public String imprimirSaludo(){
        String saludo = "Hola que tal";
        return saludo;
    }
}
