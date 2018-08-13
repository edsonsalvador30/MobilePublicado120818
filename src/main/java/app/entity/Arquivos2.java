package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela ARQUIVOS2
 * @generated
 */
@Entity
@Table(name = "\"ARQUIVOS2\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Arquivos2")
public class Arquivos2 implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "arquivo", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] arquivo;

  /**
   * Construtor
   * @generated
   */
  public Arquivos2(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Arquivos2 setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Arquivos2 setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém arquivo
   * return arquivo
   * @generated
   */
  
  public byte[] getArquivo(){
    return this.arquivo;
  }

  /**
   * Define arquivo
   * @param arquivo arquivo
   * @generated
   */
  public Arquivos2 setArquivo(byte[] arquivo){
    this.arquivo = arquivo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Arquivos2 object = (Arquivos2)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
