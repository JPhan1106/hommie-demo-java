package coding.entity;

public class Room {
	private int id;
	private String tittle;
	private String description;
	private double price;
	private double squareArea;
	private double rating;
	private int personCapacity;

//	Location:
	private String[] closeToUnis;
	// lat
	// lng

// Amenity:
	private boolean hasInternet;
	private boolean hasStudyDesk;
	private boolean hasEnsuiteBathroom;
	private boolean hasWardrobe;

// Image: 
	private String image1Url;
	private String image2Url;
	private String image3Url;
	private String image4Url;
	private String imageDescription;
	
	
	public Room () {
		
	}


	public Room(int id, String tittle, String description, double price, boolean hasInternet, boolean hasStudyDesk,
			boolean hasEnsuiteBathroom, String image1Url) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
		this.price = price;
		this.hasInternet = hasInternet;
		this.hasStudyDesk = hasStudyDesk;
		this.hasEnsuiteBathroom = hasEnsuiteBathroom;
		this.image1Url = image1Url;
	}

	



	public Room(int id, String tittle, String description, double price, double squareArea, boolean hasInternet,
			boolean hasStudyDesk, boolean hasEnsuiteBathroom, String image1Url, String image2Url, String image3Url,
			String image4Url) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
		this.price = price;
		this.squareArea = squareArea;
		this.hasInternet = hasInternet;
		this.hasStudyDesk = hasStudyDesk;
		this.hasEnsuiteBathroom = hasEnsuiteBathroom;
		this.image1Url = image1Url;
		this.image2Url = image2Url;
		this.image3Url = image3Url;
		this.image4Url = image4Url;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTittle() {
		return tittle;
	}


	public void setTittle(String tittle) {
		this.tittle = tittle;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getSquareArea() {
		return squareArea;
	}


	public void setSquareArea(double squareArea) {
		this.squareArea = squareArea;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public int getPersonCapacity() {
		return personCapacity;
	}


	public void setPersonCapacity(int personCapacity) {
		this.personCapacity = personCapacity;
	}


	public String[] getCloseToUnis() {
		return closeToUnis;
	}


	public void setCloseToUnis(String[] closeToUnis) {
		this.closeToUnis = closeToUnis;
	}


	public boolean isHasInternet() {
		return hasInternet;
	}


	public void setHasInternet(boolean hasInternet) {
		this.hasInternet = hasInternet;
	}


	public boolean isHasStudyDesk() {
		return hasStudyDesk;
	}


	public void setHasStudyDesk(boolean hasStudyDesk) {
		this.hasStudyDesk = hasStudyDesk;
	}


	public boolean isHasEnsuiteBathroom() {
		return hasEnsuiteBathroom;
	}


	public void setHasEnsuiteBathroom(boolean hasEnsuiteBathroom) {
		this.hasEnsuiteBathroom = hasEnsuiteBathroom;
	}


	public boolean isHasWardrobe() {
		return hasWardrobe;
	}


	public void setHasWardrobe(boolean hasWardrobe) {
		this.hasWardrobe = hasWardrobe;
	}


	public String getImage1Url() {
		return image1Url;
	}


	public void setImage1Url(String image1Url) {
		this.image1Url = image1Url;
	}


	public String getImage2Url() {
		return image2Url;
	}


	public void setImage2Url(String image2Url) {
		this.image2Url = image2Url;
	}


	public String getImage3Url() {
		return image3Url;
	}


	public void setImage3Url(String image3Url) {
		this.image3Url = image3Url;
	}


	public String getImage4Url() {
		return image4Url;
	}


	public void setImage4Url(String image4Url) {
		this.image4Url = image4Url;
	}


	public String getImageDescription() {
		return imageDescription;
	}


	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
