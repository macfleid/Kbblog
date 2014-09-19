package com.kayentis.kbb.beans;

// Generated 11 ao�t 2014 16:49:52 by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Article generated by hbm2java
 */
@Entity
@Table(name = "article", catalog = "mydb")
public class Article implements java.io.Serializable {

	private Integer id;
	private Categorie categorie;
	private String titre;
	private String text;
	private Date date;

	public Article() {
	}


	@Override
	public String toString() {
		return "Article [id=" + id + ", categorie=" + categorie + ", titre="
				+ titre + ", text=" + text + ", date=" + date + "]";
	}


	public Article(Categorie categorie, String titre, String text, Date date) {
		this.categorie = categorie;
		this.titre = titre;
		this.text = text;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categorie_id", nullable = false)
	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Column(name = "titre", nullable = false)
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Column(name = "text", nullable = false, length = 65535)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
