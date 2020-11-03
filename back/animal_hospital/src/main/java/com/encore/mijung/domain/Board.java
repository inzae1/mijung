package com.encore.mijung.domain;

public class Board {
	private int bdID;
	private String bdTitle;
	private String bdContent;
	private int bdView;
	private String bdDate;
	private int bdIsSecret;
	private String bdReply;
	private String custId;

	public Board() {

	}

	public Board(String bdTitle, String bdContent, int bdView, int bdIsSecret, String custId) {
		this.bdTitle = bdTitle;
		this.bdContent = bdContent;
		this.bdView = bdView;
		this.bdIsSecret = bdIsSecret;
		this.custId = custId;
	}

	public int getBdID() {
		return bdID;
	}

	public void setBdID(int bdID) {
		this.bdID = bdID;
	}

	public String getBdTitle() {
		return bdTitle;
	}

	public void setBdTitle(String bdTitle) {
		this.bdTitle = bdTitle;
	}

	public String getBdContent() {
		return bdContent;
	}

	public void setBdContent(String bdContent) {
		this.bdContent = bdContent;
	}

	public int getBdView() {
		return bdView;
	}

	public void setBdView(int bdView) {
		this.bdView = bdView;
	}

	public String getBdDate() {
		return bdDate;
	}

	public void setBdDate(String bdDate) {
		this.bdDate = bdDate;
	}

	public int getBdIsSecret() {
		return bdIsSecret;
	}

	public void setBdIsSecret(int bdIsSecret) {
		this.bdIsSecret = bdIsSecret;
	}

	public String getBdReply() {
		return bdReply;
	}

	public void setBdReply(String bdReply) {
		this.bdReply = bdReply;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Board [bdID=" + bdID + ", bdTitle=" + bdTitle + ", bdContent=" + bdContent + ", bdView=" + bdView
				+ ", bdDate=" + bdDate + ", bdIsSecret=" + bdIsSecret + ", bdReply=" + bdReply + ", custId=" + custId
				+ "]";
	}

}