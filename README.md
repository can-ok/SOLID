# SOLID

SOLID prensipleri göz önünde bulundurarak yazılım geliştirmek bize esnek, zarif ve sağlam(robust) yazılımlar geliştirmemizi sağlar. Bu prensipler geliştirme sırasında kötü tasarımları tespit etmemizi ve **temiz mimariler** oluşturmamıza yardımcı olurlar.

SOLID prensipler birbirlerini tamamlarlar ve "**iyi tasarlanmış yazılımlar**" elde etmemiz amacıyla birlikte çalışırlar.


## Single Responsibility Principle
Bütün yazılım bileşenler(ex:Class,Method) yanlızca bir sorumluluğa sahip olmalıdır.


  Single Responsibility Sağlamak için :

 - High Cohesion :heavy_check_mark:
 - Loose Coupling :heavy_check_mark:

	#### :heavy_exclamation_mark:  Uygulamayı tight coupling'den kurtarıp loosely coupled hale getirme Single Responsibility  güçlendirmektedir.
 			 						 


## Open Closed Principle
Yazılımın bileşenleri değişikliğe kapalı ama genişlemeye açık olmalıdır.

*Değişikliğe kapalı olmak: Uygulamaya eklenecek olacak olan yeni bir özellik hali hazırdaki kod üzerinde değişikliğe neden olmamalı*

*Genişlemeye açık olmak: Uygulamanın bileşenleri yeni özellik ve davranışlar için genişleyebilir olmalı*

Böylelikle :

 - Yeni özellik ekleme kolaylığı
 - Minimum geliştirme ve test etme  maliyeti

:wrench:(Modifying the existing code cause the changing test etc.)


## Liskov Substitution Principle
Objeler subtypeları ile programın çalışmasına zarar getirmeyecek şekilde yer değiştirebilir olmalıdır. 
Bu da demek oluyor ki alt sınıflarımızdan türetilen nesneler ile üst sınıfımızın nesneleri aynı şekilde davranmaları gerekmektedir.

Bunu bir örnekle açıklamak gerekirse:

    public class Bird {
	
	void fly(){
		
	 } 
	}

    public class Ostrich extends Bird{
	
	void fly(){
		//unimplemented
	   } 
	}
Bu görmüş olduğunuz durum liskov prensibini karşılamaz çünkü Bird kullandığımız yerde Ostrich(deve kuşu) kullanamayız. Unutma Deve kuşları uçamaz. 

## Interface Segregation Principle
Hiçbir cleint kullanmayacağı methodu implemente etmeye zorlanmamalıdır.

#### :heavy_exclamation_mark:  Unimplemented methodlar zayıf tasarımın bir göstergesidir.
 Bundan dolayıdır ki interfacelerin içinde gereksiz methodlara yer verilmemeli ve fonksiyonaliteyi sağlayan minimum sayıda method'a yer verilmelidir.
 

    

#### :gear: Sorumlukların ve ya davranışları bir interface toplamak yerine bunu küçük özelleştirilmiş interfacelere toplamak bu amacı karşılayacaktır.
                                     ↑
            Böylelikle Single Resposibility p. karışılanmış oluyor
            

Bunu pizza örneği ile açıklayalım:
```
public interface Pizza {
	 void addSauce();
	 void bake();
	 void addBacon();
}
```

```

public class VegetarianPizza implements Pizza{

	@Override
	public void addSauce() {
		System.out.println("sos ekle");
		
	}

	@Override
	public void bake() {
		System.out.println("pişir");

		
	}

	@Override
	public void addBacon() {
		//Unimplemented
		
	}}
    public void addMushrooms() {System.out.println("mantar ekle");}

```
Bu örneği incelediğimizde VegetarianPizza için addBacon methodunun implemente edilmediğini görürüz. Bu durumda Interface Segregation p. uygunsuz bir durum oluşmuştur.
Bunu yerine pizza için sadece zorunlu olan methodlara sahip bir interface yarattığımızda bu durum çözülecektir. 

```
public  interface Pizza { 
	 void addSauce();
	 void bake(); 
 }
 ```


## Dependecy Inversion Principle
High-level modules ile low-level modules birbirlerine doğrudan bağlı olmamalı, arayüz(interface) gibi soyutlamalara(abstract) gibi kavramları kullanmalıdır. 

> Burada amaç yüksek seviye bir sınıf ile alt seviye sınıf arasındaki
> bağımlığı ortadan kaldırarak soyut katman üzerinden bağlantının
> gerçekleştirilmesi.


##### :gear: Bu ilke gerçekten çok önemlidir çünkü modüllere ayrılarak sistemi daha az karmaşık hale getiririz. Böylelike uygulamanın bakımı, güncellemesi ve test edilmesi daha kolay hale gelir. 

**_Üst Seviye Sınıflar -> Soyutlama Katmanı -> Düşük Seviye Sınıfları_**

Örnek:
##### ProductCatalogService →ProductRepository ←MysqlProductRepository



#### Yararlı Linkler
https://stackabuse.com/object-oriented-design-principles-in-java/