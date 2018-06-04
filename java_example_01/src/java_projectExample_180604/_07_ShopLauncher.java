package java_projectExample_180604;

//쇼핑몰을 실행하기 위한 메인 메소드 클래스

public class _07_ShopLauncher {

	public static void main(String[] args) {
		_01_IShop shop = new _08_MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		/*문제발생한곳*/shop.start();

	}

}
