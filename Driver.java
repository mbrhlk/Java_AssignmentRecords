
import java.util.Scanner;

public class Driver {
	
	static Record[] records;						
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Record r1 = new Record(786,"Genesis", "Grimes",2,4);
		Record r2 = new Record(5432,"Delete Forever", "Grimes",0, 5);
		Record r3 = new Record(212,"Run", "Joji", 2, 6);
		Record r4 = new Record(506,"Daylight", "Joji",0, 4);
		Record r5 = new Record(3434,"Follow Rivers", "Lykke Li", 1, 3);
		Record r6 = new Record(8432,"Earfquake", "Tyler the creator",4 , 4);
		Record r7 = new Record(422,"Fade", "Kanye West",0, 5);
		
		records = new Record[7];
		records[0] = r1;
		records[1] = r2;
		records[2] = r3;
		records[3] = r4;
		records[4] = r5;
		records[5] = r6;
		records[6] = r7;
		
		
		System.out.println(getAverageLength());
		System.out.println(getAverageRanking());
		
		System.out.println("Please Enter the title of the song: ");
		String recordTitle = input.nextLine();
	
		printRecord(records[findByTitle(recordTitle)]);
		
		
		
	}

	
	private static double getAverageLength() {
		double sum = 0;
		for (int i = 0; i < records.length; i++) {
			sum = sum + records[i].getRecordLength();
			
		}
		return sum / records.length;
	}
	
	private static double getAverageRanking() {
		double sum = 0;
		for (int i = 0; i < records.length; i++) {
			sum = sum + records[i].getRecordRanking();
			
		}
		return sum / records.length;
	}
	
	private static void printRecord(Record record) {
		System.out.println(record);
	}
	
	private static int findByTitle(String title) {
		for (int i = 0; i < records.length; i++) {
			if (records[i].getRecordTitle() == title) {
				return i;
			}
		}
		 return -1;
	}
	
	
	
}



	