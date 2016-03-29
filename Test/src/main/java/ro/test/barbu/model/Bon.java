package ro.test.barbu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the bon database table.
 * 
 */
@Entity
@Table(name="bon")
@NamedQuery(name="Bon.findAll", query="SELECT b FROM Bon b")
public class Bon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_bon")
	private Date dataBon;

	private int lista;

	@Column(name="nr_bon")
	private int nrBon;

	private byte verificat;

	//bi-directional many-to-one association to ListaSedinta
	@OneToMany(mappedBy="bon")
	private List<ListaSedinta> listaSedintas;

	public Bon() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataBon() {
		return this.dataBon;
	}

	public void setDataBon(Date dataBon) {
		this.dataBon = dataBon;
	}

	public int getLista() {
		return this.lista;
	}

	public void setLista(int lista) {
		this.lista = lista;
	}

	public int getNrBon() {
		return this.nrBon;
	}

	public void setNrBon(int nrBon) {
		this.nrBon = nrBon;
	}

	public byte getVerificat() {
		return this.verificat;
	}

	public void setVerificat(byte verificat) {
		this.verificat = verificat;
	}

	public List<ListaSedinta> getListaSedintas() {
		return this.listaSedintas;
	}

	public void setListaSedintas(List<ListaSedinta> listaSedintas) {
		this.listaSedintas = listaSedintas;
	}

	public ListaSedinta addListaSedinta(ListaSedinta listaSedinta) {
		getListaSedintas().add(listaSedinta);
		listaSedinta.setBon(this);

		return listaSedinta;
	}

	public ListaSedinta removeListaSedinta(ListaSedinta listaSedinta) {
		getListaSedintas().remove(listaSedinta);
		listaSedinta.setBon(null);

		return listaSedinta;
	}

}