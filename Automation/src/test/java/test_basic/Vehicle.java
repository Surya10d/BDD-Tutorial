package test_basic;

class car {
    protected String licensePlate = null;

    public void setLicensePlate(String license) {
        this.licensePlate = license;
        System.out.println(licensePlate);
    }
}

class Vehicle extends car {
        protected int numberOfSeats = 1;

        public int getNumberOfSeats() {
            return this.numberOfSeats;
        }
        public void  printNumberOfSeats() {
          //  return this.numberOfSeats;
            System.out.println(numberOfSeats);
        }
        public void setNumberOfSeats(int i) {
        	this.numberOfSeats = i;
        }

//Parent class


   public static void main(String []args) {
       car c = new car();

      c.setLicensePlate("LASKF12341"); 

//Used downcasting to call the child method from the parent class. 
//Downcasting = It’s the casting from a superclass to a subclass.
      car d = new Vehicle();
      ((Vehicle) d).printNumberOfSeats();
      ((Vehicle) d).setNumberOfSeats(100);
      System.out.println(((Vehicle) d).getNumberOfSeats());
   	}
   }