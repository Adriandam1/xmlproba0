
exemplo 14:
XMLproba0

informacion:
SAX (simple API for XML: usado para convertir datos a XML e viceversa)

un documento XML esta composto de elementos
todo elemento XML comeza e remata cunha etiqueta ou tag
o tag inical e o final dun elemento teñen o mesmo nome que e elexido polo disenador do documento.

o contido(content) dun elemento e o que vai situado entre os tags iniciais e final do elemento
exemplo de elemento:   <titulo> blade runner </titulo>
tag inicial: <titulo>
contido: blade runner
tag final: </titulo>

o elemento de mais alto nivel ou elemento pai (parent element) e o denominado elemento raiz
un documento XML so pode conter un elemento raiz

dentro dun elemento poden atoparse mais elementos denominados elementos fillos (child elements)
o primeiro elemento dun documento XML e a declaracion que indica a version do XML que vai ser usada polo documento

un elemento pode conter un ou varios tributos , que son pares variable=valor que se utilizan normalmente para identificar certos elementos dun documento XML

exemplo de elemento con atributo:
<tenda codigo="t1">

Para escribir e ler documentos XML imos usar StAX  - Streaming API for XML

Antes de escribir nun documento XML necesitamos crear un obxecto que implemente  a interface XMLStreamWriter
Para facer isto debemos primeiro invocar o metodo estático newInstance() da clase XMLOutputFactory par crear un obxecto XMLOutputFactory
Despois podemos xa crear un obxecto XMLStreamWriter invocando o metodo  createXMLStreamWriter(FileWriter object) do obxecto XMLOutputFactory creado anteriormente
A partires dese momento xa se poden usar os metodos propios do obxecto XMLStreamWriter par escribir o documento

metodos:
writeStartDocument("1.0")   
//escribe a declaracion XML con a Version especificada

writeStartElement("tenda");
//escribe o tag de inicio de un elemento

writeAttribute("codigo","t1");
//escribe un atributo para o elemento actual

writeCharacters("urzaiz");
//escribe o contido do elemento

writer.writeEndElement();
//escribe o tag de peche do elemento actual



Aplicación: xmlproba0
graba este documento XML co nome autores.xml dende java usando os metodos apropiados
<?xm version="1.0"?>
<autores>
    <autor codigo ="a1">
    <nome>Alexandre Dumas </nome>
    <titulo> El conde de montecristo</titulo>
    <titulo> Los miserables </titulo>
    </autor>
    <autor codigo ="a2">
    <nome>Fiodor Dostoyevski</nome>
    <titulo> El idiota</titulo>
    <titulo> Noches blancas </>
    </autor>
<autores>

ao finalizar comproba que funciona abrindoo dende un navegador 

