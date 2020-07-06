package com.topgear.fsd;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQuery;

@NamedQuery(name="CD.findCdByPrice",query="select x from CD x where x.cdPrice > :cdPrice")
@Entity
public class CD {
	@Id
	private Long cdId;
	private String cdTitle;
	private Float cdPrice;
	private String cdPublisher;
	
	public CD() {}
	
	public CD(Long cdId, String cdTitle, Float cdPrice, String cdPublisher) {
		this.cdId = cdId;
		this.cdTitle = cdTitle;
		this.cdPrice = cdPrice;
		this.cdPublisher = cdPublisher;
	}
	public Long getCdId() {
		return cdId;
	}
	public void setCdId(Long cdId) {
		this.cdId = cdId;
	}
	public String getCdTitle() {
		return cdTitle;
	}
	public void setCdTitle(String cdTitle) {
		this.cdTitle = cdTitle;
	}
	public Float getCdPrice() {
		return cdPrice;
	}
	public void setCdPrice(Float cdPrice) {
		this.cdPrice = cdPrice;
	}
	public String getCdPublisher() {
		return cdPublisher;
	}
	public void setCdPublisher(String cdPublisher) {
		this.cdPublisher = cdPublisher;
	}
	
}
