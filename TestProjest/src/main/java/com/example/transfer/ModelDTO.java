package com.example.transfer;

import java.util.Date;
import java.util.List;

import com.example.model.Model;

public class ModelDTO {
	private String id;

	private Date dateModified;

	private List<Model> data;
	private Date datePublished;

	private String documentOf;

	private String format;

	private String hash;

	private String title;

	private String url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public List<Model> getData() {
		return data;
	}

	public void setData(List<Model> data) {
		this.data = data;
	}

	public Date getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public String getDocumentOf() {
		return documentOf;
	}

	public void setDocumentOf(String documentOf) {
		this.documentOf = documentOf;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

}
