# Hash-Table
Ekleme İşlemi: Eklem işlemi “veri.txt” dosyasındaki kayıtlar üzerinden ve ekrandan 
kullanıcı tarafından yapılabilecektir. Program ilk açıldığında “veri.txt” dosyasındaki 
kayıtlar için aşağıda açıklandığı gibi hash_tablo oluşturulacak ve veriler hash 
tablosundaki indeksine göre veri_liste dizisine eklenecektir. Kullanacağınız birinci hash 
fonksiyonu h1(n)= 3n +2’ dir. Burada n olarak müşteri numarası girilecek ve denklem 
sonucu elde edilen sonuç Hash tablosunun uzunluğu olan 10’a bölümünden kalan 
değer (yani h1(Müşteri numarası) % 10) olarak belirlenecektir ve hash_tablo’daki ve 
bağlı listedeki o indekse müşteri numarası ve musteri kaydedilecektir.
Hash tablosuna her müşteri numarası eklendiğinde, müşteri bilgileri de veri_liste’nin 
aynı indeksine eklenecektir.
Eğer bir çakışma olursa hash_tablo’da kayıtın girileceği yer h2(n)=7n+ 2 hash 
fonksiyonu ile belirlenecektir.
