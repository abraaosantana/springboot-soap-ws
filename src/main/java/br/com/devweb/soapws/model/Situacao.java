//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.2 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.08.06 às 10:37:54 PM BRT 
//


package br.com.devweb.soapws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elegivel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="valorAprovado" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="criterioIncompativel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "elegivel",
    "valorAprovado",
    "criterioIncompativel"
})
@XmlRootElement(name = "Situacao")
public class Situacao {

    protected boolean elegivel;
    protected long valorAprovado;
    @XmlElement(required = true)
    protected List<String> criterioIncompativel;

    /**
     * Obtém o valor da propriedade elegivel.
     * 
     */
    public boolean isElegivel() {
        return elegivel;
    }

    /**
     * Define o valor da propriedade elegivel.
     * 
     */
    public void setElegivel(boolean value) {
        this.elegivel = value;
    }

    /**
     * Obtém o valor da propriedade valorAprovado.
     * 
     */
    public long getValorAprovado() {
        return valorAprovado;
    }

    /**
     * Define o valor da propriedade valorAprovado.
     * 
     */
    public void setValorAprovado(long value) {
        this.valorAprovado = value;
    }

    /**
     * Gets the value of the criterioIncompativel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criterioIncompativel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterioIncompativel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCriterioIncompativel() {
        if (criterioIncompativel == null) {
            criterioIncompativel = new ArrayList<String>();
        }
        return this.criterioIncompativel;
    }

}
