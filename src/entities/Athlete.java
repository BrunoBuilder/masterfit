package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Athlete {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer code;
	private String name;
	private Character gender;
	private Date birthdate;
	private Double height;
	private Double weight;
	private Double bF;
	private Character levelOfTraining;

	public Athlete() {
		
	}

	public Athlete(Integer code, String name, Character gender, Date birthdate, Double height, Double weight, Double bF,
			Character levelOfTraining) {
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
		this.height = height;
		this.weight = weight;
		this.bF = bF;
		this.levelOfTraining = levelOfTraining;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getbF() {
		return bF;
	}

	public void setbF(Double bF) {
		this.bF = bF;
	}

	public Character getLevelOfTraining() {
		return levelOfTraining;
	}

	public void setLevelOfTraining(Character levelOfTraining) {
		this.levelOfTraining = levelOfTraining;
	}

	@Override
	public String toString() {
		return "Código: " + code + "\nNome: " + name + "\nSexo: " + gender + "\nData de nascimento: " + sdf.format(birthdate)
				+ "\nAltura: " + height + "m\nPeso: " + weight + "kg\nBF: " + bF + "%\nNível de treino: " + levelOfTraining;
	} 

	
}
