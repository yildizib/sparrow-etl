//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vBeta
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.12.11 at 03:02:58 SGT
//

package sparrow.elt.jaxb;

/**
 * The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="EXCEPTIONHANDLERType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HANDLER" type="{}HANDLERType" maxOccurs="unbounded"/>
 *         &lt;element name="HANDLE" type="{}HANDLEType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
public interface EXCEPTIONHANDLERType {

  java.util.List getHANDLE();

  java.util.List getHANDLER();

}
