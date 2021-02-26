package entity;

import java.util.List;

public class Regimen {

	private int regimenId;
	private String dosage;
	private int userId;
	private int medId;
	//not sure if this is best way for these, as place holder.

	public Regimen(int regimenId, int medId, int userId, String dosage) {
		this.setRegimenId(regimenId);
		this.setMedId(medId);
		this.setUserId(userId);
		this.setDosage(dosage);
	}

	public int getRegimenId() {
		return regimenId;
	}

	public void setRegimenId(int regimenId) {
		this.regimenId = regimenId;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMedId() {
		return medId;
	}

	public void setMedId(int medId) {
		this.medId = medId;
	}

}
