package org.etiya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // 1- Navigate to ile sayfaya yönlendirme

        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.saucedemo.com/v1/");
        String title = webDriver.getTitle();

        System.out.println(title);
        webDriver.manage().window().maximize();

        //2- GetCurrentURl ile sayfanın bağlantısını yazdırma

        String currentUrl = webDriver.getCurrentUrl();
        System.out.println("Current Url : " + currentUrl);

        Thread.sleep(5000);

        //3- Sayfayı yenileme

        webDriver.navigate().refresh();
        System.out.println("Sayfa Yenilendi\n ");

        Thread.sleep(2000);

        //4- SendKeys ile doldurma ve FindElement ile ilgili alanı bulma
        WebElement userNameInput = webDriver.findElement(By.id("user-name"));

        userNameInput.sendKeys("locked_out_user");
        Thread.sleep(2000);

        //5- Clear ile sayfadaki alanları temizleme
        userNameInput.clear();
        Thread.sleep(2000);

        // Username alanının yeniden doldurulması

        WebElement usernameInput = webDriver.findElement(By.id("user-name"));
        usernameInput.sendKeys("standard_user");
        Thread.sleep(2000);


        // Password alanının doldurulması

        WebElement passwordInput = webDriver.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(2000);

        //6- Click fonksiyonu ile Login butonuna tıklama

        WebElement loginBtn = webDriver.findElement(By.id("login-button"));
        loginBtn.click();
        Thread.sleep(2000);

        // Açılan sayfadan ürüne tıklama

        WebElement selectToProductBtn = webDriver.findElement(By.id("item_4_title_link"));

        selectToProductBtn.click();
        Thread.sleep(2000);

        //7- Gettext fonksiyonu ile belirtilen alanın metin içeriğini alma

        WebElement product = webDriver.findElement(By.className("inventory_details_name"));
        String text = product.getText();
        System.out.println("Product Name : " + text);


        //Back butonu ile geri dönme

        WebElement backBtn = webDriver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button"));
        backBtn.click();
        Thread.sleep(1000);


        //yeniden ürüne tıklama

        WebElement selectToProductBtn1 = webDriver.findElement(By.id("item_4_title_link"));

        selectToProductBtn1.click();
        Thread.sleep(2000);


        //8- ADD TO CLICK butonunun görünebilir olmasını isDisplayed ile ekrana yazdırma

        WebElement addToCartButtonvisible = webDriver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
        if (addToCartButtonvisible.isDisplayed()) {
            System.out.println("Add to cart button is visible.");
        }
        else {
            System.out.println("Add to cart button is not visible.");
        }

        //Sepete ürün ekleme
        WebElement addToCardBtn = webDriver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
        addToCardBtn.click();
        Thread.sleep(2000);


        //Sepetten ürün çıkarma

        WebElement removeBtn = webDriver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
        removeBtn.click();
        Thread.sleep(2000);

        // remove butonu görünebilir olması

        boolean isButtonVisible = removeBtn.isDisplayed();

        if (isButtonVisible) {
            System.out.println("Remove button is visible");
        } else {
            System.out.println("Remove button is not visible");
        }

        //Sepete yeniden ürün ekleme

        WebElement addToCardBtn1 = webDriver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
        addToCardBtn1.click();
        Thread.sleep(1000);

        //Sepete tıklama
        WebElement basketBtn = webDriver.findElement(By.id("shopping_cart_container"));
        basketBtn.click();
        Thread.sleep(2000);

        //9- Checkout Butonunun isEnable ile işlevselliğinin kontrolü

        WebElement checkoutEnable = webDriver.findElement(By.className("checkout_button"));
        if (checkoutEnable.isEnabled()) {
            System.out.println("Checkout Button is enabled.");
        } else {
            System.out.println("Checkout Button is disabled.");
        }

        Thread.sleep(2000);

        //10- WebDriver örneğini kapatmak için quit ile çıkış
        webDriver.quit();

    }

   }

