package com.example.model;

import javax.persistence.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Model" database table.
 * 
 */
@Entity
@Table(name="Model")
@NamedQuery(name="Model.findAll", query="SELECT m FROM Model m")
public class Model implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MODEL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MODEL_ID_GENERATOR")
	private String id;

	@Temporal(TemporalType.DATE)
	@Column(name="dateModified")
	private Date dateModified;

	@Temporal(TemporalType.DATE)
	@Column(name="datePublished")
	private Date datePublished;

	@Column(name="documentOf")
	private String documentOf;

	private String format;

	private String hash;

	private String title;

	private String url;

	public Model() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Date getDatePublished() {
		return this.datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public String getDocumentOf() {
		return this.documentOf;
	}

	public void setDocumentOf(String documentOf) {
		this.documentOf = documentOf;
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}