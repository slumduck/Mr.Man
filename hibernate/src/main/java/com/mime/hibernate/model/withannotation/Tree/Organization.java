package com.mime.hibernate.model.withannotation.Tree;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="um_orgnization")
//@IdClass(Organzition_PK.class)
public class Organization {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orgcode;
	@Id
	private String orglevel;
	private String orgName;
	//@Column(name="parent_id")
	@ManyToOne(
			cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.MERGE},
			fetch = FetchType.EAGER)
	@JoinColumn(name="parent_id")
	private Organization organization;
	@OneToMany(mappedBy="organization",
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Set<Organization> orgs = new HashSet<Organization>();
	public int getOrgcode() {
		return orgcode;
	}
	public void setOrgcode(int orgcode) {
		this.orgcode = orgcode;
	}
	public String getOrglevel() {
		return orglevel;
	}
	public void setOrglevel(String orglevel) {
		this.orglevel = orglevel;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public Set<Organization> getOrgs() {
		return orgs;
	}
	public void setOrgs(Set<Organization> orgs) {
		this.orgs = orgs;
	}	
}
