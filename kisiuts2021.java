public class kisiuts {
	public static void main (String [] args){

	double hargabrg = 150000, jmlbeli = 7, diskon, potmember, totbayar;
	String jnsplgn = "platinum";

	if (jmlbeli > 10){
		diskon = hargabrg * 0.2;
		} else if(jmlbeli > 8){
			diskon = hargabrg * 0.15;
			} else if(jmlbeli > 5){
				diskon = hargabrg * 0.1;
				} else {
					diskon = 0;
					}
	if (jnsplgn.equals("platinum")){
		potmember = 20000;
		} else if (jnsplgn.equals("gold")){
			potmember = 15000;
			} else if (jnsplgn.equals("silver")){
				potmember = 10000;
				} else {
					potmember = 5000;
					}
	totbayar = ((hargabrg * jmlbeli) - diskon) - potmember;

		System.out.println("dapat diskon nih Rp. "+diskon);
		System.out.println("dapat potongan member juga Rp. "+potmember);
		System.out.println("total bayar Rp. "+totbayar);



	}
}

