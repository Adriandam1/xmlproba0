import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase con el metodo para escribir en un fichero XML desde Java.
 */
public class Metodos {

    /**
     * Metodo que escribe en un fichero XML con la informacion de autores.
     * @param autor el array de autores
     * @param path la ruta donde se guardara el archivo XML
     */
    public void writeXMLFile(Autor[] autor, String path) {
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();

        try (FileWriter fileWriter = new FileWriter(path)) {
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(fileWriter);
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeCharacters("\n");
            xmlStreamWriter.writeStartElement("autores");

            // Recorremos el array de autores para escribirlos en el XML
            for (Autor autorItem : autor) {
                xmlStreamWriter.writeCharacters("\n    ");
                xmlStreamWriter.writeStartElement("autor");
                xmlStreamWriter.writeAttribute("codigo", autorItem.getCodigo());

                xmlStreamWriter.writeCharacters("\n        ");
                xmlStreamWriter.writeStartElement("nome");
                xmlStreamWriter.writeCharacters(autorItem.getNome());
                xmlStreamWriter.writeEndElement();

                for (String titulo : autorItem.getTitulo()) {
                    xmlStreamWriter.writeCharacters("\n        ");
                    xmlStreamWriter.writeStartElement("titulo");
                    xmlStreamWriter.writeCharacters(titulo);
                    xmlStreamWriter.writeEndElement();
                }

                xmlStreamWriter.writeCharacters("\n    ");
                xmlStreamWriter.writeEndElement();
            }

            xmlStreamWriter.writeCharacters("\n");
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();
            xmlStreamWriter.close();

            System.out.println("Fichero escrito correctamente en " + path);

        } catch (IOException ioEx) {
            System.err.println("Error de E/S al intentar escribir el fichero XML: " + ioEx.getMessage());
        } catch (XMLStreamException xmlEx) {
            System.err.println("Error al crear o escribir el fichero XML: " + xmlEx.getMessage());
        }
    }
}