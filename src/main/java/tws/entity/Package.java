package tws.entity;

import java.io.Serializable;

public class Package implements Serializable {
	private String id;
    private String receiver;
    private String telPhone;
    private int weight;
    private String status;
    private String fetchTime;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Package() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTelPhone() {
		return telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public int getWeight() {
        return weight;
    }

    public void setWeight(int age) {
        this.weight = age;
    }

	public String getFetchTime() {
		return fetchTime;
	}

	public void setFetchTime(String fetchTime) {
		this.fetchTime = fetchTime;
	}
}
