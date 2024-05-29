# TestCase16 Dökümantasyonu <br/>
Bu sınıf, bir Playwright tabanlı test senaryosunu uygular. Test, bir web uygulamasında kullanıcı kaydı oluşturur, ürün ekler, sepet işlemleri yapar ve sonunda kullanıcı hesabını siler.

## Kullanılan Sınıflar ve Yöntemler<br/>
baseTest: Temel test ayarlarını sağlayan sınıf.<br/>
homePage: Ana sayfa işlemlerini yapan sınıf.<br/>
signupPage: Kayıt sayfası işlemlerini yapan sınıf.<br/>
cartPage: Sepet işlemlerini yapan sınıf.<br/>

## Test İş Akışı<br/>
**1. Giriş ve Sayfa Yüklemeleri**<br/>
Test başlatılır ve temel ayarlar yapılır (baseTest.setUp()).<br/>
Sayfanın başlığı kontrol edilir.<br/>
**2. Kullanıcı Kaydı Oluşturma**<br/>
Ana sayfada logo görünürlüğü kontrol edilir.<br/>
Kayıt sayfasına yönlendirilir.<br/>
Kullanıcı bilgileri doldurulur ve hesap oluşturulur.<br/>
Hesap oluşturulduğu doğrulanır ve devam edilir.<br/>
**3. Ürün Sepete Ekleme**<br/>
Ürün seçilir ve sepete eklenir.<br/>
Alışverişe devam edilir ve sepete gidilir.<br/>
**4. Sepet ve Ödeme İşlemleri**<br/>
Sepet sayfasının açıldığı doğrulanır.<br/>
Ödeme işlemine geçilir ve sipariş verilir.<br/>
Ödeme bilgileri girilir ve sipariş onaylanır.<br/>
**5. Hesap Silme ve Çıkış**<br/>
Kullanıcı hesabı silinir.<br/>
Hesabın başarıyla silindiği doğrulanır ve test sonlandırılır (baseTest.tearDown()).
