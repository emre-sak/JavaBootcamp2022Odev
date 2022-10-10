-- Bu SQL kodları ANSII standartıdır. Yani bu kodlar Oracle, MySQL, MsSQL ve PostgreSQL'de de çalışır.
-- SQL case insensitive  yani büyük ve küçük harf duyarsızdır.

/* Select, seç demek. Bir veri kaynağındaki datayı çekmek için kullanılan yapıdır. selectten sonra gelen kısım kolon
lardır. * demek tüm kolonlar demek. Sonrasında veriyi çekeceğimiz tablonun adını yazıyoruz. */
Select * from customers

-- Sadece 3 tane kolonu getirmesini istedik.
Select contact_name, company_name, city from customers

-- Kolon adlarını alias kullanarak farklı isimlerde gösterebiliriz.
Select contact_name Adi, company_name Sirketadi, city Sehir from customers

-- Filtreleme sorgusu. Where koşul demek. Şehri London olanları getir. Metinler ANSII standartlarına göre tek tırnakla yazılır.
Select * from customers Where city = 'London'

-- category_id 1 olanları veya 3 olanları getir.
Select * from products Where category_id = 1 or category_id = 3

-- category_id 1 olan ve unit_price 10'dan büyük olanları getir. <> yaparsak 10'dan farklı olanları getir demek.
Select * from products Where category_id = 1 and unit_price > 10

-- order by sırala demek. Bütün ürünleri ürün ismine göre sırala.
select * from products order by product_name

-- category_id'e göre sırala.
select * from products order by category_id

-- 1 numaralı kategorileri kendi arasında ürün ismine göre sıraladık.
select * from products order by category_id, product_name

-- asc ascending yani artan demek. order by'ın default değeri asc.
select *  from products order by unit_price asc 

-- desc ise azalan demek. açılımı descending
select *  from products order by unit_price desc

-- category_id 1 olanları seç ve fiyatını azalan olarak getir.
select *  from products where category_id = 1 order by unit_price desc 

-- count, tüm satırların sayısını verir.
select count(*) from products

-- 2 numaralı kategoride kaç ürün var? Aynı zamanda aliasta kullanabiliriz.
select count(*) Adet from products where category_id = 2

-- group by kullandığımzda select ettiğimiz kolon sadece group by'da yadığımız alan olabilir ve kümülatif datalar olabilir.
-- datalarımın içine bak bütün kategorileri tekrar etmeyecek şekilde bana listele.
-- group by yaptığımızda her bir grup için arka planda bir tablo oluşturuluyormuş gibi düşünebilirz.
select category_id from products group by category_id

-- Her kategoride kaç ürün var? 2. kolon içinde group by yapılabilir.
select category_id, count(*) from products group by category_id

-- Ürün sayısı 10'dan az olan kategorileri listele.
select category_id, count(*) from products group by category_id having count(*) < 10

-- Fiyatı 20'den fazla olan ürünleri category_id'e göre grupla her bir grupta 10'dan az olanları listele.
select category_id, count(*) from products where unit_price > 20 group by category_id having count(*) < 10

/* Ürünlerle kategorilerin birleşimini getir. inner join ile birleştirme yaparız. on durumunda, şartında demek yani biz bun
ları bir araya getireceğiz ama neye göre getireceğiz? O yüzden on kullanıyoruz. products tablosundaki category_id ve  
categories tablosundaki category_id'ine göre getir yani onlar eşitse onları yan yana getir demek. inner join sadece iki
tabloda eşleşenleri bir araya getirir eşleşmeyen data varsa onu getirmez. */
select * from products inner join categories on products.category_id = categories.category_id

select products.product_id, products.product_name, products.unit_price, categories.category_name 
from products inner join categories on products.category_id = categories.category_id

select products.product_id, products.product_name, products.unit_price, categories.category_name 
from products inner join categories on products.category_id = categories.category_id where products.unit_price > 10

/* Mesela isimlendirme olarak order_details yerine order details yazsaydık [order details] diye yamamız gerekecekti. Çünkü
boşluk olduğu için iki farklı kodmuş gibi algılamasın diye. inner joinlerde alias kullanılacaksa kısaltma kullanılır. 
inner join sadece eşleşen kayıtları getirir. */
select * from products pr inner join order_details od on pr.product_id = od.product_id

-- left join ise yazıma göre solda olup sağda olmayanlarıda getir demek.
select * from products pr left join order_details od on pr.product_id = od.product_id

select * from customers cu left join orders o on cu.customer_id = o.customer_id 

/* Mesela sana özel ilk siparişte %10 indirim datası. null is ile gösterilir. Buradaki null siparişlerde gelmeyen datamız
bunu primary key'e uygularız. right join ise sağda olup solda olmayanlarıda getir demek. */
select * from customers cu left join orders o on cu.customer_id = o.customer_id where o.customer_id is null

-- Birden fazla tabloyu join etmek istersek.
select * from products pr left join order_details od on pr.product_id = od.product_id inner join orders ord on  
ord.order_id = od.order_id




