import org.tempuri.DrinkWaterIface;
import org.tempuri.DrinkWaterServerImplService;
import org.tempuri.RadiationStationListIface;
import org.tempuri.RadiationStationListImplService;







public class tets {

	public static void main(String[] args) {
//		DrinkWaterServerImplService ds=new DrinkWaterServerImplService();
//		DrinkWaterIface df=ds.getDrinkWaterServerImplPort();
//		System.out.println(df.findDrinkWater("", "", ""));
		RadiationStationListImplService rmImplService=new RadiationStationListImplService();
		RadiationStationListIface ri=rmImplService.getRadiationStationListImplPort();
		System.out.println(ri.getRadiationStationList("", "", "", ""));
	}

}