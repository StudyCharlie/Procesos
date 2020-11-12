import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainWeb
{
    public static void ShowMenu()
    {
        System.out.println("¿Que hacemos ahora?");
        System.out.println("1. Cargar página Web");
        System.out.println("2. Analizar número de vocales");
        System.out.println("3. Sustituir letras");
        System.out.println("4. Leer documento encrypted.txt");
        System.out.println("5. Buscar palabras clave");
        System.out.println("6. Crear archivo index.html");
        System.out.println("7. Ejecutar archivo index.html a través de un navegador");
        System.out.println("8. Salir del programa");
    }

    public static void main(String[] args) throws IOException {
        //runtime
        Runtime rt = Runtime.getRuntime();

        //Process
        Process p1 = null;
        Process p2 = null;
        Process p3 = null;
        Process p4 = null;
        Process p5 = null;
        Process p6 = null;
        Process p7 = null;

        Scanner sc = new Scanner(System.in);
        String paginaWeb;
        int opcion;

        System.out.println("Introduce una pagina web");

        paginaWeb = sc.nextLine();

        while (!paginaWeb.matches("^(http|https)://.*$"))
        {
            System.out.println("La página web debe empezar con http:// o https://");
            paginaWeb = sc.nextLine();
        }

        System.out.println("La pagina web con la que vamos a trabajar es: " + paginaWeb + "\n");

        ShowMenu();

        opcion = sc.nextInt();

        while(opcion != 8)
        {
            switch(opcion)
            {
                case 1:
                    ProcessBuilder pb;
                    pb = new ProcessBuilder("java",
                            "-jar",
                            "C:\\Users\\Carlos\\Desktop\\Clase\\Servicios y procesos\\ManipulacionWeb\\out\\artifacts\\CargarPagina_jar\\CargarPagina.jar",
                            paginaWeb
                    );
                    Process p = pb.start();

                    opcion = sc.nextInt();
                    break;

                case 2:
                    System.out.println("2");
                    ShowMenu();
                    opcion = sc.nextInt();
                    break;

                case 3:
                    System.out.println("3");
                    ShowMenu();
                    opcion = sc.nextInt();
                    break;

                case 4:
                    System.out.println("4");
                    ShowMenu();
                    opcion = sc.nextInt();
                    break;

                case 5:
                    System.out.println("5");
                    ShowMenu();
                    opcion = sc.nextInt();
                    break;

                case 6:
                    System.out.println("6");
                    ShowMenu();
                    opcion = sc.nextInt();
                    break;

                case 7:
                    System.out.println("7");
                    ShowMenu();
                    opcion = sc.nextInt();
                    break;

                case 8:
                    break;

                default:
                    System.out.println("Introduce una opción válida ( 1 - 8 )");
                    opcion = sc.nextInt();
                    break;
            }

        }
        System.out.println("Has salido del programa");
    }
}
