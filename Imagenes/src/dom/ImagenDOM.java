/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dom;


import classes.Imagen;
import classes.ListaImages;
import classes.NodoD;
import java.awt.Image;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.NodeList;

/**
 *
 * @author LLira
 */
public class ImagenDOM {

    private String pathFile = "C:\\Users\\LLira\\Documents\\NetBeansProjects\\Imagenes\\src\\datos\\imagenXML.xml";

    public void addAll(ListaImages lista, String pathFile2) {

        Imagen imagen;
        NodoD nodo;
        try {
            Document d = DOMHelper.getDocument(pathFile);
            Element canciones = d.getDocumentElement();
            lista.irPrimero();
            nodo= lista.getActual();
            while (nodo != null) {
                imagen = (Imagen) nodo.getDatos();
                //crear un item para agregar una cancion
                Element item = d.createElement("imagen");
                
                //create tag id
                Element id = d.createElement("id");
                id.appendChild(d.createTextNode("" + imagen.getId()));
                item.appendChild(id);
                
                //Crear tag titulo
                Element titulo = d.createElement("titulo");
                titulo.appendChild(d.createTextNode(imagen.getTitulo()));
                item.appendChild(titulo);
                
                //Crear tag ruta
                Element ruta = d.createElement("ruta");
                ruta.appendChild(d.createTextNode(imagen.getRuta()));
                item.appendChild(ruta);
                

                canciones.appendChild(item);

                nodo = nodo.getSig();
            }
            DOMHelper.saveXMLContent(d, pathFile2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Imagen> getAll(String pathFile2) {
        List<Imagen> canciones = new ArrayList();
        Imagen imagen;

        try {
            Document d = DOMHelper.getDocument(pathFile2);
            NodeList nl = d.getElementsByTagName("imagen");
            for (int i = 0; i < nl.getLength(); i++) {
                Element item = (Element) nl.item(i);
                imagen = new Imagen();
                imagen.setId(Integer.parseInt(item.getElementsByTagName("id").item(0).getTextContent()));
                imagen.setTitulo(item.getElementsByTagName("titulo").item(0).getTextContent());
                imagen.setRuta(item.getElementsByTagName("ruta").item(0).getTextContent());
                
                canciones.add(imagen);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return canciones;
}
    }
    
