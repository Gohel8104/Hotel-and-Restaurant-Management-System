import java.util.*;

class Hotel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("WELCOME TO OUR HOTEL");
		System.out.println("--------------------");
		System.out.println("");
		System.out.println("For Login Enter 1");
		System.out.println("For Exit Enter 2");
		System.out.print("Please Enter Your Choice - ");
		int choice1=sc.nextInt();
		System.out.println("");
		
	switch(choice1)
		{
			case 1:
			    boolean h=true;
				System.out.print("Please Enter Password - ");
				sc.nextLine();
				String password=sc.nextLine();
				while(h==true)
				{
					if(password.equalsIgnoreCase("1234"))
						{
							System.out.println("");
							System.out.println("-----------------");
							System.out.println("Sucessfully Login");
							System.out.println("-----------------");
							System.out.println("");
							System.out.println("1. Hotel");
							System.out.println("2. Restaurant");
							System.out.println("3. Logout");
							System.out.print("Enter your choice - ");
							int choice2= sc.nextInt();
							Restaurant r=new Restaurant();
							HotelCheckIn hotel=new HotelCheckIn();
							switch (choice2) 
							{
								case 1:
									hotel.checkin();
									break;
								case 2:
									r.orderFood();
									break;
								case 3:
									password="";
									h=false;
									break;
								default:
									System.out.println("Invalid choice.");
									break;
							}
						}
					else
						{
							System.out.println("Incorrect Password");
                            h=false;
						}
				}
				System.out.println("");
				System.out.println("----------------------");
				System.out.println("You Are Out Of System");
				System.out.println("----------------------");
				break;
				
			case 2:
					System.out.println("Thankyou For Visiting");
					break;
			
			default:
					System.out.println("Invalid Choice");
					System.out.println("Please Try Again");
					break;
				
		}
		
	}
	
}

class Restaurant
{
	int breakfast_bill=0,lunch_bill=0,dinner_bill=0;
	Scanner sc=new Scanner(System.in);
	void orderFood()
	{
		System.out.println("-------------------------");
		System.out.println("WELCOME TO OUR RESTAURANT");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("1 : breakfast");
		System.out.println("2 : lunch");
		System.out.println("3 : dinner");
		System.out.println("4 : exit");
		System.out.println("enter your choice: ");
		int food=sc.nextInt();
		switch(food)
		{
			case 1:
			System.out.println("------------------");
			System.out.println("Menu For Breakfast");
			System.out.println("------------------");
			System.out.println("");
			boolean breakfast=true;
			while(breakfast==true)
			{
				int a[]={30,40,50,20,70,80,60};
				System.out.println("************");
				System.out.println("1 : French tost");
				System.out.println("2 : Pancakes");
				System.out.println("3 : Upma");
				System.out.println("4 : Biscuits and Gravy");
				System.out.println("5 : Dosa");
				System.out.println("6 : Pongol");
				System.out.println("7 : Idli");
				System.out.println("8 : exit");
				System.out.print("enter your choice - ");
				int choice3=sc.nextInt();
				System.out.println("************");
				switch(choice3)
				{
					case 1:
						breakfast_bill=breakfast_bill+a[0];
						break;
					case 2:
						breakfast_bill=breakfast_bill+a[1];
						break;
					case 3:
						breakfast_bill=breakfast_bill+a[2];
						break;
					case 4:
						breakfast_bill=breakfast_bill+a[3];
						break;
					case 5:
						breakfast_bill=breakfast_bill+a[4];
						break;
					case 6:
						breakfast_bill=breakfast_bill+a[5];
						break;
					case 7:
						breakfast_bill=breakfast_bill+a[6];
						break;
					case 8:
						breakfast=false;
						break;
					default :
					    System.out.println("Invalid chooice");
					    System.out.println("Please try again");
						break;
				}
			}
			System.out.println("Total Bill of Breakfast : "+breakfast_bill+" rs.");
			System.out.println("");
			System.out.println("");
			
			break;
			
			
			case 2:
			System.out.println("-------------------------------");
			System.out.println("Menu For Lunch");
			System.out.println("In Lunch We Have Only Fix Thali");
			System.out.println("-------------------------------");
			System.out.println("");
			boolean lunch=true;
			while(lunch==true)
			{
				int a[]={500,470,450};
				
				System.out.println("----------------------------------------------------");
				System.out.println("1 : Rajesthani Thali");
				System.out.println("    (which include)");
				System.out.println("    1.Dal Bati Churma");
				System.out.println("    2.Gatti ki subzi");
				System.out.println("    3.ker Sangi");
				System.out.println("    4.Bajri Ke Roti");
				System.out.println("    5.Lashun ki Chutney");
				System.out.println("    6.Khichdi");
				System.out.println("    7.Kadhi");
				System.out.println("----------------------------------------------------");
				System.out.println("2 : Gujarati Thali");
				System.out.println("    1.Tamatar Shev Ki Sabji");
				System.out.println("    2.Papad Ki Sabji");
				System.out.println("    3.Undhiyo");
				System.out.println("    4.Kadhi");
				System.out.println("    5.Dhokla or Khandvi");
				System.out.println("----------------------------------------------------");
				System.out.println("3 : Punjabi Thali");
				System.out.println("    1.Sarson Ka Saag");
				System.out.println("    2.Makki ki Roti");
				System.out.println("    3.Raddish or Mooli");
				System.out.println("    4.Raw Onion,Mango Pickle,Chunks of Jagger or Gud");
				System.out.println("----------------------------------------------------");
				System.out.println("4 : exit");
				System.out.println("----------------------------------------------------");
				System.out.print("Enter Your Choice - ");
				int choice4=sc.nextInt();
				System.out.println("");
				System.out.println("");
				switch(choice4)
				{
					case 1:
						lunch_bill=lunch_bill+a[0];
						System.out.println("------------------------");
						System.out.println("Item 1 is added -");
						System.out.println("------------------------");
						System.out.println("");
						break;
					case 2:
						lunch_bill=lunch_bill+a[1];
						System.out.println("------------------------");
						System.out.println("Item 2 is added -");
						System.out.println("------------------------");
						System.out.println("");
						break;
					case 3:
						lunch_bill=lunch_bill+a[2];
						System.out.println("------------------------");
						System.out.println("Item 3 is added -");
						System.out.println("------------------------");
						System.out.println("");
						break;
					case 4:
						lunch=false;
						break;
					default :
					    System.out.println("------------------------");
					    System.out.println("Invalid chooice");
					    System.out.println("Please try again");
						System.out.println("------------------------");
						System.out.println("");
						break;
				}
			}
			System.out.println("total bill of lunch : "+lunch_bill+" rs.");
			break;
			
			case 3:
			System.out.println("---------------");
			System.out.println("Menu For Dinner");
			System.out.println("---------------");
			System.out.println("");
			boolean dinner=true;
			while(dinner==true)
			{
				int a[]={550,500,470};
				System.out.println("----------------------------------------------------");
				System.out.println("1 : Rajesthani Thali");
				System.out.println("    (which include)");
				System.out.println("    1.Dal Bati Churma");
				System.out.println("    2.Gatti ki subzi");
				System.out.println("    3.ker Sangi");
				System.out.println("    4.Bajri Ke Roti");
				System.out.println("    5.Lashun ki Chutney");
				System.out.println("    6.Khichdi");
				System.out.println("    7.Kadhi");
				System.out.println("----------------------------------------------------");
				System.out.println("2 : Gujarati Thali");
				System.out.println("    1.Tamatar Shev Ki Sabji");
				System.out.println("    2.Papad Ki Sabji");
				System.out.println("    3.Undhiyo");
				System.out.println("    4.Kadhi");
				System.out.println("    5.Dhokla or Khandvi");
				System.out.println("----------------------------------------------------");
				System.out.println("3 : Punjabi Thali");
				System.out.println("    1.Sarson Ka Saag");
				System.out.println("    2.Makki ki Roti");
				System.out.println("    3.Raddish or Mooli");
				System.out.println("    4.Raw Onion,Mango Pickle,Chunks of Jagger or Gud");
				System.out.println("----------------------------------------------------");
				System.out.println("4 : exit");
				System.out.println("----------------------------------------------------");
				System.out.print("enter your choice - ");			
				int choice5=sc.nextInt();
				System.out.println("");
				switch(choice5)
				{
					case 1:
						dinner_bill=dinner_bill+a[0];
						System.out.println("------------------------");
						System.out.println("Item 1 is added -");
						System.out.println("------------------------");
						break;
					case 2:
						dinner_bill=dinner_bill+a[1];
						System.out.println("------------------------");
						System.out.println("Item 2 is added -");
						System.out.println("------------------------");
						break;
					case 3:
						dinner_bill=dinner_bill+a[2];
						System.out.println("------------------------");
						System.out.println("Item 3 is added -");
						System.out.println("------------------------");
						break;
					case 4:
						dinner=false;
						break;
					default :
					    System.out.println("Invalid chooice");
					    System.out.println("Please try again");
						break;
				}
			}
			System.out.println("------------------------------------------");
			System.out.println("total bill of dinner : "+dinner_bill+" rs.");
			System.out.println("------------------------------------------");
			System.out.println("");
			
			break;
				
			default :
			    System.out.println("------------------------");
				System.out.println("Invalid chooice");
				System.out.println("Please try again");
				System.out.println("------------------------");
				System.out.println("");
				break;
			
		}
	}
}




class Customer{
    String name;
    String id_no;
    String mobile_no;
    void setData(String x,String y,String z){
        name = x;
        id_no = y;
        mobile_no = z;
    }

    void getData(int x){
        System.out.println("Guest name : "+name);
        System.out.println("Guest id_no : "+id_no);
        System.out.println("Guest mobile_no : "+mobile_no);
    }
	
	void occupieddata(int x){
        System.out.println("room "+x+" - Name - " +name);
    }
}

 class HotelCheckIn {
    void checkin() {
        Scanner input = new Scanner(System.in);
		int bill[]={2000,3000,4000,5000};

        boolean[] hotelRooms = new boolean[10];
        Customer [] cust =new Customer[10];
		Restaurant r=new Restaurant();

        System.out.println("");
		System.out.println("-------------------------------------");
        System.out.println("Welcome to the Hotel Check-In System!");
		System.out.println("-------------------------------------");
		System.out.println("");
		boolean hotel=true;

        while (hotel==true) {
			System.out.println("------------------------");
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. View occupied rooms");
            System.out.println("4. View available rooms");
            System.out.println("5. order food");
            System.out.println("6. Exit");
            System.out.print("Choose an option - ");
            int choice = input.nextInt();
			System.out.println("");


            switch (choice) {
                case 1:
					System.out.println("Available rooms:");
					System.out.println("===========================");
                    for (int i = 0; i < hotelRooms.length; i++) {
                        if (!hotelRooms[i]) {
                            System.out.println("Room " + (i+1));
                        }
                    }
					System.out.println("===========================");
                    System.out.print("Enter room number : ");
                    int roomNumber = input.nextInt();

                    if (hotelRooms[roomNumber-1]) {
						System.out.println("--------------------------------------------------");
                        System.out.println("Sorry, room " + roomNumber + " is already occupied.");
						System.out.println("--------------------------------------------------");
                    } else {
                        hotelRooms[roomNumber-1] = true;
                        cust[roomNumber-1] = new Customer();
						input.nextLine();
						System.out.println("===========================");
                        System.out.print("Guest name = ");
                        String name = input.nextLine();
                        System.out.print("Guest id number = ");
                        String id_no = input.nextLine();
						System.out.print("Guest mobile number = ");
                        String mobile_no = input.nextLine();
						System.out.println("===========================");
                        cust[roomNumber-1].setData(name,id_no,mobile_no);

						System.out.println("");
						System.out.println("----------------------------------------------------");
                        System.out.println("You have successfully checked in to room " + roomNumber + ".");
						System.out.println("----------------------------------------------------");
						System.out.println("");
                    }
                    break;

                case 2:
                    System.out.println("Enter room number:");
                    roomNumber = input.nextInt();
					int billing;
                    if (hotelRooms[roomNumber-1]) {
                    cust[roomNumber-1].getData(roomNumber);
					System.out.print("Enter Number of Days : " );
					int ndays=input.nextInt();
					System.out.println("1 Standard rooms");
					
					System.out.println("2 Deluxe rooms");
					System.out.println("3 luxury rooms");
					System.out.println("4 joint rooms");
					System.out.print("Enter Your Choice - ");
					int choice5 = input.nextInt();
					System.out.println("");
					
						billing = ndays*bill[choice5-1];
						System.out.println("--------------------------------------------");
						System.out.println("Your Total Bill For Room Is : "+billing+" rs");
						System.out.println("--------------------------------------------");
						System.out.println("");
					
						System.out.println("-------------------------------------------------------------------");
                        System.out.println("You Have Successfully Checked Out From Room No. " + roomNumber + ".");
						System.out.println("-------------------------------------------------------------------");
                        hotelRooms[roomNumber-1] = false;
                    } else {
						System.out.println("");
						System.out.println("--------------------------------------");
                        System.out.println("Sorry, Room No." + roomNumber + " Is Not Occupied.");
						System.out.println("--------------------------------------");
						System.out.println("");
                    }
                    break;

                case 3:
					System.out.println("----------------");
                    System.out.println("Occupied rooms:");
					System.out.println("=======================");
                    for (int i = 0; i < hotelRooms.length; i++) {
                        if (hotelRooms[i]) {
                            cust[i].occupieddata(i+1);
                        }
                    }
					System.out.println("=======================");
					System.out.println("");
                    break;

                case 4:
					System.out.println("-----------------");
                    System.out.println("Available rooms:");
					System.out.println("========================");
                    for (int i = 0; i < hotelRooms.length; i++) {
                        if (!hotelRooms[i]) {
                            System.out.println("Room " + (i+1));
                        }
                    }
					System.out.println("========================");
					System.out.println("");
                    break;
				case 5:
					r.orderFood();
					break;

                case 6:
					System.out.println("---------");
                    System.out.println("Goodbye!");
					System.out.println("---------");
					hotel=false;
                    break;

                default :
					System.out.println();
					System.out.println("************");
                    System.out.println("Invalid choice. Please choose again.");
					System.out.println("************");
					System.out.println();
            }
        }
    }
}