import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//---------------------------------------
		String Ýsim[]={"Ali","Burak","Ceren","Çiçek","Dilek","Erkan","Figen","Gizem","Hilal","Irmak","Ýlayda","Jülide","Kerim","Leyle","Mecnun","Nedim","Pamuk","Rasim","Sibel","Þermin","Tülay","Uras","Ümran","Vedat","Yasemin","Zerrin"};
		String Sehir[]={"Adana","Bursa","Çorum","Denizli","Edirne","Giresun","Hakkeri","Isparta","Ýstanbul","Kars","Malatya","Nevþehir","Ordu","Rize","Sakarya","Tekirdað","Þanlýurfa","Uþak","Van","Yozgat","Zonguldak"};
		String Hayvan[]={"At","Býldýrcýn","Ceylan","Çakal","Deve","Eþek Arýsý","Fare","Gelincik","Hamsi","Istakoz","Ýnci Balýðý","Jaguar","Kedi","Leopar","Maymun","Nar Bülbülü","Orangutan","Ördek","Palamut","Rakun","Salyangoz","Þahin","Tavuk","Uskumru","Üveyik","Vaþak","Yarasa","Zebra"};
		String Bitki[]={"Abanoz","Badem","Ceviz","Devedikeni","Elma","Fasulye","Gazel otu","Hardal","Ihlamur","Ýncir","Japon Akçaaðacý","Kabak","Ladin","Malta Eriði","Nane","Oðul Otu","Ödaðacý","Pamuk","Reyhan","Safran","Þalgam","Tarçýn","Uludað Gmknarý","Üzüm","Viþne","Yer Elmasý","Zakkum"};
		String Esya[]={"Ayna","Bidon","Cam","Çanta","Davul","Etek","Fular","Gözlük","Halý","Izgara","Ýp","Jilet","Kilit","Lamba","Masa","Nal","Oklava","Örs","Pil","Saat","Þort","Toka","Ud","Ütü","Vazo","Yastýk","Zýmpara"};
		String Ulke[]={"Amerika","Bangladeþ","Cezayir","Çad","Danimarka","Ekvador","Fas","Gana","Haiti","Irak","Ýngiltere","Japonya","Kamboçya","Letonya","Macariston","Namibya","Orta Afrika Cumhuriyeti","Özbekistan","Pakistan","Romanya","Senegal","Þili","Türkiye","Ukrayna","Ürdün","Venezuela","Yemen","Zambiya"};
		String Artist[]={"Ajda Pekkan","Barýþ Manço","Cem Yýlmaz","Çelik","Demet Akalýn","Ebru Gündeþ","Ferdi Tayfur","Gülben Ergen","Hadise","Iþýn Karaca","Ýclal Aydýn","Kenan Iþýk","Levent Yüksel","Mahmut Tuncer","Nazan Öncel","Oðuzhan Koç","Özcan Deniz","Petek Dinçöz","Reyhan Karaca","Sagopa Kajmer","Þafak Sönmez","Tarýk Mengüç","Uður Murathan","Ümit Besen","Volkan Konak","Yalýn","Yavuz Bingöl","Zuhal Olcay"};
		String Sonuc[]=new String[7];
		String Harf;
		String Ad[]={"Ýsim","Sehir","Hayvan","Bitki","Esya","Ülke","Artist"};
		//------------------------------------
		System.out.print("Harfi Giriniz: ");
		Harf=input.next();
		//---------------------------
		for(int i=0;i<Ýsim.length;i++){
		if(Harf.equalsIgnoreCase(Ýsim[i].substring(0,1)))
			Sonuc[0]=Ýsim[i];
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
