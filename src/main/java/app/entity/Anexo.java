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
 * Classe que representa a tabela ANEXO
 * @generated
 */
@Entity
@Table(name = "\"ANEXO\"")
@XmlRootElement
@CronappSecurity(post = "Public", get = "Public", delete = "Public", put = "Public")
@JsonFilter("app.entity.Anexo")
public class Anexo implements Serializable {

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
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "anexo", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] anexo;

  /**
   * Construtor
   * @generated
   */
  public Anexo(){
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
  public Anexo setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Anexo setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém anexo
   * return anexo
   * @generated
   */
  
  public byte[] getAnexo(){
    return this.anexo;
  }

  /**
   * Define anexo
   * @param anexo anexo
   * @generated
   */
  public Anexo setAnexo(byte[] anexo){
    this.anexo = anexo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Anexo object = (Anexo)obj;
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
