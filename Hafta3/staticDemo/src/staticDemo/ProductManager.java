package staticDemo;

public class ProductManager { //Veritabanına gönderecek.
	
    public void add(Product product) {
        //Product'u veri erişim katmanına gönderecek.

        //ProductValidator productValidator = new ProductValidator();
        //isValid metodunu static yaparsak obje oluşturmamıza gerek kalmaz.
        if(ProductValidator.isValid(product)) {
            System.out.println("Eklendi");
        }else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

    }
    
}
