import Ejercicio1.Saludo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
       // Forma "tradicional" de invocar un metodo de otra clase sin usar Spring
       // Saludo hola = new Saludo();
       // hola.imprimirSaludo();

        // Utilizando Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo hola = (Saludo) context.getBean("idSaludar");
        System.out.print(hola.imprimirSaludo());

    }
}
