import java.util.Scanner;
class Ticket
{
	static int ticketCost=150;
	static double availableTicket=50;

	void bookTicket(int bookingCount)
	{
		if(bookingCount<=availableTicket)
		{
			availableTicket=availableTicket-bookingCount;
			double totalAmt=bookingCount*ticketCost;

		System.out.println("TOTAL AMOUNT :"+totalAmt);
		System.out.println("TICKET HAVE BE BOOKED :=>"+bookingCount);

		showTicket();
	}
	else
	{
		System.out.println("TICKET ARE NOT AVAILABLE");
	}
}

	void cancelTicket(int cancalCount)
	{
			availableTicket=availableTicket+cancalCount;
			System.out.println("TICKET HAVE BE CANCELLED:=>"+cancalCount);

			// availableTicket=availableTicket-cancalCount;
			// System.out.println("AVAILABLE TICKET ARE :"+availableTicket);

			showTicket();
	}

	void showTicket()
	{

		System.out.println("AVAILABLE TICKET ARE :"+availableTicket);
	}
}

class MainApp4
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Ticket t=new Ticket();

		System.out.println("1>:-BOOK TICKET");
		System.out.println("2>:-CANCEL TICKET");
		System.out.println("3>:-SHOW TICKET");

		int choice=sc.nextInt();

		if(choice==1)
		{
			System.out.println("ENTER NO OF TICKET TO BE BOOKED");
			int count=sc.nextInt();
			t.bookTicket(count);

		}

		else if(choice==2)
		{
				System.out.println("ENTER NO OF TICKET TO BE CANCELLED");
				int count=sc.nextInt();
				t.cancelTicket(count);
		}

		else if(choice==3)
		{
			t.showTicket();
		}

		else
		{
			System.out.println("INVALID CHOICE");
		}

	}
}