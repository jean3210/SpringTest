package ro.test.barbu.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lista_sedinta database table.
 * 
 */
@Entity
@Table(name="lista_sedinta")
@NamedQuery(name="ListaSedinta.findAll", query="SELECT l FROM ListaSedinta l")
public class ListaSedinta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="nr_lista")
	private int nrLista;

	//bi-directional many-to-one association to Bon
	@ManyToOne
	@JoinColumn(name="id_bon")
	private Bon bon;

	public ListaSedinta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNrLista() {
		return this.nrLista;
	}

	public void setNrLista(int nrLista) {
		this.nrLista = nrLista;
	}

	public Bon getBon() {
		return this.bon;
	}

	public void setBon(Bon bon) {
		this.bon = bon;
	}

}