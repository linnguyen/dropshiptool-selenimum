import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {

	public static void main(String[] args) {
		Document document;

		try {

			String url = "https://www.aliexpress.com/item/Ice-Genie-2018-New-Space-Saving-Ice-Cubes-Maker-Kitchen-Tools-Irlde-Genie-Ice-Cream-Tubs/32919160914.html?spm=2114.11010108.06001.13.650c649bFhIpWE&gps-id=pcJustForYou&scm=1007.13562.109986.0&scm_id=1007.13562.109986.0&scm-url=1007.13562.109986.0&pvid=663eb1f6-e862-4773-85d3-a3339ef59013";
			document = Jsoup.connect(url).get();
            Element name = document.select("h1.product-name").first();
			String title = name.text(); // Get title
			
			Element descriptionEle = document.select("#j-product-description").first();
			String description = descriptionEle.text();

			System.out.print("name: " + description);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
