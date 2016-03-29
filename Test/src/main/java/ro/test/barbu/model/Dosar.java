package ro.test.barbu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dosar database table.
 * 
 */
@Entity
@Table(name="dosar")
@NamedQuery(name="Dosar.findAll", query="SELECT d FROM Dosar d")
public class Dosar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_dosar", unique=true, nullable=false)
	private int idDosar;

	@Temporal(TemporalType.DATE)
	@Column(name="data_dosar")
	private Date dataDosar;

	@Column(name="den_firma", length=200)
	private String denFirma;

	@Column(name="nr_dosar", length=45)
	private String nrDosar;

	@Column(name="nr_lista_sedinta")
	private int nrListaSedinta;

	@Column(name="pd_nume", length=200)
	private String pdNume;

	public Dosar() {
	}

	public int getIdDosar() {
		return this.idDosar;
	}

	public void setIdDosar(int idDosar) {
		this.idDosar = idDosar;
	}

	public Date getDataDosar() {
		return this.dataDosar;
	}

	public void setDataDosar(Date dataDosar) {
		this.dataDosar = dataDosar;
	}

	public String getDenFirma() {
		return this.denFirma;
	}

	public void setDenFirma(String denFirma) {
		this.denFirma = denFirma;
	}

	public String getNrDosar() {
		return this.nrDosar;
	}

	public void setNrDosar(String nrDosar) {
		this.nrDosar = nrDosar;
	}

	public int getNrListaSedinta() {
		return this.nrListaSedinta;
	}

	public void setNrListaSedinta(int nrListaSedinta) {
		this.nrListaSedinta = nrListaSedinta;
	}

	public String getPdNume() {
		return this.pdNume;
	}

	public void setPdNume(String pdNume) {
		this.pdNume = pdNume;
	}

}