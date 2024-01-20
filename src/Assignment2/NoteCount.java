package Assignment2;

public class NoteCount {
	public void counting(int[] currency, int amount) {
		int notes[]=new int[currency.length];
		
		int sum=0;
		for (int i = 0; i < notes.length; i++) {
			notes[i]=amount/currency[i];
			amount=amount%currency[i];
			sum+=notes[i];
		}
		lines();
		System.out.println("\tNotes\t"+"\tCurrency\t");
		lines();
		for (int i = 0; i < notes.length; i++) {
			if(notes[i]!=0)
			System.out.println("\t" + notes[i] + "\t X \t"+currency[i]);
		}
		lines();
		System.out.println("Total Number Of Notes: "+sum);
		System.out.println("Balnace Amount:  "+ (amount));
		lines();
	}
	
	public void lines() {
		System.out.println("-------------------------------------------------");
	}
}
    