package model;

public class Goorder {
	private Integer id;
	private String name;
	private int noodle;
	private int chicken;
	private int golden;
	private int salad;
	private int beef;
	private int duck;
	private int fish;
	private int sum;
	
	
	
	public Goorder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goorder(int noodle,int chicken,int golden,int salad,int beef,int duck,int fish) {
		super();
		this.name = name;
		this.noodle = noodle;
		this.chicken = chicken;
		this.golden = golden;
		this.salad = salad;
		this.beef = beef;
		this.duck = duck;
		this.fish = fish;
		this.sum = noodle*380 + chicken*580 + golden*160 + salad*450 + beef*480 + duck*460 + fish*620 ;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


	public int getNoodle() {
		return noodle;
	}

	public void setNoodle(int noodle) {
		this.noodle = noodle;
	}

	public int getChicken() {
		return chicken;
	}

	public void setChicken(int chicken) {
		this.chicken = chicken;
	}

	public int getGolden() {
		return golden;
	}

	public void setGolden(int golden) {
		this.golden = golden;
	}

	public int getSalad() {
		return salad;
	}

	public void setSalad(int salad) {
		this.salad = salad;
	}

	public int getBeef() {
		return beef;
	}

	public void setBeef(int beef) {
		this.beef = beef;
	}

	public int getDuck() {
		return duck;
	}

	public void setDuck(int duck) {
		this.duck = duck;
	}

	public int getFish() {
		return fish;
	}

	public void setFish(int fish) {
		this.fish = fish;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}
	

}
