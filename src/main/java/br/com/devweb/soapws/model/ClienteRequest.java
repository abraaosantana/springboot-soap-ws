//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.2 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.08.06 às 10:37:54 PM BRT 
//


package br.com.devweb.soapws.model;

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
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idade" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rendaAnual" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pontuacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modalidadeEmprego" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "nome",
    "idade",
    "rendaAnual",
    "pontuacao",
    "modalidadeEmprego"
})
@XmlRootElement(name = "ClienteRequest")
public class ClienteRequest {

    @XmlElement(required = true)
    protected String nome;
    protected int idade;
    protected long rendaAnual;
    protected int pontuacao;
    @XmlElement(required = true)
    protected String modalidadeEmprego;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade idade.
     * 
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define o valor da propriedade idade.
     * 
     */
    public void setIdade(int value) {
        this.idade = value;
    }

    /**
     * Obtém o valor da propriedade rendaAnual.
     * 
     */
    public long getRendaAnual() {
        return rendaAnual;
    }

    /**
     * Define o valor da propriedade rendaAnual.
     * 
     */
    public void setRendaAnual(long value) {
        this.rendaAnual = value;
    }

    /**
     * Obtém o valor da propriedade pontuacao.
     * 
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Define o valor da propriedade pontuacao.
     * 
     */
    public void setPontuacao(int value) {
        this.pontuacao = value;
    }

    /**
     * Obtém o valor da propriedade modalidadeEmprego.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidadeEmprego() {
        return modalidadeEmprego;
    }

    /**
     * Define o valor da propriedade modalidadeEmprego.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidadeEmprego(String value) {
        this.modalidadeEmprego = value;
    }

}
