import org.tempuri.RadiationStationListIface;
import org.tempuri.RadiationStationListImplService;







public class tets {

	public static void main(String[] args) {
//		DrinkWaterServerImplService ds=new DrinkWaterServerImplService();
//		DrinkWaterIface df=ds.getDrinkWaterServerImplPort();sss
//		System.out.println(df.findDrinkWater("", "", ""));再试试
		RadiationStationListImplService rmImplService=new RadiationStationListImplService();
		RadiationStationListIface ri=rmImplService.getRadiationStationListImplPort();
		System.out.println(ri.getRadiationStationList("", "", "", ""));
	}

}
