import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//---------------------------------------
		String �sim[]={"Ali","Burak","Ceren","�i�ek","Dilek","Erkan","Figen","Gizem","Hilal","Irmak","�layda","J�lide","Kerim","Leyle","Mecnun","Nedim","Pamuk","Rasim","Sibel","�ermin","T�lay","Uras","�mran","Vedat","Yasemin","Zerrin"};
		String Sehir[]={"Adana","Bursa","�orum","Denizli","Edirne","Giresun","Hakkeri","Isparta","�stanbul","Kars","Malatya","Nev�ehir","Ordu","Rize","Sakarya","Tekirda�","�anl�urfa","U�ak","Van","Yozgat","Zonguldak"};
		String Hayvan[]={"At","B�ld�rc�n","Ceylan","�akal","Deve","E�ek Ar�s�","Fare","Gelincik","Hamsi","Istakoz","�nci Bal���","Jaguar","Kedi","Leopar","Maymun","Nar B�lb�l�","Orangutan","�rdek","Palamut","Rakun","Salyangoz","�ahin","Tavuk","Uskumru","�veyik","Va�ak","Yarasa","Zebra"};
		String Bitki[]={"Abanoz","Badem","Ceviz","Devedikeni","Elma","Fasulye","Gazel otu","Hardal","Ihlamur","�ncir","Japon Ak�aa�ac�","Kabak","Ladin","Malta Eri�i","Nane","O�ul Otu","�da�ac�","Pamuk","Reyhan","Safran","�algam","Tar��n","Uluda� Gmknar�","�z�m","Vi�ne","Yer Elmas�","Zakkum"};
		String Esya[]={"Ayna","Bidon","Cam","�anta","Davul","Etek","Fular","G�zl�k","Hal�","Izgara","�p","Jilet","Kilit","Lamba","Masa","Nal","Oklava","�rs","Pil","Saat","�ort","Toka","Ud","�t�","Vazo","Yast�k","Z�mpara"};
		String Ulke[]={"Amerika","Banglade�","Cezayir","�ad","Danimarka","Ekvador","Fas","Gana","Haiti","Irak","�ngiltere","Japonya","Kambo�ya","Letonya","Macariston","Namibya","Orta Afrika Cumhuriyeti","�zbekistan","Pakistan","Romanya","Senegal","�ili","T�rkiye","Ukrayna","�rd�n","Venezuela","Yemen","Zambiya"};
		String Artist[]={"Ajda Pekkan","Bar�� Man�o","Cem Y�lmaz","�elik","Demet Akal�n","Ebru G�nde�","Ferdi Tayfur","G�lben Ergen","Hadise","I��n Karaca","�clal Ayd�n","Kenan I��k","Levent Y�ksel","Mahmut Tuncer","Nazan �ncel","O�uzhan Ko�","�zcan Deniz","Petek Din��z","Reyhan Karaca","Sagopa Kajmer","�afak S�nmez","Tar�k Meng��","U�ur Murathan","�mit Besen","Volkan Konak","Yal�n","Yavuz Bing�l","Zuhal Olcay"};
		String Sonuc[]=new String[7];
		String Harf;
		String Ad[]={"�sim","Sehir","Hayvan","Bitki","Esya","�lke","Artist"};
		//------------------------------------
		System.out.print("Harfi Giriniz: ");
		Harf=input.next();
		//---------------------------
		for(int i=0;i<�sim.length;i++){
		if(Harf.equalsIgnoreCase(�sim[i].substring(0,1)))
			Sonuc[0]=�sim[i];
		}
		for(int i=0;i<Sehir.length;i++){
			if(Harf.equalsIgnoreCase(Sehir[i].substring(0,1)))
				Sonuc[1]=Sehir[i];
		}
		for(int i=0;i<Hayvan.length;i++){
			if(Harf.equalsIgnoreCase(Hayvan[i].substring(0,1)))
				Sonuc[2]=Hayvan[i];
			}
		for(int i=0;i<Bitki.length;i++){
			if(Harf.equalsIgnoreCase(Bitki[i].substring(0,1)))
				Sonuc[3]=Bitki[i];
			}
		for(int i=0;i<Esya.length;i++){
			if(Harf.equalsIgnoreCase(Esya[i].substring(0,1)))
				Sonuc[4]=Esya[i];
			}
		for(int i=0;i<Ulke.length;i++){
			if(Harf.equalsIgnoreCase(Ulke[i].substring(0,1)))
				Sonuc[5]=Ulke[i];
			}
		for(int i=0;i<Artist.length;i++){
			if(Harf.equalsIgnoreCase(Artist[i].substring(0,1)))
				Sonuc[6]=Artist[i];
			}
	//----------------------------------
		for(int i=0;i<Sonuc.length;i++){
			System.out.println(Ad[i]+"= "+Sonuc[i]);
		}
		
	}

}
