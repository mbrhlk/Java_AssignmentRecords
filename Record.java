import java.util.Random;

public class Record {
	
	private int idRecord;
	private String recordTitle;
	private String recordSinger;
	private int recordLength;
	private int recordRanking;
	
	


	//constructor 
	public Record(int idRecord, String recordTitle, String recordSinger, int recordLength, int recordRanking) {
		
		Random random = new Random();
		
		setIdRecord(random.nextInt(10000-100) + 100);
		setRecordTitle(recordTitle);
		setRecordSinger(recordSinger);
		setRecordLength(recordLength);
		setRecordRanking(recordRanking);
		
		
	}
	

	public int getIdRecord() {
		return idRecord;
	}


	public String getRecordTitle() {
		return recordTitle;
	}


	public String getRecordSinger() {
		return recordSinger;
	}


	public int getRecordLength() {
		return recordLength;
	}


	public int getRecordRanking() {
		return recordRanking;
	}

	
	
	public void setIdRecord(int i) {
		this.idRecord = i;
	}


	public void setRecordLength(int recordLength) {
		if( recordLength > 0) 
			this.recordLength = recordLength;
		
	}


	public void setRecordSinger(String recordSinger) {
			this.recordSinger = recordSinger;
			
		
	}


	public void setRecordRanking(int recordRanking) {
		if( recordRanking <= 6 && recordRanking > 0) 
			this.recordRanking = recordRanking;
			
		}
	

	public void setRecordTitle(String recordTitle) {
			this.recordTitle = recordTitle;
		
	}


	@Override
	public String toString() {
		return "Record [idRecord=" + idRecord + ", recordTitle=" + recordTitle + ", recordSinger=" + recordSinger
				+ ", recordLength=" + recordLength + ", recordRanking=" + recordRanking + "]";
	}

	
	
}
	
	
	
	
	
	

