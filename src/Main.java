//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear un array de autores con los datos solicitados
        Autor[] autores = {
                new Autor("a1", "Alexandre Dumas", new String[]{"El conde de montecristo", "Los miserables"}),
                new Autor("a2", "Fiodor Dostoyevski", new String[]{"El idiota", "Noches blancas"})
        };

        // Ruta donde se guardara el archivo XML
        String path = "autores.xml";

        // Crear una instancia de MethodsXML y escribir el archivo XML
        Metodos metodosXML = new Metodos();
        metodosXML.writeXMLFile(autores, path);
    }
}